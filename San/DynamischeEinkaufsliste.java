package San;

import java.text.Collator;
import java.util.LinkedList;
import java.util.Scanner;

public class DynamischeEinkaufsliste {

    public static void main(String[] args) {
         //Konsole löschen
         System.out.print("\033[H\033[2J");
         System.out.flush();

        Scanner s = new Scanner(System.in);
        LinkedList<String> einkauf = new LinkedList<>();

        //Immer einkaufen
        einkauf.add("Milch");
        einkauf.add("Brot");
        einkauf.add("Butter");

        //Info
        System.out.println("--------------------------------------------");
        System.out.println("Einkaufsliste:"+einkauf);
        System.out.println("--------------------------------------------");

        //Frage
        String eingabe = "n";

        do {
            System.out.println("Wollen Sie noch etwas hinzufügen oder entfernen ?");
            System.out.println("Geben Sie h, e oder n ein");
            eingabe = s.next();

            if(eingabe.equals("h")){
                System.out.print("hinzufügen:\t");
                einkauf.add(s.next());
                System.out.println("--------------");
            }
            else if(eingabe.equals("e")){
                System.out.print("entfernen:\t");
                einkauf.remove(s.next());
            }
            else{

            }

         } while (eingabe.equals("h") || eingabe.equals("e") );

        //sortieren
        einkauf.sort((o1, o2) -> Collator.getInstance().compare(o1, o2));

        System.out.println("Ihre Einkaufsliste:");
        for (String string : einkauf) {
            System.out.println(string);
        }

        s.close();

        

        


        
    }
    
}
