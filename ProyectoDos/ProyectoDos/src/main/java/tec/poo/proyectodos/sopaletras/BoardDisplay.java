package tec.poo.proyectodos.sopaletras;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Random;

public class BoardDisplay implements ActionListener {

    Timer timer;

    int segundos, minutos;
    DecimalFormat dformat = new DecimalFormat("00");
    String ddSecond, ddMinute;
    JLabel counter;
    private final JFrame frame;
    private final ArrayList<LetterButton> btnArr = new ArrayList<LetterButton>(); //the array of buttons in the wordsearch
    private final JLabel[] labels; //array of labels
    private final int length; //length of the wordsearch
    private final ArrayList<LetterButton> selectedBtns = new ArrayList<LetterButton>();    //list of buttons that are selected by the user
    private boolean letterVerticalOrientation;
    private ArrayList<String> wordsToFind = new ArrayList<String>(); //list of words that are left to find
    private ArrayList<String> wordList = new ArrayList<String>();    //list of all the words in the wordsearch
    private String word = "";    //the word the user formed so far by clicking the buttons
    private final int numOfWords;

    public BoardDisplay(int length, int numOfWords) {
        this.length = length;

        this.numOfWords = numOfWords;
        frame = new JFrame("Sopa de Letras");
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        labels = new JLabel[numOfWords];

        counter = new JLabel("");
        counter.setBounds(10, 10, 10, 10);
        counter.setHorizontalAlignment(JLabel.CENTER);
        counter.setText("02:00");
        frame.add(counter);
        minutos = 2;
        segundos = 0;
        tiempo();
        timer.start();

    }

    public void buildGrid() {
        
        WordsearchGenerator ws = new WordsearchGenerator(4, length);
        ws.setUp();
        String[][] board = ws.getBoard();
        wordList = ws.getListOfWords();
        wordsToFind = (ArrayList<String>) ws.getListOfWords().clone();

        frame.setVisible(true);

        JPanel content = new JPanel();
        content.setLayout(new GridLayout(length, length));

        String[] randLetters = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q",
                "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        Random r = new Random();
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                int n = Math.abs(r.nextInt()) % 26;
                LetterButton btn;
                if (board[i][j] == null) {
                    btn = new LetterButton(randLetters[n], i, j);
                } else {
                    btn = new LetterButton(board[i][j], i, j);
                }
                content.add(btn);
                btn.addActionListener(this);
                btnArr.add(btn);
            }
        }

        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(new GridLayout(5, 2, 30, 10));
        for (int i = 0; i < numOfWords; i++) {
            labels[i] = new JLabel(wordList.get(i));
            bottomPanel.add(labels[i]);
        }

        bottomPanel.setBorder(new EmptyBorder(10, 20, 20, 20));
        content.setBorder(new EmptyBorder(10, 10, 10, 10));

        Container f = frame.getContentPane();
        f.setLayout(new BoxLayout(f, BoxLayout.Y_AXIS));

        f.add(content);
        f.add(bottomPanel);
        frame.pack();
    }

    public void checkMatch() {

        if (wordsToFind.contains(word)) {
            int index = wordList.indexOf(word);
            wordsToFind.remove(word);

            labels[index].setForeground(Color.GRAY);

            for (LetterButton b : selectedBtns) {
                b.setSelected(false);
                b.setFoundWord(true);
            }

            selectedBtns.clear();
            word = "";
        }

        if (wordsToFind.size() == 0) {

            //Give the player an option to play again or quit the program
            Object[] options = {"Jugar nuevamente", "Salir"};
            int n = JOptionPane.showOptionDialog(frame, "Ganaste", "Felicidades", JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
            if (n == 0) {
                frame.getContentPane().removeAll();
                buildGrid();
            } else {
                frame.dispose();
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() instanceof LetterButton) {
            LetterButton btn = (LetterButton) e.getSource();

            if (btn.getSelected()) {
                if (btn == selectedBtns.get(selectedBtns.size() - 1)) {
                    selectedBtns.remove(btn);
                    word = word.substring(0, word.length() - 1);
                } else if (btn == selectedBtns.get(0)) {
                    selectedBtns.remove(btn);
                    if (word.length() == 1) {
                        word = "";
                    } else {
                        word = word.substring(1);
                    }
                } else {
                    return;
                }
            } else {
                if (selectedBtns.size() == 0) {
                    selectedBtns.add(btn);
                    word = btn.getLetter();
                } else {
                    //get orientation of button is only one button was already selected
                    if (selectedBtns.size() == 1) {
                        //if the button is in the same row as the other selected button
                        if (selectedBtns.get(0).getXPos() == btn.getXPos()) {
                            letterVerticalOrientation = false;
                        } //if the button is in the same column as the other selected button
                        else if (selectedBtns.get(0).getYPos() == btn.getYPos()) {
                            letterVerticalOrientation = true;
                        } else {
                            clearSelectedBtns();
                            selectedBtns.add(btn);
                            word = btn.getLetter();
                            btn.toggle();
                            return;
                        }
                    }

                    if (letterVerticalOrientation) {
                        //if the button is beside the reference, on the top
                        if (btn.getXPos() == selectedBtns.get(0).getXPos() - 1 && btn.getYPos() == selectedBtns.get(0).getYPos()) {
                            selectedBtns.add(0, btn);
                            word = btn.getLetter() + word;
                        }//if the button is beside the reference, on the bottom
                        else if (btn.getXPos() == selectedBtns.get(selectedBtns.size() - 1).getXPos() + 1 && btn.getYPos() == selectedBtns.get(selectedBtns.size() - 1).getYPos()) {
                            selectedBtns.add(btn);
                            word = word + btn.getLetter();
                        } else {
                            clearSelectedBtns();
                            selectedBtns.add(btn);
                            word = btn.getLetter();
                        }
                    } else {
                       
                        if (btn.getYPos() == selectedBtns.get(0).getYPos() - 1 && btn.getXPos() == selectedBtns.get(0).getXPos()) {
                            selectedBtns.add(0, btn);
                            word = btn.getLetter() + word;
                        }
                        else if (btn.getYPos() == selectedBtns.get(selectedBtns.size() - 1).getYPos() + 1 && btn.getXPos() == selectedBtns.get(selectedBtns.size() - 1).getXPos()) {
                            word = word + btn.getLetter();
                            selectedBtns.add(btn);
                        } else {
                            clearSelectedBtns();
                            selectedBtns.add(btn);
                            word = btn.getLetter();
                        }
                    }

                }
            }
            btn.toggle();
            checkMatch();
        }
    }

    public void clearSelectedBtns() {
        for (LetterButton b : selectedBtns) {
            b.setSelected(false);
        }
        selectedBtns.clear();
        word = "";
    }

    public int getLength() {
        return length;
    }

    public void tiempo() {
        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                segundos--;
                ddSecond = dformat.format(segundos);
                ddMinute = dformat.format(minutos);
                counter.setText(ddMinute + ":" + ddSecond);
                if (segundos == -1) {
                    segundos = 59;
                    minutos--;
                    ddSecond = dformat.format(segundos);
                    ddMinute = dformat.format(minutos);
                    counter.setText(ddMinute + ":" + ddSecond);
                }
                if (minutos == 0 && segundos == 0) {
                    timer.stop();
                    //lanzar mensaje de que el tiempo se acabo
                    // Y salir del programa
                    JOptionPane.showMessageDialog(null, "Lastima :( Se acabo el tiempo");
                    System.exit(minutos);
                }
            }
        });
    }

}
