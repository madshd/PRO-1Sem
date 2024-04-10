package Træning;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        int data;
        int sum = 0;

        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Enter an integer (the input ends if it is o): ");
            data = input.nextInt();

            sum += data; // værdien af sum stiger med int data inputtet ved hver gentagelse, som løbende bliver lagt sammen.
        } while (data !=0);
        System.out.println("The sum is " + sum);
    }
}
