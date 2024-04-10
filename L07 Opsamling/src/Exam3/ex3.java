package Exam3;

import java.util.Scanner;

/*
Write a program that reads a sequence of input values and displays a bar chart of the values,
using asterisks, like this:
**********************
****************************************
****************************
**************************
**************
You may assume that all values are positive. First figure out the maximum value. That value’s
bar should be drawn with 40 asterisks. Shorter bars should use proportionally fewer asterisks.
 */
public class ex3 {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);

        // Læs antallet af værdier
        System.out.print("Indtast antallet af værdier: ");
        int numVal = input.nextInt();
        int[] values = new int[numVal];
        System.out.print("Indtast navne svarende til antallet af værdier: ");
        String[] names = new String[10];
        int maxValue = 0;

        System.out.println("Indtast værdierne:");
        // Læs værdierne og find den maksimale værdi
        for (int i = 0; i < numVal; i++) {
            String inNames = input.next();
            values[i] = input.nextInt();
            if (values[i] > maxValue) {
                maxValue = values[i];
            }
        }
        // Vis søjlediagrammet
        for (int i = 0; i < numVal; i++) {
            // Beregn længden af søjlen proportionelt
            int barChart = (int) (values[i] * 40.0 / maxValue);
            // Udskriv søjlen med asterisker
            for (int j = 0; j < barChart; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

