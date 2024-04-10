package opgaver;

import java.util.Scanner;
/*
Lav et program, der indlæser 3 heltal fra tastaturet og udskriver aftagende, hvis de
tre tal er i aftagende orden, voksende, hvis de tre tal er i voksende orden, eller
hverken-eller, hvis de ikke er voksende eller aftagende.
F.eks. 2 3 4 er voksende
       4 3 2 er aftagende
       3 4 2 er hverken-eller
 */
public class Opg2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Indtast tre tal: ");
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int n3 = input.nextInt();

        if (n1 < n2 && n3 > n2)
        System.out.print("Voksende");

        else if(n3 < n2 && n2 < n1)
            System.out.print("Aftagende");
        else {
            System.out.print("Hverken eller");
        }

    }
}
