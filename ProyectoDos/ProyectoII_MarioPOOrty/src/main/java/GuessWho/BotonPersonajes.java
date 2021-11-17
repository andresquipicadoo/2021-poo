package GuessWho;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BotonPersonajes extends JButton implements ActionListener {
    private static final int BTN_ANCHO = 30;
    private static final int BTN_LARGO = 150;
    private VentanaGuessWho vtn;

    public BotonPersonajes(int x, int y, VentanaGuessWho vtn, String personaje) {
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
