package storage;

import model.Bestilling;
import model.Forestilling;
import model.Kunde;
import model.Plads;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public abstract class Storage {
    private static ArrayList<Kunde> bestillinger = new ArrayList<>();
    private static ArrayList<Forestilling> forestillinger = new ArrayList<>();
    private static ArrayList<Kunde> kunder = new ArrayList<>();
    private static ArrayList<Plads> pladser = new ArrayList<>();

    public static void gemForestilling(Forestilling forestilling) {
        forestillinger.add(forestilling);
    }

    public static ArrayList<Forestilling> hentForestillinger() {
        return new ArrayList<>(forestillinger);
    }

    public static void gemKunde(Kunde kunde) {
        kunder.add(kunde);
    }

    public static ArrayList<Kunde> hentKunder() {
        return new ArrayList<>(kunder);
    }

    public static void gemPlads(Plads plads) {
        pladser.add(plads);
    }

    public static ArrayList<Plads> hentPladser() {
        return new ArrayList<>(pladser);
    }

    public static ArrayList<Kunde> hentBestillinger() {
        return new ArrayList<>(bestillinger);
    }
}