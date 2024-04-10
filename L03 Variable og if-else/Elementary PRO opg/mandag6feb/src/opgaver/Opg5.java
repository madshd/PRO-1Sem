package opgaver;

import java.util.Scanner;

public class Opg5 {
    public static void main(String[] args) {
        // Generate a lottery number (in 10..99)
        int lottery = (int) (10 + Math.random() * 90);
        int n1 = lottery / 10;
        int n2 = lottery % 10;
        // (as test, not in the finished program: Print the lottery number)
        System.out.print(lottery);
       // Prompt the user for a guess of the lottery number
        Scanner input = new Scanner(System.in);

        System.out.print("Indtast dit tal: ");
        int guess = input.nextInt();

        int guess1 = guess / 10;
        int guess2 = guess % 10;
       // Read the guess
        System.out.print("Your guess: " + guess);
// if (guess == lottery number)
        if (guess == lottery) {
            System.out.println(" - You win 10.000!");
        }
        else if (guess2 == n1 && guess1 == n2) {
            System.out.print(" - You win 3.000!");
        }
        else if (guess1 == n1 || guess2 == n2 || guess1 == n2 || guess2 == n1) {
            System.out.print(" - You win 1.000!");
        }
        else {
            System.out.print(" - Sorry, you lose!");
        }
    }
}
