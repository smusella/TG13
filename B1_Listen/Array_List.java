import java.util.ArrayList;

public class Array_List {
    
    public static void main(String[] args) {
        ArrayList<Integer> primzahlen = new ArrayList<>();

        primzahlen.add(2);
        primzahlen.add(3);
        primzahlen.add(5);
        primzahlen.add(11);

        System.out.println(primzahlen);

        primzahlen.remove(Integer.valueOf(2));// entfernt Eintrag mit den Wert 2 wenn man nicht weiss welches Index die zahl 11 hat 
        primzahlen.remove(2);  //entfernt Eintrag mit Index 2


        for(Integer i : primzahlen){
            System.out.println(i);
        }
        System.out.println(primzahlen.contains(3));

        Integer i1 = primzahlen.get(0);
    }
}
