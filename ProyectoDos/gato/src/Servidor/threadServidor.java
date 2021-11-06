/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
 
package Servidor;
import java.io.*;
import java.net.*;
import java.util.Vector;
/**
 *
 * @author Diego
 */
public class threadServidor extends Thread
{
     Socket cliente = null;//referencia a socket de comunicacion de cliente
     DataInputStream entrada=null;//Para leer comunicacion
     DataOutputStream salida=null;//Para enviar comunicacion	
     String nameUser; //Para el nombre del usuario de esta conexion
     ServidorGato servidor;// referencia al servidor

     // para envio de mensajes al enemigo
     threadServidor enemigo = null;
     // identificar el numero de jugador
     int numeroDeJugador;
     
     public threadServidor(Socket cliente,ServidorGato serv, int num)
     {
        this.cliente = cliente;
        this.servidor = serv;
        this.numeroDeJugador = num;
        nameUser="";// inicialmente se desconoce, hasta el primer read del hilo
     }
     
     //Getter an Setter...
     public String getNameUser()
     {
       return nameUser;
     }
     public void setNameUser(String name)
     {
       nameUser=name;
     }
     
     public void run()
     {
    	try
    	{
            // inicializa para lectura y escritura con stream de cliente
          entrada=new DataInputStream(cliente.getInputStream());//comunic
          salida=new DataOutputStream(cliente.getOutputStream());//comunic
          // Es el primer read que hace, para el nombre del user
          
          System.out.println("lee el nombre");
          this.setNameUser(entrada.readUTF());
          System.out.println("1. Leyo nombre: " + nameUser);
          enviaUser(); // envia su nombre al otro usuario, que es con un 2
          // al enemigo
    	}
    	catch (IOException e) {  e.printStackTrace();     }
    	//VARIABLES
        int opcion=0;
        int numUsers=0;
        String amigo="";
        String mencli="";
                
    	while(true)
    	{
          try
          {
              //Siempre espera leer un int que será la instruccion por hacer
             opcion=entrada.readInt();
             switch(opcion)
             {
                case 1://envio de coordenada
                    // LEYO OPCION 1
                    // LEE LAS COORDENADAS QUE ENVIO ESTE CLIENTE
                    // Luego las pasa al enemigo para que marque su tablero
                   int columna = entrada.readInt();//Lee coordenada
                   int fila = entrada.readInt();//Lee coordenada fila
                   servidor.ventana.mostrar("Recibido " + columna +","+fila);
                   // ENVIA LA COORDENADA AL ENEMIGO
                   enemigo.salida.writeInt(1);// Opcion 1 al hilo cliente del enemigo
                   enemigo.salida.writeInt(columna);// envia columna
                   enemigo.salida.writeInt(fila);// envia fila
                   
                   System.out.println("Op1: lee col,fil, envia al enemigo, 1, col, fila: "+columna+" , "+fila );
                   break;
                case 2:// 
                    
                    
                   break;
                case 3: //le envia el status, que es el numero de jugador y el nombre enemigo
                    salida.writeInt(3);
                    salida.writeInt(numeroDeJugador);
                    if (enemigo != null)
                        salida.writeUTF(enemigo.nameUser);
                    else
                        salida.writeUTF("");
                    System.out.println("3. Op3: envia 3 y numeroJugador y enemigo: "+ numeroDeJugador);
                   break;
                 case 4:
                     // lee el mensaje enviado desde el jframe
                     String mensaje = entrada.readUTF();
                     // envia un 4 al thradCliente enemigo
                     enemigo.salida.writeInt(4);
                     // envia el emnsaje al thread cliente enemigo
                     enemigo.salida.writeUTF(mensaje);
                     System.out.println("Op4: envia 4 y mensaje: "+ mensaje);
                 break;
                 case 5:
                     // lee la columna
                     int col = entrada.readInt();
                     // lee la fila
                     int fil = entrada.readInt();
                     // envia un 5 al thradCliente enemigo
                     enemigo.salida.writeInt(5);
                     // envia el emnsaje al thread cliente enemigo
                     enemigo.salida.writeInt(col);
                     enemigo.salida.writeInt(fil);
                     System.out.println("Op5: envia columna fila para bomba ");
                 break;
             }
          }
          catch (IOException e) {
              System.out.println("El cliente termino la conexion");break;}
    	}
    	servidor.ventana.mostrar("Se removio un usuario");
    	
    	try
    	{
          servidor.ventana.mostrar("Se desconecto un usuario: "+nameUser);
          cliente.close();
    	}	
        catch(Exception et)
        {servidor.ventana.mostrar("no se puede cerrar el socket");}   
     }

     // Envia su nombre a todos los demas usuarios excepto él
     public void enviaUser()
     {
        if (enemigo != null)
        {
        try
        {
            enemigo.salida.writeInt(2);//escribe opcion de agregar 2
            enemigo.salida.writeUTF(this.getNameUser());//escribe nombre	
            System.out.println("2. Envia 2 y username "+ "2" +getNameUser());
        }
        catch (IOException e) {e.printStackTrace();}
        }
     }


}
