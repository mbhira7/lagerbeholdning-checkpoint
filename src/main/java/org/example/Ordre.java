package org.example;

import java.util.ArrayList;
import java.util.List;

public class Ordre {
    private int ordreId;
    private List<OrdreLinje> ordrelinjer;

    public void hentAntallProduker(){
        for(OrdreLinje ordreLinje : ordrelinjer){
            if(ordreLinje.getOrdreId() == ordreId){

            }
        }
    }


    public void printOrdreHistorikk(){
        for(OrdreLinje ordreLinje : ordrelinjer){
            System.out.println(ordreLinje.getOrdreId() + ordreLinje.getAntall() + "" + ordreLinje.getProdukt().getVareType());
        }
    }

    public OrdreLinje getLastOrdreLinje(){
        return ordrelinjer.get(ordrelinjer.size()-1);
    }

    public void addOrdreLinje(OrdreLinje ordreLinje){
        ordrelinjer.add(ordreLinje);
    }
}
