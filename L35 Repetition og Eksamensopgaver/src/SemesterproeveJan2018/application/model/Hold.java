package SemesterproeveJan2018.application.model;

import java.util.ArrayList;

public class Hold {
    private Uddannelse uddannelse;
    private String betegnelse;
    private String holdLeder;
    private final ArrayList<Tutor> tutorer = new ArrayList<>();
    public Hold(String betegnelse, String holdLeder, Uddannelse uddannelse) {
        this.betegnelse = betegnelse;
        this.holdLeder = holdLeder;
        this.uddannelse = uddannelse;
    }

    public String getBetegnelse() {
        return betegnelse;
    }

    public String getHoldLeder() {
        return holdLeder;
    }

    public Uddannelse getUddannelse() {
        return uddannelse;
    }

    public ArrayList<Tutor> getTutorer() {
        return new ArrayList<>(tutorer);
    }
    public void setUddannelse(Uddannelse uddannelse) {
        this.uddannelse = uddannelse;
    }
    public void addTutor(Tutor tutor) {
        tutorer.add(tutor);
    }
    public void removeTutor(Tutor tutor) {
        tutorer.remove(tutor);
    }
}
