package Exam2;

import java.util.Arrays;

/*

 */
public class ex2 {
    public static void main(String[] args) {
        int[] perm = new int[10]; // Dette opretter et nyt array perm med plads til 10 heltal, som vil indeholde den tilfældige permutation af tallene.
        int[] secA = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // Dette opretter et andet array secA med tallene fra 1 til 10.
        int remaining = 10; // Dette initialiserer variablen remaining til 10, hvilket angiver antallet af tilbageværende elementer i secA arrayet.

        for (int i = 0; i < 10; i++) { // Dette starter en løkke, der kører 10 gange, da der er 10 tal i permutationen.
            int randomIndex = (int) (Math.random() * remaining); // Dette genererer et tilfældigt indeks mellem 0 (inklusiv) og remaining (eksklusiv), som repræsenterer et tilfældigt tal i secA arrayet.
            perm[i] = secA[randomIndex]; // Dette tildeler værdien på det tilfældige indeks i secA arrayet til det aktuelle element i permutationen.
            for (int j = randomIndex; j < remaining - 1; j++) {
                secA[j] = secA[j + 1]; // Dette fjerner elementet på det tilfældige indeks fra secA arrayet ved at skifte alle efterfølgende elementer én plads til venstre.
            }
            secA[remaining - 1] = 0; // Dette indsætter 0 på den sidste position i secA arrayet for at markere, at dette element er blevet fjernet.
            remaining--; // Dette reducerer antallet af tilbageværende elementer i secA arrayet med 1.
        }

        System.out.println("Permutation: " + Arrays.toString(perm)); // Dette udskriver den genererede permutation af tallene fra 1 til 10.
    }
}
       /* int[] perm = new int[10];
        int[] secA = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int remaining = 10;

        for (int i = 0; i < remaining; i++) {
            perm[i] = (int) (Math.random() * 10) + 1;
            secA[i] = perm[i];
        }
        System.out.print("Permutation " + Arrays.toString(perm) + " ");
        System.out.println(" Second array " + Arrays.toString(secA));
*/