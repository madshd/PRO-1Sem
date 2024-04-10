package Træning;

import java.util.Scanner;


/*
(Pass or fail) Write a program that prompts a student to enter a Java score.
If the score is greater or equal to 60, display “you pass the exam”; otherwise,
display “you don’t pass the exam”. Your program ends with input −1. Here is a
sample run:
 */
public class PassOrFail {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 1;) {
            System.out.println("Enter your score: ");
            int examResult = input.nextInt();
            if (examResult >= 80) {
                System.out.println("Congrats, you've passed the test!");
            }
            if (examResult <= 80 && examResult >= 0) {
                System.out.println("You didn't pass the test!");
            }
            if (examResult == -1) {
                System.out.println("Exiting...");
                System.exit(0); // terminerer løkken
            }
        }
    }
}
