package Tablero;

import javax.swing.*;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Jugador extends Socket {
    public static String IP_SERVER = "localhost"; //IP del Servidor
    Tablero ventanaCliente; // Ventana del cliente
    DataInputStream entrada = null;//leer comunicacion
    DataOutputStream salida = null;//escribir comunicacion
    Socket cliente = null;//para la comunicacion
    String nomCliente;

    public Jugador(Tablero vent) throws IOException {
        this.ventanaCliente = vent;
    }

    public void conexion() throws IOException {
        try {
            // se conecta con dos sockets al server, uno comunicacion otro msjes
            cliente = new Socket(Jugador.IP_SERVER, 8081);
            // inicializa las entradas-lectura y salidas-escritura
            entrada = new DataInputStream(cliente.getInputStream());
            salida = new DataOutputStream(cliente.getOutputStream());
            // solicita el nombre del user

            int cantPersonajes = entrada.readInt();
            Object personajes[] = new Object[cantPersonajes];  //set Personajes disponibles
            for (int i = 0; i < cantPersonajes; i++) {
                personajes[i] = entrada.readUTF();
            }

            Object personaje = (String) JOptionPane.showInputDialog(null, "Selecciona un color", "Elegir", JOptionPane.QUESTION_MESSAGE, null, personajes, personajes[0]);
            nomCliente = personaje.toString();

            ventanaCliente.setTitle(nomCliente);
            salida.writeUTF(nomCliente);
            System.out.println("1. Envia el nombre del cliente: " + nomCliente);

            int cant = entrada.readInt();                  //set casillas
            for (int i = 0; i < cant; i++) {
                ventanaCliente.casillasName.add(entrada.readUTF());
            }

            ventanaCliente.setInitialButtons(entrada.readBoolean());

        } catch (IOException e) {
            System.out.println("\tEl servidor no esta levantado");
            System.out.println("\t=============================");
        }

        new ThreadJugador(entrada, ventanaCliente).start();
    }

    //GETTET AND SETTER
    public String getNombre() {
        return nomCliente;
    }
}
