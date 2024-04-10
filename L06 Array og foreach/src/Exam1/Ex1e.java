package Exam1;

import java.util.Arrays;

public class Ex1e {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) Math.pow(i + 1, 2);
        }
        System.out.print(Arrays.toString(numbers));
    }
}
