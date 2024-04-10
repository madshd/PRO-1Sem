package Exam2;

import java.util.Scanner;

/*
Lav et program, der indlæser tallene og udskriver det største tal og hvor mange gange det forekommer.
Indtastes 3 5 2 5 4 5 5 er det største tal 5 og det forekommer 4 gange.
(Hint: Brug to variable: max til det største tal og count til antal forekomster.)
 */
public class Ex2c {
    public static void main(String[] args) {
        // Opretter en Scanner-objekt til at læse input fra brugeren
        Scanner input = new Scanner(System.in);

        // Udskriver en prompt for antallet af tal, brugeren skal indtaste
        System.out.print("Antal tal: ");

        // Læser antallet af tal, brugeren ønsker at indtaste
        int numbersCount = input.nextInt();

        // Udskriver en prompt for brugeren til at indtaste de ønskede tal
        System.out.print("Indtast " + numbersCount + " tal i området 1-99: ");

        // Initialiserer variabler til at gemme sum, mindste og største tal
        int counter = 0; // summen af alle indtastede tal
        int max = 0; // det største indtastede tal, startet med en mindre værdi end mulige input

        // Løkke til at indtaste og behandle hvert tal
        for (int i = 0; i < numbersCount; i++) {
            // Indlæser et tal fra brugeren
            int number = input.nextInt();

            // Tjekker om det indtastede tal er større end det hidtil største tal
            if (number > max) {
                max = number; // Opdaterer det hidtil største tal
                counter = 1; // Nulstiller summen og sætter den til 1, hvis det nye tal er større end det hidtil største tal

            } else if (number == max) { // Hvis indtastede nr er ligeså stort som maksimum.
                counter++; // Hvis det indtastede tal er det samme som det hidtil største tal, øges summen
            }
        }

        // Udskriver det største tal
        System.out.println("Max er: " + max);

        // Udskriver antallet af gange det største tal forekommer
        System.out.println("Max forekommer " + counter + " gange");
    }
}
