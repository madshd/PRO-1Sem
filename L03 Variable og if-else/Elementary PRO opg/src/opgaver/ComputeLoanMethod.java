package opgaver;

import java.util.Scanner;

public class ComputeLoanMethod {
    public static void main(String[] args) {
        // Algorithm:
        // Input loan-amount
        System.out.print("Input loan amount: ");
        Scanner input = new Scanner(System.in);

        double loanAm = input.nextDouble();
        // Input annual interest rate
        System.out.print("Input annual interest rate in %: ");
        double annualInt = input.nextDouble();

        // Compute monthly interest
        double monthlyInt = annualInt / 1200;

        // Input number of years
        System.out.print("Input number of years: ");
        double numberYears = input.nextDouble();

        // Display results in month and total
        double monthlyPay = calcMonthlyPayment(loanAm, monthlyInt, numberYears);
        double totalPayment = calcAnnualPayment(monthlyPay, numberYears);

        System.out.printf("Monthly payment is: %.2f DKK", monthlyPay);
        System.out.printf(" | Total payment is: %.2f DKK", totalPayment);

    }
    public static double calcMonthlyPayment(double loanAm, double monthlyInt, double numberYears) {
        double monthlyPay = loanAm * monthlyInt / (1 - 1 / Math.pow(1 + monthlyInt, numberYears * 12));
        return monthlyPay;
    }

    public static double calcAnnualPayment(double monthlyPay, double numberYears) {
        double totalPayment = monthlyPay * numberYears * 12;
        return totalPayment;
    }
}
