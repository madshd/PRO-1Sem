package Ex1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
Opgave 1
Lav med en fil med en række heltal, f.eks.
34 -20 0 200 177 285 (med præcis ét tal på hver linje).
Lav en applikation, der i main-metoden læser denne fil og udskriver det dobbelte af tallene i
consolvinduet, dvs.
68 -40 0 400 354 570 (på en eller flere linjer).
 */
public class Ex1 {
    public static void main(String[] args) {
        String fileName = "L33 - Files and Exceptions/src/Ex1/Input.txt";
        File input = new File(fileName);
        try {
            Scanner scanner = new Scanner(input);
            int i = 0;
            while (scanner.hasNextInt()) {
                i = scanner.nextInt();
                System.out.println(i);
                int no = i * 2;
                System.out.println("Doubled number is: " + no);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
            e.printStackTrace();
        }
    }
}
