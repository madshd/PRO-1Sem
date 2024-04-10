package opgaver.opg2;
/*
Lav en klasse med en main() metode.
Tilføj til klassen en metode sumEvenInts(int lower, int upper), der returnerer
summen af alle lige tal mellem lower og upper. Grænserne lower og upper
skal indlæses.
Kald metoden i main() metoden.
(Resultatet af sumEvenInts(7, 25) er 144.)
 */
import java.util.Scanner;

public class Opg2b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Indlæser grænserne
        System.out.print("Input lower limit: ");
        int lower = input.nextInt();

        System.out.print("Input upper limit: ");
        int upper = input.nextInt();
        // Kalder metoden sumEventsInts og printer resultatet
        int sum = sumEventsInts(lower, upper);
        System.out.println(sum);
    }
    public static int sumEventsInts(int lower, int upper) {
        int sum = 0; // Den sum som loopet starter på, altså 0
        int current = lower; // current er den integer som loopet starter med at kører boolean på.
        while (current < upper) { // hvis current er under den øvre grænse, så vil loopet køre
            if (current % 2 == 0) { // boolean variablen,
                sum += current; // ligger tallet til summen
            }
            current++; // går videre til næste tal
        }
        return sum;
    }
}
