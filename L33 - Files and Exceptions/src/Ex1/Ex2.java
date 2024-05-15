package Ex1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/*
Opgave 2
Læs filen fra opgave 1 og indsæt tallene i en ArrayList<Integer> efterhånden som de
indlæses.
Udskriv dernæst tallene fra arraylisten i omvendt rækkefølge, dvs. 285, 177, …, 34.
 */
public class Ex2 {
    private static ArrayList<Integer> list = new ArrayList<>();
    public static void main(String[] args) {
        String fileName = "L33 - Files and Exceptions/src/Ex1/Input.txt";
        File input = new File(fileName);
        try {
            Scanner scanner = new Scanner(input);
            int i = 0;
            while (scanner.hasNextInt()) {
                i = scanner.nextInt();
                System.out.println(i);
                list.add(i);
            }
            list.sort(Comparator.reverseOrder());
            System.out.println(list.toString());
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
            e.printStackTrace();
        }
    }
}
