
package BomberMario;

import java.awt.Image;
import java.util.Random;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class VentanaBombermario extends javax.swing.JFrame {
    private Random rn = new Random();
    private JLabel treasure = new JLabel();
    private Bomba[][] casillas;
    private static final int BTN_SIZE = 25;
    private int cantBtnPressed;
    
    public VentanaBombermario() {
        cantBtnPressed = 7;
        initComponents();
        init();
    }

    private void init(){
        int num = getMatriz();
        this.setResizable(false);
        casillas = new Bomba[num][num];
        
        
        for (int fila=0; fila<casillas.length; fila++){
            for(int col=0; col<casillas.length; col++){
                Bomba boton = new Bomba(fila*BTN_SIZE, col*BTN_SIZE, this);
                casillas[fila][col]=boton;
                this.add(boton);
                boton.setBounds(fila*BTN_SIZE, col*BTN_SIZE, BTN_SIZE, BTN_SIZE);
            }
        }
        this.setSize((BTN_SIZE+2)*num , (BTN_SIZE+4)*num);
        addTreasure(num);
    }
    
    private void addTreasure(int largo){
        treasure.setBounds(getCoordinate(largo-1), getCoordinate(largo-1), BTN_SIZE*2, BTN_SIZE*2);
        Image imgEscalada = new ImageIcon("estrella.png").getImage().getScaledInstance(treasure.getWidth(), treasure.getHeight(), Image.SCALE_SMOOTH);
        Icon iconoEscalado = new ImageIcon(imgEscalada);
        treasure.setIcon(iconoEscalado);
        //System.out.println(treasure.getX()/25 + " " + treasure.getY()/25);
        this.add(treasure);
    }
    
    private int getCoordinate(int largo){
        return rn.nextInt(largo)*BTN_SIZE;
    }
    
    private int getMatriz(){
        switch(rn.nextInt(3)){
            case 0:
                return 10;
            case 1:
                return 15;
            default:
                return 20;
        }
    }
    
    public void explote(String type, int x, int y){
        if (x==0 || y==0 || x==BTN_SIZE*casillas.length-BTN_SIZE || y==BTN_SIZE*casillas.length-BTN_SIZE )
            type = "simple";
        getButton(x,y).setVisible(false);
        switch(type){
            case "cruz":
                exploteCruz(x,y);
                break;
            case "linea":
                exploteLinea(x,y);
                break;
            case "double":
                exploteDouble(x,y);
        }
        if (win()){
            JOptionPane.showMessageDialog(this, "Ganó", "Felicidades", JOptionPane.INFORMATION_MESSAGE);
        }else{
            cantBtnPressed--;
            if(cantBtnPressed == 0)
                JOptionPane.showMessageDialog(this, "Perdió", "Suerte en los demás juegos", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private boolean win(){
        return !getButton(treasure.getX(), treasure.getY()).isVisible() && 
               !getButton(treasure.getX()+BTN_SIZE, treasure.getY()).isVisible() &&
               !getButton(treasure.getX(), treasure.getY()+BTN_SIZE).isVisible() &&
               !getButton(treasure.getX()+BTN_SIZE, treasure.getY()+BTN_SIZE).isVisible();
    }
    
    
    private Bomba getButton(int x, int y){
        return this.casillas[x/BTN_SIZE][y/BTN_SIZE];
    }
    
    private void exploteCruz(int x, int y){
        getButton(x,y-25).setVisible(false);
        getButton(x,y+25).setVisible(false);
        getButton(x-25,y).setVisible(false);
        getButton(x+25,y).setVisible(false);
    }
    
    private void exploteLinea(int x, int y){
        if(rn.nextInt(2) == 0){
            getButton(x-25,y).setVisible(false);
            getButton(x+25,y).setVisible(false);
            getButton(x+50,y).setVisible(false);
        }else{
            getButton(x,y-25).setVisible(false);
            getButton(x,y+25).setVisible(false);
            getButton(x,y+50).setVisible(false);
        }
    }
    
    private void exploteDouble(int x, int y){
        int der = rn.nextInt(2);
        int up = rn.nextInt(2);
        if(der == 1){
            getButton(x+25,y).setVisible(false);
            if(up == 1){
                getButton(x,y-25).setVisible(false);
                getButton(x+25,y-25).setVisible(false);
            }else{
                getButton(x,y+25).setVisible(false);
                getButton(x+25,y+25).setVisible(false);
            }
        }else{
            getButton(x-25,y).setVisible(false);
            if(up == 1){
                getButton(x,y-25).setVisible(false);
                getButton(x-25,y-25).setVisible(false);
            }else{
                getButton(x,y+25).setVisible(false);
                getButton(x-25,y+25).setVisible(false);
            }
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
