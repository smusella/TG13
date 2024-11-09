package HR_Thread;

public class MeinThread implements Runnable{


String name;
int wait;
Thread t;

public MeinThread(String name, int wait){ //Konstruktor
        this.name = name; //Attributen werden initialisiert
        this.wait = wait;
        t = new Thread(this);
}

 public void start(){ // start Methode
    t.start();      
 }

    @Override
    public void run() { // run methode 
         
        for (int i = 0; i < 100; i++) {
            System.out.println(name+" "+i);

            try {
                Thread.sleep(wait);
            } catch (InterruptedException e) {
                
                e.printStackTrace();
            }
        }
    }
    

}
