package ex3;

import java.security.DrbgParameters;
import java.time.Duration;
import java.time.LocalDate;

public class Rental {
    private int number;
    private int days;
    private LocalDate startDate;
    private double price;

    public Rental(int number, int days, double price, LocalDate startDate) {
        this.number = number;
        this.days = days;
        this.startDate = startDate;
        this.price = price;
    }

    public double getPricePrDay() {
        double pricePrDay = price / days;
        return pricePrDay;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public int getDays() {
        return days;
    }

    public LocalDate getStartDate() {
        startDate = LocalDate.now();
        return startDate;
    }

    public LocalDate getEndDate() {
        LocalDate endTime = startDate.plusDays(days);
        return endTime;
    }

    public double getTotalPrice() {
        LocalDate endTime = getEndDate();
        LocalDate elapsedTime = LocalDate.from(startDate);
        double totalPrice = getPricePrDay() * days;
        return totalPrice;
    }

    @Override
    public String toString() {
        return "Rental - " +
                "Rental No: " + number +
                " | Start date: " + startDate +
                " | End date: " + getEndDate() +
                " | Total price: " + getTotalPrice();
    }
}
