/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package auxiliar;

import java.util.Random;

/**
 *
 * @author Dark
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] numeros = new int[18];
        int contador = 0;
        
        while(contador < 18) {
            Random r = new Random();
            int na = r.nextInt(9) + 1;
            int nvr = 0;
            
            for (int i = 0; i < 18; i++) {
                if(numeros[i] == na) {
                    nvr++;
                }
            }
            if(nvr < 2) {
                numeros[contador] = na;
                contador++;
            }
            
    }
        for (int i = 0; i < 18; i++) {
            System.out.print(numeros[i]+" ");
        }
    }
}
