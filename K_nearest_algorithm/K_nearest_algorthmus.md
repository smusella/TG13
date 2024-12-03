# KNN-Algorithmus

Der k-Nearest Neighbors (kNN)-Algorithmus ist ein einfacher Algorithmus, der verwendet wird, um Daten zu klassifizieren oder Werte vorherzusagen.

- Es vegleicht ein neues Datenstück (z.B. ein Bild oder eine Zahl) mit bereits bekannte Daten
- dann schaut er sich die 'k' nächsten Nachbarn an, also die ähnlichsten Datenpunkte 



## Funktion

- der Algorithmus misst die Distanz zwischen dem neuen Punkt und alle anderen bekannten Punkten
- Er wählt die 'k' nächsten Punkte aus
- Je nachdem, welche Klasse die Mehrheit dieser Nachbarn hat, wir das neue Datenstück dieser Klasse zugeordnet


### Vorteile

- Einfach zu verstehen und zu implementieren
- Keine komplizierte Modellbildung nötig
- Flexibel für Klassifikation und Regression
- funktioniert am Besten, wenn die Daten gut strukturiert sind

### Nachteile

- Langsam bei großen datenmengen 
- Empfindlich gegenüber irrelevanten oder schlechte skalierten Daten
- Ergebnisse hängen stark von der Wahl von k und der Distanzmetrik ab

#### Beispiel:
Man hat ein Bild eines Tieres und möchte wissen ob es eine Katze oder ein Hund ist

der Algorithmus vergleicht das Bild mit gespeichterten Bilder und schaut, ob die nächsten 'k' Bilder eher katzen oder Hunde sind -> die Mehrheit entscheidet

## Implementierung in Python

### Importieren der 'numpy' Bibliothek
- man benötigt 'numpy' um mathematische Operationen wie die Distanzberechnung zu berechnen

```
import numpy as np
from collections import Counter
````
### Daten vorbereiten 
- Skaliere die Daten, da kNN empfindlich auf datenverhältnisse ist

````
X_train = np.array([[1,2], [2,3], [3,1]]) 
y_train = np.array([0,1,0])

X_test = np.array([[1,1],[3,3]])
````

### Distanz berechnen
- Messe die Distanz zwischen dem neuen Punkt und allen anderen Punkten 

### k nächste Nachbar finden
- Wähle die k nächstgelegenen Punkte basiert auf der Distanz

### Klassifikation oder Regression durchführen
- Bei Klassifikation : die häufigste Klasse der nachbarn ist die Vorhersage
- Bei Regression: Berechne den Durchschnitt der Nachbarn