package SemesterproeveJan2019.application.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Kunde {
    private String navn;
    private String mobil;
    private final ArrayList<Bestilling> bestillinger = new ArrayList<>();
    public Kunde(String navn, String mobil) {
        this.navn = navn;
        this.mobil = mobil;
    }

    public String getNavn() {
        return navn;
    }

    public String getMobil() {
        return mobil;
    }

    public ArrayList<Bestilling> getBestillinger() {
        return new ArrayList<>(bestillinger);
    }
    public void addBestilling(Bestilling bestilling) {
        bestillinger.add(bestilling);
    }
    public void removeBestilling(Bestilling bestilling) {
        bestillinger.remove(bestilling);
    }
    public ArrayList<Plads> bestiltePladserTilForestillingPåDag(Forestilling forestilling, LocalDate dato) {
        ArrayList<Plads> pladser = new ArrayList<>();
        for (int i = 0; i < bestillinger.size(); i++) {
            if (dato.isEqual(dato) && bestillinger.get(i).getDato() == dato) {
                Plads plads = bestillinger.get(i).getPladser().get(i);
                pladser.add(plads);
            }
        }
        return pladser;
    }

    @Override
    public String toString() {
        return "Kunde{" +
                "navn='" + navn + '\'' +
                ", mobil='" + mobil + '\'' +
                '}';
    }
}
