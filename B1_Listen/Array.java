public class Array {

    //Array-> Liste 
    //Anzahl Elemente fest

    public static void main(String[] args) {
        
        int[] lotto = new int[6]; //erzeugt Liste mit 6 Objekte
     

        lotto[0]=5;  //fùgt die Werte in Objekte 
        lotto[1]=10;
        lotto[2]=15;
        lotto[3]=20;
        lotto[4]=25;
        lotto[5]=30;

        lotto[2]=0;  //àndert Wert von Objekt mit Index 2

        for (int i : lotto) {
           
                System.out.println(i); // gibt Liste aus 
            
       
        }
    }
}