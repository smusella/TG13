package UbungDatenstrukturen;

import java.util.HashMap;

public class H_Maps {
    
    public static void main(String[] args) {
        
        HashMap<String,Integer> AlterSchueler = new HashMap<>();

        AlterSchueler.put("John", 17);
        AlterSchueler.put("Jonas", 18);
        AlterSchueler.put("Kiara", 17);
        AlterSchueler.put("Lian", 19);

        AlterSchueler.remove("Jonas");

        System.out.println(AlterSchueler);
 
    }
}
