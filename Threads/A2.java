package Threads;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class A2  implements Runnable { 

 

    // Liste der IP-Adressen als Klassenvariable 

    private static final List<String> ipAddressen = Arrays.asList( 

        "172.10.1.5", 

        "172.10.1.9", 

        "172.10.1.3" 

    ); 

 

    // Referenz auf den laufenden Thread 

    private Thread thread; 

 

    // Methode ping gibt die IP-Adresse aus 

    public void ping(String ip) { 

        System.out.println("IP Adresse: " + ip); 

    } 

 

    // Methode start() initialisiert und startet den Thread 

    public void start() { 

        thread = new Thread(this); // Initialisiere das Thread-Objekt 

        thread.start(); // Starte den Thread 

    } 

 

    // Methode halt() zum Beenden des Threads mit interrupt() 

    public void halt() { 

        if (thread != null && thread.isAlive()) { 

            thread.interrupt(); // Unterbricht den Thread 

        } 

    } 

 
    // run()-Methode führt das Pingen aus und prüft auf Interrupts 

    @Override 

    public void run() { 

        int index = 0; 

        while (!Thread.currentThread().isInterrupted()) { 

            // Zyklisches Pingen der IP-Adressen 

            String ip = ipAddressen.get(index); 

            ping(ip); 

 

            // Nächste IP-Adresse in der Liste auswählen 

            index = (index + 1) % ipAddressen.size(); 

 

            // 5 Sekunden warten 

            try { 

                Thread.sleep(5000); 

            } catch (InterruptedException e) { 

                // Wenn der Thread unterbrochen wird, beende die Schleife 

                System.out.println("Thread wurde unterbrochen."); 

                Thread.currentThread().interrupt(); // Setzt das Interrupt-Flag erneut 

                break; 

            } 

        } 

        System.out.println("Überwachungssystem gestoppt."); 

    } 

    // main()-Methode startet das Überwachungssystem und wartet auf Eingabe 

    public static void main(String[] args) { 

        A2 test = new A2(); 

        test.start(); 

 

        // Scanner zum Einlesen der Benutzereingabe 

        Scanner scanner = new Scanner(System.in); 

        System.out.println("Drücken Sie 'q', um das Überwachungssystem zu stoppen."); 

 

        // Warte auf Eingabe von 'a' zum Stoppen 

        while (true) { 

            String input = scanner.next(); 

            if ("q".equalsIgnoreCase(input.trim())) { 

                test.halt(); // Ruf halt() auf, um den Thread zu unterbrechen 

                break; 

            } 

        } 

    } 

} 
 
