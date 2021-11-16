package CollectTheCoins;

import CatchTheCat.BotonCirculo;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;


public class VentanaCollectTheCoins extends javax.swing.JFrame {
    private Cronometro cronometro;
    private Coin coinsArray[][] = new Coin[25][25];
    private static final int COIN_SIZE = 25;
    private int sumaFinal;
    
    public VentanaCollectTheCoins() {
        initComponents();
        generateItems();
        this.cronometro = new Cronometro(setTime(), this);
        this.cronometro.start();
    }

    int setTime(){
        Random rn = new Random();
        int sig = rn.nextInt(3);
        switch (sig){
            case 0: 
                return 30;
            case 1: 
                return 45;
            case 2: 
                return 60;
        }
        return -1;
    }
    
    private void generateItems(){
        ArrayList<Integer> nums = generateArray();
        int lim = 625;
        Random rn = new Random();
        for (int fila=0; fila<25; fila++){
            for (int col=0; col<25; col++){
                coinsArray[fila][col] = new Coin(col*COIN_SIZE, fila*COIN_SIZE, this, nums.remove(rn.nextInt(lim)));
                lim--;
                this.add(coinsArray[fila][col]);
            }
        }
    }
    
    private ArrayList<Integer> generateArray(){
        ArrayList<Integer> nums = new ArrayList();
        int value = 0;
        Random rn = new Random();
        for (int i=0; i<625; i++){
            value = rn.nextInt(10)+1;
            if(i>312)
               value *= -1; 
            nums.add(value);
        }
        return nums;
    }
    
    public void coinClicked(int value){
        sumaFinal += value;
    }
    
    public void finishGame(){
        String msg = ", la suma de las monedas tomadas es de: " + sumaFinal;
        if (sumaFinal>=0)
            JOptionPane.showMessageDialog(this, "Ganó" + msg, "Se acabo el tiempo", JOptionPane.INFORMATION_MESSAGE);
        else
            JOptionPane.showMessageDialog(this, "Perdió" + msg, "Se acabo el tiempo", JOptionPane.ERROR_MESSAGE);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 625, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 625, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
