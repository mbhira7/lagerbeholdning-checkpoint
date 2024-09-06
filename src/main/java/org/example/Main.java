package org.example;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        Produkt produkt = new Produkt(null, null, 0, null);
        List<Produkt> produktList = new ArrayList<>();
        produktList.add(produkt);
        Lagerbeholdning lagerbeholdning = new Lagerbeholdning(produktList);
        lagerbeholdning.readFiles();
    }
}