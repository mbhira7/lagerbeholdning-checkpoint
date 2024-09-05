package org.example;

import java.util.List;

public class Lagerbeholdning {

    List<Produkt> produkter;

    public Lagerbeholdning(List<Produkt> produkter) {
        this.produkter = produkter;
    }

    public List<Produkt> getProdukter() {
        return produkter;
    }

    public void påfyll(){
        for (Produkt p : produkter) {
            p.økLagerBeholdning();
        }
    }

    public int getAntallAvVareType(VareType varetype) {
        for (Produkt produkt : produkter) {
            if (produkt.getVareType().equals(varetype)) {
                return produkt.getAntall();
            }
        }
        return 0;
    }

    public void printLagerbeholdning() {
        for (Produkt produkt : produkter) {
            System.out.println(produkt.getVareType() + ": " + produkt.getAntall());
        }
    }
}
