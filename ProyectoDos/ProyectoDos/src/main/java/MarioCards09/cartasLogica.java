/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MarioCards09;

import java.util.Random;
/**
 *
 * @author aquir
 */
public class cartasLogica {
      public int[] getCard() {
        
        int[] numbers = new int[51];
        int count = 0;
        
        while(count < 51) {
            Random r = new Random();
            int na = r.nextInt() + 1;
            int nvr = 0;
            
            for (int i = 0; i < 51; i++) {
                if(numbers[i] == na) {
                    nvr++;
                }
            }
            if(nvr < 1) {
                numbers[count] = na;
                count++;
            }//fin
            
        }
        
        
        return numbers;
    }
    
    
    
}
