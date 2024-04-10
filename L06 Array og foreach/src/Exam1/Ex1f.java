package Exam1;

import java.util.Arrays;

public class Ex1f {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;

            if (numbers[i] % 2 == 0) {
                numbers[i] = 0;
            } else numbers[i] = 1;
        }
        System.out.print(Arrays.toString(numbers));
    }
}
