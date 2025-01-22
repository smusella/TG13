public class Dataobjekt {

   
    int k;
    public int getK() {
        return k;
    }
    public void setK(int k) {
        this.k = k;
    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    int x;
    int y;
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    public int getKlasse() {
        return klasse;
    }
    public void setKlasse(int klasse) {
        this.klasse = klasse;
    }
    int klasse;
 
    public Datenobjekt(int x, int y, int klasse) {
        this.x = x;
        this.y = y;
        this.klasse = klasse;
    }
 
    public Datenobjekt(int x, int y) {
        this.x = x;
        this.y = y;
        this.klasse = -1;
    }
   
}
 


