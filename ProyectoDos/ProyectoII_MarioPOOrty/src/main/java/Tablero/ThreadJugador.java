
package Tablero;

import java.io.DataInputStream;
import java.io.IOException;

public class ThreadJugador extends Thread{
    
    //solo de lectura
    DataInputStream entrada;
    Tablero tablero; //referencia acliente
    public ThreadJugador (DataInputStream entrada,Tablero tablero) throws IOException
    {
        this.entrada=entrada;
        this.tablero=tablero;
    }
    
    public void run()
   {
       //VARIABLES
      String menser="",amigo="";
      int opcion=0;
      
      // solamente lee lo que el servidor threadServidor le envia
      while(true)
      {         
         try{
             // esta leyendo siempre la instruccion, un int
             opcion=entrada.readInt();
            
            switch(opcion)
            {
               case 0://setPersonajes
                     int cantPersonajes = entrada.readInt();
                     for (int i=0; i<cantPersonajes; i++){
                         tablero.addFicha(entrada.readUTF());
                     }
                     System.out.println(tablero.casillasName.toString());
                     System.out.println(tablero.players.toString());
                     break;
                     
               case 1:
                  tablero.addFichas();
                  break;
               case 3:
                     tablero.setDadoVisible(true);
                     break;
               case 4:
                   String nombre = entrada.readUTF();
                   int x = entrada.readInt();
                   int y = entrada.readInt();
                   tablero.moveFicha(nombre, x, y);
                   break;
            }
         }
         catch (IOException e){
            System.out.println("Error en la comunicaci�n "+"Informaci�n para el usuario");
            break;
         }
      }
      System.out.println("se desconecto el servidor");
   }
    
}
