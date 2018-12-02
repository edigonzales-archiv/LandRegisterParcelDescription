package ch.so.agi.landregisterparceldescription.webservice.models;

public class LandCoverShare {
    private int art;
    
    private String art_txt;
    
    private double flaeche;
    
    public int getArt() {
        return art;
    }
    public void setArt(int art) {
        this.art = art;
    }
    public String getArt_txt() {
        return art_txt;
    }
    public void setArt_txt(String art_txt) {
        this.art_txt = art_txt;
    }
    public double getFlaeche() {
        return flaeche;
    }
    public void setFlaeche(double flaeche) {
        this.flaeche = flaeche;
    }
}
