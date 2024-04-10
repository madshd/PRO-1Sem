package opgaver.opg6;

import java.sql.SQLOutput;

/*
(Financial application: compute commissions) Write a method that computes the
commission, using the scheme in Programming Exercise 5.39. The header of the
method is as follows:
public static double computeCommission(double salesAmount)
Write a test program that displays the following table:
Sales Amount Commission
1000        900.0 9%
20000
 */
public class Opg611 {
    public static void main(String[] args) {
        double salesAmount = 1000;
        System.out.println("Sales Amount | Commission Rate");
        for (salesAmount = 1000; salesAmount <=20000; salesAmount += 1000) {
            System.out.printf("%-13d%-10.2f\n", salesAmount, computeCommission(salesAmount));
        }
    }
    /*
    Sales Amount              Commission Rate
    $0.01–$5,000               6 percent
    $5,000.01–$10,000          8 percent
    $10,000.01 and above      10 percent

    commission is 5,000 * 6% + 5,000 * 8% + 15,000 * 10% = 2,200.
     */
    public static double computeCommission(double salesAmount) {
        double commission = 0;
        if (salesAmount > 0.01 && salesAmount <= 5000) {
            commission = salesAmount * 0.06;
        } else if (salesAmount > 5000.01 && salesAmount <= 10000) {
            commission = 5000 * 0.06 + (salesAmount - 5000) * 0.08;
        } else {
            commission = 5000 * 0.06 + (salesAmount - 5000) * 0.08 + (salesAmount - 10000) * 0.10;
        }
        return commission;
    }
}
