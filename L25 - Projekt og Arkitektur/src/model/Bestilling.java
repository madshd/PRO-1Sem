package model;

import java.time.LocalDate;
import java.util.ArrayList;
import model.Forestilling;
import model.Kunde;

public class Bestilling {
    private LocalDate dato;
    private final Forestilling forestilling;
    private Kunde kunde;
    private final ArrayList<Plads> pladser = new ArrayList<>();
    public Bestilling(LocalDate dato, Forestilling forestilling, Kunde kunde) {
        this.dato = dato;
        this.forestilling = forestilling;
        this.kunde = kunde;
    }

    public ArrayList<Plads> hentPladser() {
        return new ArrayList<>(pladser);
    }

    public void tilføjPladser(ArrayList<Plads> nyePladser) {
        pladser.addAll(nyePladser);
    }

    public void fjernPlads(Plads plads) {
        pladser.remove(plads);
    }

    public void setKunde(Kunde kunde) {
        this.kunde = kunde;
    }

    public Forestilling getForestilling() {
        return forestilling;
    }

    public Kunde getKunde() {
        return kunde;
    }

    public LocalDate getDato() {
        return dato;
    }

    public ArrayList<Plads> getPladser() {
        return pladser;
    }

    @Override
    public String toString() {
        return  forestilling + "\n" + pladser;
    }
}
