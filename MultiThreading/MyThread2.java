package MultiThreading;
//Erste Methode um mehrere Threads zu erzeugen mit "extends Thread" u. run-Methode
public class MyThread2 extends Thread{
    
    @Override
    public void run() {
        
        for (int i = 10; i > 0; i--) {

            System.out.println("Thread Nr.1: "+i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
 
        }
        System.out.println("Thread Nr.1 ist fertig");
    }
}
