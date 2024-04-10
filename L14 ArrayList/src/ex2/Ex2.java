package ex2;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex2 {

    public static void main(String[] args) {
        ArrayList<Integer> ints = new ArrayList<>();
        ints.add(12);
        ints.add(0);
        ints.add(45);
        ints.add(7);
        ints.add(-16);
        ints.add(0);
        ints.add(23);
        ints.add(-10);
//        ints.addAll(List.of(12, 0, 45, 7, -16, 0, 23, -10));
        System.out.println("ints: " + ints);
        System.out.println();

        // Test of sum1() method: correct sum is 61.
        int total = sum1(ints);
        System.out.println("Sum: " + total);

        // Test of sum() method: correct sum is 61.

        int totalSum = sum(ints);
        System.out.println("Total sum: " + totalSum);
        // Test of minimum() method: correct minimum is -16.

        int minimum = minimum(ints);
        System.out.println("Min. is: " + minimum);

        // Test of maximum() method: correct maximum is 45.

        int maximum = maximum(ints);
        System.out.println("Max. is: " + maximum);

        // Test of average() method: correct average is 7.625.

        double average = average(ints);

        System.out.println("Average is: " + average);

        // Test of zeroes() method: correct number of zeroes is 2.

        int zeroes = zeroes(ints);
        System.out.println("Zeroes: " + zeroes);

        // Test of evens() method: correct result is [12, 0, -16, 0, -10].
        ArrayList<Integer> evenNumbers = evens(ints);
        System.out.println("Evens: " + evenNumbers);

    }

    // sum made with for statement
    public static int sum1(ArrayList<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            int number = list.get(i);
            sum += number;
        }
        return sum;
    }
//    We use int number : list in the enhanced for loop, where number represents each element of the list.
    public static int sum(ArrayList<Integer> list) {
        int sum = 0;
        for (int number : list) {
            sum += number;
        }
        return sum;
    }

    public static int minimum(ArrayList<Integer> list) {
        int min = list.get(0);
        for (int e : list) {
            if (e < min) {
                min = e;
            }
        }
        return min;
    }

    public static int maximum(ArrayList<Integer> list) {
        int max = list.get(0);
        for (int i : list) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    public static double average(ArrayList<Integer> list) {
        double avg = 0.0;
        double sum = 0.0;
        for (double number : list) {
            sum += number;
        }
        int factor = list.size();
        avg = sum / factor;
        return avg;
    }

    public static int zeroes(ArrayList<Integer> list) {
        int count = 0;
        for (int number : list) {
            if (number == 0) {
                count++;
            }
        }
        return count;
    }

    public static ArrayList<Integer> evens(ArrayList<Integer> list) {
        ArrayList<Integer> evenList = new ArrayList<>();
        for (int number : list) {
            if (number % 2 == 0) {
                evenList.add(number);
            }
        }
        return evenList;
    }
}