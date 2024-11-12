package Threads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A1 implements Runnable { 

 

    // c) Liste der IP-Adressen als Klassenvariable 

    private static final List<String> ipAddresses = Arrays.asList( 

        "172.10.1.5", 

        "172.10.1.9", 

        "172.10.1.3" 

    ); 

 

    // b) Implementierung der Methode +ping(text: IP) 

    public void ping(String ip) { 

        System.out.println("IP Adresse: " + ip); 

    } 

 

    // d) Implementierung der Methode start() 

    public void start() { 

        Thread thread = new Thread(this); // Initialisiere das Thread-Objekt 

        thread.start(); // Starte den Thread 

    } 

 

    // e) Implementierung der run()-Methode aus Runnable, die alle 5 Sekunden eine IP-Adresse pingt 

    @Override 

    public void run() { 

        int index = 0; 

        while (true) { 

            // Hole die nächste IP-Adresse aus der Liste, zyklisch 

            String ip = ipAddresses.get(index); 

            ping(ip); // Rufe die ping-Methode auf, um die IP auszugeben 

 

            // Erhöhe den Index, um zur nächsten IP zu gehen, setze zurück wenn Ende der Liste 

            index = (index + 1) % ipAddresses.size(); 

            
            // Warte 5 Sekunden 

            try { 

                Thread.sleep(5000); // 5 Sekunden Pause 

            } catch (InterruptedException e) { 

                System.err.println("Thread wurde unterbrochen: " + e.getMessage()); 

            } 
        } 

    }
    // e) main()-Methode zum Testen des Programms 

    public static void main(String[] args) { 

        A1 test = new A1(); 

        test.start(); // Startet das Überwachungssystem 

    } 

} 
