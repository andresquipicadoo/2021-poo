
package CollectTheCoins;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Cronometro extends Thread{
    private boolean isRunning = true;
    private int segundosActual = 0;
    private int segundosFinish;
    VentanaCollectTheCoins vtn;

    public Cronometro(int segundosFinish, VentanaCollectTheCoins vtn){
        this.segundosFinish = segundosFinish;
        this.vtn = vtn;
    }
    
    @Override
    public void run(){
        
        while(isRunning){
            
            try {
                sleep(1000);
                
                segundosActual++;
                if (segundosActual == segundosFinish){
                    isRunning = false;
                    vtn.finishGame();
                }
                
            }catch(InterruptedException ex) {
                Logger.getLogger(Cronometro.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}