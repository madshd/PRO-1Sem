package Ex3;

public class Person {
    private final String name;
    private String address;
    private int monthlySalary;
    private double annualSalary;

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void setMonthlySalary(int newSal) {
        monthlySalary = newSal;
    }

    public String toString() {
        return String.format("Person: (%s, %s, %d)", name, address, monthlySalary, annualSalary);
    }
    public void printPerson() {
        System.out.println("*******************");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Monthly salary: " + monthlySalary + " DKK");
        System.out.println("Annual salary: " + annualSalary);
        System.out.println("*******************");
    }
    public void calcYearlySalary() {
        annualSalary = (monthlySalary * 12.0) + (monthlySalary * 0.025);
    }

}
