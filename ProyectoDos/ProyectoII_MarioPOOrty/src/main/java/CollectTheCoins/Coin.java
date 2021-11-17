package CollectTheCoins;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Coin extends JButton implements ActionListener {
    private static final int BTN_SIZE = 25;
    private ImageIcon icon = new ImageIcon("coin.png");
    private VentanaCollectTheCoins vtn;
    private int value;

    public Coin(int x, int y, VentanaCollectTheCoins vtn, int value) {
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
