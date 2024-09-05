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

    public int getAntallAvVareType(VareType varetype){

        for (Batch batch : batches) {
            
        }

        return 0;
    }

}
