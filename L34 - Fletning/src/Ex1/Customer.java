package Ex1;
/*
a) Make a Customer class that implements Comparable<Customer>. Customers are ordered
by last name and then first name.
 */
public class Customer implements Comparable<Customer> {
    private String firstName;
    private String lastName;
    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    @Override
    public String toString() {
        return
                firstName + " " + lastName;
    }
    @Override
    public int compareTo(Customer other) {
        if (this.lastName != other.lastName) {
            return this.lastName.compareTo(other.lastName);
        } else
            return this.firstName.compareTo(other.firstName);
    }
}
