package opgaver;
/* Løs følgende opgave:
Enter 2 numbers and display them in ascending order.
        Ekstra:
Enter 3 numbers and display them in ascending order. */

import java.util.Scanner;

public class Ascending {
    public static void main(String[] args) {
        // Algoritme:

        // Input numbers
        Scanner input = new Scanner(System.in);
        System.out.print("Indtast 2 tal: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        // Hvis number1 er mindre end number2
        if (number1 < number2)
        {
            System.out.print(number2 + " " + number1);
        }
        // Hvis number2 er mindre end number 1
        else {
            System.out.print(number1 + " " + number2);
        }
    }
}
