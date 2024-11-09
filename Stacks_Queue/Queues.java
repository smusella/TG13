package Stacks_Queue;

import java.util.LinkedList;
import java.util.Queue;

//Queue-> Warteschlange
//FIFO-> First In First Out

public class Queues {
    

    public static void main(String[] args) {
        
        Queue<String> Filme = new LinkedList<>();

        Filme.add("Interstellar");
        Filme.add("Jumanji");
        Filme.add("Titanic");
        Filme.add("Uncharted");

        System.out.println(Filme);
        Filme.poll(); //lòscht das erste Element aus der Queue
        System.out.println(Filme.poll()); //lòscht das Element ganz oben und mit syso wird es angezeigt  


    }
}
