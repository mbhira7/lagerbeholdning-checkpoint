package org.example;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        
        Lagerbeholdning lagerbeholdning = new Lagerbeholdning();
        lagerbeholdning.readFiles();
        lagerbeholdning.printLagerbeholdning();

    }
}