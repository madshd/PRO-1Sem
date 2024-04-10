package opgaver;

import java.util.Scanner;

/*
Lav et program, der indlæser et heltal fra tastaturet og udskriver negativ, 0 eller
positiv, afhængig af om det indlæste tal er <, == eller > end 0.
*/
public class Opg1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Indtast tal: ");
        int helTal = input.nextInt();

        if (helTal < 0)
        System.out.println("Tallet er negativt.");

        else if (helTal > 0)
            System.out.println("Tallet er positivt.");

        else {
            System.out.println("Tallet er hverken-eller.");
        }
    }
}
