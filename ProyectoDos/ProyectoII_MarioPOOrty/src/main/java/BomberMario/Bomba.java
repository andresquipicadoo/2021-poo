
package BomberMario;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;


public class Bomba extends JButton implements ActionListener{
    private Random rn = new Random();  
    private ImageIcon icon = new ImageIcon("bloqueBomber.png");
    private VentanaBombermario vtn;
    private static final int BTN_SIZE = 25;
            
    public Bomba(int x, int y, VentanaBombermario vtn){
        this.vtn = vtn;
        
        this.setBounds(x, y, BTN_SIZE, BTN_SIZE);
        this.setIcon(icon);
        this.setBorder(BorderFactory.createEmptyBorder());
        this.setBackground(Color.white);
        
        this.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        vtn.explote(getType(), this.getX(), this.getY());
    }
    
    String getType(){
        switch(rn.nextInt(4)){
            case 0:
                return "simple";
            case 1:
                return "double";
            case 2:
                return "cruz";
            default:
                return "linea";
        }
    }
    
}