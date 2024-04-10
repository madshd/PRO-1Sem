package Exam2;

import java.util.Scanner;

/*
Lav et program, der indlæser tallene og udskriver den løbende sum.
Indtastes 1 7 2 9, skal programmet udskrive 1 8 10 19.
 */
public class Ex2b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Antal tal: ");
        int numbersCount = input.nextInt();
        System.out.print("Indtast " + numbersCount + " tal i området 1-99: ");
        // start summen
        int sum = 0;
        //
        for (int i = 0; i < numbersCount; i++) {
            int number = input.nextInt();
            sum += number;
            System.out.println("Akkumeleret sum: " + sum);
        }
    }
}
