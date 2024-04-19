package controller;

import model.*;
import storage.Storage;
import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Controller {
//    public static Bestilling opretBestilling(LocalDate dato, Forestilling forestilling, Kunde kunde) {
//        Bestilling bestilling = new Bestilling(dato, forestilling, kunde);
//        forestilling.tilføjBestilling(bestilling);
//        bestilling.setKunde(kunde);
//        return bestilling;
//    }

    public static Bestilling opretBestillingMedPladser(Forestilling forestilling, Kunde kunde, LocalDate dato, ArrayList<Plads> pladser) {
        Bestilling bestilling = new Bestilling(dato, forestilling, kunde);
        forestilling.tilføjBestilling(bestilling);
//        bestilling.tilføjPlads(pladser);
        bestilling.setKunde(kunde);
        return bestilling;
    }

    public static Kunde opretKunde(String navn, String mobil) {
        Kunde kunde = new Kunde(navn, mobil);
        Storage.gemKunde(kunde);
        return kunde;
    }

    public static ArrayList<Kunde> getKunder() {
        return Storage.getKunder();
    }

    public static Forestilling opretForestilling(String navn, LocalDate startDato, LocalDate slutDato) {
        Forestilling forestilling = new Forestilling(navn, startDato, slutDato);
        Storage.gemForestilling(forestilling);
        return forestilling;
    }

    public static ArrayList<Forestilling> getForestillinger() {
        return Storage.getForestillinger();
    }
    public static ArrayList<Plads> getPladser() {
        return Storage.getPladser();
    }

    public static Plads opretPlads(int række, int nr, int pris, PladsType pladsType) {
        Plads plads = new Plads(række, nr, pris, pladsType);
        Storage.gemPlads(plads);
        return plads;
    }

    public static void tilføjKundeTilBestilling(Bestilling bestilling, Kunde kunde) {
//        if (bestilling.getKunde() != null) {
//            var gammelKunde = bestilling.getKunde();
//            gammelKunde.fjernBestilling(bestilling);
//        }
        kunde.tilføjBestilling(bestilling);
        bestilling.setKunde(kunde);
    }

    public static void tilføjBestillingTilForestilling(Forestilling forestilling, Bestilling bestilling) {
//        var oldForestilling = bestilling.getForestilling();
////        oldForestilling.fjernBestilling(bestilling);
        bestilling.setForestilling(forestilling);
        forestilling.tilføjBestilling(bestilling);
    }

    public static void tilføjPladsTilBestilling(Bestilling bestilling, Plads plads) {
        bestilling.tilføjPlads(plads);
    }

}
