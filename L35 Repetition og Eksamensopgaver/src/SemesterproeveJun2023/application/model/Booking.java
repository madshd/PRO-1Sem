package SemesterproeveJun2023.application.model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Booking {
    private LocalDate dato;
    private LocalTime tid;
    private boolean single;
    // composition 0..* --- 1 Spiller
    private final Spiller spiller;
    private Bane bane;
    public Booking(LocalDate dato, LocalTime tid, boolean single, Spiller spiller, Bane bane) {
        this.dato = dato;
        this.tid = tid;
        this.single = single;
        this.spiller = spiller;
        this.bane = bane;
    }

    public LocalDate getDato() {
        return dato;
    }

    public LocalTime getTid() {
        return tid;
    }

    public boolean isSingle() {
        return single;
    }

    public Bane getBane() {
        return bane;
    }
    public void setBane(Bane bane) {
        this.bane = bane;
    }
}
