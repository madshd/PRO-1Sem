package opgaver;

import java.util.Scanner;

/*
Opgave 4
Koden fra opgave 2 skal nu anvende metoder, så indlæsning af data og udskrivning
af resultat foregår i main(), hvorimod koden, der afgør om de tre tal er voksende,
aftagende eller hverken-eller, foregår i en metode.
Metoden kan have navnet order(), skal tage tre heltal som parameter og returnere en
String.
Programmer metoden order() og kald den fra main().
 */
public class Opg4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Indtast tre tal: ");
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int n3 = input.nextInt();

        order(n1, n2, n3);
    }

    public static void order(int n1, int n2, int n3) {
        if (n1 < n2 && n3 > n2) {
            System.out.print("Voksende");
        } else if (n3 < n2 && n2 < n1) {
            System.out.print("Aftagende");
        } else {
            System.out.print("Hverken eller");
        }
    }
}

