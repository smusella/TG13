public class Array {

    public static void main(String[] args) {
        
        int[] lotto = new int[6];
     

        lotto[0]=5;
        lotto[1]=10;
        lotto[2]=15;
        lotto[3]=20;
        lotto[4]=25;
        lotto[5]=30;

        lotto[2]=0;

        for (int i : lotto) {
           
                System.out.println(i);
            
       
        }
    }
}