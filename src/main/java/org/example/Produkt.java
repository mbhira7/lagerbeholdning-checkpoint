package org.example;

public class Produkt {

    private String produktId;
    private VareType vareType;
    private int antall;
    private String hylle;

    public Produkt(String produktId, VareType vareType, int antall, String hylle) {
        this.produktId = produktId;
        this.vareType = vareType;
        this.antall = antall;
        this.hylle = hylle;
    }

    public String getProduktId() {
        return produktId;
    }

    public VareType getVareType() {
        return vareType;
    }

    public int getAntall() {
        return antall;
    }

    public String getHylle() {
        return hylle;
    }

    public void økLagerBeholdning(){
        if (vareType.equals(VareType.Telefon) && (antall < 10)){
            this.antall+= 40;
        }
        else if (vareType.equals(VareType.Laptop) && (antall < 5)){
            this.antall+= 15;
        }
        else if (vareType.equals(VareType.Tablet) && (antall < 5)){
            this.antall+= 5;
        }
    }

}
