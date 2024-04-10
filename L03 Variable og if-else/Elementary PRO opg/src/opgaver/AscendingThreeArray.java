package opgaver;

import java.util.Arrays;
import java.util.Scanner;

public class AscendingThreeArray {
    public static void main(String[] args) {
        System.out.println("Input three numbers: ");
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        // Sorting the numbers
        int[] sortedNumbers = sortAscending(num1, num2, num3);

        // Printing the sorted numbers
        System.out.println("Sorted numbers in ascending order: " + Arrays.toString(sortedNumbers));
    }

    // Method to sort three numbers in ascending order
    public static int[] sortAscending(int a, int b, int c) {
        int[] numbers = {a, b, c};
        Arrays.sort(numbers); // Sort the array in ascending order
        return numbers;
    }
}
