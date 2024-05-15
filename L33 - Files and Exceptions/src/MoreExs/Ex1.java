package MoreExs;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
        Scanner scanner = new Scanner(System.in);
        int index = -1;
        do {
            System.out.println("Type an index in 0..9: ");
            index = scanner.nextInt();
            System.out.printf("Prime number at index %d is %d\n", index, primes[index]);
            scanner.nextLine();
        } while (index < 0 || index > 9);
    }
}
