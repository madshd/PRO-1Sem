package Exam2;

import java.util.Scanner;

/*
Lav et program, der indlæser tallene og udskriver de tal, som forekommer flere gange efter
hinanden.
Indtastes 1 3 3 4 5 5 5 5 6 6 6 1 3 3, skal programmet udskrive 3 5 6 3.
 */
public class Ex2d {
    public static void main(String[] args) {
        // Opretter en Scanner-objekt til at læse input fra brugeren
        Scanner input = new Scanner(System.in);

        // Udskriver en prompt for antallet af tal, brugeren skal indtaste
        System.out.print("Antal tal: ");

        // Læser antallet af tal, brugeren ønsker at indtaste
        int numbersCount = input.nextInt();  // Hvor mange tal der kan indtastes
        int lastRead = 0; // tal der kommer før number
        int counter = 0; // det tal der forekommer flere gange og printes ud

        // Udskriver en prompt for brugeren til at indtaste de ønskede tal
        System.out.print("Indtast " + numbersCount + " tal i området 1-99: ");

        for (int i = 0; i < numbersCount; i++) {
            int nowRead = input.nextInt(); //
            if (lastRead == nowRead) {
                if (nowRead != counter) {
                    System.out.print(nowRead + " ");
                    counter = lastRead;
                }
            }
            lastRead = nowRead;
        }
    }
}