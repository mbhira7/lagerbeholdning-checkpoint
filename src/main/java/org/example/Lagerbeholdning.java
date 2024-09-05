package org.example;

import java.util.List;

public class Lagerbeholdning {

    List<Batch> batches;

    public Lagerbeholdning(List<Batch> batches) {
        this.batches = batches;
    }

    public List<Batch> getBatches() {
        return batches;
    }

    public void påfyll(){
        if (getAntallAvVareType(VareType.Telefon) < 10){
            int påfyll = 40;
            for (Batch batch : batches) {
                if (batch.produkt.getVareType() == VareType.Telefon){
                    
                }
            }
        }
    }

    public int getAntallAvVareType(VareType varetype){

        int antallAvVareType = 0;

        for (Batch batch : batches) {
            if (batch.produkt.getVareType().equals(varetype)){
                antallAvVareType += batch.antall;
            }
        }
        return antallAvVareType;
    }

}
