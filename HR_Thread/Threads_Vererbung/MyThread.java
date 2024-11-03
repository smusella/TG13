package HR_Thread.Threads_Vererbung;

public class MyThread extends Thread{

    String name;
    int wait;

    //Konstruktor
    public MyThread(String name, int wait){
        this.name = name;
        this.wait = wait;
   } 

   @Override
   public void run() {
       
    for (int i = 0; i < 100; i++) {

        System.out.println(name+": "+i);

        try {
            Thread.sleep(wait);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
    }
   }
}