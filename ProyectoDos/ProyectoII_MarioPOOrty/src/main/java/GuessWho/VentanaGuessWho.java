package GuessWho;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class VentanaGuessWho extends javax.swing.JFrame {
    private Random rn = new Random();
    private JLabel imagen = new JLabel();
    private JLabel matriz[][] = new JLabel[10][10];
    private BotonPersonajes botones[] = new BotonPersonajes[15];
    private String personajes[] = {"mario", "luigi", "peach", "blooper", "birdo",
            "boo", "toadette", "toad", "bowser", "yoshi",
            "koopas", "goombas", "floruga", "daisy", "waluigi"};

    public VentanaGuessWho() {
        initComponents();
        generateLabels();
        generateHideImage();
        removeLabels();
        generateButtons();
    }

    private void generateLabels() {
        for (int fila = 0; fila < 10; fila++) {
            for (int col = 0; col < 10; col++) {
                JLabel label = new JLabel();
                matriz[fila][col] = label;
                label.setBounds(50 * fila, 50 * col, 50, 50);
                label.setIcon(new ImageIcon("bloqueGW.png"));
                this.add(label);
            }
        }
    }

    private void generateHideImage() {
        imagen.setBounds(0, 0, 500, 500);
        imagen.setOpaque(true);
        imagen.setBackground(Color.white);
        imagen.setName(getImage());
        Image imgEscalada = new ImageIcon(imagen.getName() + ".png").getImage().getScaledInstance(imagen.getWidth(), imagen.getHeight(), Image.SCALE_SMOOTH);
        Icon iconoEscalado = new ImageIcon(imgEscalada);
        imagen.setIcon(iconoEscalado);
        this.add(imagen);
    }

    private String getImage() {
        return personajes[rn.nextInt(15)];
    }

    private void removeLabels() {
        int cant = getCantLabels();
        boolean keepDoing = false;
        System.out.println(cant);
        do {
            for (int fila = 5; fila < 10; fila++) {
                for (int col = 2; col < 10; col++) {
                    if (rn.nextBoolean()) {
                        matriz[fila][col].setVisible(false);
                        cant--;
                        if (cant == 0)
                            break;
                    }
                }
                if (cant == 0)
                    break;
            }
            if (cant != 0)
                keepDoing = true;
        } while (keepDoing);
    }

    private int getCantLabels() {
        switch (rn.nextInt(5)) {
            case 1:
                return 4;
            case 2:
                return 5;
            case 3:
                return 6;
            case 4:
                return 7;
            default:
                return 8;
        }
    }

    private void generateButtons() {
        int fila = 550;
        int col = 0;
        for (String personaje : personajes) {
            BotonPersonajes boton = new BotonPersonajes(fila, 30 * col, this, personaje);
            botones[col] = boton;
            this.add(boton);
            col++;
        }
    }

    public void finish(String personaje) {
        if (personaje.equals(imagen.getName()))
            JOptionPane.showMessageDialog(this, "Ganó", "Adivinó el personaje", JOptionPane.INFORMATION_MESSAGE);
        else
            JOptionPane.showMessageDialog(this, "Perdió", "No adivinó el personaje", JOptionPane.ERROR_MESSAGE);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("GuessWho");
        setResizable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 700, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 506, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
