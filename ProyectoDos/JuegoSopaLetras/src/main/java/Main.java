
import java.util.Random;

public class Main {
	
    public static void main(String args[]){
        Random dimensiones=new Random() ;
        int num =dimensiones.nextInt(3);
      
        int tamano = 0 ;
       
        if (num==0){
            tamano=10;
            
        }
        else if (num==1){
            tamano=15;
        }
        else if (num==2){
            tamano=20;
        }
        SopaLetras game = new SopaLetras(tamano, 4);
	game.GenerarCuadricula();
        
       
       
    }
	
	
}

