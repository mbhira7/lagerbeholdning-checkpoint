package org.example;

import java.util.ArrayList;
import java.util.List;

public class Ordre {
    private int ordreId;
    private List<OrdreLinje> ordrelinjer;

    public void printOrdreHistorikk(){
        for(OrdreLinje ordreLinje : ordrelinjer){
            System.out.println(ordreLinje.getOrdreId() + ordreLinje.getAntall() + "" + ordreLinje.getProdukt().getVareType());
        }
    }
}
