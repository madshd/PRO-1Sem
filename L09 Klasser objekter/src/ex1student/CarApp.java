package ex1student;

public class CarApp {

    public static void main(String[] args) {
        Car myCar = new Car("VW UP", "White", "AB 12.345", 50000);
        System.out.println("Test: " + myCar.toString());
        System.out.println();

        myCar.setBrand("VW UP");

//        System.out.println("Brand " + myCar.brand);
//        System.out.println("My car: " + myCar.brand + ", " + myCar.color);

//        myCar.km = 65000;
//        System.out.println("Km nu: " + myCar.km);

        Car newCar = new Car("Hyundai i10","White", "DE93277", 0);
        newCar.setBrand("Hyundai i20 N");
        newCar.setColor("Black");
        newCar.setKm(2300);
        System.out.println(newCar.toString());

        newCar.carPrint();
    }
}
