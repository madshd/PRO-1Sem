package opgaver.opg6;

import java.util.Scanner;

public class Opg67 {
    public static void main(String[] args) {
        // Algorithm:
        // Input loan-amount
        System.out.print("Input invest amount: ");
        Scanner input = new Scanner(System.in);

        double investmentAmount = input.nextDouble();
        // Input annual interest rate
        System.out.print("Input annual interest rate in %: ");
        double annualInterestRate = input.nextDouble();

        // Compute monthly interest
        double monthlyInterestRate = annualInterestRate / 1200;

        // Display results in month and total
       double futureInvestment = futureInvestmentValue(investmentAmount, monthlyInterestRate);
        System.out.printf("%-10s%-20s", "Year", "Future Value");

    }
    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate) {
       int numberYears = 1;
        while (numberYears <= 30) {
            /*
            Skal være inde i loopet, så det bliver genberegnet for hvert år.
            Hvis udregningen nu indsættes ved main method, så printer den kun resultatet for år 1 x 30.
            */
            double futureValue = investmentAmount * Math.pow(1 + monthlyInterestRate, numberYears * 12);
            System.out.printf("%-10d%-20.2f\n", numberYears,  futureValue);
            numberYears++;
        }
        return investmentAmount;
    }
}
