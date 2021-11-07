
import java.util.Random;

public class Main {
	
    public static void main(String args[]){
        Random size=new Random() ;
        int num =size.nextInt(3);
      
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
        BoardDisplay game = new BoardDisplay(tamano, 4);
	game.buildGrid();
        
       
       
    }
	
	
}

