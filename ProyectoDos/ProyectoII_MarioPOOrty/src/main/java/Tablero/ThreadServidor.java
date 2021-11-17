package Tablero;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ThreadServidor extends Thread {
    Socket cliente = null;//referencia a socket de comunicacion de cliente
    DataInputStream entrada = null;//Para leer comunicacion
    DataOutputStream salida = null;//Para enviar comunicacion
    String nameUser; //Para el nombre del usuario de esta conexion
    Servidor servidor;// referencia al servidor

    // para envio de mensajes al enemigo
    ThreadServidor todos[] = null;
    ThreadServidor enemigos[] = null;
    // identificar el numero de jugador
    int numeroDeJugador;

    public ThreadServidor(Socket cliente, Servidor serv, int numeroDeJugador) {
        this.cliente = cliente;
        this.servidor = serv;
        this.numeroDeJugador = numeroDeJugador;
        nameUser = "";// inicialmente se desconoce, hasta el primer read del hilo
    }

    //Getter an Setter...
    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String name) {
        nameUser = name;
    }

    public void run() {
        try {
            // inicializa para lectura y escritura con stream de cliente
            entrada = new DataInputStream(cliente.getInputStream());//comunic
            salida = new DataOutputStream(cliente.getOutputStream());//comunic
            // Es el primer read que hace, para el nombre del user

            salida.writeInt(servidor.getCantPersonajes());    //setPersonajes disponibles
            for (int i = 0; i < servidor.getCantPersonajes(); i++) {
                salida.writeUTF(servidor.personajes[i]);
            }

            System.out.println("lee el nombre");
            this.setNameUser(entrada.readUTF());
            //servidor.addPlayer(nameUser);
            System.out.println("1. Leyo nombre: " + nameUser);
            servidor.takePlayer(nameUser);

            salida.writeInt(servidor.casillasName.size());    //setCasillas
            for (int i = 0; i < servidor.casillasName.size(); i++) {
                salida.writeUTF(servidor.casillasName.get(i));
            }

            if (numeroDeJugador == servidor.getCantPlayers() - 1)
                salida.writeBoolean(true);
            else
                salida.writeBoolean(false);

        } catch (IOException e) {
            e.printStackTrace();
        }
        //VARIABLES


        int opcion = 0;
        int numUsers = 0;
        String amigo = "";
        String mencli = "";

        while (true) {
            try {
                //Siempre espera leer un int que será la instruccion por hacer
                opcion = entrada.readInt();
                switch (opcion) {
                    case 0://setPersonajes
                        for (int i = 0; i < todos.length; i++) {
                            todos[i].salida.writeInt(0);
                            int cantPersonajes = servidor.getCantPlayers();
                            todos[i].salida.writeInt(cantPersonajes);
                            for (int x = 0; x < cantPersonajes; x++) {
                                todos[i].salida.writeUTF(servidor.personajesJugando[x]);
                            }
                        }
                        break;
                    case 1:
                        for (int i = 0; i < todos.length; i++)
                            todos[i].salida.writeInt(1);
                        break;
                    case 3:
                        for (int i = 0; i < todos.length; i++) {
                            enemigos[0].salida.writeInt(3);
                        }
                        break;
                    case 4:
                        String nombre = entrada.readUTF();
                        int x = entrada.readInt();
                        int y = entrada.readInt();
                        for (int i = 0; i < todos.length; i++) {
                            todos[i].salida.writeInt(4);
                            todos[i].salida.writeUTF(nombre);
                            todos[i].salida.writeInt(x);
                            todos[i].salida.writeInt(y);
                        }
                        break;

                }
            } catch (IOException e) {
                System.out.println("El cliente termino la conexion");
                break;
            }
        }
    }

}
