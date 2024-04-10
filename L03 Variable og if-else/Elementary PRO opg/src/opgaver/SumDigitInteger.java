package opgaver;

import java.util.Scanner;

public class SumDigitInteger {
    public static void main(String[] args) {
        // Algoritme:

        // Input integer
        Scanner input = new Scanner(System.in);

        System.out.print("Input integer: ");
        int digitInt = input.nextInt();

        if (digitInt < 0 || digitInt > 1000)
        System.out.print(":-((");

        else {
            // Compute

            // Extract the first digit
            int fDig = digitInt / 100;
            // Extract the second digit
            int sDig = (digitInt % 100) / 10;
            // Extract the third digit
            int tDig = (digitInt % 10);
            // Calculate the sum of the digits
            int sumDig = fDig + sDig + tDig;
            System.out.println("The total sum of digits is: " + sumDig);
        }

    }
}
