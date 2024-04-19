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

    public static ArrayList<Forestilling> getForestillinger() {
        return new ArrayList<>(forestillinger);
    }

    public static void gemKunde(Kunde kunde) {
        kunder.add(kunde);
    }

    public static ArrayList<Kunde> getKunder() {
        return new ArrayList<>(kunder);
    }

    public static void gemPlads(Plads plads) {
        pladser.add(plads);
    }

    public static ArrayList<Plads> getPladser() {
        return new ArrayList<>(pladser);
    }

    public static ArrayList<Kunde> getBestillinger() {
        return new ArrayList<>(bestillinger);
    }
}