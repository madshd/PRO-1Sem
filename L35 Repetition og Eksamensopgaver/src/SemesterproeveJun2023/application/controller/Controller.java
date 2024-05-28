package SemesterproeveJun2023.application.controller;

import SemesterproeveJun2023.application.model.Bane;
import SemesterproeveJun2023.application.model.Booking;
import SemesterproeveJun2023.application.model.Kategori;
import SemesterproeveJun2023.application.model.Spiller;
import SemesterproeveJun2023.storage.Storage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalTime;

public abstract class Controller {
    public static Spiller createSpiller(String navn, String uddannelse) {
        Spiller spiller = new Spiller(navn, uddannelse);
        Storage.saveSpiller(spiller);
        return spiller;
    }
    public static Bane createBane(int nummer, boolean inde, LocalTime førsteTid, LocalTime sidsteTid, Kategori kategori) {
        Bane bane = new Bane(nummer, inde, førsteTid, sidsteTid, kategori);
        Storage.saveBane(bane);
        return bane;
    }
    public static Kategori createKategori(String navn, int prisKrSingle, int prisKrDouble) {
        Kategori kategori = new Kategori(navn, prisKrSingle, prisKrDouble);
        Storage.saveKategori(kategori);
        return kategori;
    }
    public static Booking createBooking(LocalDate dato, LocalTime tid, boolean single, Spiller spiller, Bane bane) {
        Booking booking = new Booking(dato, tid, single, spiller, bane);
        return booking;
    }
    public static int samletBookeyDoubleTid(String uddannelse, Kategori kategori) {
        int doubleTid = 0;
        for (Spiller spiller : Storage.getSpillere()) {
            if (spiller.getUddannelse() == uddannelse) {
                for (int i = 0; i < spiller.getBookings().size(); i++) {
                    if (spiller.getBookings().get(i).getBane().getKategori() == kategori && spiller.getBookings().get(i).isSingle() == false) {
                        doubleTid ++;
                    }
                }
            }
        }
        return doubleTid;
    }
    public static void udskrivAlleBookinger(String filnavn) {
        File out = new File("SemesterproeveJun2023/application/out.txt");
        try (PrintWriter writer = new PrintWriter(out)){
            try {
                for (int i = 0; i < Storage.getBaner().size(); i++) {
                    for (int j = 0; j < Storage.getBaner().get(j).getBookings().size(); j++) {
                        writer.print(Storage.getBaner().get(j).getBookings().get(j).toString());
                    }
                }
            } catch (RuntimeException ex) {
                System.err.println("Der blev ikke fundet nogle baner.");
            }
        } catch (FileNotFoundException ex) {
            System.err.println(filnavn + " blev ikke fundet.");
        }
    }
    public static Bane tidLedig(LocalDate dato, LocalTime tid, Kategori kategori) {
        Bane bane = null;
        int i = 0;
        while (bane == null && i < Storage.getBaner().size()) {
            Bane b = Storage.getBaner().get(i);
            if (!b.getBookings().get(i).getDato().equals(dato) &&  !b.getBookings().get(i).getTid().equals(tid)
                && !b.getBookings().get(i).getBane().getKategori().getNavn().equals(kategori.getNavn())
                    && Storage.getBaner().get(i).getKategori().getNavn() == kategori.getNavn()) {
                bane = b;
            } else {
                i++;
            }
        }
        return bane;
    }
}
