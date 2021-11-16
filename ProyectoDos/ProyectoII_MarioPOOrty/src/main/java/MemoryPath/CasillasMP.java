
package MemoryPath;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class CasillasMP extends JButton implements ActionListener {
    private ImageIcon icon = new ImageIcon("bloqueExclamacion.png");
    private VentanaMemoryPath vtn;
    private int value;
    private static final int BTN_SIZE = 50;
            
    public CasillasMP(int x, int y, VentanaMemoryPath vtn, int value){
        this.vtn = vtn;
        
        this.setBounds(x, y, BTN_SIZE, BTN_SIZE);
        this.setIcon(icon);
        this.setBorder(BorderFactory.createEmptyBorder());
        this.setBackground(Color.white);
        this.value = value;
        
        this.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (vtn.getMarioY() == this.getY()+50){
            vtn.moveMario(value, this.getX(), this.getY());
        }
    }
    
}
