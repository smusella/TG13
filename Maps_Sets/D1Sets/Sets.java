package Maps_Sets.D1Sets;

import java.util.HashSet;
import java.util.Set;

//Liste von Elemente -> Reihenfolge egal
//Verwendet man wenn man das Hinzufugen von doppelter Elemente einschrànken will

public class Sets {

    public static void main(String[] args) {
     
    
    Set<String> namen = new HashSet<>();

    namen.add("Max");
    namen.add("Moritz");
    namen.add("Alex");
    namen.add("Zoe");

    namen.remove("Max"); //bei Sets kann man nicht mit Index Elemente lòschen

    System.out.println(namen);
    System.out.println(namen.size()); //zeigt wie viele Elemente im Set sind
    System.out.println(namen.contains("Alex")); //pruft ob Alex im Set ist
 }
   
}
