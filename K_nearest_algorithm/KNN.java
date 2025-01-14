import java.util.List;

public class KNN {

    public static int knn(Dataobjekt neu, List<Dataobjekt> testdaten, int k){

     return k;

    }

    public static void main(String[] args) {
       
        List<Dataobjekt> testdaten = new ArrayList<>();
        testdaten.add(new Dataobjekt(1.0,5));
        testdaten.add(new Dataobjekt(1.0,2.0));
        testdaten.add(new Dataobjekt(1.0,2.0));
        testdaten.add(new Dataobjekt(1.0,2.0));

        Dataobjekt neu = new Dataobjekt(null,0)(2.0,2.0), -1);
       
    
        int klasseNeu = knn(neu, testdaten, 3);

        System.out.println(klasseNeu);
    
    
    
    }
    
    
    
    
}