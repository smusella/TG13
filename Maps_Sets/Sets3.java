import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets3 {
    public static void main(String[] args) {
        
        
        Set<Integer> erstesSet = new HashSet<Integer>();

        erstesSet.addAll(Arrays.asList(new Integer[] {1, 2, 3, 5, 0 }));
        System.out.println(erstesSet);

        Set<Integer> zweitesSet = new HashSet<Integer>();
        System.out.println(zweitesSet);

        zweitesSet.addAll(Arrays.asList(new Integer[] {1, 3, 4, 5, 6, 7, 5})); 

        //Sets vereinigen
        Set<Integer> union = new HashSet<Integer>(erstesSet);
        

          union.addAll(zweitesSet);

          System.out.println(union);

          //Schnittmenge
          Set<Integer> schnittmenge = new HashSet<Integer>(erstesSet);

          schnittmenge.retainAll(zweitesSet);

          System.out.println(schnittmenge);

          //Differenz
          Set<Integer> differenz = new HashSet<Integer>(erstesSet);

          differenz.removeAll(zweitesSet);
         
          System.out.println(differenz);

    }
}
