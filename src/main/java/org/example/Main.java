package org.example;

import java.io.IOException;
import java.util.*;

public class Main {

    private static final Lagerbeholdning lagerbeholdning = new Lagerbeholdning();
    private static final Ordre ordre = new Ordre();

    public static void main(String[] args) throws IOException {
        lagerBeholdningApp();
    }

    public static void lagerBeholdningApp() throws IOException {
        boolean control = true;
        Scanner scanner = new Scanner(System.in);
        lagerbeholdning.readFiles();

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

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> lagerbeholdning.printLagerbeholdning();
                case 2 -> ordre.printOrdreHistorikk();
                case 4 -> vareRekvirering();
                case 5 -> control = false;
                default -> System.out.println("Velg ett av menyvalgene over");
            }

        }
    }

    public static void vareRekvirering() {
        boolean control = false;

        do {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Angi produktnummeret til produktet du vil bestille");

            String produktNummer = scanner.nextLine();

            System.out.println("Angi antall enheter av produktet");

            int antall = scanner.nextInt();
            scanner.nextLine();

            //Oppretter et ordreLinje objekt
            Map<String, Integer> ordreLinjeMap = new HashMap<>();
            ordreLinjeMap.put(produktNummer, antall);

            lagerbeholdning.hentVarer(ordreLinjeMap, ordre);

            System.out.println("Ønsker du å bestille mer? J/N");

            String leggeTil = scanner.nextLine();

            control = leggeTil.equals("J");

        } while(control);
    }
}