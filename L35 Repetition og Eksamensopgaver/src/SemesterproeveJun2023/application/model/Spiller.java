package SemesterproeveJun2023.application.model;

import java.util.ArrayList;

public class Spiller {
    private String navn;
    private String uddannelse;
    private ArrayList<Booking> bookings = new ArrayList<Booking>();
    public Spiller(String navn, String uddannelse) {
        this.navn = navn;
        this.uddannelse = uddannelse;
    }

    public String getNavn() {
        return navn;
    }

    public String getUddannelse() {
        return uddannelse;
    }

    public ArrayList<Booking> getBookings() {
        return new ArrayList<>(bookings);
    }

    public void addBooking(Booking booking) {
        bookings.add(booking);
    }

    public double sampletPris(Kategori kategori) {
        double prisTotal = 0;
        for (Booking b : bookings) {
            if (b.getBane().getKategori() == kategori) {
                if (b.isSingle() == false) {
                    prisTotal += b.getBane().getKategori().getPrisKrDouble();
                } else {
                    prisTotal += b.getBane().getKategori().getPrisKrSingle();
                }
            }
        }
        return prisTotal;
    }

    @Override
    public String toString() {
        return "Spiller{" +
                "navn='" + navn + '\'' +
                ", uddannelse='" + uddannelse + '\'' +
                '}';
    }
}
