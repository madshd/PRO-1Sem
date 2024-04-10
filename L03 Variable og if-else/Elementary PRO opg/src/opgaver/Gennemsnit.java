package opgaver;

import java.util.Scanner;

public class Gennemsnit {
    public static void main(String[] args) {
        //Algoritme
        //Prompt the user for 3 numbers
        Scanner input = new Scanner(System.in);
        System.out.print("Choose 3 numbers: ");
        //Read the numbers
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();
        //Calculate average
        double average = (number1 + number2 + number3 / 3.0);
        //Print average
        System.out.print("The average is:  " + average);
    }
}
