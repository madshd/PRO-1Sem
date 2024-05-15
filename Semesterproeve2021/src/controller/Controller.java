package controller;

import model.*;
import storage.Storage;

import java.time.LocalDate;
import java.time.LocalTime;


public abstract class Controller {
    public static Deltagelse createDeltagelse(boolean registreret, String begrundelse, DeltagerStatus status, Lektion lektion, Studerende studerende) {
        Deltagelse deltagelse = new Deltagelse(registreret, begrundelse, status, lektion, studerende);
        lektion.addDeltagelse(deltagelse);
        studerende.addDeltagelse(deltagelse);
        return deltagelse;
    }
    //    public void addStuderendeToDeltagelse(Deltagelse deltagelse, Studerende studerende) {
//        deltagelse.set
//        studerende.addDeltagelse(deltagelse);
//    }
    public static Studerende createStuderende(String navn, String email) {
        Studerende studerende = new Studerende(navn, email);
        Storage.addStuderende(studerende);
        return studerende;
    }
    public static Fag createFag(String navn, String klasse) {
        Fag fag = new Fag(navn, klasse);
        Storage.addFag(fag);
        return fag;
    }
    public static Lektion createLektion(LocalDate dato, LocalTime startTid, String lokale, Fag fag) {
        Lektion lektion = new Lektion(dato, startTid, lokale, fag);
        fag.addLektion(lektion);
        return lektion;
    }
    public void initStorage() {
        Studerende s1 = Controller.createStuderende("Peter Hansen", "ph@stud.dk");
        Studerende s2 = Controller.createStuderende("Tina Jensen", "tj@stud.dk");
        Studerende s3 = Controller.createStuderende("Sascha Petersen", "sp@stud.dk");

        Fag f1 = Controller.createFag("PRO1", "20S");
        Fag f2 = Controller.createFag("PRO1", "20T");
        Fag f3 = Controller.createFag("SU1", "20S");

        Lektion l1 = Controller.createLektion(LocalDate.of(2021, 2,1), LocalTime.of(8,30), "A1.32", f1);
        Lektion l2 = Controller.createLektion(LocalDate.of(2021, 2,1), LocalTime.of(10,30), "A1.32", f1);
        Lektion l3 = Controller.createLektion(LocalDate.of(2021, 2,3), LocalTime.of(8,30), "A1.32", f1);
        Lektion l4 = Controller.createLektion(LocalDate.of(2021, 2,3), LocalTime.of(10,30), "A1.32", f1);
    }
    public void opretDeltagelser(Fag fag, Studerende studerende) {
        for (int i = 0; i < fag.getLektioner().size(); i++) {
            fag.getLektioner().get(i).addDeltagelse(studerende.getDeltagelser().get(i));
        }
    }
}
