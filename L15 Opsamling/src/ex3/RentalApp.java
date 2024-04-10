package ex3;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;


public class RentalApp {
    public static void main(String[] args) {
        Rental r1 = new Rental(12345, 10, 5000.0, LocalDate.of(2025,01,06));
        System.out.println(r1.toString());

        Rental r2 = new Rental(12346, 5, 2500.0, LocalDate.of(2024,04,01));
        System.out.println(r2.toString());

        Period period1 = Period.between(r2.getStartDate(), r1.getEndDate());

        long totalYears = ChronoUnit.YEARS.between(r2.getStartDate(), r1.getEndDate());
        long totalMonths = ChronoUnit.MONTHS.between(r2.getStartDate(), r1.getEndDate());
        long totalDays = ChronoUnit.DAYS.between(r2.getStartDate(), r1.getEndDate());

        Period period2 = Period.between(r1.getStartDate(), r2.getEndDate());
        long totalDays2 = ChronoUnit.DAYS.between(r1.getStartDate(), r2.getEndDate());
        System.out.println("Years: " + period1.getYears() + " | Months: " + period1.getMonths() + " | Days: " + period1.getDays());
        System.out.println("Years: " + period2.getYears() + " | Months: " + period2.getMonths() + " | Days: " + period2.getDays());
        System.out.println("R1 Years: " + totalYears + " | Months: " + totalMonths + " | Days: " + totalDays);
        System.out.println("R2 Days: " + totalDays2);
    }
}
