package opgaver.opg2;

import java.util.Scanner;

/*
Lav en klasse med en main() metode.
Tilføj til klassen en metode sumOddDigits(int number), der returnerer summen
af de ulige cifre i tallet number. Tallet number skal indlæses.
Kald metoden i main() metoden.
(Resultatet af sumOddDigits(1.234.567) er 16.)
 */
public class Opg2c {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input et tal: ");
        int number = input.nextInt();

        int sum = sumOddDigits(number);
        System.out.println(sum);
    }

    public static int sumOddDigits(int number) {
        int sum = 0;
        while (number != 0) {
            int digit = number % 10; // Få det sidste ciffer i tallet
            if (digit % 2 != 0) { // Kontroller om cifferet er ulige
                sum += digit; // Tilføj cifferet til summen, hvis det er ulige
            }
            number /= 10; // Fjern det sidste ciffer fra tallet
        }
        return sum;
    }

}
