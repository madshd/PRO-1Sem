package ex6;

public class Student {
    private String name;
    private int age;
    private boolean active;

    public Student(String name, int age, boolean active) {
        this.name = name;
        this.age = age;
        this.active = active;
    }

    public Student() {
        this.name = name;
        this.age = age;
        this.active = active;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isActive() {
        return active;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean setActive(boolean active) {
        this.active = active;
        return active;
    }

    @Override
    public String toString() {
        return  "Name: " + name + "\n" +
                "Age: " + age + "\n" +
                "Active: " + active + "\n";
    }
}
