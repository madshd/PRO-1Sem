package ex1;

import demosorting.Player;

import java.util.Random;

public class Customer implements Comparable<Customer> {
    Random random = new Random();
    private int userID;
    private String name;
    private String email;
    private int tlf;

    public Customer(int userID, String name, String email, int tlf) {
        this.userID = random.nextInt(1000);
        this.name = name;
        this.email = email;
        this.tlf = tlf;
    }

    private int generateRandomUserID() {
        Random random = new Random();
        return random.nextInt(1000); // Generate random userID between 0 and 999
    }

    @Override
    public String toString() {
        return "UserID=" + userID +
                ", tlf=" + tlf +
                ", name='" + name + '\'';
    }

    @Override
    public int compareTo(Customer other) {
        return Integer.compare(this.userID, other.userID);
    }

    public int CompareTo2(Customer other) {
        return Integer.compare(this.tlf, other.tlf);
    }
}
