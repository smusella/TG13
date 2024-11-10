import java.util.HashMap;

//Maps, HashMaps -> Reihenfolge egal
//Maps sind Kollektionen von Key,Value (Schlussel,Wert) Paare

public class SMaps {

    public static void main(String[] args) {
        
        HashMap<String, Integer> MitarbeiterId = new HashMap<>();
      //HashMap<Key, Value>

        MitarbeiterId.put("Alex", 123); //fugt neue Objekte hinzu
        MitarbeiterId.put("Max", 456);
        MitarbeiterId.put("Eric", 789);


        System.out.println(MitarbeiterId);

        System.out.println(MitarbeiterId.get("Max")); //wenn man ID von einen bestimmten Ojekt haben will

        System.out.println(MitarbeiterId.containsKey("Georg")); //pruft ob dieser Objekt in der Map existiert
        System.out.println(MitarbeiterId.containsValue(456)); //pruft ob es ein Objekt mit diesen Wert gibt

        MitarbeiterId.put("Alex", 678); //uberschreibt dieser Objekt weil er schon existiert
        //Aber bei Namen die nicht existieren werden sie einfach hinzugefugt

        System.out.println(MitarbeiterId);

        MitarbeiterId.replace("Jan", 888); //wenn Objekt nicht existiert wird es nicht hinzugefugt

        MitarbeiterId.putIfAbsent("Jan", 222); //Objekt nur hinzugefugt wenn es nicht vorhanden ist
        System.out.println(MitarbeiterId);

        MitarbeiterId.remove("Jan");
        System.out.println(MitarbeiterId);
    }
}