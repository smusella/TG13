package Threads;

public class Main {

    public static void main(String[] args) {

      // /* 
       System.out.println(Thread.activeCount()); //um zu sehen wie viele Threads im moment laufen 

       Thread.currentThread().setName("MAINNNNNN"); //àndert Thread Name 
       System.out.println(Thread.currentThread().getName()); //name der laufenden Threads

      // Thread.currentThread().setPriority(10); //àndert Thread Prioritàt
      //System.out.println(Thread.currentThread().getPriority()); //Prioritàt des Threads checken (Skala 1-10)


       
       for(int i =3; i>0; i--) {  //Schleife zàhlt runter
          System.out.println(i);
          //try-catch muss man nicht selber tippen
          try {
            //Thread pausieren:
            Thread.sleep(1000); //1 Sekunde
        } catch (InterruptedException e) {
            e.printStackTrace();
        } 
    } 
        System.out.println("Fertig");
    
//*/

    MyThread thread2 = new MyThread(); //Ezeugt zweite Thread
    thread2.start(); // startet Thread
    System.out.println(thread2.isAlive()); // man braucht start methode sonst wird sie nicht gestartet
    
}
}