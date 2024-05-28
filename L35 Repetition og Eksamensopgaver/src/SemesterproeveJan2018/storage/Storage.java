package SemesterproeveJan2018.storage;

import SemesterproeveJan2018.application.model.Arrangement;
import SemesterproeveJan2018.application.model.Tutor;
import SemesterproeveJan2018.application.model.Uddannelse;

import java.util.ArrayList;

public abstract class Storage {
    public static final ArrayList<Uddannelse> uddannelser = new ArrayList<>();
    public static final ArrayList<Tutor> tutorer = new ArrayList<>();
    public static final ArrayList<Arrangement> arrangementer = new ArrayList<>();
    public static ArrayList<Uddannelse> getUddannelser() {
        return new ArrayList<>(uddannelser);
    }
    public static ArrayList<Tutor> getTutorer() {
        return new ArrayList<>(tutorer);
    }
    public static ArrayList<Arrangement> getArrangementer() {
        return new ArrayList<>(arrangementer);
    }
    public static void addUddannelse(Uddannelse uddannelse) {
        uddannelser.add(uddannelse);
    }
    public static void addTutor(Tutor tutor) {
        tutorer.add(tutor);
    }
    public static void addArrangement(Arrangement arrangement) {
        arrangementer.add(arrangement);
    }
}
