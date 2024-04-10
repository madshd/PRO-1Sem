package opgaver;

import java.util.Scanner;

public class ComputeAreaWithConstant {
    public static void main(String[] args) {
        //Declaring of a constant
        final double PI = 3.14159;

        Scanner input = new Scanner(System.in);

        System.out.print("Angiv radius: ");
        double radius = input.nextDouble();
        if (radius < 0) {
            System.out.println("Forkert input");
        }
        else {
            //Compute area
            double area = radius * radius * PI;

            System.out.println("Arealet for en cirkel med radius " + radius + " er: " + area);
        }
    }
}
