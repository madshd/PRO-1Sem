package SemesterproeveJun2023.gui;

import SemesterproeveJun2023.application.controller.Controller;
import SemesterproeveJun2023.application.model.Bane;
import SemesterproeveJun2023.application.model.Booking;
import SemesterproeveJun2023.application.model.Kategori;
import SemesterproeveJun2023.application.model.Spiller;

import java.time.LocalDate;
import java.time.LocalTime;

public class App {
    public static void main(String[] args) {
        Gui.launch(Gui.class);
    }
    public static void initStorage() {
        Kategori k1 = Controller.createKategori("Luksus", 100, 200);
        Kategori k2= Controller.createKategori("Mellem", 50, 100);
        Kategori k3 = Controller.createKategori("Begynder", 25, 50);
//        Luksus
        Bane b1 = Controller.createBane(1, true, LocalTime.of(9, 0), LocalTime.of(17,0), k1);
        Bane b2 = Controller.createBane(2, true, LocalTime.of(9, 0), LocalTime.of(17,0), k1);
//        Mellem
        Bane b3 = Controller.createBane(3, true, LocalTime.of(9, 0), LocalTime.of(17,0), k2);
        Bane b4 = Controller.createBane(4, false, LocalTime.of(9, 0), LocalTime.of(17,0), k2);
//        Begynder
        Bane b5 = Controller.createBane(5, false, LocalTime.of(9, 0), LocalTime.of(17,0), k3);
        Bane b6 = Controller.createBane(6, false, LocalTime.of(9, 0), LocalTime.of(17,0), k3);

//        Spillere
        Spiller s1 = Controller.createSpiller("Andreas", "DMU");
        Spiller s2 = Controller.createSpiller("Petra", "DMU");
        Spiller s3 = Controller.createSpiller("Henrik", "ITA");
        Spiller s4 = Controller.createSpiller("Ulla", "ITA");

//        Bookings

//        Andreas
        Booking book1 = Controller.createBooking(LocalDate.of(2023, 6, 20), LocalTime.of(10,0), true, s1, b3);
        Booking book2 = Controller.createBooking(LocalDate.of(2023, 6, 22), LocalTime.of(10,0), false, s1, b2);
//        Henrik
        Booking book3 = Controller.createBooking(LocalDate.of(2023, 6, 20), LocalTime.of(11,0), false, s3, b3);
//        Ulla
        Booking book4 = Controller.createBooking(LocalDate.of(2023, 6, 20), LocalTime.of(16,0), false, s4, b3);
        Booking book5 = Controller.createBooking(LocalDate.of(2023, 6, 23), LocalTime.of(17,0), true, s4, b5);
    }
}
