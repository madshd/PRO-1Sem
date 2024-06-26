package ex3;

import java.time.LocalDate;
import java.util.ArrayList;

public class Rental {
    private int no;
    private String date = String.valueOf(LocalDate.now());
    private int days; //days of rental
    private ArrayList<Car> cars = new ArrayList<>();
    public Rental(int no, String date, int days) {
        this.no = no;
        this.date = date;
        this.days = days;
    }

    public int getNo() {
        return no;
    }

    public String getDate() {
        return date;
    }

    public int getPrice() {
        int price = 0;
        for (Car car : cars) {
            price = car.getPricePerDay();
        }
        return price * getDays();
    }

    public void setDays(int days) {
        this.days = days;
    }

    public int getDays() {
        return days;
    }

    public ArrayList<Car> getCars() {
        return new ArrayList<>(cars);
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public void removeCar(Car car) {
        cars.remove(car);
    }
}
