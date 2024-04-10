package ex1student;

public class Car {
    private String brand;
    private String color;
    private String regNo; // registration number
    private int km;

    public Car(String brand, String color, String regNo, int km) {
        this.brand = brand;
        this.color = color;
        this.regNo = regNo;
        this.km = km;
    }

    public void setBrand (String newBrand) {
        brand = newBrand;
    }
    public void setColor (String newColor) {
        color = newColor;
    }

    public void setKm (int newKm) {
        km = newKm;
    }

    public void setRegNo (String newRegNo) {
        regNo = newRegNo;
    }
    /*
    e) In the Car class, add a method, that prints all information about a car. Test the method
    in the CarApp class on both cars.
    The print out could look something like this:
    ****************
    * VW UP, White
    * AB 12.345
    * 5432 km
    ****************
     */
    public void carPrint() {
        System.out.println("****************");
        System.out.println("* " + this.brand + ", " + this.color);
        System.out.println("* " + this.regNo);
        System.out.println("* " + this.km + " km");
        System.out.println("****************");
    }

    @Override
    public String toString() {
        return String.format("Car(%s, %s, %s, %d km)", brand, color, regNo, km);
    }
}
