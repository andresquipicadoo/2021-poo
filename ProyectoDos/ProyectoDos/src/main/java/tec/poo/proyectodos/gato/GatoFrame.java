/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tec.poo.proyectodos.gato;

import javax.swing.*;
import java.awt.*;

/**
 * @author aquir
 */
public class GatoFrame extends javax.swing.JFrame {
    int turnoJugador = 1;
    //numero de jugador 1 o 2
    int numeroJugador = 0;
    private String iniciaJuego = "X";
    private int contadorX = 0;
    private int contadorO = 0;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jugadorO;
    private javax.swing.JLabel jugadorX;
    /**
     * Creates new form gat
     */
    public GatoFrame() {
        initComponents();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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
            java.util.logging.Logger.getLogger(GatoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GatoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GatoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GatoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GatoFrame().setVisible(true);
            }
        });
    }

    private void marcadorJuego() {
        jugadorX.setText(String.valueOf(contadorX));
        jugadorO.setText(String.valueOf(contadorO));
    }

    private void escogerJugador() {
        if (iniciaJuego.equalsIgnoreCase("X")) {
            iniciaJuego = "O";
        } else {
            iniciaJuego = "X";
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

        jLabel1 = new javax.swing.JLabel();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jugadorX = new javax.swing.JLabel();
        jugadorO = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("Tic Tac Toe");

        btn1.setFont(new java.awt.Font("Arial Black", 0, 48)); // NOI18N
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.setFont(new java.awt.Font("Arial Black", 0, 48)); // NOI18N
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setFont(new java.awt.Font("Arial Black", 0, 48)); // NOI18N
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn4.setFont(new java.awt.Font("Arial Black", 0, 48)); // NOI18N
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn5.setFont(new java.awt.Font("Arial Black", 0, 48)); // NOI18N
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn6.setFont(new java.awt.Font("Arial Black", 0, 48)); // NOI18N
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn7.setFont(new java.awt.Font("Arial Black", 0, 48)); // NOI18N
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn8.setFont(new java.awt.Font("Arial Black", 0, 48)); // NOI18N
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn9.setFont(new java.awt.Font("Arial Black", 0, 48)); // NOI18N
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel2.setText("Jugador 01 :");

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel3.setText("Jugador 02 :");

        jugadorX.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jugadorO.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        jLabel4.setText("VS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(26, 26, 26)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jugadorO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jLabel2)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jugadorX, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(83, 83, 83)
                                                .addComponent(jLabel4)))
                                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jugadorX, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(95, 95, 95)
                                                .addComponent(jugadorO, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel4)
                                                .addGap(32, 32, 32)
                                                .addComponent(jLabel3)))
                                .addContainerGap(122, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(23, 23, 23)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(btn9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(btn4, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                                                                        .addComponent(btn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(btn6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(156, 156, 156)
                                                .addComponent(jLabel1)))
                                .addGap(112, 112, 112))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(btn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(btn2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(btn3, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(btn4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(btn5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(btn6, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(9, 9, 9)
                                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btn7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btn8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btn9, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE))
                                .addContainerGap(53, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:
        btn1.setText(iniciaJuego);

        if (iniciaJuego.equalsIgnoreCase("X")) {
            btn1.setForeground(Color.RED);
        } else {
            btn1.setForeground(Color.GREEN);
        }

        escogerJugador();
        winningGame();
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        // TODO add your handling code here:
        btn2.setText(iniciaJuego);

        if (iniciaJuego.equalsIgnoreCase("X")) {
            btn2.setForeground(Color.RED);
        } else {
            btn2.setForeground(Color.GREEN);
        }

        escogerJugador();
        winningGame();
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        // TODO add your handling code here:
        btn3.setText(iniciaJuego);

        if (iniciaJuego.equalsIgnoreCase("X")) {
            btn3.setForeground(Color.RED);
        } else {
            btn3.setForeground(Color.GREEN);
        }

        escogerJugador();
        winningGame();
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        // TODO add your handling code here:
        btn4.setText(iniciaJuego);

        if (iniciaJuego.equalsIgnoreCase("X")) {
            btn4.setForeground(Color.RED);
        } else {
            btn4.setForeground(Color.GREEN);
        }

        escogerJugador();
        winningGame();
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        // TODO add your handling code here:
        btn5.setText(iniciaJuego);

        if (iniciaJuego.equalsIgnoreCase("X")) {
            btn5.setForeground(Color.RED);
        } else {
            btn5.setForeground(Color.GREEN);
        }

        escogerJugador();
        winningGame();
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        // TODO add your handling code here:
        btn6.setText(iniciaJuego);

        if (iniciaJuego.equalsIgnoreCase("X")) {
            btn6.setForeground(Color.RED);
        } else {
            btn6.setForeground(Color.GREEN);
        }

        escogerJugador();
        winningGame();
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        // TODO add your handling code here:
        btn7.setText(iniciaJuego);

        if (iniciaJuego.equalsIgnoreCase("X")) {
            btn7.setForeground(Color.RED);
        } else {
            btn7.setForeground(Color.GREEN);
        }

        escogerJugador();
        winningGame();
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        // TODO add your handling code here:
        btn8.setText(iniciaJuego);

        if (iniciaJuego.equalsIgnoreCase("X")) {
            btn8.setForeground(Color.RED);
        } else {
            btn8.setForeground(Color.GREEN);
        }

        escogerJugador();
        winningGame();
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        // TODO add your handling code here:
        btn9.setText(iniciaJuego);

        if (iniciaJuego.equalsIgnoreCase("X")) {
            btn9.setForeground(Color.RED);
        } else {
            btn9.setForeground(Color.GREEN);
        }

        escogerJugador();
        winningGame();
    }//GEN-LAST:event_btn9ActionPerformed

    private void winningGame() {
        String bt1 = btn1.getText();
        String bt2 = btn2.getText();
        String bt3 = btn3.getText();

        String bt4 = btn4.getText();
        String bt5 = btn5.getText();
        String bt6 = btn6.getText();

        String bt7 = btn7.getText();
        String bt8 = btn8.getText();
        String bt9 = btn9.getText();


        // PLAYER X CODING

        if (bt1 == ("X") && bt2 == ("X") && bt3 == ("X")) {
            JOptionPane.showMessageDialog(this, "! Felicidades, el jugador X gana", "Gato", JOptionPane.INFORMATION_MESSAGE);
            contadorX++;
            marcadorJuego();

            btn1.setBackground(Color.red);
            btn2.setBackground(Color.red);
            btn3.setBackground(Color.red);

        }

        if ((bt4 == null ? ("X") == null : bt4.equals("X")) && bt5 == ("X") && bt6 == ("X")) {
            JOptionPane.showMessageDialog(this, "! Felicidades el jugador X gana", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            contadorX++;
            marcadorJuego();

            btn4.setBackground(Color.red);
            btn5.setBackground(Color.red);
            btn6.setBackground(Color.red);
        }

        if (bt7 == ("X") && bt8 == ("X") && bt9 == ("X")) {
            JOptionPane.showMessageDialog(this, "! Felicidades el jugador X gana", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            contadorX++;
            marcadorJuego();

            btn7.setBackground(Color.red);
            btn8.setBackground(Color.red);
            btn9.setBackground(Color.red);
        }

        if (bt1 == ("X") && bt4 == ("X") && bt7 == ("X")) {
            JOptionPane.showMessageDialog(this, " Felicidades el jugador X gana", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            contadorX++;
            marcadorJuego();

            btn1.setBackground(Color.red);
            btn4.setBackground(Color.red);
            btn7.setBackground(Color.red);
        }

        if (bt2 == ("X") && bt5 == ("X") && bt8 == ("X")) {
            JOptionPane.showMessageDialog(this, "Felicades jugador X ganador", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            contadorX++;
            marcadorJuego();

            btn2.setBackground(Color.red);
            btn5.setBackground(Color.red);
            btn8.setBackground(Color.red);
        }
        if (bt3 == ("X") && bt6 == ("X") && bt9 == ("X")) {
            JOptionPane.showMessageDialog(this, "! Felicidades el jugador X gana", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            contadorX++;
            marcadorJuego();

            btn3.setBackground(Color.red);
            btn6.setBackground(Color.red);
            btn9.setBackground(Color.red);
        }


        if (bt1 == ("X") && bt5 == ("X") && bt9 == ("X")) {
            JOptionPane.showMessageDialog(this, "! Felicidades el jugador X gana", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            contadorX++;
            marcadorJuego();

            btn1.setBackground(Color.red);
            btn5.setBackground(Color.red);
            btn9.setBackground(Color.red);
        }

        if (bt3 == ("X") && bt5 == ("X") && bt7 == ("X")) {
            JOptionPane.showMessageDialog(this, "! Felicidades el jugador X gana", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            contadorX++;
            marcadorJuego();

            btn3.setBackground(Color.red);
            btn5.setBackground(Color.red);
            btn7.setBackground(Color.red);
        }


        // PLAYER O CODING


        if (bt1 == ("O") && bt2 == ("O") && bt3 == ("O")) {
            JOptionPane.showMessageDialog(this, "! Felicidades el jugador o gana", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            contadorO++;
            marcadorJuego();

            btn1.setBackground(Color.DARK_GRAY);
            btn2.setBackground(Color.DARK_GRAY);
            btn3.setBackground(Color.DARK_GRAY);

        }

        if (bt4 == ("O") && bt5 == ("O") && bt6 == ("O")) {
            JOptionPane.showMessageDialog(this, "! Felicidades el jugador O gana", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            contadorO++;
            marcadorJuego();

            btn4.setBackground(Color.DARK_GRAY);
            btn5.setBackground(Color.red);
            btn6.setBackground(Color.red);
        }

        if (bt7 == ("O") && bt8 == ("O") && bt9 == ("O")) {
            JOptionPane.showMessageDialog(this, "! Felicidades el jugador O gana", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            contadorO++;
            marcadorJuego();

            btn7.setBackground(Color.YELLOW);
            btn8.setBackground(Color.YELLOW);
            btn9.setBackground(Color.YELLOW);
        }

        if (bt1 == ("O") && bt4 == ("O") && bt7 == ("O")) {
            JOptionPane.showMessageDialog(this, "! Felicidades el jugador X gana", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            contadorO++;
            marcadorJuego();

            btn1.setBackground(Color.red);
            btn4.setBackground(Color.red);
            btn7.setBackground(Color.red);
        }

        if (bt2 == ("O") && bt5 == ("O") && bt8 == ("O")) {
            JOptionPane.showMessageDialog(this, "! Felicidades el jugador O gana", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            contadorO++;
            marcadorJuego();

            btn2.setBackground(Color.red);
            btn5.setBackground(Color.red);
            btn8.setBackground(Color.red);
        }
        if (bt3 == ("O") && bt6 == ("O") && bt9 == ("O")) {
            JOptionPane.showMessageDialog(this, "! Felicidades el jugador O gana", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            contadorO++;
            marcadorJuego();

            btn3.setBackground(Color.red);
            btn6.setBackground(Color.red);
            btn9.setBackground(Color.red);
        }


        if (bt1 == ("O") && bt5 == ("O") && bt9 == ("O")) {
            JOptionPane.showMessageDialog(this, "! Felicidades el jugador O gana", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            contadorO++;
            marcadorJuego();

            btn1.setBackground(Color.BLUE);
            btn5.setBackground(Color.BLUE);
            btn9.setBackground(Color.BLUE);
        }

        if (bt3 == ("O") && bt5 == ("O") && bt7 == ("O")) {
            JOptionPane.showMessageDialog(this, "! Felicidades el jugador O gana", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            contadorO++;
            marcadorJuego();

            btn3.setBackground(Color.red);
            btn5.setBackground(Color.red);
            btn7.setBackground(Color.red);
        }


    }
    // End of variables declaration//GEN-END:variables
}
