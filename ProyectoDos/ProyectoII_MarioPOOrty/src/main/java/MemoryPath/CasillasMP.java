package MemoryPath;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CasillasMP extends JButton implements ActionListener {
    private static final int BTN_SIZE = 50;
    private ImageIcon icon = new ImageIcon("bloqueExclamacion.png");
    private VentanaMemoryPath vtn;
    private int value;

    public CasillasMP(int x, int y, VentanaMemoryPath vtn, int value) {
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
        if (vtn.getMarioY() == this.getY() + 50) {
            vtn.moveMario(value, this.getX(), this.getY());
        }
    }

}
