package HR_Thread.Threads_Vererbung;

public class Ampel_Aufgabe implements Runnable{


    private final int Rot = 1;
    private final int RotGelb = 2;
    private final int Gelb = 3;
    private final int Gruen = 4;

    int Zustand;

    String name;
    int wait;
    Thread t;

    public Ampel_Aufgabe(String name,int wait) {
        
        this.name = name;
        this.wait = wait; 
        t = new Thread(this);
    
    }


    @Override
    public void run() {
        while (true)  {
        switch (Zustand) {

            case Rot:
                System.out.println("Rot");
                
                try {
                    Thread.sleep(wait);
                } catch (InterruptedException e) {
                    
                    e.printStackTrace();
                }
                Zustand = RotGelb;
                break;
        
                case RotGelb:
                System.out.println("RotGelb");
                
                try {
                    Thread.sleep(wait);
                } catch (InterruptedException e) {
                    
                    e.printStackTrace();
                }
                Zustand = Gelb;
                break;
            
                case Gelb:
                System.out.println("Gelb");
                
                try {
                    Thread.sleep(wait);
                } catch (InterruptedException e) {
                    
                    e.printStackTrace();
                }
                Zustand = Gruen;
                break;

                case Gruen:
                System.out.println("Gruen");
                
                try {
                    Thread.sleep(wait);
                } catch (InterruptedException e) {
                    
                    e.printStackTrace();
                }
                Zustand = Rot;
                break;
        }
        }

    }
    public void start(){
        t.start();
    }
    
}
