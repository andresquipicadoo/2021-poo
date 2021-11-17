package CatchTheCat;

import javax.swing.*;

public class VentanaCatchTheCat extends javax.swing.JFrame {

    private static final int LBL_SIZE = 50;
    private JLabel lblCatMario = new JLabel();
    private BotonCirculo[][] buttonArray = new BotonCirculo[11][11];
    private int largoFila = 550;

    public VentanaCatchTheCat() {
        initComponents();
        lblCatMario.setIcon(new ImageIcon("circuloVerdeCatMario.png"));
        lblCatMario.setBounds(275, 250, LBL_SIZE, LBL_SIZE);
        this.add(lblCatMario);
        generateItems();
    }

    private void generateItems() {
        for (int fila = 0; fila < 11; fila++) {
            for (int col = 0; col < 11; col++) {
                if (fila % 2 == 0)
                    buttonArray[fila][col] = new BotonCirculo(col * LBL_SIZE, fila * LBL_SIZE, this);
                else
                    buttonArray[fila][col] = new BotonCirculo(col * LBL_SIZE + 25, fila * LBL_SIZE, this);
                this.add(buttonArray[fila][col]);
            }
        }
        buttonArray[5][5].setVisible(false);
    }

    public void moveCat() {
        setButtonActual(true);
        setLocationLblMario();
        setButtonActual(false);
        if (lose())
            JOptionPane.showMessageDialog(this, "Ha perdido", "Talvez la próxima", JOptionPane.ERROR_MESSAGE);
        else if (win())
            JOptionPane.showMessageDialog(this, "Ha ganado", "Felicidades", JOptionPane.INFORMATION_MESSAGE);
    }

    private boolean win() {
        int moves[][] = getPriorityMoves(getClosestBorder());
        for (int i = 0; i < 6; i++) {
            if (!buttonArray[moves[i][0]][moves[i][1]].getClicked())
                return false;
        }
        return true;
    }

    private boolean lose() {
        return lblCatMario.getX() == 500 || lblCatMario.getX() == 525 //limite derecho
                || lblCatMario.getX() == 0 || lblCatMario.getX() == 25  //limite izquierdo
                || lblCatMario.getY() == 0 || lblCatMario.getY() == 500; //limite superior e inferior
    }

    private void setButtonActual(boolean visible) {
        buttonArray[lblCatMario.getY() / LBL_SIZE][lblCatMario.getX() / LBL_SIZE].setVisible(visible);
    }

    private void setLocationLblMario() {
        int moves[][] = getPriorityMoves(getClosestBorder());
        for (int i = 0; i < 6; i++) {
            if (!buttonArray[moves[i][0]][moves[i][1]].getClicked()) {
                lblCatMario.setLocation(buttonArray[moves[i][0]][moves[i][1]].getLocation());
                break;
            }
        }
    }


    int[][] getPriorityMoves(String border) {
        int x = lblCatMario.getX() / LBL_SIZE;
        int y = lblCatMario.getY() / LBL_SIZE;

        if (y % 2 == 0) {
            if (border.equals("toLeft")) {
                int[][] moves = {{y, x - 1}, {y - 1, x - 1}, {y + 1, x - 1}, {y - 1, x}, {y + 1, x}, {y, x + 1}};
                return moves;
            } else if (border.equals("toRight")) {
                int[][] moves = {{y, x + 1}, {y - 1, x}, {y + 1, x}, {y - 1, x - 1}, {y + 1, x - 1}, {y, x - 1}};
                return moves;
            } else if (border.equals("toTop")) {
                int[][] moves = {{y - 1, x - 1}, {y - 1, x}, {y, x - 1}, {y, x + 1}, {y + 1, x - 1}, {y + 1, x}};
                return moves;
            } else {
                int[][] moves = {{y + 1, x - 1}, {y + 1, x}, {y, x - 1}, {y, x + 1}, {y - 1, x - 1}, {y - 1, x}};
                return moves;
            }
        } else {
            if (border.equals("toLeft")) {
                int[][] moves = {{y, x - 1}, {y - 1, x}, {y + 1, x}, {y - 1, x + 1}, {y + 1, x + 1}, {y, x + 1}};
                return moves;
            } else if (border.equals("toRight")) {
                int[][] moves = {{y, x + 1}, {y - 1, x + 1}, {y + 1, x + 1}, {y - 1, x}, {y + 1, x}, {y, x - 1}};
                return moves;
            } else if (border.equals("toTop")) {
                int[][] moves = {{y - 1, x}, {y - 1, x + 1}, {y, x + 1}, {y, x - 1}, {y + 1, x}, {y + 1, x + 1}};
                return moves;
            } else {
                int[][] moves = {{y + 1, x}, {y + 1, x + 1}, {y, x + 1}, {y, x - 1}, {y - 1, x}, {y - 1, x + 1}};
                return moves;
            }
        }
    }

    private String getClosestBorder() {
        int x = lblCatMario.getX();
        int y = lblCatMario.getY();

        //guarda las distancias entre los bordes
        int toLeft = x;
        if (x % 2 != 0)
            toLeft -= 25;
        int toRight = largoFila - toLeft - LBL_SIZE;

        int toTop = y;
        int toBottom = largoFila - toTop - LBL_SIZE;

        //retorna el nombre del más corto
        if (toLeft < toRight && toLeft < toTop && toLeft < toBottom)
            return "toLeft";
        else if (toRight < toLeft && toRight < toTop && toRight < toBottom)
            return "toRight";
        else if (toTop < toRight && toTop < toLeft && toTop < toBottom)
            return "toTop";
        else
            return "toBottom";
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CatchTheCat");
        setResizable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 585, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 554, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
