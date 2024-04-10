package ex3;

import java.time.LocalDate;
import java.util.ArrayList;

public class TestClass {
    public static void main(String[] args) {
        Rental r1 = new Rental(1, String.valueOf(LocalDate.now()), 4);
        Rental r2 = new Rental(2, String.valueOf(LocalDate.now()), 3);
        Rental r3 = new Rental(3, String.valueOf(LocalDate.now()), 17);

        Car c1 = new Car("887sd87sd7862", "2017");
        Car c2 = new Car("887sd99sd7862", "2017");
        Car c3 = new Car("887sd76sd7862", "2017");

        c1.setPricePerDay(1000);
        c2.setPricePerDay(245);
        c3.setPricePerDay(725);

        r1.addCar(c1);
        r2.addCar(c2);
        r3.addCar(c3);

        System.out.println("Car No. : " + r1.getNo() + " | Date: " + r1.getDate() + " | Price: " + r1.getPrice() + " | Days: " + r1.getDays());
        System.out.println("Car No. : " + r2.getNo() + " | Date: " + r2.getDate() + " | Price: " + r2.getPrice() + " | Days: " + r2.getDays());
        System.out.println("Car No. : " + r3.getNo() + " | Date: " + r3.getDate() + " | Price: " + r3.getPrice() + " | Days: " + r3.getDays());

    }
}
