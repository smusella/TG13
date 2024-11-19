import java.util.HashMap;
import java.util.List;

public class UbungMaps {
    
    public static void main(String[] args) {
        
        HashMap<String, String> landernamen = new HashMap<>();

        landernamen.put("Baden-Wüttemberg", "Stuttgart");
        landernamen.put("Bayern", "München");
        landernamen.put("Berlin", "Berlin");
        landernamen.put("Brandenburg", "Potsdam");
        landernamen.put("Bremen", "Bremen");
        landernamen.put("Hessen", "Wiesbaden");
        landernamen.put("Hamburg", "Hamburg");
        landernamen.put("Niedersachsen", "Hannover");
        landernamen.put("Nordrhein-Westfalen", "Düsseldorf");
        landernamen.put("Rheinland-Pflanz", "Mainz");
        landernamen.put("Saarland", "Saarbrücken");
        landernamen.put("Sachsen", "Dresden");
        landernamen.put("Sachsen-Anhalt", "Magdenburg");
        landernamen.put("Schleswig-Holstein", "Kiel");
        landernamen.put("Thüringen", "Erfurt");
        landernamen.put("Mecklenburg-Vorpommern", "Schwerin");

        for (HashMap.Entry m : landernamen.entrySet()) {

            System.out.println(m.getKey() + " " + m.getValue());
            
        }

        
    }
}
