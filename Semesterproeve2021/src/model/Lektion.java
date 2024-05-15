package model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Lektion {
    private LocalDate dato;
    private LocalTime startTid;
    private String lokale;
    private Fag fag; //nullable
    private ArrayList<Deltagelse> deltagelser = new ArrayList<>();
    public Lektion(LocalDate dato, LocalTime startTid, String lokale, Fag fag) {
        this.dato = dato;
        this.startTid = startTid;
        this.lokale = lokale;
        this.fag = fag;
    }

    public LocalDate getDato() {
        return dato;
    }

    public LocalTime getStartTid() {
        return startTid;
    }

    public String getLokale() {
        return lokale;
    }

    public Fag getFag() {
        return fag;
    }

    public void setFag(Fag fag) {
        this.fag = fag;
    }

    public ArrayList<Deltagelse> getDeltagelser() {
        return deltagelser;
    }
    public void addDeltagelse(Deltagelse deltagelse) {
        deltagelser.add(deltagelse);
    }
    public void removeDeltagelse(Deltagelse deltagelse) {
        deltagelser.remove(deltagelse);
    }
}
