package ch.so.agi.landregisterparceldescription.webservice.models;

public class BuildingAddress {
    private String streetname;
    private String number;
    private Integer egid;
    private Integer edid;
    private int postalcode;
    private String city;

    public String getStreetname() {
        return streetname;
    }
    public void setStreetname(String streetname) {
        this.streetname = streetname;
    }
    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    public int getEgid() {
        return egid;
    }
    public void setEgid(Integer egid) {
        this.egid = egid;
    }
    public int getEdid() {
        return edid;
    }
    public void setEdid(Integer edid) {
        this.edid = edid;
    }
    public int getPostalcode() {
        return postalcode;
    }
    public void setPostalcode(int postalcode) {
        this.postalcode = postalcode;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
}
