package SemesterproeveJun2023.storage;

import SemesterproeveJun2023.application.model.Bane;
import SemesterproeveJun2023.application.model.Kategori;
import SemesterproeveJun2023.application.model.Spiller;

import javax.swing.plaf.basic.BasicMenuBarUI;
import java.util.ArrayList;

public abstract class Storage {
    private static final ArrayList<Spiller> spillere = new ArrayList<>();
    private static final ArrayList<Bane> baner = new ArrayList<>();
    private static final ArrayList<Kategori> kategorier = new ArrayList<>();

    public static ArrayList<Spiller> getSpillere() {
        return new ArrayList<>(spillere);
    }
    public static ArrayList<Bane> getBaner() {
        return new ArrayList<>(baner);
    }
    public static ArrayList<Kategori> getKategorier() {
        return new ArrayList<>(kategorier);
    }
    public static void saveSpiller(Spiller spiller) {
        spillere.add(spiller);
    }
    public static void saveBane(Bane bane) {
        baner.add(bane);
    }
    public static void saveKategori(Kategori kategori) {
        kategorier.add(kategori);
    }
}
