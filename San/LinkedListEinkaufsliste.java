package San;

import java.util.LinkedList;

public class LinkedListEinkaufsliste {

    public static void main(String[] args) {
        // Konsole löschen
        System.out.print("\033[H\033[2J");
        System.out.flush();

        // LinkedList erzeugen
        LinkedList<String> einkaufliste = new LinkedList<>();

        // Werte hinzufügen
        einkaufliste.add("Milch");
        einkaufliste.add("Bier");
        einkaufliste.add("Butter");
        einkaufliste.add("Brot");
        einkaufliste.add("Wein");
        einkaufliste.add("Chips");

        // Ausgabe
        System.out.println("Ausgabe mit Syso");
        System.out.println(einkaufliste);
        System.out.println("---------------------");

        // entfernen von Objekten
        System.out.println("Entferne Element mit index 2 ");
        einkaufliste.remove(2);
        System.out.println(einkaufliste);
        System.out.println("---------------------");

        // Iterieren über Liste
        System.out.println("Iteriere ueber ganze Liste");
        for (String s : einkaufliste) {
            System.out.println(s);
        }
        System.out.println("---------------------");

        // Liste als Queue (Stack, Stapel)
        System.out.println("Stapeloperationen ");
        einkaufliste.removeFirst();
        einkaufliste.removeLast();
        einkaufliste.addFirst("Wasser");
        einkaufliste.addLast("Salami");

        // Ausgabe
        System.out.println(einkaufliste);

        System.out.println(einkaufliste.pop());
        System.out.println(einkaufliste);

        System.out.println(einkaufliste.pollLast());
        System.out.println(einkaufliste);


        String ware = einkaufliste.get(1);
        System.out.println(ware);

    }

}
