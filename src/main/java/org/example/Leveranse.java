package org.example;

public class Leveranse {
    int antallNyeVarer;
    Produkt produkt;
    int påLager;

    public Leveranse(int antallNyeVarer, Produkt produkt, int påLager) {
        this.antallNyeVarer = antallNyeVarer;
        this.produkt = produkt;
        this.påLager = påLager;
    }

    public void printLeveranse(){
        System.out.println("Levert" + antallNyeVarer + " nye av vare " + produkt.getProduktId() + " " + produkt.getVareType() + ". På lager etter leveranse: " + påLager);
    }

}

