package opgaver;

import java.util.Scanner;

public class CalculateTips {
    public static void main(String[] args) {
        //Algoritme:
        Scanner input = new Scanner(System.in);
        // Input subtotal and gratuity rate
        System.out.print("Enter the subtotal: ");
        double subTotal = input.nextDouble();
        System.out.print("Enter the gratuity rate in %: ");
        double gratuityRate = input.nextDouble();

        double gratuityTot = ((gratuityRate / 100.0) * subTotal);
        // Display gratuity and total
        System.out.println("The gratuity is $" + gratuityTot + " and total is $" + (subTotal + gratuityTot));

    }
}
