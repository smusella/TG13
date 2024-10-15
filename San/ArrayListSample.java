package San;

import java.util.ArrayList;


/**
 * ArrayListSample
 */
public class ArrayListSample {
    public static void main(String[] args) {

        // ArrayListe erstellen
        ArrayList<Integer> primzahlen = new ArrayList<>();

        // Objekte hinzufügen
        primzahlen.add(2);
        primzahlen.add(3);
        primzahlen.add(5);
        primzahlen.add(11);

        // Liste ausgeben
        System.out.println(primzahlen); //Gibt aus in der [2,3,5,11] schreibweise

        // Objekt entfernen
        primzahlen.remove(Integer.valueOf(2)); //Entferne das Interger in dem Wert 2
                                                 //primzahlen.remove(2); Entferne den Eintrag in dem Index 2
        // Über Liste iterieren
        for (Integer i : primzahlen) {
            System.out.println(i);
        }

        //prüfen ob Werte in Liste sind
        System.out.println(primzahlen.contains(5));{ //Falls es gibt, dann gebe den Befehl aus
            System.out.println("Fünf ist in der Liste");
        } 

        //Wert aus der Liste holen
        Integer i1 = primzahlen.get(2);
        System.out.println("Die Zahl im index 2 ist: " + i1);

    }

}