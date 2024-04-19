package model;

import controller.Controller;

import java.time.LocalDate;
import java.util.ArrayList;

public class Forestilling {
    private String navn;
    private LocalDate startDato;
    private LocalDate slutDato;
    // association 1 forestilling --> 0..* bestilling
    private ArrayList<Bestilling> bestillinger = new ArrayList<>();
    public Forestilling(String navn, LocalDate startDato, LocalDate slutDato) {
        this.navn = navn;
        this.startDato = startDato;
        this.slutDato = slutDato;
    }

    public ArrayList<Bestilling> hentBestillinger() {
        return new ArrayList<>(bestillinger);
    }

    public void tilføjBestilling(Bestilling bestilling) {
        bestillinger.add(bestilling);
    }

    public void fjernBestilling(Bestilling bestilling) {
        bestillinger.remove(bestilling);
    }

    public LocalDate getStartDato() {
        return startDato;
    }

    public LocalDate getSlutDato() {
        return slutDato;
    }

    // TODO

//    public boolean erPladsLedig(int række,int nr, LocalDate dato) {
//        for (Bestilling bestilling : bestillinger) {
//            if (dato == bestilling.getDato()) {
//                for (Plads plads : bestilling.hentPladser()) {
//                    if (række == bestilling.get)
//                }
//            }
//        }
//    }

    public boolean erPladsLedig(int række, int nr, LocalDate dato) {
        boolean pladsLedig = false; //Antager at sædet ikke er optaget som standard
        for (Bestilling bestilling : bestillinger) {
            for (Plads plads : bestilling.hentPladser()) {
                if (bestilling.getDato().equals(dato) && plads.getRække() == række && plads.getNr() == nr) {
                    pladsLedig = true;
                }
            }
        }
        return pladsLedig;
    }

    @Override
    public String toString() {
        return navn + "(fra " +
                startDato + " til " +
                slutDato + ")";
    }

}
