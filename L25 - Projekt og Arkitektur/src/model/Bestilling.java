package model;

import java.time.LocalDate;
import java.util.ArrayList;
import model.Forestilling;
import model.Kunde;

public class Bestilling {
    private LocalDate dato;
    private Forestilling forestilling;
    private Kunde kunde;
    private ArrayList<Plads> pladser = new ArrayList<>();
    public Bestilling(LocalDate dato, Forestilling forestilling, Kunde kunde) {
        this.dato = dato;
        this.forestilling = forestilling;
        this.kunde = kunde;
    }

    public ArrayList<Plads> hentPladser() {
        return new ArrayList<>(pladser);
    }

    public void tilføjPlads(Plads plads) {
        pladser.add(plads);
    }

    public void fjernPlads(Plads plads) {
        pladser.remove(plads);
    }

    public void setKunde(Kunde kunde) {
        this.kunde = kunde;
    }

    public void setForestilling(Forestilling forestilling) {
        this.forestilling = forestilling;
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

    @Override
    public String toString() {
        return "Bestilling{" +
                "dato=" + dato +
                "pladser=" + pladser +
                forestilling +
                "} \n";
    }
}
