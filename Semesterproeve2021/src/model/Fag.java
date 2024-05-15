package model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Fag {
    private String navn;
    private String klasse;
    private final ArrayList<Lektion> lektioner = new ArrayList<>();
    public Fag(String navn, String klasse) {
        this.navn = navn;
        this.klasse = klasse;
    }
    public String getNavn() {
        return navn;
    }
    public String getKlasse() {
        return klasse;
    }
    public ArrayList<Lektion> getLektioner() {
        return new ArrayList<>(lektioner);
    }
    public void addLektion(Lektion lektion) {
        lektioner.add(lektion);
    }
    public void removeLektion(Lektion lektion) {
        lektioner.remove(lektion);
    }
    public ArrayList<Studerende> sygdomPåDato(LocalDate dato) {
        ArrayList<Studerende> sygdomPåDatoListe = new ArrayList<>();
        for (Lektion lektion : lektioner) {
            if (lektion.getDato() == dato) {
                for (int i = 0; i < lektion.getDeltagelser().size(); i++) {
                    if(lektion.getDeltagelser().get(i).getStatus() == DeltagerStatus.SYG) {
                        sygdomPåDatoListe.add(lektion.getDeltagelser().get(i).getStuderende());
                    }
                }
            }
        }
        return sygdomPåDatoListe;
    }
}
