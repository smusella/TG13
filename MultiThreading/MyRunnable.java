package MultiThreading;
//Zweite Methode um mehrere Threads zu erzeugen mit Interface (implements Runnable)
//Mit dieser Methode kann man mit extend auch von anderen Klassen erben
public class MyRunnable implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {

            System.out.println("Thread Nr.2: "+i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
 
        }
        System.out.println("Thread Nr.2 ist fertig");
    }
    
  
}
