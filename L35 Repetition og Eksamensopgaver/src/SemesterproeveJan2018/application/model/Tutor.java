package SemesterproeveJan2018.application.model;

import com.sun.jdi.ArrayReference;

import java.util.ArrayList;

public class Tutor {
    private String navn;
    private String email;
    private Hold hold; //nullable
    private final ArrayList<Arrangement> arrangementer = new ArrayList<>();
    public Tutor(String navn, String email) {
        this.navn = navn;
        this.email = email;
    }
    public String getNavn() {
        return navn;
    }
    public String getEmail() {
        return email;
    }

    /** Note: nullable return value. */
    public Hold getHold() {
        return hold;
    }
    /** Note: Nullable param hold */
    public void setHold(Hold hold) {
        this.hold = hold;
    }

    public ArrayList<Arrangement> getArrangementer() {
        return new ArrayList<>(arrangementer);
    }
    public void addArrangement(Arrangement arrangement) {
        arrangementer.add(arrangement);
    }
    public void removeArrangement(Arrangement arrangement) {
        arrangementer.remove(arrangement);
    }
}
