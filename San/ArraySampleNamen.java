package San;

public class ArraySampleNamen {
    public static void main(String[] args) {
        // Erstellen
        String[] namen = new String[3];

        // Werte hinzufügen
        namen[0] = "Max";
        namen[1] = "Moritz";
        namen[2] = "Michael";

        // Array ausgeben
        for (String strNames : namen) {
            System.out.println(strNames);
        }
        System.out.println("----------------");

        // Name entfernen > bei Objekten null zuweisen
        try {
              namen[5] = null;
        } catch (Exception e) {
            System.out.println(e);
        }
      

        // Array ausgeben
        for (String strNames : namen) {
            System.out.println(strNames);
        }

        // Prüfen ob Wert in Liste
        for (String strNames : namen) {
            if (strNames=="Max") {
                System.out.println("Max vorhanden");
            }

        }

    }
}
