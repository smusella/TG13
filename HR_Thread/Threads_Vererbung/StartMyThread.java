package HR_Thread.Threads_Vererbung;

public class StartMyThread {

    public static void main(String[] args) {
        //beginnt Main Thread
        System.out.println("Main Thread gestartet");

        //Thread Objekt erzeugen
        MyThread a = new MyThread("a", 30);
        MyThread x = new MyThread("x", 100);

        //Thread starten 
        a.run();   //falsch -> sonst laufen Threads nicht gleichzeitig
        x.start(); //richtig

        System.out.println("Main Thread zuende");
    }
    
}