package opgaver;

import java.util.Scanner;

public class SalesTax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Indtast købsbeløbet: ");
        double purchaseAmount = input.nextDouble();

        double tax = purchaseAmount * 0.06;
        System.out.println("Momsen er " + (int)(tax * 100 / 100.0) + " kr.");
    }
}
