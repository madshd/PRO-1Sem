package controller;

import model.*;
import storage.Storage;

import java.time.LocalDate;

public abstract class Controller {
    public static Bestilling opretBestilling(LocalDate dato, Forestilling forestilling) {
        Bestilling bestilling = new Bestilling(dato, forestilling);
        forestilling.tilføjBestilling(bestilling);
        return bestilling;
    }

    public static Kunde opretKunde(String navn, String mobil) {
        Kunde kunde = new Kunde(navn, mobil);
//        bestilling.tilføjKunde(kunde);
        Storage.gemKunde(kunde);
        return kunde;
    }

    public static Forestilling opretForestilling(String navn, LocalDate startDato, LocalDate slutDato) {
        Forestilling forestilling = new Forestilling(navn, startDato, slutDato);
        Storage.gemForestilling(forestilling);
        return forestilling;
    }

    public static Plads opretPlads(int række, int nr, int pris, PladsType pladsType) {
        Plads plads = new Plads(række, nr, pris, pladsType);
        Storage.gemPlads(plads);
        return plads;
    }

    public static void tilføjKundeTilBestilling(Bestilling bestilling, Kunde kunde) {
        var gammelKunde = bestilling.getKunde();
        gammelKunde.fjernBestilling(bestilling);
        kunde.tilføjBestilling(bestilling);
        bestilling.setKunde(kunde);
        kunde.tilføjBestilling(bestilling);
    }

    public static void tilføjBestillingTilForestilling(Forestilling forestilling, Bestilling bestilling) {
        var oldForestilling = bestilling.getForestilling();
        oldForestilling.fjernBestilling(bestilling);
        bestilling.setForestilling(forestilling);
        forestilling.tilføjBestilling(bestilling);
    }
}
