package Ex2;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

/*
Exercise 2
In this exercise you are going to merge two arrays containing integers.
a) Program the following method in the method class:
/**
* Return a sorted array containing all elements
* shared by l1 and l2.
* The returned array must have no empty entries.
* Pre: l1 and l2 are sorted and have no empty entries.
*/
/*
public static int[] sharedNumbers (int[] l1, int[] l2)
b) Create two arrays in the main() method (perhaps {2,4,6,8,10,12,14} and
{1,2,4,5,6,9,12,17}).
c) Use the method sharedNumbers() with the two arrays and print the result. (With the two
arrays above the result will be {2,4,6,12}).
 */
public class Ex2 {
    public static void main(String[] args) {
        int[] l1 = {2, 4, 6, 8, 10, 12, 14};
        int[] l2 = {1, 2, 4, 5, 6, 9, 12, 17};
        Arrays.sort(l1);
        Arrays.sort(l2);
        System.out.println(Arrays.toString(l1));
        System.out.println(Arrays.toString(l2));

        System.out.println(Arrays.toString(sharedNumbers(l1, l2)));
    }

    public static int[] sharedNumbers(int[] l1, int[] l2) {
        int[] result = new int[4];

        int i1 = 0;
        int i2 = 0;
        int j = 0;
        // Compare elements of l1 and l2 to find shared numbers
        while (i1 < l1.length && i2 < l2.length) {
            if (l1[i1] < l2[i2]) { // s1's første tal er mindst
                i1++;
            } else if (l1[i1] > l2[i2]) {
                i2++;
            } else {
                // Found a shared number, store it in the result array
                // s2's første tal er mindst
                result[j] = l2[i2];
                i1++;
                i2++;
                j++;
            }
        }
        return result;
    }
}
