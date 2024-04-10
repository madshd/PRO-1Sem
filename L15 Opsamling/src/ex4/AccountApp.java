package ex4;

public class AccountApp {
    public static void main(String[] args) {
        Account a1 = new Account();

        Account aTest = new Account(1122, 20000.0);
        aTest.setAnnualInterestRate(4.5);
        aTest.withdraw(2500.0);
        aTest.deposit(3000.0);
        System.out.println(aTest.toString());
    }
}

/*

■■ A method named deposit that deposits a specified amount to the account.
Draw the UML diagram for the class then implement the class. (Hint: The method
getMonthlyInterest() is to return monthly interest, not the interest rate.
Monthly interest is balance * monthlyInterestRate. monthlyInterestRate
is annualInterestRate / 12. Note annualInterestRate is a percentage,
for example 4.5%. You need to divide it by 100.)
Write a test program that creates an Account object with an account ID of 1122,
a balance of $20,000, and an annual interest rate of 4.5%. Use the withdraw
method to withdraw $2,500, use the deposit method to deposit $3,000, and print
the balance, the monthly interest, and the date when this account was created.
 */