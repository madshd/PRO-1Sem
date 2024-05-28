package SemesterproeveJan2019.application.controller;

import SemesterproeveJan2019.application.model.Bestilling;
import SemesterproeveJan2019.application.model.Forestilling;
import SemesterproeveJan2019.application.model.Kunde;
import SemesterproeveJan2019.application.model.Plads;
import SemesterproeveJan2019.storage.Storage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Calendar;

public abstract class Controller {
    public static void createForestilling(String navn, LocalDate startDato, LocalDate slutDato) {
        Forestilling forestilling = new Forestilling(navn, startDato, slutDato);
        Storage.saveForestilling(forestilling);
    }
    public static void createKunde(String navn, String mobil) {
        Kunde kunde = new Kunde(navn, mobil);
        Storage.saveKunde(kunde);
    }
    public static ArrayList<Forestilling> getForestillinger() {
       return Storage.getForestillinger();
    }
    public static ArrayList<Kunde> getKunder() {
        return Storage.getKunder();
    }
    // TODO
//    public static Bestilling opretBestillingMedPladser(Forestilling forestilling, Kunde kunde, LocalDate dato, ArrayList<Plads> pladser) {
//        Bestilling bestilling = new Bestilling(dato, forestilling, kunde);
//        if (dato.isAfter(forestilling.getStartDato()) || dato.isBefore(forestilling.getSlutDato()))
//                try {
//                    for (Plads p : pladser) {
//                        if (forestilling.erPladsLedig(p.getRække(), p.getNr(), dato)) {
//                            bestilling.addPlads(p);
//                        }
//                    }
//                } catch (RuntimeException e) {
//                    System.err.println("Datoen er forkert og- eller pladsen er reserveret.");
//                }
//        forestilling.addBestilling(bestilling);
//        return bestilling;
//    }

    public static Bestilling opretBestillingMedPladser(Forestilling forestilling, Kunde kunde, LocalDate dato, ArrayList<Plads> pladser) {
        Bestilling bestilling = null;
        boolean isFinished = false;
        while (!isFinished) {
            try {
                bestilling = new Bestilling(dato, forestilling, kunde);
                if (!dato.isBefore(forestilling.getStartDato()) && !dato.isAfter(forestilling.getSlutDato())) {
                    try {
                        for (Plads p : pladser) {
                            if (forestilling.erPladsLedig(p.getRække(), p.getNr(), dato)) {
                                bestilling.addPlads(p);
                            } else {
                                System.err.println("Plads " + p.getRække() + "-" + p.getNr() + " er ikke ledig på denne dato.");
                                isFinished = true;
                            }
                        }
                        if (bestilling.getPladser().isEmpty()) {
                            System.err.println("Ingen pladser kunne reserveres.");
                            isFinished = true;
                        }
                    } catch (RuntimeException ex) {
                        System.err.println("Ingen ledige pladser på denne dato.");
                    }
                    forestilling.addBestilling(bestilling);
                }
            } catch (Exception e) {
                System.err.println("Datoen er ugyldig.");
            }
        }
            return bestilling;
    }

    public static void oversigtOverForestillinger(String filnavn) {
        File out = new File("SemesterproeveJan2019/application/out.txt");
        try (PrintWriter writer = new PrintWriter(out)){
            try {
                for (int i = 0; i < Storage.getForestillinger().size(); i++) {
                    writer.print(Storage.getForestillinger().get(i).getNavn());
                }
            } catch (RuntimeException ex) {
                System.err.println("Der blev ikke fundet nogle forestillinger.");
            }
        } catch (FileNotFoundException ex) {
            System.err.println(filnavn + " blev ikke fundet.");
        }
    }
    public static void initStorage() {
        createForestilling("Evita", LocalDate.of(2019,01,10), LocalDate.of(2019, 01,20));
        createForestilling("Evita", LocalDate.of(2019,02,01), LocalDate.of(2019, 02,10));
        createForestilling("Evita", LocalDate.of(2019,01,21), LocalDate.of(2019, 01,30));

        createKunde("Anders Hansen", "11223344");
        createKunde("Peter Jense", "12345678");
        createKunde("Niels Madsen", "12341234");
    }
}
