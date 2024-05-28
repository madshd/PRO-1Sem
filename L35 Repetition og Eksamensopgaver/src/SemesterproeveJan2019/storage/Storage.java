package SemesterproeveJan2019.storage;

import SemesterproeveJan2019.application.model.Forestilling;
import SemesterproeveJan2019.application.model.Kunde;

import java.util.ArrayList;

public abstract class Storage {
    public static final ArrayList<Forestilling> forestillinger = new ArrayList<>();
    public static final ArrayList<Kunde> kunder = new ArrayList<>();

    public static ArrayList<Forestilling> getForestillinger() {
        return new ArrayList<>(forestillinger);
    }
    public static ArrayList<Kunde> getKunder() {
        return new ArrayList<>(kunder);
    }
    public static void saveForestilling(Forestilling forestilling) {
        forestillinger.add(forestilling);
    }
    public static void saveKunde(Kunde kunde) {
        kunder.add(kunde);
    }

}
