/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SopaDeLetras;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Random;


/**
 *
 * @author aquir
 */
public class llamada {
    public static void main(String[] args) {
        String [] telefonos = new String [10];
     try{
            // Abrimos el archivo
            FileInputStream fis = new FileInputStream("llamadas.txt");
            // Creamos el objeto de entrada
            DataInputStream dis = new DataInputStream(fis);
            // Creamos el Buffer de Lectura
            BufferedReader buffer = new BufferedReader(new InputStreamReader(dis));
            String strLinea;
            // Leer el archivo linea por linea
            int indice = 0;
            while ((strLinea = buffer.readLine()) != null)   {
                // Imprimimos la línea por pantalla
                System.out.println (strLinea);
                telefonos [indice] = (strLinea);
                indice++;
            }
            Random rn = new Random();
            int sorteo = rn.nextInt(9);
            System.out.println("Ganador--->"+telefonos[sorteo]);
            // Cerramos el archivo
            dis.close();
        }catch (Exception e){ //Catch de excepciones
            System.err.println("Ocurrio un error: " + e.getMessage());
        }
    }

    
}
