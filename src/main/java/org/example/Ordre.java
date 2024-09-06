package org.example;

import java.util.ArrayList;
import java.util.List;

public class Ordre {
    private List<OrdreLinje> ordrelinjer;

    public Ordre() {
        this.ordrelinjer = new ArrayList<>();
    }

    public void printOrdreHistorikk(){
        System.out.println("\nORDREHISTORIKK\n");
        for(OrdreLinje ordreLinje : ordrelinjer){
            System.out.println(ordreLinje.getOrdreId() + ordreLinje.getAntall() + " " + ordreLinje.getProdukt().getVareType());
        }
    }

    public void addOrdreLinje(OrdreLinje ordreLinje){
        ordrelinjer.add(ordreLinje);
    }
}
