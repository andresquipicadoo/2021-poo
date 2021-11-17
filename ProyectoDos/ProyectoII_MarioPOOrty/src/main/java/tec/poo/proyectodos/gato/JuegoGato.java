/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tec.poo.proyectodos.gato;

import Tablero.Jugador;

import javax.swing.*;
import java.awt.*;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/**
 * @author aquir
 */
public class JuegoGato extends javax.swing.JFrame {

    int turnoJugador = 1;
    int numeroJugador = 0;
    private String fichaGato = "X";
    private int contadorX = 0;
    private int contadorO = 0;
    private Jugador jugador;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel jugadorO;
    private javax.swing.JLabel jugadorX;

    public enum MODO {PRINCIPAL, SUBORDINADO}

    // datos del otro jugador
    private int otroJugador;
    private String nombreOtroJugador;
    private MODO modo;

    public JuegoGato(Jugador jugador, MODO modo) {
        this.modo = modo;
        initComponents();
        this.jugador = jugador;
        iniciarGato();
    }

    private void iniciarGato() {
        if (modo == MODO.PRINCIPAL) {
            DataOutputStream salida = jugador.getSalida();
            DataInputStream entrada = jugador.getEntrada();
            try {
                salida.writeInt(1000);
                otroJugador = entrada.readInt();
                nombreOtroJugador = entrada.readUTF();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else {
            fichaGato = "O";
            esperarOtroJugador();
        }
    }

    private void esperarOtroJugador() {
        try {
            int codigo = jugador.getEntrada().readInt();
            switch (codigo) {
                case 1001:
                    procesarJugada();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void procesarJugada() throws IOException {
        int pos = jugador.getEntrada().readInt();
        String car = jugador.getEntrada().readUTF();
        switch (pos) {
            case 1:
                activarBoton(btn6, car);
                break;
            case 2:
                activarBoton(btn9, car);
                break;
            case 3:
                activarBoton(btn3, car);
                break;
            case 4:
                activarBoton(btn5, car);
                break;
            case 5:
                activarBoton(btn2, car);
                break;
            case 6:
                activarBoton(btn1, car);
                break;
            case 7:
                activarBoton(btn4, car);
                break;
            case 8:
                activarBoton(btn8, car);
                break;
            case 9:
                activarBoton(btn7, car);
                break;
        }
    }

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
            java.util.logging.Logger.getLogger(JuegoGato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JuegoGato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JuegoGato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JuegoGato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JuegoGato(null, MODO.PRINCIPAL).setVisible(true);
            }
        });
    }

    private void Puntaje() {
        jugadorX.setText(String.valueOf(contadorX));
        jugadorO.setText(String.valueOf(contadorO));
    }

    private void cambiarJugador() {
        esperarOtroJugador();
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
        jPanel2 = new javax.swing.JPanel();
        btn3 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jugadorX = new javax.swing.JLabel();
        jugadorO = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 204));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Juego del Gato 1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 11, -1, -1));

        jPanel2.setForeground(new java.awt.Color(0, 0, 153));

        btn3.setFont(new java.awt.Font("Arial Black", 0, 48)); // NOI18N
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn2.setFont(new java.awt.Font("Arial Black", 0, 48)); // NOI18N
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn6.setFont(new java.awt.Font("Arial Black", 0, 48)); // NOI18N
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn9.setFont(new java.awt.Font("Arial Black", 0, 48)); // NOI18N
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btn5.setFont(new java.awt.Font("Arial Black", 0, 48)); // NOI18N
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn1.setFont(new java.awt.Font("Arial Black", 0, 48)); // NOI18N
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn4.setFont(new java.awt.Font("Arial Black", 0, 48)); // NOI18N
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn8.setFont(new java.awt.Font("Arial Black", 0, 48)); // NOI18N
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn7.setFont(new java.awt.Font("Arial Black", 0, 48)); // NOI18N
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(10, 10, 10)
                                                .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btn7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(btn3, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                                                        .addComponent(btn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGap(202, 202, 202))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btn6, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                                        .addComponent(btn9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btn3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(btn2, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                                                .addComponent(btn5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btn8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addComponent(btn7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 74, 546, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gato/mariofondo.jpg"))); // NOI18N

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel2.setText("Jugador 1 Puntaje :");

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel3.setText("Jugador 2 Puntaje :");

        jugadorX.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jugadorO.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(260, 260, 260)
                                                .addComponent(jugadorX, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel2)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(8, 8, 8)
                                                                .addComponent(jugadorO, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jugadorO, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(jugadorX, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(jLabel3)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1043, 627));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void activarBoton(JButton boton, String ficha) {
        boton.setText(ficha);
        if (ficha.equals("X")) {
            boton.setForeground(Color.BLACK);
        }
        else {
            boton.setForeground(Color.BLUE);
        }
        boton.setEnabled(false);
    }

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        // TODO add your handling code here:
        activarBoton(btn7, fichaGato);
        enviarJugada(9, fichaGato);
        cambiarJugador();
        GanadorJuego();
    }//GEN-LAST:event_btn7ActionPerformed

    private void enviarJugada(int pos, String fichaGato) {
        try {
            jugador.getSalida().writeInt(1001);
            jugador.getSalida().writeInt(pos);
            jugador.getSalida().writeUTF(fichaGato);
        }
        catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        // TODO add your handling code here:
        activarBoton(btn8, fichaGato);
        enviarJugada(8, fichaGato);
        cambiarJugador();
        GanadorJuego();
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        // TODO add your handling code here:
        activarBoton(btn4, fichaGato);
        enviarJugada(7, fichaGato);
        cambiarJugador();
        GanadorJuego();
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:
        activarBoton(btn1, fichaGato);
        enviarJugada(6, fichaGato);
        cambiarJugador();
        GanadorJuego();
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        // TODO add your handling code here:
        activarBoton(btn5, fichaGato);
        enviarJugada(4, fichaGato);
        cambiarJugador();
        GanadorJuego();
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        // TODO add your handling code here:
        activarBoton(btn9, fichaGato);
        enviarJugada(2, fichaGato);
        cambiarJugador();
        GanadorJuego();
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        // TODO add your handling code here:
        activarBoton(btn6, fichaGato);
        enviarJugada(1, fichaGato);
        cambiarJugador();
        GanadorJuego();
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        // TODO add your handling code here:
        activarBoton(btn2, fichaGato);
        enviarJugada(5, fichaGato);
        cambiarJugador();
        GanadorJuego();
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        // TODO add your handling code here:
        activarBoton(btn3, fichaGato);
        enviarJugada(3, fichaGato);
        cambiarJugador();
        GanadorJuego();
    }//GEN-LAST:event_btn3ActionPerformed

    private void GanadorJuego() {
        String bt1 = btn1.getText();
        String bt2 = btn2.getText();
        String bt3 = btn3.getText();

        String bt4 = btn4.getText();
        String bt5 = btn5.getText();
        String bt6 = btn6.getText();

        String bt7 = btn7.getText();
        String bt8 = btn8.getText();
        String bt9 = btn9.getText();


        if (bt1 == ("X") && bt2 == ("X") && bt3 == ("X")) {
            JOptionPane.showMessageDialog(this, "! Felicidades el jugador X gana", "Gato", JOptionPane.INFORMATION_MESSAGE);
            contadorX++;
            Puntaje();

            btn1.setBackground(Color.red);
            btn2.setBackground(Color.red);
            btn3.setBackground(Color.red);

        }

        if ((bt4 == null ? ("X") == null : bt4.equals("X")) && bt5 == ("X") && bt6 == ("X")) {
            JOptionPane.showMessageDialog(this, "! Felicidades el jugador X gana", "Gato", JOptionPane.INFORMATION_MESSAGE);
            contadorX++;
            Puntaje();

            btn4.setBackground(Color.red);
            btn5.setBackground(Color.red);
            btn6.setBackground(Color.red);
        }

        if (bt7 == ("X") && bt8 == ("X") && bt9 == ("X")) {
            JOptionPane.showMessageDialog(this, "! Felicidades el jugador X gana", "Gato", JOptionPane.INFORMATION_MESSAGE);
            contadorX++;
            Puntaje();

            btn7.setBackground(Color.red);
            btn8.setBackground(Color.red);
            btn9.setBackground(Color.red);
        }

        if (bt1 == ("X") && bt4 == ("X") && bt7 == ("X")) {
            JOptionPane.showMessageDialog(this, " Felicidades el jugador X gana", "Gato", JOptionPane.INFORMATION_MESSAGE);
            contadorX++;
            Puntaje();

            btn1.setBackground(Color.red);
            btn4.setBackground(Color.red);
            btn7.setBackground(Color.red);
        }

        if (bt2 == ("X") && bt5 == ("X") && bt8 == ("X")) {
            JOptionPane.showMessageDialog(this, "Felicades jugador X ganador", "Gato", JOptionPane.INFORMATION_MESSAGE);
            contadorX++;
            Puntaje();

            btn2.setBackground(Color.red);
            btn5.setBackground(Color.red);
            btn8.setBackground(Color.red);
        }
        if (bt3 == ("X") && bt6 == ("X") && bt9 == ("X")) {
            JOptionPane.showMessageDialog(this, "! Felicidades el jugador X gana", "Gato", JOptionPane.INFORMATION_MESSAGE);
            contadorX++;
            Puntaje();

            btn3.setBackground(Color.red);
            btn6.setBackground(Color.red);
            btn9.setBackground(Color.red);
        }


        if (bt1 == ("X") && bt5 == ("X") && bt9 == ("X")) {
            JOptionPane.showMessageDialog(this, "! Felicidades el jugador X gana", "Gato", JOptionPane.INFORMATION_MESSAGE);
            contadorX++;
            Puntaje();

            btn1.setBackground(Color.red);
            btn5.setBackground(Color.red);
            btn9.setBackground(Color.red);
        }

        if (bt3.equals("X") && bt5 == ("X") && bt7 == ("X")) {
            JOptionPane.showMessageDialog(this, "! Felicidades el jugador X gana", "Gato", JOptionPane.INFORMATION_MESSAGE);
            contadorX++;
            Puntaje();

            btn3.setBackground(Color.red);
            btn5.setBackground(Color.red);
            btn7.setBackground(Color.red);
        }


        if (bt1.equals("O") && bt2 == ("O") && bt3 == ("O")) {
            JOptionPane.showMessageDialog(this, "! Felicidades el jugador o gana", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            contadorO++;
            Puntaje();

            btn1.setBackground(Color.DARK_GRAY);
            btn2.setBackground(Color.DARK_GRAY);
            btn3.setBackground(Color.DARK_GRAY);

        }

        if (bt4.equals("O") && bt5 == ("O") && bt6 == ("O")) {
            JOptionPane.showMessageDialog(this, "! Felicidades el jugador O gana", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            contadorO++;
            Puntaje();

            btn4.setBackground(Color.DARK_GRAY);
            btn5.setBackground(Color.red);
            btn6.setBackground(Color.red);
        }

        if (bt7.equals("O") && bt8 == ("O") && bt9 == ("O")) {
            JOptionPane.showMessageDialog(this, "! Felicidades el jugador O gana", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            contadorO++;
            Puntaje();

            btn7.setBackground(Color.YELLOW);
            btn8.setBackground(Color.YELLOW);
            btn9.setBackground(Color.YELLOW);
        }

        if (bt1.equals("O") && bt4 == ("O") && bt7 == ("O")) {
            JOptionPane.showMessageDialog(this, "! Felicidades el jugador X gana", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            contadorO++;
            Puntaje();

            btn1.setBackground(Color.red);
            btn4.setBackground(Color.red);
            btn7.setBackground(Color.red);
        }

        if (bt2.equals("O") && bt5 == ("O") && bt8 == ("O")) {
            JOptionPane.showMessageDialog(this, "! Felicidades el jugador O gana", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            contadorO++;
            Puntaje();

            btn2.setBackground(Color.red);
            btn5.setBackground(Color.red);
            btn8.setBackground(Color.red);
        }
        if (bt3.equals("O") && bt6 == ("O") && bt9 == ("O")) {
            JOptionPane.showMessageDialog(this, "! Felicidades el jugador O gana", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            contadorO++;
            Puntaje();

            btn3.setBackground(Color.red);
            btn6.setBackground(Color.red);
            btn9.setBackground(Color.red);
        }


        if (bt1.equals("O") && bt5 == ("O") && bt9 == ("O")) {
            JOptionPane.showMessageDialog(this, "! Felicidades el jugador O gana", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            contadorO++;
            Puntaje();

            btn1.setBackground(Color.BLUE);
            btn5.setBackground(Color.BLUE);
            btn9.setBackground(Color.BLUE);

        }

        if (bt3 == ("O") && bt5 == ("O") && bt7 == ("O")) {
            JOptionPane.showMessageDialog(this, "! Felicidades el jugador O gana", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            contadorO++;
            Puntaje();

            btn3.setBackground(Color.red);
            btn5.setBackground(Color.red);
            btn7.setBackground(Color.red);
        }


    }
    // End of variables declaration//GEN-END:variables
}
