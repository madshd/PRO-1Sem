package Ex3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/*
Opgave 3
Lav en applikation der i main-metoden skriver en fil med alle positive, ulige tal mindre end
100.
 */
public class Ex3 {
    public static void main(String[] args) {
        File out = new File("L33 - Files and Exceptions/src/Ex3/Output.txt");
        try (PrintWriter writer = new PrintWriter(out)) {
            for (int i = 1; i < 100; i += 2) {
                System.out.println(i + " is added to txtfile");
                writer.println(i);
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("End of program ");
    }
}