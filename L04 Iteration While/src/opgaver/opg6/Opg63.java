package opgaver.opg6;

import java.util.Scanner;

public class Opg63 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input number: ");
        int number = input.nextInt();

        if (isPalindrome(number)) {
            System.out.print(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
    }
    public static int reverse(int number) {
        int reversedNo = 0;
        while (number != 0) {
            int digit = number % 10; // modulus
            reversedNo = reversedNo * 10 + digit;
            number /= 10;
        }
        return reversedNo;
    }
    public static boolean isPalindrome(int number) {
        return number == reverse(number);
    }
}

/*
Først importerer vi Scanner-klassen fra java.util pakken. Dette er for at kunne læse input fra brugeren.

Derefter har vi vores hovedklasse opg63, hvor vores main metode er defineret.

I main metoden opretter vi en ny instans af Scanner-klassen kaldet scanner til at læse brugerens input.

Vi udskriver en besked og beder brugeren om at indtaste et heltal ved at bruge System.out.print metoden sammen med scanner.nextInt() til at læse brugerens input og gemme det i variablen number.

Vi kalder derefter isPalindrome metoden med number som argument. Hvis resultatet er true, udskriver vi, at tallet er en palindrome, ellers udskriver vi, at det ikke er det.

I reverse metoden, som kaldes af isPalindrome, tager vi det givne tal number og starter med at initialisere reversedNumber til 0.

Vi bruger en while-løkke til at gentage følgende trin, indtil number bliver 0:

Vi beregner resten af number ved at tage modulo 10. Dette giver os det sidste ciffer i number.
Vi tilføjer dette ciffer til reversedNumber ved at multiplicere reversedNumber med 10 og derefter tilføje det sidste ciffer.
Vi opdaterer number ved at dividere det med 10 for at fjerne det sidste ciffer.
Når løkken slutter, returnerer vi reversedNumber, som nu indeholder det omvendte tal.

I isPalindrome metoden sammenligner vi det originale tal (number) med det omvendte tal, som returneres fra reverse metoden. Hvis de to tal er ens, betyder det, at tallet er en palindrome, og vi returnerer true. Ellers returnerer vi false.
 */