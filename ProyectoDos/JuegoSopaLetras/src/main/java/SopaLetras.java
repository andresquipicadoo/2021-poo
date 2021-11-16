
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JLabel;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.Timer;

public class SopaLetras implements ActionListener {

    Timer timer;

    int segundos, minutos;
    DecimalFormat dformat = new DecimalFormat("00");
    String ddSecond, ddMinute;
    private JFrame frame;
    private ArrayList<Palabras> btnArr = new ArrayList<Palabras>();
    private JLabel[] labels; 
    private int length; 

    private ArrayList<Palabras> botonSeleccionado = new ArrayList<Palabras>();
    private boolean orientacionVertical;

    private ArrayList<String> palabraBuscar = new ArrayList<String>();
    private ArrayList<String> listaPalabras = new ArrayList<String>();	
    private String palabra = "";	
    private int cantPalabras;

    JLabel counter;

    public SopaLetras(int length, int numOfWords) {
        this.length = length;

        this.cantPalabras = numOfWords;
        ImageIcon img = new ImageIcon("C://Andres/Quiros/Netbeans/ Workspace/WordSearch/logo_tr.png");
        frame = new JFrame("Juego de Sopa de Letras !");
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setIconImage(img.getImage());
        labels = new JLabel[numOfWords];

        counter = new JLabel("");
        counter.setBounds(10, 10, 10, 10);
        counter.setHorizontalAlignment(JLabel.CENTER);
        counter.setText("02:00");
        frame.add(counter);
        minutos = 2;
        segundos = 0;
        tiempo();
        timer.start();

    }

    public void GenerarCuadricula() {
      
        BuscadorDePalabras bp = new BuscadorDePalabras(4, length);
        bp.Iniciar();
        String board[][] = bp.getCuadriculaSopaletras();
        listaPalabras = bp.getListaPaises();
        palabraBuscar = (ArrayList<String>) bp.getListaPaises().clone();

        frame.setVisible(true);

        JPanel contenido = new JPanel();
        contenido.setLayout(new GridLayout(length, length));

        String[] letrasRandom = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q",
            "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        Random r = new Random();
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                int n = Math.abs(r.nextInt()) % 26;
                Palabras btn;
                if (board[i][j] == null) {
                    btn = new Palabras(letrasRandom[n], i, j);
                } else {
                    btn = new Palabras(board[i][j], i, j);
                }
                contenido.add(btn);
                btn.addActionListener(this);
                btnArr.add(btn);
            }
        }

        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(new GridLayout(5, 2, 40, 10));
        for (int i = 0; i < cantPalabras; i++) {
            labels[i] = new JLabel(listaPalabras.get(i));
            bottomPanel.add(labels[i]);
        }

        bottomPanel.setBorder(new EmptyBorder(10, 20, 20, 20));
        contenido.setBorder(new EmptyBorder(10, 10, 10, 10));

        Container f = frame.getContentPane();
        f.setLayout(new BoxLayout(f, BoxLayout.Y_AXIS));

        f.add(contenido);
        f.add(bottomPanel);
        frame.pack();

    }

    public void checkMatch() {

        if (palabraBuscar.contains(palabra)) {
            int index = listaPalabras.indexOf(palabra);
            palabraBuscar.remove(palabra);

            labels[index].setForeground(Color.GRAY);

            for (Palabras b : botonSeleccionado) {
                b.setSelected(false);
                b.setPalabrabuscada(true);
            }

            botonSeleccionado.clear();
            palabra = "";
        }

        if (palabraBuscar.size() == 0) {

           
            Object[] opciones = {"Jugar nuevamente", "Salir"};
            int numero = JOptionPane.showOptionDialog(frame, "Has ganado !", "Felicidades", JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[1]);
            if (numero == 0) {
                frame.getContentPane().removeAll();
                GenerarCuadricula();
            } else {
                frame.dispose();
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() instanceof Palabras) {
            Palabras btn = (Palabras) e.getSource();

            if (btn.getSelected()) {
                if (btn == botonSeleccionado.get(botonSeleccionado.size() - 1)) {
                    botonSeleccionado.remove(btn);
                    palabra = palabra.substring(0, palabra.length() - 1);
                } else if (btn == botonSeleccionado.get(0)) {
                    botonSeleccionado.remove(btn);
                    if (palabra.length() == 1) {
                        palabra = "";
                    } else {
                        palabra = palabra.substring(1);
                    }
                } else {
                    return;
                }
            } else {
                if (botonSeleccionado.size() == 0) {
                    botonSeleccionado.add(btn);
                    palabra = btn.getLetra();
                } else {
                    
                    if (botonSeleccionado.size() == 1) {
                    
                        if (botonSeleccionado.get(0).getPosicionHorizontal() == btn.getPosicionHorizontal()) {
                            orientacionVertical = false;
                        } 
                        else if (botonSeleccionado.get(0).getPosicionVertical() == btn.getPosicionVertical()) {
                            orientacionVertical = true;
                        } else {
                            BorrarBotones();
                            botonSeleccionado.add(btn);
                            palabra = btn.getLetra();
                            btn.toggle();
                            return;
                        }
                    }

                    if (orientacionVertical) {
                        
                        if (btn.getPosicionHorizontal() == botonSeleccionado.get(0).getPosicionHorizontal() - 1 && btn.getPosicionVertical() == botonSeleccionado.get(0).getPosicionVertical()) {
                            botonSeleccionado.add(0, btn);
                            palabra = btn.getLetra() + palabra;
                        }
                        else if (btn.getPosicionHorizontal() == botonSeleccionado.get(botonSeleccionado.size() - 1).getPosicionHorizontal() + 1 && btn.getPosicionVertical() == botonSeleccionado.get(botonSeleccionado.size() - 1).getPosicionVertical()) {
                            botonSeleccionado.add(btn);
                            palabra = palabra + btn.getLetra();
                        } else {
                            BorrarBotones();
                            botonSeleccionado.add(btn);
                            palabra = btn.getLetra();
                        }
                    } else {
                       
                        if (btn.getPosicionVertical() == botonSeleccionado.get(0).getPosicionVertical() - 1 && btn.getPosicionHorizontal() == botonSeleccionado.get(0).getPosicionHorizontal()) {
                            botonSeleccionado.add(0, btn);
                            palabra = btn.getLetra() + palabra;
                        }
                        else if (btn.getPosicionVertical() == botonSeleccionado.get(botonSeleccionado.size() - 1).getPosicionVertical() + 1 && btn.getPosicionHorizontal() == botonSeleccionado.get(botonSeleccionado.size() - 1).getPosicionHorizontal()) {
                            palabra = palabra + btn.getLetra();
                            botonSeleccionado.add(btn);
                        } else {
                            BorrarBotones();
                            botonSeleccionado.add(btn);
                            palabra = btn.getLetra();
                        }
                    }

                }
            }
            btn.toggle();
            checkMatch();
        }
    }

    public void BorrarBotones() {
        for (Palabras b : botonSeleccionado) {
            b.setSelected(false);
        }
        botonSeleccionado.clear();
        palabra = "";
    }

    public int getLength() {
        return length;
    }

    public void tiempo() {
        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                segundos--;
                ddSecond = dformat.format(segundos);
                ddMinute = dformat.format(minutos);
                counter.setText(ddMinute + ":" + ddSecond);
                if (segundos == -1) {
                    segundos = 59;
                    minutos--;
                    ddSecond = dformat.format(segundos);
                    ddMinute = dformat.format(minutos);
                    counter.setText(ddMinute + ":" + ddSecond);
                }
                if (minutos == 0 && segundos == 0) {
                    timer.stop();
                    //lanzar mensaje de que el tiempo se acabo
                    // Y salir del programa
                    JOptionPane.showMessageDialog(null, "Lastima :( Se acabo el tiempo");  
                    System.exit(minutos);
                }
            }
        });
    }

}
