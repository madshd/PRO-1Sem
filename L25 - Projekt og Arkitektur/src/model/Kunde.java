package model;

import java.util.ArrayList;

public class Kunde {
    private String navn;
    private String mobil;

    private final ArrayList<Bestilling> bestillinger = new ArrayList<>();

    public Kunde(String navn, String mobil) {
        this.navn = navn;
        this.mobil = mobil;
    }
    public ArrayList<Bestilling> hentBestillinger() {
        return bestillinger;
    }

    public void tilføjBestilling(Bestilling bestilling) {
        bestillinger.add(bestilling);
    }

    public void fjernBestilling(Bestilling bestilling) {
        bestillinger.remove(bestilling);
    }

    @Override
    public String toString() {
        return navn + " (" + mobil + ") " + bestillinger;
    }
}
