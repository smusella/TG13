import java.util.HashSet;
import java.util.Set;

public class Sets {

    public static void main(String[] args) {
    
    Set<String> mitarbeiterSet = new HashSet<>(); //Sets sind immer sortiert 


    mitarbeiterSet.add("Alex");  
    mitarbeiterSet.add("Paul");  
    mitarbeiterSet.add("Michael");  


    System.out.println(mitarbeiterSet);

    //GröSe eines Sets vermitteln
    int setGroesse = mitarbeiterSet.size();
    System.out.println(setGroesse);

   //Objekt im Set suchen
    if (mitarbeiterSet.contains("Paul")) {
        System.out.println("Paul ist ein Mitarbeiter");
    }

    }
}