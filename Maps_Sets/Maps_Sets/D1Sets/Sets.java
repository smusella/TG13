package Maps_Sets.D1Sets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//Liste von Elemente -> Reihenfolge egal
//Verwendet man wenn man das Hinzufugen von doppelter Elemente einschrànken will

public class Sets {

    public static void main(String[] args) {
     
    
    Set<String> namen = new HashSet<>(); 
    /*Wenn man TreeSet benutzt werden die Namen in alphabetischer Reihenfolge ausgegeben
      Wenn man LinkedHashSet benutzt werden die Namen in die Reihenfolge ausgegeben wie man sie schreibt
      Schnell: HashSet > LinkedHashSet > TreeSet :Langsam
    */

    namen.add("Max");
    namen.add("Moritz");
    namen.add("Alex");
    namen.add("Zoe");

    namen.remove("Max"); //bei Sets kann man nicht mit Index Elemente lòschen

    System.out.println(namen);
    System.out.println(namen.size()); //zeigt wie viele Elemente im Set sind
    System.out.println(namen.contains("Alex")); //pruft ob Alex im Set ist

//-------------------------------------------------------------------------------------


    List<Integer> Zahlenliste = new ArrayList<>(); //so werden gleiche Zahlen in der Liste trotzdem angezeigt 

    Zahlenliste.add(0); 
    Zahlenliste.add(1);
    Zahlenliste.add(2);
    Zahlenliste.add(3);
    Zahlenliste.add(1);

    System.out.println(Zahlenliste);


    Set<Integer> ZahlenSet = new HashSet<>(Zahlenliste);// so werden gleiche Zahlen nur einmal angezeigt

    /*ZahlenSet.addAll(Zahlenliste); -> alle Zahlen die in ZahleListe stehen werden auch hier verwendet
     oder man schreibt es direkt in den Klammer der Konstruktor
    */
    System.out.println(ZahlenSet);
 }
   
}
