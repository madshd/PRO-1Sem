package Ex3;

public class Customer implements Comparable<Customer> {
    private String firstName;
    private String lastName;
    private Boolean slowPayer;

    public Customer(String firstName, String lastName, Boolean slowPayer) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.slowPayer = slowPayer;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public Boolean getSlowPayer() {
        return slowPayer;
    }

    @Override
    public String toString() {
        return firstName + " " +lastName +
                ", slowPayer: " + slowPayer;
    }

    @Override
    public int compareTo(Customer other) {
        return Boolean.compare(this.slowPayer, other.slowPayer);
    }
}
