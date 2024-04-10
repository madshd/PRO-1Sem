package Ex5;

import java.util.Scanner;

/*
Tallene skal ligge i intervallet 1..49 (50 er ikke med). Sørg for, at programmet udskriver en
besked til brugeren, hvis denne indtaster et tal udenfor intervallet.

(Count occurrence of numbers) Write a program that reads the integers between 1
and 50 and counts the occurrences of each. Assume the input ends with 0. Here is
a sample run of the program.
 */
public class ex5b {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Initialize an array to store the occurrences of each number
            int[] occurrences = new int[50];

            // Read numbers until 0 is entered
            while (true) {
                System.out.print("Enter a number between 1 and 49 (0 to stop): ");
                int num = scanner.nextInt();
                if (num == 0) {
                    break;
                } else if (num < 1 || num >= 50) {
                    System.out.println("Number must be between 1 and 49 (exclusive).");
                    continue;
                }
                occurrences[num]++;
            }

            // Print the occurrences of each number
            for (int i = 1; i <= 49; i++) {
                if (occurrences[i] > 0) {
                    System.out.printf("Number %d occurred %d time(s).\n", i, occurrences[i]);
                }
            }
        }
    }