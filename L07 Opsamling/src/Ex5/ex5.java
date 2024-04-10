package Ex5;

import java.util.Arrays;

public class ex5 {
    public static void main(String[] args) {
//        2 arrays med den samme længde
        int [] a = {11, 11, 7, 9, 16, 4, 1};
        int [] b = {11, 7, 11, 16, 9, 4, 1};
        int [] c = {1, 4, 9, 16, 9, 7, 4, 9, 11};
        System.out.println("a = " + Arrays.toString(a));
        System.out.println("b = " + Arrays.toString(b));
        System.out.println("c = " + Arrays.toString(c));
        System.out.println("The two arrays, a and b are the same: " + equals(a, b));
        System.out.println("Is a and b have the same values: " + sameValues(a, b));
    }

    public static boolean equals(int[] a, int[] b) {
// that checks whether two arrays with the same length have the same values in the same order.
        if (a.length != b.length) {
            return false;
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false; // Hvis der er en forskel, er arraysene ikke ens
            }
        }
        return true; // Hvis ingen forskelle er fundet, er arraysene ens
    }
    public static boolean sameValues(int[] a, int[] b) {
// that checks whether two arrays have the same values in some order, ignoring duplicates.
//For example, the two arrays 1 4 9 16 9 7 4 9 11 and 11 11 7 9 16 4 1 have the same values.
        for (int i = 0; i < a.length; i++) {
            int value = b[i];
            boolean valueFound = contains(b, value);
            if (!valueFound) {
                return false;
            }
        }
        return true;
    }
    // (Hint: Make a helper method
//private boolean contains(int[] array, int value) t
//hat returns true, if the value is found in the array.)
//Test your methods in a main() method.
    private static boolean contains(int[] array, int value) {
        for (int i= 0; i < array.length; i++) {

        }
        return false;
    }
}
