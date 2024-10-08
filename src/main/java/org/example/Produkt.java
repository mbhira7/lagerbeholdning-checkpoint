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

    public Leveranse setAntall() {


        if (vareType.equals(VareType.Telefon) && (antall < 10)){
            antall+= 40;
            return new Leveranse(40, this, antall);
        }
        else if (vareType.equals(VareType.Laptop) && (antall < 5)){
            antall+= 15;
            return new Leveranse(15, this, antall);
        }
        else if (vareType.equals(VareType.Tablet) && (antall < 5)){
            antall+= 5;
            return new Leveranse(5, this, antall);
        }
        return null;
    }

    public String getHylle() {
        return hylle;
    }

    public void reduserBeholdning(int hentUt){
        if (antall>=hentUt){
            antall-=hentUt;
        }
        else {
            System.out.println("Kan ikke hente ut flere varer enn det som er lagret");
        }
    }
}
