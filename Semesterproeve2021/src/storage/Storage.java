package storage;

import model.Fag;
import model.Studerende;

import java.util.ArrayList;

public abstract class Storage {
    private static final ArrayList<Fag> FAG = new ArrayList<>();
    private static final ArrayList<Studerende> STUDERENDE = new ArrayList<>();
    public static ArrayList<Fag> getFAG() {
        return new ArrayList<>(FAG);
    }
    public static ArrayList<Studerende> getSTUDERENDE() {
        return new ArrayList<>(STUDERENDE);
    }
    public static void addFag(Fag fag) {
        FAG.add(fag);
    }
    public static void removeFag(Fag fag) {
        FAG.remove(fag);
    }
    public static void addStuderende(Studerende studerende) {
        STUDERENDE.add(studerende);
    }
    public static void removeStuderende(Studerende studerende) {
        STUDERENDE.remove(studerende);
    }
}
