/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tec.poo.proyectodos.memory.gui;

import javax.swing.*;
import java.awt.*;


public class FondoJuego extends javax.swing.JPanel {


    public FondoJuego(int w, int h) {
        initComponents();

        setSize(w, h);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        /* reemplazar el uso de "../imagenes/..." por "/imagenes/..." */
        Image im = new ImageIcon(getClass().getResource("/memory/fondo.JPG")).getImage();
        g.drawImage(im, 0, 0, getWidth(), getHeight(), null);
        setOpaque(false);
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
