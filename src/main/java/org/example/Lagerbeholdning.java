package org.example;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Lagerbeholdning {

    List<Produkt> produkter;

    public Lagerbeholdning() {
        produkter = new ArrayList<>();
    }

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

        BufferedReader reader;

        try {
            reader = new BufferedReader(new FileReader("C:\\\\Users\\\\frball\\\\Documents\\\\Brights\\\\checkpoint\\\\lagerbeholdning-checkpoint\\\\src\\\\main\\\\java\\\\org\\\\example\\\\lagerbeholdning.txt"));
            String line = reader.readLine();

            while (line != null && !line.isEmpty()) {
                //System.out.println(line);
                String[] result = line.split(";");
                produkter.add(new Produkt(result[0], VareType.valueOf(result[1]), Integer.parseInt(result[2]), result[3]));
                // read next line
                line = reader.readLine();
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
