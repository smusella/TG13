package MultiThreading;

public class Main2 {
    
    public static void main(String[] args) {
        
        //erste Methode 
        MyThread2 thread1 = new MyThread2();

        //zweite Methode 
        MyRunnable runnable1 = new MyRunnable();
        Thread thread2 = new Thread(runnable1);

        thread1.start();
        thread2.start();
    }
}
