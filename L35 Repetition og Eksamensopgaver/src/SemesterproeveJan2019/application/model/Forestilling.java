package SemesterproeveJan2019.application.model;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;

public class Forestilling {
    private String navn;
    private LocalDate startDato;
    private LocalDate slutDato;
    private ArrayList<Bestilling> bestillinger = new ArrayList<>();

    public Forestilling(String navn, LocalDate startDato, LocalDate slutDato) {
        this.navn = navn;
        this.startDato = startDato;
        this.slutDato = slutDato;
    }

    public String getNavn() {
        return navn;
    }

    public LocalDate getStartDato() {
        return startDato;
    }

    public LocalDate getSlutDato() {
        return slutDato;
    }

    public ArrayList<Bestilling> getBestillinger() {
        return bestillinger;
    }
    public void addBestilling(Bestilling bestilling) {
        bestillinger.add(bestilling);
    }
    public void removeBestilling(Bestilling bestilling) {
        bestillinger.remove(bestilling);
    }
    public int antalBestiltePladserPåDag(LocalDate dato) {
        int count = 0;
        for (int i = 0; i < bestillinger.size(); i++) {
           if (dato == bestillinger.get(i).getDato()) {
               count += bestillinger.get(i).getPladser().size();
           }
        }
        return count;
    }
    public int succesDato() {
        Period period = Period.between(startDato, slutDato);
        int indexTal = 0;
        int succesAntal = 0;
        for (int i = 0; i < bestillinger.size(); i++) {
            int antalPladser = getBestillinger().get(i).getPladser().size();
            indexTal = antalPladser;
            if (antalPladser >= indexTal) {
                getBestillinger().get(i).getDato();
                antalPladser = succesAntal;
            }
        }
        return succesAntal;
    }

    /*
    Tilføj til klassen Forestilling metoden erPladsLedig(int række,int nr, LocalDate dato): boolean,
    der returnerer om den pågældende plads er ledig til forestillingen på den angivne dato.
    Det er et krav at metoden implementeres under anvendelse af søgeskabelonen.
     */
    public boolean erPladsLedig(int række, int nr, LocalDate dato) {
        int indeks = -1;
        int i = 0;
        while ( indeks == -1 && i < bestillinger.size()) {
            Plads plads = bestillinger.get(i).getPladser().get(i);
            if (dato.isEqual(bestillinger.get(i).getDato())) {
                if (række == plads.getRække() && nr == plads.getNr()) {
                   return false;
                }
            }
            i++;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Forestilling{" +
                "navn='" + navn + '\'' +
                ", startDato=" + startDato +
                ", slutDato=" + slutDato +
                '}';
    }
}
