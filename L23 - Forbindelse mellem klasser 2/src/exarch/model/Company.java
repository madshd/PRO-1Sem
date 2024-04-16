package exarch.model;

import java.util.ArrayList;

public class Company {
    private String name;
    private int hours; // weekly work hours

//    private int counter;

    // Company 0..1 --- 0..* Employee
    private final ArrayList<Employee> employees = new ArrayList<>();

    /** Pre: name not empty, hours >= 0. */
    public Company(String name, int hours) {
        this.name = name;
        this.hours = hours;
    }

    public String getName() {
        return name;
    }

    /** Pre: name not empty. */
    public void setName(String name) {
        this.name = name;
    }

    public int getHours() {
        return hours;
    }

//    public int getCounter() {
//        return counter;
//    }

    /** Pre: hours >= 0. */
    public void setHours(int hours) {
        this.hours = hours;
    }

    @Override
    public String toString() {
        return name + " (" + hours + " hours)";
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    /** Return the count of employees in this company. */
    public int employeesCount() {
        int counter = 0;
        for (Employee e : employees) {
            counter++;
        }
        return counter;
    }
}
