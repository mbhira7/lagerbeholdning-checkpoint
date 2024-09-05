package org.example;

public class Batch {

    Produkt produkt;
    int antall;
    String hylle;

    public Batch(Produkt produkt, int antall, String hylle) {
        this.produkt = produkt;
        this.antall = antall;
        this.hylle = hylle;
    }

    public void setAntall(){
        if (produkt.getVareType().equals(VareType.Telefon) && antall < 40){
            antall += 10;
        }
    }

}
