package UbungDatenstrukturen;

import java.util.LinkedList;

public class C_LinkedList {
    
    public static void main(String[] args) {
        
        LinkedList<String> Serien = new LinkedList<>();

        Serien.add("Obx");
        Serien.add("You");
        Serien.add("Lucifer");

        System.out.println(Serien);

        Serien.addFirst("Stranger Things");
        Serien.addLast("Anne with an E");

        System.out.println(Serien);

        Serien.removeLast();

        System.out.println(Serien);
    }
}
