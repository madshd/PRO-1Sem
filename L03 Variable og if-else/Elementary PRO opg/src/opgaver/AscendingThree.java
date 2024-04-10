package opgaver;

import java.util.Scanner;

public class AscendingThree {
    public static void main(String[] args) {
        // Algoritme:

        // Input numbers
        Scanner input = new Scanner(System.in);
        System.out.print("Indtast 2 tal: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        // Hvis number1 er mindre end number2
        if (number1 < number2 )
        {
            System.out.print(number2 + " " + number1);
        }
        System.out.print("Indtast 3. tal: ");
        int number3 = input.nextInt();
        //Alle mulige outcomes
        //else if (number1 < number2 && number2 < number3)
        {
            System.out.print(number1 + " " + number2);
        }
    }
}
