package Ex5;

import jdk.swing.interop.SwingInterOpUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        String fileName = "L33 - Files and Exceptions/src/Ex5/tal1";
        String fileName2 = "L33 - Files and Exceptions/src/Ex5/tal2";
        File input = new File(fileName);
        try {
            //tal 1
            System.out.println("Tal 1");
            System.out.println("Max: " + NumberFileGenerator.max(fileName));
            System.out.println("Min: " + NumberFileGenerator.min(fileName));
            System.out.println("Gennemsnit: " + NumberFileGenerator.average(fileName));
            //tal2
            System.out.println("Tal 2");
            System.out.println("Max: " + NumberFileGenerator.max(fileName2));
            System.out.println("Min: " + NumberFileGenerator.min(fileName2));
            System.out.println("Gennemsnit: " + NumberFileGenerator.average(fileName2));
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
            e.printStackTrace();
        } catch (IOException e) {

        }
    }
}
