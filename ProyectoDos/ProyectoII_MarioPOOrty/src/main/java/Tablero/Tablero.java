/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tablero;

import tec.poo.proyectodos.gato.JuegoGato;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

/**
 * @author raque
 */
public class Tablero extends javax.swing.JFrame {
    private final static int FICHAS_SIZE = 25;
    public Jugador jugador;
    public ArrayList<String> players = new ArrayList<String>();
    public ArrayList<String> casillasName = new ArrayList<String>();
    private String playersInit[] = {"mario", "luigi", "peach", "daisy", "yoshi", "toad"};
    private JLabel fichasInit[];
    private JLabel fichas[];
    private int posicionFicha = -1;
    private Casilla casillas[] = new Casilla[26];
    private JLabel casillaInit = new JLabel();
    private JLabel casillaFinal = new JLabel();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDado;
    private javax.swing.JButton btnInit;
    private javax.swing.JButton btnStart;
    private javax.swing.JLabel lblDado;

    public Tablero() {

        try {
            initComponents();

            // Cra una cliente que es su coenxion al server
            jugador = new Jugador(this);
            jugador.conexion();
            initFichas();
            initCasillas();
        } catch (IOException ex) {

        }
        btnDado.setVisible(false);

    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tablero().setVisible(true);
            }
        });
    }

    public void addFicha(String personaje) {
        players.add(personaje);
    }

    public void initFichas() {
        int x = 1;
        int y = 0;
        fichasInit = new JLabel[playersInit.length];
        for (int i = 0; i < playersInit.length; i++) {
            if (i % 2 == 0 && i > 0) {
                x = 1;
                y++;
            }
            JLabel jugador = new JLabel();
            fichasInit[i] = jugador;
            jugador.setBounds(x * FICHAS_SIZE, y * FICHAS_SIZE, FICHAS_SIZE, FICHAS_SIZE);
            setIcon(new ImageIcon(playersInit[i] + "Character.png"), jugador, null);
            x += 1;
            this.add(jugador);
            jugador.setVisible(false);
        }
    }

    public void addFichas() {
        int index = 0;
        fichas = new JLabel[players.size()];
        for (int i = 0; i < playersInit.length; i++) {
            System.out.println(i + " -> " + playersInit[i]);
            if (players.contains(playersInit[i])) {
                fichas[index] = fichasInit[i];
                fichasInit[i].setVisible(true);
                index++;
            }
        }
    }

    public void initCasillas() {
        casillaInit.setBounds(0, 0, FICHAS_SIZE * 4, FICHAS_SIZE * 4);
        setIcon(new ImageIcon("inicioTablero.png"), casillaInit, null);
        this.add(casillaInit);

        casillaFinal.setBounds(660, 320, FICHAS_SIZE * 4, FICHAS_SIZE * 4);
        setIcon(new ImageIcon("estrellaGanadorTablero.png"), casillaFinal, null);
        this.add(casillaFinal);

        int x = 0;
        int y = 0;
        int contY = 1;
        int contX = 0;
        Color c = null;
        for (int i = 0; i < casillas.length; i++) {

            if (i % 2 == 0) c = c.red;
            else c = c.blue;

            if (i == 8 || i == 9 || i == 17 || i == 18) {
                y = 10 + (contY * Casilla.CASILLA_SIZE);
                contY++;
            } else if (i < 8 || i > 17) {
                x = 100 + (contX * Casilla.CASILLA_SIZE);
                contX++;
                if (i == 7) contX = 0;
                if (i < 8) y = 10;
                else y = 330;
            } else if (i > 8 && i < 17) {
                x = x - Casilla.CASILLA_SIZE;
                y = 170;
            }

            casillas[i] = new Casilla(casillasName.get(i), x, y, c, this);
            this.add(casillas[i]);
        }
    }

    private void setIcon(ImageIcon icon, JLabel label, JButton boton) {
        if (boton == null) {
            Image imgEscalada = icon.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
            Icon iconoEscalado = new ImageIcon(imgEscalada);
            label.setIcon(iconoEscalado);
        } else {
            Image imgEscalada = icon.getImage().getScaledInstance(boton.getWidth(), boton.getHeight(), Image.SCALE_SMOOTH);
            Icon iconoEscalado = new ImageIcon(imgEscalada);
            boton.setIcon(iconoEscalado);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnInit = new javax.swing.JButton();
        btnStart = new javax.swing.JButton();
        btnDado = new javax.swing.JButton();
        lblDado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MarioPOOrty");

        btnInit.setText("InitTablero");
        btnInit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInitActionPerformed(evt);
            }
        });

        btnStart.setText("Start");
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });

        btnDado.setText("Dado");
        btnDado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(btnDado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnStart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnInit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 673, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblDado, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(251, Short.MAX_VALUE)
                                .addComponent(btnInit, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnStart, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnDado, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblDado, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInitActionPerformed
        try {
            jugador.salida.writeInt(0);
            btnStart.setEnabled(true);
        } catch (IOException ex) {

        }
    }//GEN-LAST:event_btnInitActionPerformed

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
        try {
            jugador.salida.writeInt(1);
        } catch (IOException ex) {
        }
        setInitialButtons(false);
        btnDado.setVisible(true);
    }//GEN-LAST:event_btnStartActionPerformed

    private void btnDadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDadoActionPerformed
        Random rn = new Random();
        int pos = rn.nextInt(6) + 1;
        lblDado.setText((pos) + "");

        JLabel ficha = fichas[getIndex(jugador.nomCliente)];
        posicionFicha += pos;
        ficha.setLocation(casillas[posicionFicha].getLocation());

        try {
            jugador.salida.writeInt(4); // enviar la posicion del jugador que esta jugando
            jugador.salida.writeUTF(jugador.nomCliente);
            jugador.salida.writeInt(ficha.getX());
            jugador.salida.writeInt(ficha.getY());
            jugador.salida.writeInt(3); // indica que el siguiente use el dado
        } catch (IOException ex) {
        }

        btnDado.setVisible(false);
        casillas[posicionFicha].getFunction(jugador);

//        if ((posicionFicha+pos) == casillas.length){
//
//        }else{
//            if ((posicionFicha+pos) > casillas.length){
//
//            }
//
//            JLabel ficha = fichas[getIndex(jugador.nomCliente)];
//            posicionFicha += pos;
//            ficha.setLocation(casillas[posicionFicha].getLocation());
//
//            try {
//                jugador.salida.writeInt(4); // enviar la posicion del jugador que esta jugando
//                jugador.salida.writeUTF(jugador.nomCliente);
//                jugador.salida.writeInt(ficha.getX());
//                jugador.salida.writeInt(ficha.getY());
//                jugador.salida.writeInt(3); // indica que el siguiente use el dado
//            } catch (IOException ex) {
//            }
//
//            btnDado.setVisible(false);
//            casillas[posicionFicha].getFunction();
//        }
    }//GEN-LAST:event_btnDadoActionPerformed

    public void setInitialButtons(boolean visible) {
        btnInit.setVisible(visible);
        btnStart.setVisible(visible);
        if (visible)
            btnStart.setEnabled(false);
    }

    public void setDadoVisible(boolean visible) {
        btnDado.setVisible(visible);
    }

    private int getIndex(String jugador) {
        for (int i = 0; i < players.size(); i++) {
            if (players.get(i).equals(jugador))
                return i;
        }
        return -1;
    }

    public void moveFicha(String nombre, int x, int y) {
        JLabel ficha = fichas[getIndex(nombre)];
        ficha.setLocation(x, y);
    }

    public void doGato() {
        // Random rn = new Random(fichas.length);
        //jugador.salida.writeInt();
        //jugarGato();
    }

    public void jugarGato() {
        JuegoGato g = new JuegoGato(jugador, JuegoGato.MODO.SUBORDINADO);
        g.setVisible(true);
    }
    // End of variables declaration//GEN-END:variables
}
