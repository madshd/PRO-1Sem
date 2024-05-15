package Ex4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex4 {
    /*
    Lav en applikation der i main-metoden indlæser en række tal fra tastaturet (sluttende med -1),
    de indlæste tal skrives til en tekstfil. Tallet -1 skal ikke skrives i filen. De øvrige tal skal være positive.
    Tallene skal skrives i filen efterhånden, som de indlæses (de skal altså ikke gemmes i en ArrayList).
     */
    public static void main(String[] args) throws FileNotFoundException {
        File out = new File("L33 - Files and Exceptions/src/Ex4/NumberOutput.txt");
        try (PrintWriter writer = new PrintWriter(out); Scanner scanner = new Scanner(System.in)) {
            boolean finished = false;
            while (!finished) {
                try {
                    System.out.println("Input a positive number: ");
                    int input = scanner.nextInt();
                    if (input >= 0) {
                        System.out.println("Number " + input + " added to the list.");
                        writer.println(input);
                    } else if (input == -1) {
                        scanner.close();
                        finished = true;
                    }
                } catch (NumberFormatException ex) {
                    System.err.println(ex.getMessage());
                    System.err.println("Number cannot be less than 0");
                } catch (InputMismatchException ex) {
                    scanner.nextLine();
                    System.err.println("Not an Integer");
                }
            }
        } catch (FileNotFoundException ex) {
            System.err.println(ex.getMessage());
        }
    }
}
