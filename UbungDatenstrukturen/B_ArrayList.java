package UbungDatenstrukturen;

import java.util.ArrayList;

public class B_ArrayList {
    

    public static void main(String[] args) {
        
        ArrayList<Integer> PLZ = new ArrayList<>();
        
        PLZ.add(78321);
        PLZ.add(78314);
        PLZ.add(78340);
        PLZ.add(78211);

        PLZ.remove(2);
        PLZ.remove(Integer.valueOf(78321));

       
        System.out.println(PLZ);
        
    }
}
