
package GuessWho;

import BomberMario.VentanaBombermario;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class BotonPersonajes  extends JButton implements ActionListener{
    private VentanaGuessWho vtn;
    private static final int BTN_ANCHO = 30;
    private static final int BTN_LARGO = 150;
            
    public BotonPersonajes(int x, int y, VentanaGuessWho vtn, String personaje){
        this.vtn = vtn;
        
        this.setBounds(x, y, BTN_LARGO, BTN_ANCHO);
        this.setText(personaje);
        this.setFont(new Font("Perpetua Titling MT", Font.BOLD, 12));
        this.setForeground(Color.orange);
        this.setBackground(Color.darkGray);
        
        this.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        vtn.finish(this.getText());
    }
    
}
