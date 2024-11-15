package UbungDatenstrukturen;

import java.util.LinkedList;
import java.util.Queue;

public class E_Queue {
    
    public static void main(String[] args) {
        
        Queue<String> ToDo = new LinkedList<>();

        ToDo.add("Arzt Termin");
        ToDo.add("Hausaufgaben");
        ToDo.add("Koffer packen");
        ToDo.add("Einkaufen");

        ToDo.poll();
        System.out.println(ToDo);
    }
}
