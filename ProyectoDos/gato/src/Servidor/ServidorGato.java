/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Servidor;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Diego
 */
public class ServidorGato {
    
    JFrameServidor ventana;
    Socket cliente1;
    Socket cliente2;
    public ArrayList<threadServidor> hilosserver;
    
    public ServidorGato(JFrameServidor padre)
    {
        // asigna la ventana
        this.ventana = padre;
    }
    
    public void runServer()
    {
        try {
            //crea el socket servidor para aceptar dos conexiones
            ServerSocket serv = new ServerSocket(8081);
            ventana.mostrar(".::Servidor Activo");
            ventana.mostrar(".::Esperando dos usuarios");
            
            // espera primer cliente
            cliente1 = serv.accept();
            ventana.mostrar(".::Primer Cliente Aceptado");
            threadServidor user1 = new threadServidor(cliente1, this,1);
            user1.start();
            
            // espera segundo cliente
            cliente2 = serv.accept();
            ventana.mostrar(".::Segundo Cliente Aceptado");
            threadServidor user2 = new threadServidor(cliente2, this,2);
            user2.start();
            
            // 
            user1.enemigo = user2;
            user2.enemigo = user1;
            
            
            
            
            while (true)
            {
            
            }
            
        } catch (IOException ex) {
            ventana.mostrar("ERROR ... en el servidor");
        }
    }

}
