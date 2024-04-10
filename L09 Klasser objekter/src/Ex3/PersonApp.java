package Ex3;

public class PersonApp {
    public static void main(String[] args) {
        Person p1 = new Person("Mads Dueholm", "Rødlundvej");
        Person p2 = new Person("Madsen Hansen");


        System.out.println(p1);
        p1.setMonthlySalary(23000);
        p1.calcYearlySalary();
        p1.printPerson();
        System.out.println(p2);
    }
}
