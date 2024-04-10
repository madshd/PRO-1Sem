package Træning;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input number of elements in Array: ");
        int a = input.nextInt();
        double[] numbers = new double[a]; // definerer hvor mange elementer der er i arrayet

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] + 5*i;
//            System.out.println(myList[i]);
        }
        System.out.println(Arrays.toString(numbers));
    }
}