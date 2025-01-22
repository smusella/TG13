import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
 
public class KNN
{
    public static int knn(Datenobjekt neu, List<Datenobjekt> testdaten, int k)
    {
        Map<Double, Datenobjekt> abstanede = new TreeMap<>();
        for (Datenobjekt o : testdaten) {
            double dist = getDistance(neu,o);
            abstanede.put(dist, o);
        }
        List<Datenobjekt> knns = new ArrayList<Datenobjekt>(abstanede.values());
        int klasse0 = 0;
        int klasse1 = 0;
 
        for (int i = 0; i < k; i++) {
            int klasseDesNachbarn = knns.get(i).klasse;
            if (klasseDesNachbarn == 0) {
                klasse0++;
            } else {
                klasse1++;
            }
        }
 
        if (klasse0>klasse1) {
            neu.klasse = 0;
        } else {
            neu.klasse = 1;
        }
 
        return k;
    }
    public static void main(String[] args)
    {
        List<Datenobjekt> testdaten = new ArrayList<>();
        testdaten.add(new Datenobjekt(1, 2));
        testdaten.add(new Datenobjekt(2, 4));
        testdaten.add(new Datenobjekt(3,7 ));
        testdaten.add(new Datenobjekt(4, 7));
 
        Datenobjekt neu = new Datenobjekt(2,3);
 
        int klasseNeu = knn(neu, testdaten, 5);
       
        System.out.println(klasseNeu);
       
 
    }
 
    public static int getDistance(Datenobjekt neu, Datenobjekt o){
 
            return (neu.x - o.x)*(neu.x - o.x) + (neu.y - o.y)*(neu.y - o.y);
 
    }
}
    
    
    
    
