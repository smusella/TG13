package HR_Thread.Threads_Vererbung;

import HR_Thread.MeinThread;

public class ThreadInterface {
    
    public static void main(String[] args) {
        System.out.println("Thread mit Interface erstellen gestartet");

         MeinThread a = new MeinThread("a", 3);
         MeinThread b = new MeinThread("b",10);
    }
}
