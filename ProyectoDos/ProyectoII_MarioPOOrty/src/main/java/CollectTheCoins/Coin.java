
package CollectTheCoins;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Coin extends JButton implements ActionListener{
    private ImageIcon icon = new ImageIcon("coin.png");
    private VentanaCollectTheCoins vtn;
    private int value;
    private static final int BTN_SIZE = 25;
            
    public Coin(int x, int y, VentanaCollectTheCoins vtn, int value){
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
        vtn.coinClicked(value);
        this.setEnabled(false);        
    }
    
}
