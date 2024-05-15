package ex4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Ex4 {
    public static void main(String[] args) {
        // Generate random numbers
        Random r = new Random();
        // Generates an array of 10000 random integers between 1 and 10000
        int[] ints = r.ints(10000, 1, 10000).toArray();

        // Create three ArrayList<Integer> with exactly the same numbers
        ArrayList<Integer> numbers1 = new ArrayList<>();
        ArrayList<Integer> numbers2 = new ArrayList<>();
        ArrayList<Integer> numbers3 = new ArrayList<>();
        ArrayList<Integer> numbers4 = new ArrayList<>();
        for (int e : ints) {
            numbers1.add(e);
            numbers2.add(e);
            numbers3.add(e);
            numbers4.add(e);
        }


        // Measure execution time for bubble sort
        long startTime = System.currentTimeMillis();
        bubbleSort(numbers1);
        long bubbleSortTime = System.currentTimeMillis() - startTime;
        System.out.println("Bubble Sort Time: " + bubbleSortTime + " milliseconds");

        // Measure execution time for selection sort
        startTime = System.currentTimeMillis();
        selectionSort(numbers2);
        long selectionSortTime = System.currentTimeMillis() - startTime;
        System.out.println("Selection Sort Time: " + selectionSortTime + " milliseconds");

        // Measure execution time for insertion sort
        startTime = System.currentTimeMillis();
        insertionSort(numbers3);
        long insertionSortTime = System.currentTimeMillis() - startTime;
        System.out.println("Insertion Sort Time: " + insertionSortTime + " milliseconds");

        startTime = System.currentTimeMillis();
        Collections.sort(numbers4);
        long javaSortTime = System.currentTimeMillis() - startTime;
        System.out.println("Java Sort Time: " + javaSortTime + " milliseconds");

        startTime = System.currentTimeMillis();
        Collections.sort(numbers4);

    }

    // Bubble Sort
    public static void bubbleSort(ArrayList<Integer> arr) {
        // Iterate through the array
        int n = arr.size(); // Get the size of the array
        for (int i = 0; i < n - 1; i++) { // Loop through the array
            for (int j = 0; j < n - i - 1; j++) {  // Loop through the unsorted part of the array
                if (arr.get(j) > arr.get(j + 1)) { // If the element at index j is greater than the element at index j+1
                    // Swap arr[j] and arr[j+1]
                    int temp = arr.get(j); // Store the value at index j in a temporary variable
                    arr.set(j, arr.get(j + 1));  // Set the value at index j to the value at index j+1
                    arr.set(j + 1, temp);  // Set the value at index j+1 to the value stored in the temporary variable
                }
            }
        }
    }

    // Selection Sort
    public static void selectionSort(ArrayList<Integer> arr) {
        int n = arr.size(); // Get the size of the array
        for (int i = 0; i < n - 1; i++) { // Loop through the array
            // Find the minimum element in the unsorted part of the array
            int minIndex = i; // Assume the minimum element is at index i
            for (int j = i + 1; j < n; j++) { // Loop through the unsorted part of the array
                if (arr.get(j) < arr.get(minIndex)) { // If the element at index j is smaller than the element at index minIndex
                    minIndex = j;  // Set minIndex to j
                }
            }
            // Swap arr[i] and arr[minIndex]
            int temp = arr.get(minIndex); // Store the value at index minIndex in a temporary variable
            arr.set(minIndex, arr.get(i)); // Set the value at index minIndex to the value at index i
            arr.set(i, temp); // Set the value at index i to the value stored in the temporary variable
        }
    }

    // Insertion Sort
    public static void insertionSort(ArrayList<Integer> arr) {
        int n = arr.size(); // Get the size of the array

        // Start from the second element
        for (int i = 1; i < n; ++i) { // Loop through the array
            // Store the current element in a temporary variable
            int key = arr.get(i); // Store the value at index i in a temporary variable

            // Move elements of arr[0..i-1], that are
            // greater than key, to one position ahead
            // of their current position
            int j = i - 1; // Set j to i - 1

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && arr.get(j) > key) { // While j is greater than or equal to 0 and the value at index j is greater than the value at index i
                arr.set(j + 1, arr.get(j));  // Set the value at index j + 1 to the value at index j
                j = j - 1; // Decrement j by 1
            }
            arr.set(j + 1, key); // Set the value at index j + 1 to the value stored in the temporary variable
        }
    }
}