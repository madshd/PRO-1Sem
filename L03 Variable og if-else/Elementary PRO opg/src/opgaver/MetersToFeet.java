package opgaver;

import java.util.Scanner;

public class MetersToFeet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Indtast antal meter: ");
        double meter = input.nextDouble();
        double feet = 3.2786;
        double totalFeet = meter * feet;
        System.out.println(meter + " er " + totalFeet);
    }
}
