package MemoryPath;

import javax.swing.*;
import java.awt.*;
import java.util.Random;


public class VentanaMemoryPath extends javax.swing.JFrame {
    private Random rn = new Random();
    private int oportunidades = 3;
    private JLabel mario = new JLabel();
    private JLabel estrella = new JLabel();
    private CasillasMP casillas[][] = new CasillasMP[6][3];

    public VentanaMemoryPath() {
        initComponents();
        initLabels();
        initCasillas();
    }

    private void initLabels() {
        mario.setBounds(50, 350, 50, 50);
        Image imgEscalada = new ImageIcon("marioMemoryPath.png").getImage().getScaledInstance(mario.getWidth(), mario.getHeight(), Image.SCALE_SMOOTH);
        Icon iconoEscalado = new ImageIcon(imgEscalada);
        mario.setIcon(iconoEscalado);
        this.add(mario);

        estrella.setBounds(50, 0, 50, 50);
        imgEscalada = new ImageIcon("estrella.png").getImage().getScaledInstance(estrella.getWidth(), estrella.getHeight(), Image.SCALE_SMOOTH);
        iconoEscalado = new ImageIcon(imgEscalada);
        estrella.setIcon(iconoEscalado);
        this.add(estrella);
    }

    private void initCasillas() {
        int value;
        for (int fila = 0; fila < 6; fila++) {
            int random = rn.nextInt(3);
            for (int col = 0; col < 3; col++) {
                value = 0;
                if (random == col)
                    value = 1;
                CasillasMP casilla = new CasillasMP(col * 50, fila * 50 + 50, this, value);
                casillas[fila][col] = casilla;
                this.add(casilla);
            }
        }
    }

    public int getMarioY() {
        return mario.getY();
    }

    public void moveMario(int value, int x, int y) {
        if (value == 1) {
            mario.setLocation(x, y);
            setButtonActual(false);
        } else {
            mario.setLocation(50, 350);
            setAllButtonsVisible();
            oportunidades--;
        }
        if (mario.getY() == 50) {
            JOptionPane.showMessageDialog(this, "Ganó", "Llegó a la estrella", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        if (oportunidades == 0)
            JOptionPane.showMessageDialog(this, "Perdió", "Se acabaron sus opotunidades", JOptionPane.ERROR_MESSAGE);
    }

    private void setButtonActual(boolean visible) {
        casillas[(mario.getY() - 50) / 50][mario.getX() / 50].setVisible(visible);
    }

    private void setAllButtonsVisible() {
        for (int fila = 0; fila < 6; fila++) {
            for (int col = 0; col < 3; col++) {
                casillas[fila][col].setVisible(true);
            }
        }
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
                        .addGap(0, 150, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 400, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
