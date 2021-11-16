
package Tablero;

import BomberMario.*;
import CatchTheCat.VentanaCatchTheCat;
import CatchTheCat.BotonCirculo;
import CollectTheCoins.*;
import GuessWho.*;
import MemoryPath.*;
import tec.poo.proyectodos.gato.GatoFrame;
import tec.poo.proyectodos.sopaletras.*;
import tec.poo.proyectodos.memory.gui.JuegoMemoria;
import java.awt.Color;
import java.awt.Image;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Casilla extends JLabel{
    public final static int CASILLA_SIZE = 80;
    public String name;
    JFrame tablero;
    
    public Casilla(String name, int x, int y, Color color, JFrame tablero){
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
    
    public void getFunction(){
        switch(name){
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
                new GatoFrame().setVisible(true);
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
