package SemesterproeveJan2019.application.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Bestilling {
    private LocalDate dato;
    private final Forestilling forestilling;
    private Kunde kunde;
    private ArrayList<Plads> pladser = new ArrayList<>();
    public Bestilling(LocalDate dato, Forestilling forestilling, Kunde kunde) {
        this.dato = dato;
        this.forestilling = forestilling;
        this.kunde = kunde;
    }
    public LocalDate getDato() {
        return dato;
    }
    public Forestilling getForestilling() {
        return forestilling;
    }
    public Kunde getKunde() {
        return kunde;
    }
    public ArrayList<Plads> getPladser() {
        return new ArrayList<>(pladser);
    }
    public void setKunde(Kunde kunde) {
        this.kunde = kunde;
    }
    public void addPlads(Plads plads) {
        pladser.add(plads);
    }
    public int samletPris() {
        int pris = 0;
        int samletPris = 0;
        for (int i = 0; i < pladser.size(); i++) {
            pris = pladser.get(i).getPris();
            samletPris += pris;
        }
        return samletPris;
    }
}
