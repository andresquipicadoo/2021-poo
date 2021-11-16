/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MarioCards09;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import MarioCards09.cartasLogica;

import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.JOptionPane;

/**
 *
 * @author aquir
 */
public class cards extends javax.swing.JFrame {

    private cartasLogica car = new cartasLogica();



    private JButton[] pbtn = new JButton[2];
   
    private final ArrayList<String> nombreImagenes = new ArrayList(52);
    private int cantidadJugadores = 6;
    private int turno = 1;
    private final ArrayList<String> cartasSeleccionadas = new ArrayList(6);

    /**
     * Creates new form cards
     */
    public cards() {
        initComponents();
        setCartas();
        char[] letras = new char[]{'a', 'b', 'c', 'd'};
        for (int i = 2; i <= 14; i++) {
            for (int j = 0; j < letras.length; j++) {
                nombreImagenes.add("card" + String.format("%02d", i) + String.valueOf(letras[j]) + ".png");
            }
        }
    }

    public void setCantidadJugadores(int cantidad) {
        if (cantidad > 6) {
            cantidad = 6;
        }
        this.cantidadJugadores = cantidad;
    }

    public void encontrarJugadorGanador() {
        if (cartasSeleccionadas.size() < 2) {
            
          Icon m=new ImageIcon(getClass().getResource("/mariocard/Bowser.png"));
         JOptionPane.showMessageDialog(null, "No puede haber solo una carta seleccionada.","Error", JOptionPane.ERROR_MESSAGE,m);
           

        } else {
            String mayor = cartasSeleccionadas.get(0);
            for (int i = 1; i < cartasSeleccionadas.size(); i++) {
                int c = mayor.compareTo(cartasSeleccionadas.get(i));
                if (c < 0) {
                    mayor = cartasSeleccionadas.get(i);
                }
            }
            int jugadorGanador = cartasSeleccionadas.indexOf(mayor) + 1;
            Icon w=new ImageIcon(getClass().getResource("/mariocard/win.png"));
            JOptionPane.showMessageDialog(this, " Muchas Felicidades, ha ganado el jugador " + jugadorGanador, "Ganador", JOptionPane.INFORMATION_MESSAGE,w);
        }

    }

    public void setCartas() {

        int[] numbers = car.getCard();
        crd1.setDisabledIcon(new ImageIcon(getClass().getResource("/mariocard/r.png")));
        crd2.setDisabledIcon(new ImageIcon(getClass().getResource("/mariocard/r.png")));
        crd3.setDisabledIcon(new ImageIcon(getClass().getResource("/mariocard/r.png")));
        crd4.setDisabledIcon(new ImageIcon(getClass().getResource("/mariocard/r.png")));
        crd5.setDisabledIcon(new ImageIcon(getClass().getResource("/mariocard/r.png")));
        crd6.setDisabledIcon(new ImageIcon(getClass().getResource("/mariocard/r.png")));
        crd7.setDisabledIcon(new ImageIcon(getClass().getResource("/mariocard/r.png")));
        crd8.setDisabledIcon(new ImageIcon(getClass().getResource("/mariocard/r.png")));
        crd9.setDisabledIcon(new ImageIcon(getClass().getResource("/mariocard/r.png")));
        crd10.setDisabledIcon(new ImageIcon(getClass().getResource("/mariocard/r.png")));
        crd11.setDisabledIcon(new ImageIcon(getClass().getResource("/mariocard/r.png")));
        crd12.setDisabledIcon(new ImageIcon(getClass().getResource("/mariocard/r.png")));
        crd13.setDisabledIcon(new ImageIcon(getClass().getResource("/mariocard/r.png")));
        crd14.setDisabledIcon(new ImageIcon(getClass().getResource("/mariocard/r.png")));
        crd15.setDisabledIcon(new ImageIcon(getClass().getResource("/mariocard/r.png")));
        crd16.setDisabledIcon(new ImageIcon(getClass().getResource("/mariocard/r.png")));
        crd17.setDisabledIcon(new ImageIcon(getClass().getResource("/mariocard/r.png")));
        crd18.setDisabledIcon(new ImageIcon(getClass().getResource("/mariocard/r.png")));
        crd19.setDisabledIcon(new ImageIcon(getClass().getResource("/mariocard/r.png")));
        crd20.setDisabledIcon(new ImageIcon(getClass().getResource("/mariocard/r.png")));
        crd21.setDisabledIcon(new ImageIcon(getClass().getResource("/mariocard/r.png")));
        crd22.setDisabledIcon(new ImageIcon(getClass().getResource("/mariocard/r.png")));
        crd23.setDisabledIcon(new ImageIcon(getClass().getResource("/mariocard/r.png")));
        crd24.setDisabledIcon(new ImageIcon(getClass().getResource("/mariocard/r.png")));
        crd25.setDisabledIcon(new ImageIcon(getClass().getResource("/mariocard/r.png")));
        crd26.setDisabledIcon(new ImageIcon(getClass().getResource("/mariocard/r.png")));
        crd27.setDisabledIcon(new ImageIcon(getClass().getResource("/mariocard/r.png")));
        crd28.setDisabledIcon(new ImageIcon(getClass().getResource("/mariocard/r.png")));
        crd29.setDisabledIcon(new ImageIcon(getClass().getResource("/mariocard/r.png")));
        crd30.setDisabledIcon(new ImageIcon(getClass().getResource("/mariocard/r.png")));
        crd31.setDisabledIcon(new ImageIcon(getClass().getResource("/mariocard/r.png")));
        crd32.setDisabledIcon(new ImageIcon(getClass().getResource("/mariocard/r.png")));
        crd33.setDisabledIcon(new ImageIcon(getClass().getResource("/mariocard/r.png")));
        crd34.setDisabledIcon(new ImageIcon(getClass().getResource("/mariocard/r.png")));
        crd35.setDisabledIcon(new ImageIcon(getClass().getResource("/mariocard/r.png")));
        crd36.setDisabledIcon(new ImageIcon(getClass().getResource("/mariocard/r.png")));
        crd37.setDisabledIcon(new ImageIcon(getClass().getResource("/mariocard/r.png")));
        crd38.setDisabledIcon(new ImageIcon(getClass().getResource("/mariocard/r.png")));
        crd39.setDisabledIcon(new ImageIcon(getClass().getResource("/mariocard/r.png")));
        crd40.setDisabledIcon(new ImageIcon(getClass().getResource("/mariocard/r.png")));
        crd41.setDisabledIcon(new ImageIcon(getClass().getResource("/mariocard/r.png")));
        crd42.setDisabledIcon(new ImageIcon(getClass().getResource("/mariocard/r.png")));
        crd43.setDisabledIcon(new ImageIcon(getClass().getResource("/mariocard/r.png")));
        crd44.setDisabledIcon(new ImageIcon(getClass().getResource("/mariocard/r.png")));
        crd45.setDisabledIcon(new ImageIcon(getClass().getResource("/mariocard/r.png")));
        crd46.setDisabledIcon(new ImageIcon(getClass().getResource("/mariocard/r.png")));
        crd47.setDisabledIcon(new ImageIcon(getClass().getResource("/mariocard/r.png")));
        crd48.setDisabledIcon(new ImageIcon(getClass().getResource("/mariocard/r.png")));
        crd49.setDisabledIcon(new ImageIcon(getClass().getResource("/mariocard/r.png")));
        crd50.setDisabledIcon(new ImageIcon(getClass().getResource("/mariocard/r.png")));
        crd51.setDisabledIcon(new ImageIcon(getClass().getResource("/mariocard/r.png")));
        crd52.setDisabledIcon(new ImageIcon(getClass().getResource("/mariocard/r.png")));

    }

   

    private boolean procesarTurno(String imagen) {
        if (turno <= cantidadJugadores) {
            cartasSeleccionadas.add(imagen);
            switch (turno) {
                case 1 ->
                    btn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/" + imagen)));
                case 2 ->
                    btn4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/" + imagen)));
                case 3 ->
                    btn5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/" + imagen)));
                case 4 ->
                    btn6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/" + imagen)));
                case 5 ->
                    btn7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/" + imagen)));
                case 6 ->
                    btn8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/" + imagen)));
                default -> {
                }
            }
            turno++;
            
            return true;

        } else {
            
            JOptionPane.showMessageDialog(null, "Lastima Ya no hay mas turnos disponibles" + JOptionPane.INFORMATION_MESSAGE);
            return false;
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        crd3 = new javax.swing.JButton();
        crd2 = new javax.swing.JButton();
        crd4 = new javax.swing.JButton();
        crd5 = new javax.swing.JButton();
        crd1 = new javax.swing.JButton();
        crd15 = new javax.swing.JButton();
        crd17 = new javax.swing.JButton();
        crd14 = new javax.swing.JButton();
        crd18 = new javax.swing.JButton();
        crd29 = new javax.swing.JButton();
        crd30 = new javax.swing.JButton();
        crd16 = new javax.swing.JButton();
        crd31 = new javax.swing.JButton();
        crd33 = new javax.swing.JButton();
        crd19 = new javax.swing.JButton();
        crd6 = new javax.swing.JButton();
        crd20 = new javax.swing.JButton();
        crd7 = new javax.swing.JButton();
        crd34 = new javax.swing.JButton();
        crd21 = new javax.swing.JButton();
        crd8 = new javax.swing.JButton();
        crd22 = new javax.swing.JButton();
        crd9 = new javax.swing.JButton();
        crd23 = new javax.swing.JButton();
        crd10 = new javax.swing.JButton();
        crd27 = new javax.swing.JButton();
        crd28 = new javax.swing.JButton();
        crd40 = new javax.swing.JButton();
        crd41 = new javax.swing.JButton();
        crd42 = new javax.swing.JButton();
        crd43 = new javax.swing.JButton();
        crd32 = new javax.swing.JButton();
        crd35 = new javax.swing.JButton();
        crd36 = new javax.swing.JButton();
        crd44 = new javax.swing.JButton();
        crd45 = new javax.swing.JButton();
        crd46 = new javax.swing.JButton();
        crd47 = new javax.swing.JButton();
        crd48 = new javax.swing.JButton();
        crd49 = new javax.swing.JButton();
        crd50 = new javax.swing.JButton();
        crd24 = new javax.swing.JButton();
        crd11 = new javax.swing.JButton();
        crd51 = new javax.swing.JButton();
        crd39 = new javax.swing.JButton();
        crd25 = new javax.swing.JButton();
        crd12 = new javax.swing.JButton();
        crd52 = new javax.swing.JButton();
        crd37 = new javax.swing.JButton();
        crd38 = new javax.swing.JButton();
        crd13 = new javax.swing.JButton();
        crd26 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jugadorO4 = new javax.swing.JLabel();
        btnJugador1 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 0, 51));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 48)); // NOI18N
        jLabel1.setText("Mario Cards");

        jScrollPane2.setViewportView(jScrollPane4);

        jPanel2.setBackground(new java.awt.Color(0, 102, 0));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        crd3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/r.png"))); // NOI18N
        crd3.setPreferredSize(new java.awt.Dimension(300, 340));
        crd3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crd3ActionPerformed(evt);
            }
        });

        crd2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/r.png"))); // NOI18N
        crd2.setPreferredSize(new java.awt.Dimension(300, 340));
        crd2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                crd2MouseExited(evt);
            }
        });
        crd2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crd2ActionPerformed(evt);
            }
        });

        crd4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/r.png"))); // NOI18N
        crd4.setPreferredSize(new java.awt.Dimension(300, 340));
        crd4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crd4ActionPerformed(evt);
            }
        });

        crd5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/r.png"))); // NOI18N
        crd5.setPreferredSize(new java.awt.Dimension(300, 340));
        crd5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crd5ActionPerformed(evt);
            }
        });

        crd1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/r.png"))); // NOI18N
        crd1.setPreferredSize(new java.awt.Dimension(300, 340));
        crd1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                crd1MouseExited(evt);
            }
        });
        crd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crd1ActionPerformed(evt);
            }
        });

        crd15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/r.png"))); // NOI18N
        crd15.setPreferredSize(new java.awt.Dimension(300, 340));
        crd15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crd15ActionPerformed(evt);
            }
        });

        crd17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/r.png"))); // NOI18N
        crd17.setPreferredSize(new java.awt.Dimension(300, 340));
        crd17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crd17ActionPerformed(evt);
            }
        });

        crd14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/r.png"))); // NOI18N
        crd14.setPreferredSize(new java.awt.Dimension(300, 340));
        crd14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crd14ActionPerformed(evt);
            }
        });

        crd18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/r.png"))); // NOI18N
        crd18.setPreferredSize(new java.awt.Dimension(300, 340));
        crd18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crd18ActionPerformed(evt);
            }
        });

        crd29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/r.png"))); // NOI18N
        crd29.setPreferredSize(new java.awt.Dimension(300, 340));
        crd29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crd29ActionPerformed(evt);
            }
        });

        crd30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/r.png"))); // NOI18N
        crd30.setPreferredSize(new java.awt.Dimension(300, 340));
        crd30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crd30ActionPerformed(evt);
            }
        });

        crd16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/r.png"))); // NOI18N
        crd16.setPreferredSize(new java.awt.Dimension(300, 340));
        crd16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crd16ActionPerformed(evt);
            }
        });

        crd31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/r.png"))); // NOI18N
        crd31.setPreferredSize(new java.awt.Dimension(300, 340));
        crd31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crd31ActionPerformed(evt);
            }
        });

        crd33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/r.png"))); // NOI18N
        crd33.setPreferredSize(new java.awt.Dimension(300, 340));
        crd33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crd33ActionPerformed(evt);
            }
        });

        crd19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/r.png"))); // NOI18N
        crd19.setPreferredSize(new java.awt.Dimension(300, 340));
        crd19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crd19ActionPerformed(evt);
            }
        });

        crd6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/r.png"))); // NOI18N
        crd6.setPreferredSize(new java.awt.Dimension(300, 340));
        crd6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crd6ActionPerformed(evt);
            }
        });

        crd20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/r.png"))); // NOI18N
        crd20.setPreferredSize(new java.awt.Dimension(300, 340));
        crd20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crd20ActionPerformed(evt);
            }
        });

        crd7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/r.png"))); // NOI18N
        crd7.setPreferredSize(new java.awt.Dimension(300, 340));
        crd7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crd7ActionPerformed(evt);
            }
        });

        crd34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/r.png"))); // NOI18N
        crd34.setPreferredSize(new java.awt.Dimension(300, 340));
        crd34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crd34ActionPerformed(evt);
            }
        });

        crd21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/r.png"))); // NOI18N
        crd21.setPreferredSize(new java.awt.Dimension(300, 340));
        crd21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crd21ActionPerformed(evt);
            }
        });

        crd8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/r.png"))); // NOI18N
        crd8.setPreferredSize(new java.awt.Dimension(300, 340));
        crd8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crd8ActionPerformed(evt);
            }
        });

        crd22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/r.png"))); // NOI18N
        crd22.setPreferredSize(new java.awt.Dimension(300, 340));
        crd22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crd22ActionPerformed(evt);
            }
        });

        crd9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/r.png"))); // NOI18N
        crd9.setPreferredSize(new java.awt.Dimension(300, 340));
        crd9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crd9ActionPerformed(evt);
            }
        });

        crd23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/r.png"))); // NOI18N
        crd23.setPreferredSize(new java.awt.Dimension(300, 340));
        crd23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crd23ActionPerformed(evt);
            }
        });

        crd10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/r.png"))); // NOI18N
        crd10.setPreferredSize(new java.awt.Dimension(300, 340));
        crd10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crd10ActionPerformed(evt);
            }
        });

        crd27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/r.png"))); // NOI18N
        crd27.setPreferredSize(new java.awt.Dimension(300, 340));
        crd27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crd27ActionPerformed(evt);
            }
        });

        crd28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/r.png"))); // NOI18N
        crd28.setPreferredSize(new java.awt.Dimension(300, 340));
        crd28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crd28ActionPerformed(evt);
            }
        });

        crd40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/r.png"))); // NOI18N
        crd40.setPreferredSize(new java.awt.Dimension(300, 340));
        crd40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crd40ActionPerformed(evt);
            }
        });

        crd41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/r.png"))); // NOI18N
        crd41.setPreferredSize(new java.awt.Dimension(300, 340));
        crd41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crd41ActionPerformed(evt);
            }
        });

        crd42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/r.png"))); // NOI18N
        crd42.setPreferredSize(new java.awt.Dimension(300, 340));
        crd42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crd42ActionPerformed(evt);
            }
        });

        crd43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/r.png"))); // NOI18N
        crd43.setPreferredSize(new java.awt.Dimension(300, 340));
        crd43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crd43ActionPerformed(evt);
            }
        });

        crd32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/r.png"))); // NOI18N
        crd32.setPreferredSize(new java.awt.Dimension(300, 340));
        crd32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crd32ActionPerformed(evt);
            }
        });

        crd35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/r.png"))); // NOI18N
        crd35.setPreferredSize(new java.awt.Dimension(300, 340));
        crd35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crd35ActionPerformed(evt);
            }
        });

        crd36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/r.png"))); // NOI18N
        crd36.setPreferredSize(new java.awt.Dimension(300, 340));
        crd36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crd36ActionPerformed(evt);
            }
        });

        crd44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/r.png"))); // NOI18N
        crd44.setPreferredSize(new java.awt.Dimension(300, 340));
        crd44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crd44ActionPerformed(evt);
            }
        });

        crd45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/r.png"))); // NOI18N
        crd45.setPreferredSize(new java.awt.Dimension(300, 340));
        crd45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crd45ActionPerformed(evt);
            }
        });

        crd46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/r.png"))); // NOI18N
        crd46.setPreferredSize(new java.awt.Dimension(300, 340));
        crd46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crd46ActionPerformed(evt);
            }
        });

        crd47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/r.png"))); // NOI18N
        crd47.setPreferredSize(new java.awt.Dimension(300, 340));
        crd47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crd47ActionPerformed(evt);
            }
        });

        crd48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/r.png"))); // NOI18N
        crd48.setPreferredSize(new java.awt.Dimension(300, 340));
        crd48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crd48ActionPerformed(evt);
            }
        });

        crd49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/r.png"))); // NOI18N
        crd49.setPreferredSize(new java.awt.Dimension(300, 340));
        crd49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crd49ActionPerformed(evt);
            }
        });

        crd50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/r.png"))); // NOI18N
        crd50.setPreferredSize(new java.awt.Dimension(300, 340));
        crd50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crd50ActionPerformed(evt);
            }
        });

        crd24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/r.png"))); // NOI18N
        crd24.setPreferredSize(new java.awt.Dimension(300, 340));
        crd24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crd24ActionPerformed(evt);
            }
        });

        crd11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/r.png"))); // NOI18N
        crd11.setPreferredSize(new java.awt.Dimension(300, 340));
        crd11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crd11ActionPerformed(evt);
            }
        });

        crd51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/r.png"))); // NOI18N
        crd51.setPreferredSize(new java.awt.Dimension(300, 340));
        crd51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crd51ActionPerformed(evt);
            }
        });

        crd39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/r.png"))); // NOI18N
        crd39.setPreferredSize(new java.awt.Dimension(300, 340));
        crd39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crd39ActionPerformed(evt);
            }
        });

        crd25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/r.png"))); // NOI18N
        crd25.setPreferredSize(new java.awt.Dimension(300, 340));
        crd25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crd25ActionPerformed(evt);
            }
        });

        crd12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/r.png"))); // NOI18N
        crd12.setPreferredSize(new java.awt.Dimension(300, 340));
        crd12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crd12ActionPerformed(evt);
            }
        });

        crd52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/r.png"))); // NOI18N
        crd52.setPreferredSize(new java.awt.Dimension(300, 340));
        crd52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crd52ActionPerformed(evt);
            }
        });

        crd37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/r.png"))); // NOI18N
        crd37.setPreferredSize(new java.awt.Dimension(300, 340));
        crd37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crd37ActionPerformed(evt);
            }
        });

        crd38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/r.png"))); // NOI18N
        crd38.setPreferredSize(new java.awt.Dimension(300, 340));
        crd38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crd38ActionPerformed(evt);
            }
        });

        crd13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/r.png"))); // NOI18N
        crd13.setPreferredSize(new java.awt.Dimension(300, 340));
        crd13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crd13ActionPerformed(evt);
            }
        });

        crd26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/r.png"))); // NOI18N
        crd26.setPreferredSize(new java.awt.Dimension(300, 340));
        crd26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crd26ActionPerformed(evt);
            }
        });

        jPanel8.setBackground(new java.awt.Color(153, 0, 0));
        jPanel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jugadorO4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        btnJugador1.setBackground(new java.awt.Color(51, 102, 255));
        btnJugador1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        btnJugador1.setText("Jugador Ganador");
        btnJugador1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJugador1ActionPerformed(evt);
            }
        });

        btn3.setFont(new java.awt.Font("Arial Black", 0, 48)); // NOI18N
        btn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/r.png"))); // NOI18N
        btn3.setPreferredSize(new java.awt.Dimension(136, 175));
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn4.setFont(new java.awt.Font("Arial Black", 0, 48)); // NOI18N
        btn4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/r.png"))); // NOI18N
        btn4.setPreferredSize(new java.awt.Dimension(136, 175));
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn5.setFont(new java.awt.Font("Arial Black", 0, 48)); // NOI18N
        btn5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/r.png"))); // NOI18N
        btn5.setPreferredSize(new java.awt.Dimension(136, 175));
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn6.setFont(new java.awt.Font("Arial Black", 0, 48)); // NOI18N
        btn6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/r.png"))); // NOI18N
        btn6.setPreferredSize(new java.awt.Dimension(136, 175));
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn7.setFont(new java.awt.Font("Arial Black", 0, 48)); // NOI18N
        btn7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/r.png"))); // NOI18N
        btn7.setPreferredSize(new java.awt.Dimension(136, 175));
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn8.setFont(new java.awt.Font("Arial Black", 0, 48)); // NOI18N
        btn8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/r.png"))); // NOI18N
        btn8.setPreferredSize(new java.awt.Dimension(136, 175));
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(204, 204, 204));
        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Cartas de los Jugadores :");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jLabel7)
                .addGap(90, 90, 90)
                .addComponent(jugadorO4, javax.swing.GroupLayout.DEFAULT_SIZE, 16, Short.MAX_VALUE))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnJugador1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(254, 254, 254)
                        .addComponent(jugadorO4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnJugador1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(crd27, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(crd40, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(crd28, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(crd41, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(crd29, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(crd30, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(crd42, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(crd43, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(crd44, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(crd45, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(crd46, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(crd47, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(crd48, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(crd49, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(crd50, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(crd51, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(crd52, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(crd1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(crd14, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(crd2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(crd3, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(crd15, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(crd16, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(crd4, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(crd5, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(crd6, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(crd7, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(crd8, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(crd9, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(crd10, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(crd11, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(crd12, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(crd13, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(crd31, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(crd32, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(crd17, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(crd18, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(crd19, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(crd20, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(crd21, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(crd22, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(crd23, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(crd24, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(crd25, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(crd26, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(crd33, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(crd34, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(crd35, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(crd36, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(crd37, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(crd38, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(crd39, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(crd21, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(crd15, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(crd17, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(crd14, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(crd18, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(crd16, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(crd19, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(crd20, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(crd22, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(crd23, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(crd24, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(crd25, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(crd26, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(5, 5, 5))))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(crd4, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(crd2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(crd3, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(crd5, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(crd1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(crd6, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(crd7, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(crd8, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(crd9, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(crd10, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(crd11, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(crd12, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(crd13, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(crd32, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(crd35, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(crd48, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(crd36, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(crd38, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(crd39, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(crd37, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(crd49, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(crd50, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(crd51, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(crd52, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(crd28, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(crd29, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(crd41, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(crd30, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(crd43, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(crd31, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(crd33, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(crd34, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(crd27, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(7, 7, 7)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(crd42, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(crd44, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(crd45, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(crd46, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(crd47, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(crd40, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addGap(447, 447, 447))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(2533, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 756, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(706, Short.MAX_VALUE))
        );

        jScrollPane3.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel1))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 2440, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(22, 22, 22)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 789, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(399, 399, 399)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void crd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crd1ActionPerformed
        // TODO add your handling code here:

        String nombre = nombreImagenes.get(0);
        if (procesarTurno(nombre)) {
            crd1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/" + nombre)));
            crd1.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/" + nombre)));
            crd1.setEnabled(false);

        }
    }//GEN-LAST:event_crd1ActionPerformed

    private void crd2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crd2ActionPerformed
        // TODO add your handling code here:
        String nombre = nombreImagenes.get(1);
        if (procesarTurno(nombre)) {
            crd2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/" + nombre)));
            crd2.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/" + nombre)));
            crd2.setEnabled(false);
        }

    }//GEN-LAST:event_crd2ActionPerformed

    private void crd3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crd3ActionPerformed
        // TODO add your handling code here:
        String nombre = nombreImagenes.get(2);
        if (procesarTurno(nombre)) {
            crd3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/" + nombre)));
            crd3.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/" + nombre)));
            crd3.setEnabled(false);
        }
    }//GEN-LAST:event_crd3ActionPerformed

    private void crd4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crd4ActionPerformed
        // TODO add your handling code here:
        String nombre = nombreImagenes.get(3);
        if (procesarTurno(nombre)) {
            crd4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/" + nombre)));
            crd4.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/" + nombre)));
            crd4.setEnabled(false);
        }
    }//GEN-LAST:event_crd4ActionPerformed

    private void crd6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crd6ActionPerformed
        // TODO add your handling code here:
        String nombre = nombreImagenes.get(5);
        if (procesarTurno(nombre)) {
            crd6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/" + nombre)));
            crd6.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/" + nombre)));
            crd6.setEnabled(false);
        }


    }//GEN-LAST:event_crd6ActionPerformed

    private void crd5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crd5ActionPerformed
        // TODO add your handling code here:
        String nombre = nombreImagenes.get(4);
        if (procesarTurno(nombre)) {
            crd5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/" + nombre)));
            crd5.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/" + nombre)));
            crd5.setEnabled(false);
        }
    }//GEN-LAST:event_crd5ActionPerformed

    private void crd7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crd7ActionPerformed
        // TODO add your handling code here:
        String nombre = nombreImagenes.get(6);
        if (procesarTurno(nombre)) {
            crd7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/" + nombre)));
            crd7.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/" + nombre)));
            crd7.setEnabled(false);
        }
    }//GEN-LAST:event_crd7ActionPerformed

    private void crd1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crd1MouseExited
        // TODO add your handling code here:

    }//GEN-LAST:event_crd1MouseExited

    private void crd2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crd2MouseExited
        // TODO add your handling code here:

    }//GEN-LAST:event_crd2MouseExited

    private void crd8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crd8ActionPerformed
        // TODO add your handling code here:
        String nombre = nombreImagenes.get(7);
        if (procesarTurno(nombre)) {
            crd8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/" + nombre)));
            crd8.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/" + nombre)));
            crd8.setEnabled(false);
        }
    }//GEN-LAST:event_crd8ActionPerformed

    private void crd9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crd9ActionPerformed
        // TODO add your handling code here:
        String nombre = nombreImagenes.get(8);
        if (procesarTurno(nombre)) {
            crd9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/" + nombre)));
            crd9.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/" + nombre)));
            crd9.setEnabled(false);
        }

    }//GEN-LAST:event_crd9ActionPerformed

    private void crd10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crd10ActionPerformed
        // TODO add your handling code here:
        String nombre = nombreImagenes.get(9);
        if (procesarTurno(nombre)) {
            crd10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/" + nombre)));
            crd10.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/" + nombre)));
            crd10.setEnabled(false);
        }
    }//GEN-LAST:event_crd10ActionPerformed

    private void crd14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crd14ActionPerformed
        // TODO add your handling code here:
        String nombre = nombreImagenes.get(13);
        if (procesarTurno(nombre)) {
            crd14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/" + nombre)));
            crd14.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/" + nombre)));
            crd14.setEnabled(false);
        }
    }//GEN-LAST:event_crd14ActionPerformed

    private void crd15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crd15ActionPerformed
        // TODO add your handling code here:
        String nombre = nombreImagenes.get(14);
        if (procesarTurno(nombre)) {
            crd15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/" + nombre)));
            crd15.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/" + nombre)));
            crd15.setEnabled(false);
        }
    }//GEN-LAST:event_crd15ActionPerformed

    private void crd16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crd16ActionPerformed
        // TODO add your handling code here:
        String nombre = nombreImagenes.get(15);
        if (procesarTurno(nombre)) {
            crd16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/" + nombre)));
            crd16.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/" + nombre)));
            crd16.setEnabled(false);
        }

    }//GEN-LAST:event_crd16ActionPerformed

    private void crd17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crd17ActionPerformed
        // TODO add your handling code here:
        String nombre = nombreImagenes.get(16);
        if (procesarTurno(nombre)) {
            crd17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/" + nombre)));
            crd17.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/" + nombre)));
            crd17.setEnabled(false);
        }
    }//GEN-LAST:event_crd17ActionPerformed

    private void crd18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crd18ActionPerformed
        // TODO add your handling code here:
        String nombre = nombreImagenes.get(17);
        if (procesarTurno(nombre)) {
            crd18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/" + nombre)));
            crd18.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/" + nombre)));
            crd18.setEnabled(false);
        }
    }//GEN-LAST:event_crd18ActionPerformed

    private void crd28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crd28ActionPerformed
        // TODO add your handling code here:
        String nombre = nombreImagenes.get(27);
        if (procesarTurno(nombre)) {
            crd28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/" + nombre)));
            crd28.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/" + nombre)));
            crd28.setEnabled(false);
        }
    }//GEN-LAST:event_crd28ActionPerformed

    private void crd19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crd19ActionPerformed
        // TODO add your handling code here:
        String nombre = nombreImagenes.get(18);
        if (procesarTurno(nombre)) {
            crd19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/" + nombre)));
            crd19.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/" + nombre)));
            crd19.setEnabled(false);
        }
    }//GEN-LAST:event_crd19ActionPerformed

    private void crd11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crd11ActionPerformed
        // TODO add your handling code here:
        String nombre = nombreImagenes.get(10);
        if (procesarTurno(nombre)) {
            crd11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/" + nombre)));
            crd11.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/" + nombre)));
            crd11.setEnabled(false);
        }
    }//GEN-LAST:event_crd11ActionPerformed

    private void crd12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crd12ActionPerformed
        // TODO add your handling code here:
        String nombre = nombreImagenes.get(11);
        if (procesarTurno(nombre)) {
            crd12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/" + nombre)));
            crd12.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/" + nombre)));
            crd12.setEnabled(false);
        }
    }//GEN-LAST:event_crd12ActionPerformed

    private void crd13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crd13ActionPerformed
        // TODO add your handling code here:
        String nombre = nombreImagenes.get(12);
        if (procesarTurno(nombre)) {
            crd13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/" + nombre)));
            crd13.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/" + nombre)));
            crd13.setEnabled(false);
        }
    }//GEN-LAST:event_crd13ActionPerformed

    private void crd52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crd52ActionPerformed
        // TODO add your handling code here:
        String nombre = nombreImagenes.get(51);
        if (procesarTurno(nombre)) {
            crd52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/" + nombre)));
            crd52.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/" + nombre)));
            crd52.setEnabled(false);
        }
    }//GEN-LAST:event_crd52ActionPerformed

    private void crd30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crd30ActionPerformed
        // TODO add your handling code here:
        String nombre = nombreImagenes.get(29);

        if (procesarTurno(nombre)) {
            crd30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/" + nombre)));
            crd30.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/" + nombre)));
            crd30.setEnabled(false);
        }
    }//GEN-LAST:event_crd30ActionPerformed

    private void crd20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crd20ActionPerformed
        // TODO add your handling code here:
        String nombre = nombreImagenes.get(19);
        if (procesarTurno(nombre)) {
            crd20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/" + nombre)));
            crd20.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/" + nombre)));
            crd20.setEnabled(false);
        }
    }//GEN-LAST:event_crd20ActionPerformed

    private void crd21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crd21ActionPerformed
        // TODO add your handling code here:
        String nombre = nombreImagenes.get(20);
        if (procesarTurno(nombre)) {
            crd21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/" + nombre)));
            crd21.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/" + nombre)));
            crd21.setEnabled(false);
        }
    }//GEN-LAST:event_crd21ActionPerformed

    private void crd22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crd22ActionPerformed
        // TODO add your handling code here:
        String nombre = nombreImagenes.get(21);
        if (procesarTurno(nombre)) {
            crd22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/" + nombre)));
            crd22.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/" + nombre)));
            crd22.setEnabled(false);
        }
    }//GEN-LAST:event_crd22ActionPerformed

    private void crd23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crd23ActionPerformed
        // TODO add your handling code here:
        String nombre = nombreImagenes.get(22);
        if (procesarTurno(nombre)) {
            crd23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/" + nombre)));
            crd23.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/" + nombre)));
            crd23.setEnabled(false);
        }
    }//GEN-LAST:event_crd23ActionPerformed

    private void crd24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crd24ActionPerformed
        // TODO add your handling code here:
        String nombre = nombreImagenes.get(23);
        if (procesarTurno(nombre)) {
            crd24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/" + nombre)));
            crd24.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/" + nombre)));
            crd24.setEnabled(false);
        }
    }//GEN-LAST:event_crd24ActionPerformed

    private void crd25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crd25ActionPerformed
        // TODO add your handling code here:
        String nombre = nombreImagenes.get(24);
        if (procesarTurno(nombre)) {
            crd25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/" + nombre)));
            crd25.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/" + nombre)));
            crd25.setEnabled(false);
        }
    }//GEN-LAST:event_crd25ActionPerformed

    private void crd26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crd26ActionPerformed
        // TODO add your handling code here:
        String nombre = nombreImagenes.get(25);
        if (procesarTurno(nombre)) {
            crd26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/" + nombre)));
            crd26.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/" + nombre)));
            crd26.setEnabled(false);
        }
    }//GEN-LAST:event_crd26ActionPerformed

    private void crd27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crd27ActionPerformed
        // TODO add your handling code here:
        String nombre = nombreImagenes.get(26);
        if (procesarTurno(nombre)) {
            crd27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/" + nombre)));
            crd27.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/" + nombre)));
            crd27.setEnabled(false);
        }
    }//GEN-LAST:event_crd27ActionPerformed

    private void crd29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crd29ActionPerformed
        // TODO add your handling code here:
        String nombre = nombreImagenes.get(28);
        if (procesarTurno(nombre)) {
            crd29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/" + nombre)));
            crd29.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/" + nombre)));
            crd29.setEnabled(false);
        }
    }//GEN-LAST:event_crd29ActionPerformed

    private void crd31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crd31ActionPerformed
        // TODO add your handling code here:
        String nombre = nombreImagenes.get(30);
        if (procesarTurno(nombre)) {
            crd31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/" + nombre)));
            crd31.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/" + nombre)));
            crd31.setEnabled(false);
        }
    }//GEN-LAST:event_crd31ActionPerformed

    private void crd32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crd32ActionPerformed
        // TODO add your handling code here:
        String nombre = nombreImagenes.get(31);
        if (procesarTurno(nombre)) {
            crd32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/" + nombre)));
            crd32.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/" + nombre)));
            crd32.setEnabled(false);
        }
    }//GEN-LAST:event_crd32ActionPerformed

    private void crd33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crd33ActionPerformed
        // TODO add your handling code here:
        String nombre = nombreImagenes.get(32);
        if (procesarTurno(nombre)) {
            crd33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/" + nombre)));
            crd33.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/" + nombre)));
            crd33.setEnabled(false);
        }
    }//GEN-LAST:event_crd33ActionPerformed

    private void crd34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crd34ActionPerformed
        // TODO add your handling code here:
        String nombre = nombreImagenes.get(33);
        if (procesarTurno(nombre)) {
            crd34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/" + nombre)));
            crd34.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/" + nombre)));
            crd34.setEnabled(false);
        }
    }//GEN-LAST:event_crd34ActionPerformed

    private void crd35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crd35ActionPerformed
        // TODO add your handling code here:
        String nombre = nombreImagenes.get(34);
        if (procesarTurno(nombre)) {
            crd35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/" + nombre)));
            crd35.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/" + nombre)));
            crd35.setEnabled(false);
        }
    }//GEN-LAST:event_crd35ActionPerformed

    private void crd36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crd36ActionPerformed
        // TODO add your handling code here:
        String nombre = nombreImagenes.get(35);
        if (procesarTurno(nombre)) {
            crd36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/" + nombre)));
            crd36.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/" + nombre)));
            crd36.setEnabled(false);
        }
    }//GEN-LAST:event_crd36ActionPerformed

    private void crd37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crd37ActionPerformed
        // TODO add your handling code here:
        String nombre = nombreImagenes.get(36);
        if (procesarTurno(nombre)) {
            crd37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/" + nombre)));
            crd37.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/" + nombre)));
            crd37.setEnabled(false);
        }
    }//GEN-LAST:event_crd37ActionPerformed

    private void crd38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crd38ActionPerformed
        // TODO add your handling code here:
        String nombre = nombreImagenes.get(37);
        if (procesarTurno(nombre)) {
            crd38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/" + nombre)));
            crd38.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/" + nombre)));
            crd38.setEnabled(false);
        }
    }//GEN-LAST:event_crd38ActionPerformed

    private void crd39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crd39ActionPerformed
        // TODO add your handling code here:
        String nombre = nombreImagenes.get(38);
        if (procesarTurno(nombre)) {
            crd39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/" + nombre)));
            crd39.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/" + nombre)));
            crd39.setEnabled(false);
        }
    }//GEN-LAST:event_crd39ActionPerformed

    private void crd40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crd40ActionPerformed
        // TODO add your handling code here:
        String nombre = nombreImagenes.get(39);
        if (procesarTurno(nombre)) {
            crd40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/" + nombre)));
            crd40.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/" + nombre)));
            crd40.setEnabled(false);
        }
    }//GEN-LAST:event_crd40ActionPerformed

    private void crd41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crd41ActionPerformed
        // TODO add your handling code here:
        String nombre = nombreImagenes.get(40);
        if (procesarTurno(nombre)) {
            crd41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/" + nombre)));
            crd41.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/" + nombre)));
            crd41.setEnabled(false);
        }
    }//GEN-LAST:event_crd41ActionPerformed

    private void crd42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crd42ActionPerformed
        // TODO add your handling code here:
        String nombre = nombreImagenes.get(41);
        if (procesarTurno(nombre)) {
            crd42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/" + nombre)));
            crd42.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/" + nombre)));
            crd42.setEnabled(false);
        }
    }//GEN-LAST:event_crd42ActionPerformed

    private void crd43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crd43ActionPerformed
        // TODO add your handling code here:
        String nombre = nombreImagenes.get(42);
        if (procesarTurno(nombre)) {
            crd43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/" + nombre)));
            crd43.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/" + nombre)));
            crd43.setEnabled(false);
        }
    }//GEN-LAST:event_crd43ActionPerformed

    private void crd44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crd44ActionPerformed
        // TODO add your handling code here:
        String nombre = nombreImagenes.get(43);
        if (procesarTurno(nombre)) {
            crd44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/" + nombre)));
            crd44.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/" + nombre)));
            crd44.setEnabled(false);
        }
    }//GEN-LAST:event_crd44ActionPerformed

    private void crd45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crd45ActionPerformed
        // TODO add your handling code here:
        String nombre = nombreImagenes.get(44);
        if (procesarTurno(nombre)) {
            crd45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/" + nombre)));
            crd45.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/" + nombre)));
            crd45.setEnabled(false);
        }
    }//GEN-LAST:event_crd45ActionPerformed

    private void crd46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crd46ActionPerformed
        // TODO add your handling code here:
        String nombre = nombreImagenes.get(45);
        if (procesarTurno(nombre)) {
            crd46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/" + nombre)));
            crd46.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/" + nombre)));
            crd46.setEnabled(false);
        }
    }//GEN-LAST:event_crd46ActionPerformed

    private void crd47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crd47ActionPerformed
        // TODO add your handling code here:
        String nombre = nombreImagenes.get(46);
        if (procesarTurno(nombre)) {
            crd47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/" + nombre)));
            crd47.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/" + nombre)));
            crd47.setEnabled(false);
        }
    }//GEN-LAST:event_crd47ActionPerformed

    private void crd48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crd48ActionPerformed
        // TODO add your handling code here:
        String nombre = nombreImagenes.get(47);
        if (procesarTurno(nombre)) {
            crd48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/" + nombre)));
            crd48.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/" + nombre)));
            crd48.setEnabled(false);
        }
    }//GEN-LAST:event_crd48ActionPerformed

    private void crd49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crd49ActionPerformed
        // TODO add your handling code here:
        String nombre = nombreImagenes.get(48);
        if (procesarTurno(nombre)) {
            crd49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/" + nombre)));
            crd49.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/" + nombre)));
            crd49.setEnabled(false);
        }
    }//GEN-LAST:event_crd49ActionPerformed

    private void crd50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crd50ActionPerformed
        // TODO add your handling code here:
        String nombre = nombreImagenes.get(49);
        if (procesarTurno(nombre)) {
            crd50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/" + nombre)));
            crd50.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/" + nombre)));
            crd50.setEnabled(false);
        }
    }//GEN-LAST:event_crd50ActionPerformed

    private void crd51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crd51ActionPerformed
        // TODO add your handling code here:
        String nombre = nombreImagenes.get(50);
        if (procesarTurno(nombre)) {
            crd51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/" + nombre)));
            crd51.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/mariocard/" + nombre)));
            crd51.setEnabled(false);
        }
    }//GEN-LAST:event_crd51ActionPerformed

    private void btnJugador1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJugador1ActionPerformed
        // TODO add your handling code here:

        encontrarJugadorGanador();

    }//GEN-LAST:event_btnJugador1ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed

        // TODO add your handling code here:

    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn8ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(cards.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cards.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cards.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cards.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cards().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btnJugador1;
    private javax.swing.JButton crd1;
    private javax.swing.JButton crd10;
    private javax.swing.JButton crd11;
    private javax.swing.JButton crd12;
    private javax.swing.JButton crd13;
    private javax.swing.JButton crd14;
    private javax.swing.JButton crd15;
    private javax.swing.JButton crd16;
    private javax.swing.JButton crd17;
    private javax.swing.JButton crd18;
    private javax.swing.JButton crd19;
    private javax.swing.JButton crd2;
    private javax.swing.JButton crd20;
    private javax.swing.JButton crd21;
    private javax.swing.JButton crd22;
    private javax.swing.JButton crd23;
    private javax.swing.JButton crd24;
    private javax.swing.JButton crd25;
    private javax.swing.JButton crd26;
    private javax.swing.JButton crd27;
    private javax.swing.JButton crd28;
    private javax.swing.JButton crd29;
    private javax.swing.JButton crd3;
    private javax.swing.JButton crd30;
    private javax.swing.JButton crd31;
    private javax.swing.JButton crd32;
    private javax.swing.JButton crd33;
    private javax.swing.JButton crd34;
    private javax.swing.JButton crd35;
    private javax.swing.JButton crd36;
    private javax.swing.JButton crd37;
    private javax.swing.JButton crd38;
    private javax.swing.JButton crd39;
    private javax.swing.JButton crd4;
    private javax.swing.JButton crd40;
    private javax.swing.JButton crd41;
    private javax.swing.JButton crd42;
    private javax.swing.JButton crd43;
    private javax.swing.JButton crd44;
    private javax.swing.JButton crd45;
    private javax.swing.JButton crd46;
    private javax.swing.JButton crd47;
    private javax.swing.JButton crd48;
    private javax.swing.JButton crd49;
    private javax.swing.JButton crd5;
    private javax.swing.JButton crd50;
    private javax.swing.JButton crd51;
    private javax.swing.JButton crd52;
    private javax.swing.JButton crd6;
    private javax.swing.JButton crd7;
    private javax.swing.JButton crd8;
    private javax.swing.JButton crd9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel jugadorO4;
    // End of variables declaration//GEN-END:variables
}
