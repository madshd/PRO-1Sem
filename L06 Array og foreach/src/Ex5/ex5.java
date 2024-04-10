package Ex5;

import java.util.Arrays;
import java.util.Scanner;

/*
(The number of even numbers and odd numbers) Write a program that reads ten integers,
and then display the number of even numbers and odd numbers. Assume that
the input ends with 0. Here is the sample run of the program:
1 2 3 2 1 6 3 4 5 2
 */
public class ex5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] IntList = new int[10];

        int evenCount = 0;
        int oddCount = 0;
        int i = 0;
//      Integer input that fills the array
        System.out.print("Input ten integers: ");

        for (i = 0; i < IntList.length; i++) {
            IntList[i] = input.nextInt(); //Inputtet til integer
//                Sum counter for even number
            if (IntList[i] % 2 == 0) evenCount++;
//                Sum counter for odd number
            if (IntList[i] % 2 != 0) oddCount ++;
        }
//      Print the number of even and odd numbers
        System.out.print(Arrays.toString(IntList));
        System.out.println("There is " + evenCount + " even numbers and " + oddCount + " odd numbers.");
    }
}
