package model;

public class Plads {
    private int række;
    private int nr;
    private int pris;
    private PladsType pladsType;
    public Plads(int række, int nr, int pris, PladsType pladsType) {
        this.række = række;
        this.nr = nr;
        this.pris = pris;
        this.pladsType = pladsType;
    }

    public void tilføjPladsType(PladsType pladsType) {
        this.pladsType = pladsType;
    }

    public int getRække() {
        return række;
    }

    public int getNr() {
        return nr;
    }

    @Override
    public String toString() {
        return "Rk " + række +
                " nr " + nr +
                " (kr. " + pris +
                " " + pladsType + ")";
    }
}
