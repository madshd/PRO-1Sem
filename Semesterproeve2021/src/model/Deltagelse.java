package model;

import java.util.ArrayList;

public class Deltagelse {
    private boolean registreret = false;
    private String begrundelse;
    private DeltagerStatus status = DeltagerStatus.TILSTEDE;
    private final Lektion lektion;
    private final Studerende studerende;
    public Deltagelse(boolean registreret, String begrundelse, DeltagerStatus status, Lektion lektion, Studerende studerende) {
        this.registreret = registreret;
        this.begrundelse = begrundelse;
        this.status = status;
        this.lektion = lektion;
        this.studerende = studerende;
    }
    public boolean isRegistreret() {
        return registreret;
    }
    public String getBegrundelse() {
        return begrundelse;
    }
    public DeltagerStatus getStatus() {
        return status;
    }
    public Lektion getLektion() {
        return lektion;
    }
//    public ArrayList<Studerende> getStuderendes() {
//        return studerendes;
//    }
//    public void addStuderende(Studerende studerende) {
//        studerendes.add(studerende);
//    }

    public Studerende getStuderende() {
        return studerende;
    }
}
