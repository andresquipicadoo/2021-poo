/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tec.poo.proyectodos.memory.auxiliar;

import java.util.Random;

/**
 *
 * @author Dark
 */
public class LogicaJuego {
    
    public int[] getCardNumbers() {
        
        int[] numbers = new int[18];
        int count = 0;
        
        while(count < 18) {
            Random r = new Random();
            int na = r.nextInt(9) + 1;
            int nvr = 0;
            
            for (int i = 0; i < 18; i++) {
                if(numbers[i] == na) {
                    nvr++;
                }
            }
            if(nvr < 2) {
                numbers[count] = na;
                count++;
            }//fin
            
        }
        
        
        return numbers;
    }
            
}
