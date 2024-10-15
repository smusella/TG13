package San;

import java.util.ArrayList;
import java.util.List;


/**
 * ArrayListSample
 */
public class ArrayListSampleNames {
    public static void main(String[] args) {

        // ArrayListe erstellen
        ArrayList<String> names = new ArrayList<>();

        // Objekte hinzufügen
        names.add("Max");
        names.add("Moritz");
        names.add("Mike");

        // Liste ausgeben
        System.out.println(names);

        // Objekt entfernen
        names.remove(2);

        // Über Liste iterieren
        for (String i : names) {
            System.out.println(i);
        }

        System.out.println("----------------");
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        //prüfen ob Werte in Liste sind
        System.out.println(names.contains("Max"));

    }

}