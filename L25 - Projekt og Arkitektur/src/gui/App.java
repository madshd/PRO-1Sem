package gui;

import controller.Controller;
import javafx.application.Application;
import javafx.scene.layout.GridPane;
import model.*;
import storage.Storage;
import model.Kunde;
import model.Bestilling;
import model.Forestilling;
import model.Plads;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        initStorage();
        opretPladser();
        Application.launch(AppGui.class);
        testPrint();

    }

    public static void initStorage() {
        Forestilling f1 = Controller.opretForestilling("Evita", LocalDate.parse("2023-08-10"), LocalDate.parse("2023-08-20"));
        Forestilling f2 = Controller.opretForestilling("Lykke Per", LocalDate.parse("2023-09-01"), LocalDate.parse("2023-09-10"));
        Forestilling f3 = Controller.opretForestilling("Chess", LocalDate.parse("2023-08-21"), LocalDate.parse("2023-08-30"));

        Kunde k1 = Controller.opretKunde("Niels Madsen", "11223344");
        Kunde k2 = Controller.opretKunde("Anders Hansen", "11223344");
        Kunde k3 = Controller.opretKunde("Peter Jensen", "11223344");

        Bestilling b1 = Controller.opretBestilling(LocalDate.now(), f2, k1);
        Bestilling b2 = Controller.opretBestilling(LocalDate.now(), f2, k2);
        Bestilling b3 = Controller.opretBestilling(LocalDate.now(), f2, k3);

        Plads p1 = Controller.opretPlads(1,1,beregnPris(1,1), bestemPladsType(1,1));
    }

    public static void opretPladser() {
        int antalRaekker = 15;
        int antalSaeder = 20;
        for (int raekkeNr = 1; raekkeNr <= antalRaekker; raekkeNr++){
            for (int saedeNr = 1; saedeNr <= antalSaeder; saedeNr++){
                Controller.opretPlads(raekkeNr, saedeNr, beregnPris(raekkeNr, saedeNr), bestemPladsType(raekkeNr, saedeNr));
            }
        }
    }

    public static int beregnPris(int raekkeNr, int saedeNr) {
        int pris = 0;
        switch (raekkeNr) {
            // GULE PLADSER
            case 1, 2, 3, 4, 5 -> {
                if (saedeNr >= 3 && saedeNr <= 18 || saedeNr <= 1 && saedeNr >= 2 || saedeNr <= 19 && saedeNr >= 20) {
                    pris = 500;
                }
            }
            // GRØNNE PLADSER
            case 6, 7, 8, 9, 10 -> {
                if (saedeNr >= 3 && saedeNr <= 18 || saedeNr <= 1 && saedeNr >= 2 || saedeNr <= 19 && saedeNr >= 20) {
                    pris = 450;
                }
            }
            // BLÅ PLADSER
            case 11, 12, 13, 14, 15 -> {
                if (saedeNr >= 3 && saedeNr <= 18) {
                    pris = 500;
                }
            }
        }
        return pris;
    }
    public static PladsType bestemPladsType(int raekkeNr, int saedeNr) {
        return switch (raekkeNr) {
            case 10 -> switch (saedeNr) {
                case 8, 9, 10, 11, 12 -> PladsType.KØRESTOL;
                default -> PladsType.STANDARD;
            };
            case 11 -> switch (saedeNr) {
                case 8, 9, 10, 11, 12 -> PladsType.EKSTRABEN;
                default -> PladsType.STANDARD;
            };
            default -> PladsType.STANDARD;
        };
    }

    public static void testPrint() {
        System.out.println(Controller.hentForestillinger());
        System.out.println(Controller.hentKunder());
        System.out.println(Controller.hentPladser());
    }
}
