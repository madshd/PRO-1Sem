package opgaver;

import java.util.Scanner;

public class MomsUdregner {
    public static void main(String[] args) {
        // Algoritme:
        // Input purchased amount excl. sales tax
        Scanner input = new Scanner(System.in);
        System.out.print("Input purchased amount: ");
        // Calculate sales tax
        double purchaseAmount = input.nextDouble();
        double salesTax = purchaseAmount * 0.25;
        // Print amount with sales tax
        System.out.println("Sales tax is: " + salesTax);

    }
}
