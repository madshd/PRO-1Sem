package Exam2;

import java.util.Scanner;

/*
 denne opgave skal der i alle spørgsmål indlæses et antal hele tal, alle mellem 1 og 99. Men
først skal indlæses et tal, som angiver, hvor mange tal, der efterfølgende indlæses.
(For dem som kender til break sætningen: break må ikke anvendes.)
a) Lav et program, der indlæser tallene og udskriver det største tal, det mindste tal, antal lige
tal og antal ulige tal
 */
public class Ex2a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Antal tal: ");
        int numbersCount = input.nextInt();
        System.out.print("Indtast " + numbersCount + " tal i området 1-99: ");
        // det største tal, det mindste tal, antal lige tal og antal ulige tal

        int min = 100; // stort tal, da min ellers ville gemmes som 0
        int max = 0;
        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < numbersCount; i++) {
            int number = input.nextInt();
            if (number < min) min = number; // gemmer et tal der er mindre end 100, derfor min sat til 100, men opdateres til number. Ellers vil værdien altid være 0
            if (number > max) max = number;

            if (number % 2 == 0) evenCount++; // % 2 vil man altid have 0 eller 1 tilbage
            if (number % 2 != 0) oddCount ++; // % 2 != er tallet ulige
        }
        System.out.println("Min er: " + min);
        System.out.println("Max er: " + max);
        System.out.println("Lige tal er: " + evenCount);
        System.out.println("Ulige tal er: " + oddCount);
    }
}
