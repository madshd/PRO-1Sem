package opgaver;

/*
Opgave 3
Koden fra opgave 1 skal nu anvende metoder, så indlæsning af data og udskrivning
af resultatet foregår i main(), hvorimod koden der afgør om et tal er positivt, negativt
eller nul foregår i en metode.
Metoden kan have navnet sign(), skal tage et heltal som parameter og returnere en
String.
Programmer metoden sign() og kald den fra main().
 */

import java.util.Scanner;

public class Opg3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Indtast tal: ");
        int helTal = input.nextInt();

        int calcHelTal = sign(helTal);

        System.out.print(calcHelTal);
    }
    public static int sign(int helTal){
        if (helTal < 0)
            System.out.println("Tallet er negativt.");

        else if (helTal > 0)
            System.out.println("Tallet er positivt.");

        else {
            System.out.println("Tallet er nul.");
        }
        return helTal;
    }
}