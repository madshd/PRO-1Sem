package ex2student;

public class EmployeeApp {

    public static void main(String[] args) {
        Employee e1 = new Employee("Hans Jensen", true);
        Employee e2 = new Employee("Hans Madsen", true, 30);
        System.out.println("Test: " + e1);
        System.out.println();

        System.out.println("Name: " + e1.getName());
        System.out.println("Trainee? " + e1.isTrainee());
        System.out.println();

        e1.setTrainee(true);
        e1.printEmployee();

        e2.birthday();
        e2.printEmployee();
        System.out.println();
    }
}
