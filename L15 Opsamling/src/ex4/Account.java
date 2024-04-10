package ex4;

import java.time.LocalDate;

public class Account {
    private int id = 0;
    private double balance = 0;

    private double annualInterestRate = 0;
    private LocalDate dateCreated = LocalDate.now();

    public Account() {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        this.dateCreated = LocalDate.now();
    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        this.dateCreated = dateCreated;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public LocalDate getDateCreated() {
        return dateCreated;
    }

    public double getMonthlyInterestRate() {
        double monthlyInterestRate = (getAnnualInterestRate() / 12.00) / 100;
        return monthlyInterestRate;
    }

    public double getMonthlyInterest() {
        double monthlyInterest = balance * getMonthlyInterestRate();
        return monthlyInterest;
    }

    public double withdraw(double amount) {
        balance = getBalance() - amount;
        return balance;
    }

    public double deposit(double amount) {
        balance = getBalance() + amount;
        return balance;
    }

    @Override
    public String toString() {
        return
                " ID = " + getId() +
                " | Balance = $" + getBalance() +
                " | Annual Interest Rate = " + annualInterestRate +
                " | Date created = " + getDateCreated() + "\n";
    }
}
