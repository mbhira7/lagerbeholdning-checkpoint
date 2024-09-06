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

    public void setAntall(){
        if (vareType.equals(VareType.Telefon) && (antall < 10)){
            antall+= 40;
            leverandørRapport(40, produktId, vareType, antall);
        }
        else if (vareType.equals(VareType.Laptop) && (antall < 5)){
            antall+= 15;
            leverandørRapport(15, produktId, vareType, antall);
        }
        else if (vareType.equals(VareType.Tablet) && (antall < 5)){
            antall+= 5;
            leverandørRapport(5, produktId, vareType, antall);
        }
    }

    public void leverandørRapport(int antallNyeEnhterer, String produktId, VareType vareType, int antall) {
        System.out.println("Levert " + antallNyeEnhterer + " nye av vare " + produktId + " " + vareType  + ". " +
                "På lager etter leveranse: " + antall);
    }

}
