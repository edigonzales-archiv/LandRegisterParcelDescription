package ch.so.agi.landregisterparceldescription.webservice.models;

public abstract class Person {
    private String name;
    private String strasse;
    private String hausnummer;
    private int plz;
    private String ortschaft;
    private String land;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getStrasse() {
        return strasse;
    }
    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }
    public String getHausnummer() {
        return hausnummer;
    }
    public void setHausnummer(String hausnummer) {
        this.hausnummer = hausnummer;
    }
    public int getPlz() {
        return plz;
    }
    public void setPlz(int plz) {
        this.plz = plz;
    }
    public String getOrtschaft() {
        return ortschaft;
    }
    public void setOrtschaft(String ortschaft) {
        this.ortschaft = ortschaft;
    }
    public String getLand() {
        return land;
    }
    public void setLand(String land) {
        this.land = land;
    }
}
