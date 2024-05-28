package SemesterproeveJun2023.application.model;

import SemesterproeveJan2019.application.model.Bestilling;
import com.sun.javafx.binding.OrElseBinding;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.util.ArrayList;

public class Bane {
    private int nummer;
    private boolean inde;
    private LocalTime førsteTid;
    private LocalTime sidsteTid;
    private ArrayList<Booking> bookings = new ArrayList<>();
    private Kategori kategori;
    public Bane(int nummer, boolean inde, LocalTime førsteTid, LocalTime sidsteTid, Kategori kategori) {
        this.nummer = nummer;
        this.inde = inde;
        this.førsteTid = førsteTid;
        this.sidsteTid = sidsteTid;
        this.kategori = kategori;
    }

    public int getNummer() {
        return nummer;
    }

    public boolean isInde() {
        return inde;
    }

    public LocalTime getFørsteTid() {
        return førsteTid;
    }

    public LocalTime getSidsteTid() {
        return sidsteTid;
    }

    public ArrayList<Booking> getBookings() {
        return new ArrayList<>(bookings);
    }
    public void addBooking(Booking booking) {
        bookings.add(booking);
    }
    public void removeBooking(Booking booking) {
        bookings.remove(booking);
    }
    public Kategori getKategori() {
        return kategori;
    }
    public void setKategori(Kategori kategori) {
        this.kategori = kategori;
    }

    public int bookedeTimerPåDato(LocalDate dato) {
        int antalTimer = 0;
        for (int i = 0; i < bookings.size(); i++) {
            if (bookings.get(i).getDato() == dato) {
                antalTimer++;
            }
        }
        return antalTimer;
    }

//    public Array[] antalBookningerPrTime() {
//        int[] antalBookningerPrTime = new int[8];
//        int current = 0;
//        int previous = 0;
//        for (int i = 0; i < bookings.size(); i++) {
//            if (current == previous)
//                antalBookningerPrTime[i]++;
//            else if (current > previous) {
//                antalBookningerPrTime[i] =
//            }
//        }
//    }
    public boolean tidLedig(LocalDate dato, LocalTime tid) {
        boolean erLedig = false;
        for (int i = 0; i < bookings.size(); i++) {
            if (dato != bookings.get(i).getDato() && tid != bookings.get(i).getTid()) {
                erLedig = true;
            } else {
                System.err.println("Tiden er ikke ledig.");
            }
        }
        return erLedig;
    }

    @Override
    public String toString() {
        return "Bane{" +
                "nummer=" + nummer +
                ", inde=" + inde +
                ", førsteTid=" + førsteTid +
                ", sidsteTid=" + sidsteTid +
                ", kategori=" + kategori.getNavn() +
                '}';
    }
}
