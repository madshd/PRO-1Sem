package SemesterproeveJan2018.application.model;

import java.util.ArrayList;
import java.util.Arrays;

public class Uddannelse {
    private String name;
    private final ArrayList<Hold> holds = new ArrayList<>();
    public Uddannelse(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public ArrayList<Hold> getHold() {
        return new ArrayList<>(holds);
    }
    public void addHold(Hold hold) {
        holds.add(hold);
    }
    public void removeHold(Hold hold) {
        holds.remove(hold);
    }
}
