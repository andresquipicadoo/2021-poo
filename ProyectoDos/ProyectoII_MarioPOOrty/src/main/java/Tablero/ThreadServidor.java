package Tablero;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Random;

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
    Random random = new Random(123);
    //
    Gato gato = null;

    static class Gato {
        ThreadServidor otro;
        Gato(ThreadServidor o) {
            otro = o;
        }
    }

    void jugandoGato(ThreadServidor ts) {
        gato = new Gato(ts);
        ts.gato = new Gato(this);
    }

    void terminarGato() {
        gato.otro.gato = null;
        gato = null;
    }

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
                    case 1000:
                        // iniciar juego de gato
                        iniciarGato();
                        break;
                    case 1001:
                        // notificar movida de gato
                        if (gato != null) {
                            movidaGato();
                        }
                        break;
                    case 1002:
                        terminarGato();
                        break;
                }
            } catch (IOException e) {
                System.out.println("El cliente termino la conexion");
                break;
            }
        }
    }

    private void movidaGato() {
        try {
            int pos = entrada.readInt();
            String car = entrada.readUTF();
            gato.otro.salida.writeInt(1001);
            gato.otro.salida.writeInt(pos);
            gato.otro.salida.writeUTF(car);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void iniciarGato() {
        int i = random.nextInt(todos.length);
        // indicar en salida el jugador escogido
        try {
            jugandoGato(todos[i]);
            // primero se notifica al jugador que inicio el gato
            salida.writeInt(i);
            salida.writeUTF(gato.otro.nameUser);
            // luego al escogido

            todos[i].salida.writeInt(1000);
            todos[i].salida.writeInt(numeroDeJugador);
            todos[i].salida.writeUTF(nameUser);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
