package UbungDatenstrukturen;

import java.util.Stack;

public class D_Stack {
    
    public static void main(String[] args) {
         
        Stack<String> Wunschliste = new Stack<>();

        Wunschliste.add("Kerzen");
        Wunschliste.add("Uhr");
        Wunschliste.add("Buch");
        Wunschliste.add("Handy Hulle");

        Wunschliste.pop();

        System.out.println(Wunschliste);
    }
}
