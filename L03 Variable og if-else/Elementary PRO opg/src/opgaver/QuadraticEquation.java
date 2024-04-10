package opgaver;

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Solve quadratic equations");
        System.out.print("Enter a, b, c: ");
        // input for values
        double valA = scan.nextDouble();
        double valB = scan.nextDouble();
        double valC = scan.nextDouble();

        printSolutions(valA, valB, valC);
        // calculation of the discriminant
      /*  double discri = valB * valB - 4 * valA * valC;
        // two roots
        if (discri > 0) {
            double root1 = (((-valB + Math.pow(discri, 0.5)) / (2 * valA)));
            double root2 = (((-valB - Math.pow(discri, 0.5)) / (2 * valA)));
            System.out.println("The equation has two roots: " + root1 + " " + root2);
        } // one root
         else if (discri == 0) {
            double oneRoot = (-valB / (2 * valA));
            System.out.println("The equation has one root: " + oneRoot);
        } // no roots
         else if (discri < 0) {
            System.out.println("The equation has no roots.");
        }
         */
    }
    public static void printSolutions(double valA, double valB, double valC) {
        double discri = valB * valB - 4 * valA * valC;
        // two roots
        if (discri > 0) {
            double root1 = (((-valB + Math.pow(discri, 0.5)) / (2 * valA)));
            double root2 = (((-valB - Math.pow(discri, 0.5)) / (2 * valA)));
            System.out.println("The equation has two roots: " + root1 + " " + root2);
        } // one root
        else if (discri == 0) {
            double oneRoot = (-valB / (2 * valA));
            System.out.println("The equation has one root: " + oneRoot);
        } // no roots
        else if (discri < 0) {
            System.out.println("The equation has no roots.");
        }

    }
}

