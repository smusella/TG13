package UbungDatenstrukturen;

import java.util.HashSet;

public class G_Sets {
    
    public static void main(String[] args) {
        
        HashSet<String> Lehrer = new HashSet<>();

        Lehrer.add("Hammer");
        Lehrer.add("Laber");
        Lehrer.add("Ruhl");
        Lehrer.add("Beck");
        Lehrer.add("Laber");

        System.out.println(Lehrer);
    }
}
