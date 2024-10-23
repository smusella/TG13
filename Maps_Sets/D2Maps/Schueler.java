class Schueler {
    
    String name;
    String vorname;
    
    public Schueler(String name, String vorname) {
        this.name = name;
        this.vorname = vorname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    @Override
    public String toString() {
        return "Schueler [name=" + name + ", vorname=" + vorname + "]";
    }

    
    

    
}