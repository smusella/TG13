package Stacks_Queue;

import java.util.Stack;

// Stacks-> Stapel
// LIFO-> Last in First out

public class Stacks {

    public static void main(String[] args) {
        
       Stack<String> Einkaufliste = new Stack<>(); //erstellt Stack

       Einkaufliste.add("Milch");  //erstellt Objekte/Elemente
       Einkaufliste.add("Brot");
       Einkaufliste.add("Butter");
       Einkaufliste.add("Pizza");

       Einkaufliste.pop(); //lòscht letztes Element

       System.out.println(Einkaufliste); //gibt Liste aus 

       
       System.out.println(Einkaufliste.pop());//lòscht letztes Element und mit syso gibt den Wert an

       
    }
    
}
