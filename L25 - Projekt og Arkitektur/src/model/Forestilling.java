package model;

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

    @Override
    public String toString() {
        return "Forestilling{" +
                "navn='" + navn + '\'' +
                "startDato=" + startDato +
                "slutDato=" + slutDato +
                "} \n";
    }

}
