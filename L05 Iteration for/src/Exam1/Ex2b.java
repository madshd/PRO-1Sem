package Exam1;

import java.util.Scanner;

/*
b) Lav et program, der indlæser tallene og udskriver den løbende sum.
Indtastes 1 7 2 9, skal programmet udskrive 1 8 10 19.
 */
public class Ex2b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Indlæser grænserne
        System.out.print("Input lower limit: ");
        int lower = input.nextInt();

        System.out.print("Input upper limit: ");
        int upper = input.nextInt();
        // Kalder metoden sumEventsInts og printer resultatet
        int sum = sumEventsInts(lower, upper);
        System.out.println(sum);
    }
    public static int sumEventsInts(int lower, int upper) {
        int sum = 0;
        for (int i = lower; i < upper; i++) {
            if (i % 2 == 0) { // boolean variablen,
                sum += i; // ligger tallet til summen
        }
    }
        return sum;
    }
}

/*
    public static int sumEventsInts(int lower, int upper) {
        int sum = 0;
        for (int i = lower; i < upper; i++) {
            if (i % 2 == 0) { // boolean variablen,
                sum += i; // ligger tallet til summen
            }
        }
        return sum;
    }
}
 */