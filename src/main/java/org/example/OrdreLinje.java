package org.example;

import java.util.List;

public class OrdreLinje {
    private int ordreId;
    private int antall;
    private Produkt produkt;

    public OrdreLinje(int ordreId, int antall, Produkt produkt) {
        this.ordreId = ordreId;
        this.antall = antall;
        this.produkt = produkt;
    }

    public int getOrdreId() {
        return ordreId;
    }

    public void setOrdreId(int ordreId) {
        this.ordreId = ordreId;
    }

    public int getAntall() {
        return antall;
    }

    public void setAntall(int antall) {
        this.antall = antall;
    }

    public Produkt getProdukt() {
        return produkt;
    }

    public void setProdukt(Produkt produkt) {
        this.produkt = produkt;
    }
}
