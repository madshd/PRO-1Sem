package opgaver.opg1;

import java.util.Scanner;

public class Opg1aa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Indtast den øvre grænse: ");
        int limit = input.nextInt();
        int sum = 0;
        int i = 1;
        while (i * i <= limit) {
            sum = sum + i * i;
            i++;
        }
        System.out.print("Kvadrattallene fra 1-" + limit + " is " + sum);
    }
}
