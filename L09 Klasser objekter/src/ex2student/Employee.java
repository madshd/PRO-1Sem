package ex2student;

public class Employee {
    // The name of the employee.
     private String name;
    // Whether the employee is a trainee or not.
  private boolean trainee;
   private int age;

    /** Create an employee. */
    // b) Add to the Employee class a field age of type int. (Remember to change the toString() method.)
    //In the EmployeeApp class: Give the employee an age and print the age using the age field.
    public Employee(String name, boolean trainee) {
        this.name = name;
        this.trainee = true;
//        age = 0;
    }

    public Employee(String name, boolean trainee, int age) {
        this.name = name;
        this.trainee = true;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public void setTrainee(boolean trainee) {
        this.trainee = trainee;
    }

    public boolean isTrainee() {
        return trainee;
    }

    //    Age
    public void setAge(int newAge) {
        age = newAge;
    }
    public int getAge() {
        return age;
    }

        @Override
    public String toString() {
        return String.format("Employee(%s, %s, %d)", name, trainee, age);
    }

    /** Print a description of the employee. */
//    Change the printEmployee() method, so that it prints all information in this way:
    public void printEmployee() {
        System.out.println("*******************");
        System.out.println("Name: " + name);
        System.out.println("Trainee: " + trainee);
        System.out.println("Age: " + age);
        System.out.println("*******************");
    }
//    d) Add to the Employe class a method birthday() that makes the employee one year older.
    public void birthday() {
        age = age + 1;
    }
}


//c) Add a new constructor in the Employee class, so that the an employee also gets an age. Test the new constructor in the EmployeeApp class.
