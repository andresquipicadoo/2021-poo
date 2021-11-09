/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logicaBroMemory;

import java.util.Random;


public class CantidadCartas {
    
    public int[] NumeroCartas() {
        
        int[] numeros = new int[18];
        int contador = 0;
        
        while(contador < 18) {
            Random r = new Random();
            int cantidad = r.nextInt(9) + 1;
            int cant = 0;
            
            for (int i = 0; i < 18; i++) {
                if(numeros[i] == cantidad) {
                    cant++;
                }
            }
            if(cant < 2) {
                numeros[contador] = cantidad;
                contador++;
            }
            
        }
        
        
        return numeros;
    }
            
}
