import java.util.ArrayList;

//ArrayList -> dynamische Liste
/*Anzahl der Elemente nicht fest
  Man kann uber Methoden arbeiten(einfuge,lòschen..)
  */

public class Array_List {
    
    public static void main(String[] args) {

        ArrayList<Integer> primzahlen = new ArrayList<>(); //erzeugt ArrayList

        primzahlen.add(1);  //fugt Objekte ein 
        primzahlen.add(3);
        primzahlen.add(5);
        primzahlen.add(11);

        System.out.println(primzahlen); 

        primzahlen.remove(2);  //entfernt Eintrag mit Index 2 (indem Fall 5)
        primzahlen.remove(Integer.valueOf(1));// entfernt Eintrag mit den Wert 1 wenn man nicht weiss welches Index die zahl hat 

        for(Integer i : primzahlen){
            System.out.println(i);
        }
        System.out.println(primzahlen.contains(11)); //pruft ob Wert in der Liste sind 

        Integer i1 = primzahlen.get(0);  //gibt den Wert mit Index 0 aus der Liste
    }
}
