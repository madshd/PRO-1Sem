package Exam1;

import java.util.Arrays;

public class Ex1c {
    public static void main(String[] args) {
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] += numbers[i] + i;
        }
        System.out.println(Arrays.toString(numbers));
    }
}
