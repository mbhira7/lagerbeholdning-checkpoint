package org.example;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
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
            p.setAntall();
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

    public void readFiles() throws IOException {
        FileReader fr = new FileReader("C:\\Users\\frball\\Documents\\Brights\\checkpoint\\lagerbeholdning-checkpoint\\src\\main\\java\\org\\example\\lagerbeholdning.txt");

        int i;
        // Holds true till there is nothing to read
        while ((i = fr.read()) != -1)

            // Print all the content of a file
            System.out.print((char)i);
    }
}
