package org.example;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        /*Lagerbeholdning lagerbeholdning = new Lagerbeholdning();
        lagerbeholdning.readFiles();
        lagerbeholdning.printLagerbeholdning();*/

        lagerBeholdningApp();
    }

    public static void lagerBeholdningApp() throws IOException {
        boolean control = true;
        Lagerbeholdning lagerbeholdning = new Lagerbeholdning();
        lagerbeholdning.readFiles();
        Ordre ordre = new Ordre();
        ArrayList<Leveranse> leveranser = new ArrayList<>();
        lagerbeholdning.påfyll(leveranser);


        while(control) {
            System.out.println(
                    "\nVelkommen til lagerbeholdningssystemet vårt!\n\n" +
                    "-----MENY------\n" +
                            "1: Skriv ut lagerbeholdningsrapport\n" +
                            "2: Skriv ut ordreistorikk\n" +
                            "3: Skriv ut leverandørrapport\n" +
                            "4: Rekvirer varer\n" +
                            "5: Avslutt\n"

            );

            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> lagerbeholdning.printLagerbeholdning();
                case 2 -> ordre.printOrdreHistorikk();
                case 3 -> {
                    if (leveranser != null && !leveranser.isEmpty()) {
                        leveranser.forEach(Leveranse::printLeveranse);
                    } else {
                        System.out.println("Ingen leveranser funnet.");
                    }
                }
                case 4 -> vareRekvirerikng();
                case 5 -> control = false;
                default -> System.out.println("Velg ett av menyvalgene over");
            }

        }
    }

    public static void vareRekvirerikng() {

    }
}