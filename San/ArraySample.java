package San;

public class ArraySample {
    public static void main(String[] args) {

        //Array anlegen
        int[] primzahlen = new int[3];

        //Werte hinzufügen
        primzahlen[0]=2;
        primzahlen[1]=3;
        primzahlen[2]=5;

        //Array ausgeben
        for (int i = 0; i < primzahlen.length; i++) {
            System.out.println(primzahlen[i]);
        }

        //Wert entfernen
        primzahlen[1]=0;

        //Prüfen ob Wert in der Liste
        for (int i : primzahlen) {
            if(i==5){
                System.out.println("5 ist in primzahlen enthalten");
            }
        }

        

    }
}
