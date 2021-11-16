
package CatchTheCat;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class BotonCirculo extends JButton implements ActionListener {
    private ImageIcon icon = new ImageIcon("circuloVerde.png");
    private VentanaCatchTheCat vtn;
    private ImageIcon iconClicked = new ImageIcon("circuloNegro.png");
    private static final int BTN_SIZE = 50;
    private boolean clicked;
            
    public BotonCirculo(int x, int y, VentanaCatchTheCat vtn){
        this.vtn = vtn;
        
        this.setBounds(x, y, BTN_SIZE, BTN_SIZE);
        this.setIcon(icon);
        this.setBorder(BorderFactory.createEmptyBorder());
        this.setBackground(Color.white);
        this.clicked = false;
        
        this.addActionListener(this);
    }

    
    boolean getClicked(){
        return clicked;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (!clicked){
            clicked = true;
            this.setIcon(iconClicked);
            vtn.moveCat();
        }
    }
}
