package Exam1;

public class Ex1a {
    public static void main(String[] args) {
        int sum = 0; // kan defineres lokalt i ens for-sætning, men er fordelagtig at definere den i main methods scope

        for (int i = 2; i <= 99; i += 2) {
            sum = sum + i;
        }
        System.out.print("Sum of even numbers " + sum);
    }
}
