package org.example;

public class Produkt {

    private String produktId;
    private VareType vareType;

    public Produkt(String produktId, VareType vareType) {
        this.produktId = produktId;
        this.vareType = vareType;
    }

    public String getProduktId() {
        return produktId;
    }

    public VareType getVareType() {
        return vareType;
    }
}
