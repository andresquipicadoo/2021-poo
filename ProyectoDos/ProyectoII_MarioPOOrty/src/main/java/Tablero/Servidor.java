package Tablero;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;


public class Servidor {

    public Socket[] jugadores;
    public String[] personajes = {"mario", "luigi", "daisy", "peach", "yoshi", "toad"};
    public String[] personajesJugando = new String[6];
    public ArrayList<String> casillasName = new ArrayList<String>();
    public ThreadServidor[] hilosServer;
    private int cantPlayers;
    private int cantPersonajes = 6;
    private int cont = 0;

    public Servidor(int cantPlayers) {
        this.cantPlayers = cantPlayers;
        jugadores = new Socket[cantPlayers];
        hilosServer = new ThreadServidor[cantPlayers];
        setCasillas();
        System.out.println(cantPlayers + " Iniciado");
    }

    public void runServer() {
        try {
            //crea el socket servidor para aceptar dos conexiones
            ServerSocket serv = new ServerSocket(8081);
            System.out.println(".::Servidor Activo");
            System.out.println(".::Esperando dos usuarios");

            for (int i = 0; i < cantPlayers; i++) {
                // espera primer cliente
                jugadores[i] = serv.accept();
                System.out.println("Jugador conectado");
                hilosServer[i] = new ThreadServidor(jugadores[i], this, i);
                hilosServer[i].start();
            }

            for (int i = 0; i < hilosServer.length; i++) {       //set Todos y Enemigos de cada hilo
                System.out.println("I: " + i);
                hilosServer[i].todos = hilosServer;
                hilosServer[i].enemigos = getEnemigos(i);
            }

            while (true) {

            }

        } catch (IOException ex) {
            ex.printStackTrace();
            System.out.println("ERROR ... en el servidor");
        }
    }

    private ThreadServidor[] getEnemigos(int index) {
        index++;
        ThreadServidor[] enemigos = new ThreadServidor[cantPlayers - 1];
        for (int i = 0; i < enemigos.length; i++) {
            if (index == cantPlayers)
                index = 0;
            enemigos[i] = hilosServer[index];
            index++;
        }
        return enemigos;
    }

    public void takePlayer(String playerName) {
        for (int i = 0; i < personajes.length; i++) {
            if (personajes[i].equals(playerName)) {
                deletePlayer(i);
                cantPersonajes--;
            }
        }
        addToPJ(playerName);
    }

    private void deletePlayer(int playerIndex) {
        if (playerIndex == personajes.length - 1) return;
        for (int i = playerIndex; i < personajes.length - 1; i++) {
            personajes[i] = personajes[i + 1];
        }
    }

    private void addToPJ(String playerName) {
        for (int i = 0; i < personajes.length; i++) {
            if (personajesJugando[i] == null) {
                personajesJugando[i] = playerName;
                break;
            }
        }
    }


    private void setCasillas() {
        ArrayList<String> casillasNameElim = initCasillasName();
        Random rn = new Random();
        while (!casillasNameElim.isEmpty())
            casillasName.add(casillasNameElim.remove(rn.nextInt(casillasNameElim.size())));
    }

    private ArrayList<String> initCasillasName() {
        ArrayList<String> casillasNameElim = new ArrayList<String>();
//        String array[] = {"Gato", "Gato", "SopaDeLetras", "SopaDeLetras", "MemoryPath", "MemoryPath", "SuperBrosMemory",
//                "SuperBrosMemory", "CatchTheCat", "CatchTheCat", "Bombermario", "Bombermario", "GuessWho", "GuessWho",
//                "CollectTheCoins", "CollectTheCoins", "MarioCards", "MarioCards", "eCárcel", "eTubo",
//                "eTubo", "eTubo", "eEstrella", "eFuego", "eHielo", "eCola"};
        String array[] = Collections.nCopies(26, "Gato").toArray(new String[26]);
        for (String i : array)
            casillasNameElim.add(i);
        return casillasNameElim;
    }

    //Getters
    public int getCantPersonajes() {
        return cantPersonajes;
    }

    public int getCantPlayers() {
        return cantPlayers;
    }

}
