import java.util.LinkedList;


public class LinkedListSample {

    public static void main(String[] args) {

         //Konsole löschen
         System.out.print("\033[H\033[2J"); //löscht die Konsole
         System.out.flush();                // ''

        //LinkedList erzeugen
        LinkedList<String> programmiersprachen = new LinkedList<>(); //erstell Liste
        
        //Werte hinzufügen
        programmiersprachen.add("java"); //add ->Fügt ein neues Objekt ein
        programmiersprachen.add("c++");
        programmiersprachen.add("c#");
       
        //Ausgabe
        System.out.println(programmiersprachen);

        //entfernen von Objekten
        programmiersprachen.remove(2); //löscht nur Element mit Index 2 

        //Iterieren über Liste
        for (String str : programmiersprachen) {
            System.out.println(str);
        }

        //Liste als Queue (Stack, Stapel)
        //programmiersprachen.removeFirst();
        //programmiersprachen.removeLast();
        programmiersprachen.addFirst("Basic");
        programmiersprachen.addLast("VBA");
       

        //Ausgabe
        System.out.println(programmiersprachen);

        String test = programmiersprachen.pollLast(); //Poll -> löscht Elemente aus Queue und gibt Wert zurück
        System.out.println(programmiersprachen);

        programmiersprachen.pop();  //Pop -> löscht Elemente aus Stack und gibt Wert zurück 
        System.out.println(programmiersprachen);

        
    }
    
}
