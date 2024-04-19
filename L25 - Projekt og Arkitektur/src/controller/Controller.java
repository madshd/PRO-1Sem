package controller;

import model.*;
import storage.Storage;
import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Controller {
    public static Bestilling opretBestilling(LocalDate dato, Forestilling forestilling, Kunde kunde) {
        Bestilling bestilling = new Bestilling(dato, forestilling, kunde);
        forestilling.tilføjBestilling(bestilling);
        kunde.tilføjBestilling(bestilling);

        return bestilling;
    }

    public static Bestilling opretBestillingMedPladser(Forestilling forestilling, Kunde kunde, LocalDate dato, ArrayList<Plads> pladser) {
        Bestilling bestilling = new Bestilling(dato, forestilling, kunde);
        forestilling.tilføjBestilling(bestilling);
        bestilling.tilføjPladser(pladser);

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
        kunde.tilføjBestilling(bestilling);
        bestilling.setKunde(kunde);
    }

    public static void tilføjBestillingTilForestilling(Forestilling forestilling, Bestilling bestilling) {
        forestilling.tilføjBestilling(bestilling);
    }

    public static boolean erPladsLedig(Forestilling forestilling, int række, int nr, LocalDate dato) {
        return forestilling.erPladsLedig(række, nr, dato);
    }

}

