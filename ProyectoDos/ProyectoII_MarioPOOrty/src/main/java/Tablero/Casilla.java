package Tablero;

import BomberMario.VentanaBombermario;
import CatchTheCat.VentanaCatchTheCat;
import CollectTheCoins.VentanaCollectTheCoins;
import GuessWho.VentanaGuessWho;
import MemoryPath.VentanaMemoryPath;
import tec.poo.proyectodos.gato.JuegoGato;
import tec.poo.proyectodos.memory.gui.JuegoMemoria;

import javax.swing.*;
import java.awt.*;


public class Casilla extends JLabel {
    public final static int CASILLA_SIZE = 80;
    public String name;
    JFrame tablero;

    public Casilla(String name, int x, int y, Color color, JFrame tablero) {
        this.tablero = tablero;
        this.name = name;
        this.setText(name);
        System.out.println("X: " + x + " Y:" + y);
        this.setBounds(x, y, CASILLA_SIZE, CASILLA_SIZE);
        this.setOpaque(true);
        Image imgEscalada = new ImageIcon(name + ".png").getImage().getScaledInstance(this.getWidth(), this.getHeight(), Image.SCALE_SMOOTH);
        Icon iconoEscalado = new ImageIcon(imgEscalada);

        Color c = Color.BLUE;
        if (name.startsWith("e")) c = Color.RED;

        this.setBorder(BorderFactory.createLineBorder(c, 5));
        this.setIcon(iconoEscalado);
    }

    public void getFunction(Jugador jugador) {
        switch (name) {
            case "Bombermario":
                new VentanaBombermario().setVisible(true);
                break;
            case "CatchTheCat":
                new VentanaCatchTheCat().setVisible(true);
                break;
            case "CollectTheCoins":
                new VentanaCollectTheCoins().setVisible(true);
                break;
            case "GuessWho":
                new VentanaGuessWho().setVisible(true);
                break;
            case "MemoryPath":
                new VentanaMemoryPath().setVisible(true);
                break;
            case "Gato":
                new JuegoGato(jugador).setVisible(true);
                break;
            case "Super Bro Memory":
                new JuegoMemoria().setVisible(true);
                break;
            case "Mario Cards":

                break;
            case "Sopa Letras":

                break;
            default:
                System.out.println("no implementado");
        }
    }
}
