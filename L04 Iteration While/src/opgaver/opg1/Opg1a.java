/*
a) Lav en klasse med en main() metode.
Programmer i main() metoden en while-løkke, som summerer alle lige tal
mellem 2 og 100 (begge inklusive).
(Resultatet skal være 2450.)
 */
package opgaver.opg1;

public class Opg1a {
    public static void main(String[] args) {
        int sum = 0;
        int i = 2;
        while (i <= 99) {
            sum = sum + i;
            i += 2; //i = i + 2
        }
        System.out.print("Sum of even numbers " + sum);
    }
}
