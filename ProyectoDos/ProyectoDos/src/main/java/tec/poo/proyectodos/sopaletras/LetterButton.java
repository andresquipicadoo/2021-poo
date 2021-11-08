package tec.poo.proyectodos.sopaletras;

import javax.swing.*;
import java.awt.*;


public class LetterButton extends JButton {

    private String letter; //letter that is displayed on the button
    private boolean selected; //
    private int xPos; //the wordsearch row the button is on
    private int yPos; //the wordsearch column the button is on
    private boolean foundWord; //true if the button is part of a word and was "found" by user


    //Constructor
    public LetterButton(String letter, int xP, int yP) {
        super(letter);
        this.letter = letter;
        xPos = xP;
        yPos = yP;
        setPreferredSize(new Dimension(30, 30));
        setMargin(new Insets(0, 0, 0, 0));
        setSelected(false);
    }

    /**
     * Toggle the LetterButton to be selected or unselected
     * If the button was unselected, it becomes selected
     * If the button was selected, it becomes unselected
     */
    public void toggle() {
        setSelected(!selected);
    }

    public String getLetter() {
        return letter;
    }

    public void setLetter(String l) {
        letter = l.substring(0, 1);
        setText(letter);
    }

    public boolean getSelected() {
        return selected;
    }

    public void setSelected(boolean s) {
        this.selected = s;
        if (s)
            setBackground(Color.GREEN);
        else if (foundWord)
            setBackground(Color.CYAN);
        else
            setBackground(Color.WHITE);
        super.setSelected(s);
        this.repaint();
    }

    public int getXPos() {
        return xPos;
    }

    /**
     * Modifier of the xPos variable
     *
     * @param x, the new value of xPos
     */
    public void setXPos(int x) {
        xPos = x;
    }


    public int getYPos() {
        return yPos;
    }

    /**
     * Modifier of the yPos variable
     *
     * @param y, the new value of yPos
     */
    public void setYPos(int y) {
        yPos = y;
    }


    public boolean isFoundWord() {
        return foundWord;
    }


    public void setFoundWord(boolean foundWord) {
        this.foundWord = foundWord;
        if (foundWord)
            setBackground(Color.GREEN);
    }

}
