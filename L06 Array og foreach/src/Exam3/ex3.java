public class ex3 {
    public static void main(String[] args) {
        int[] a = {4, 6, 7, 2, 3};
        int[] b = {4, 6, 8, 2, 6};

        // Call the sumArrays method and store the result for arrays of equal lengths
        int[] sumArrayEqual = sumArrays(a, b);

        // Print the result of arrays with equal lengths
        System.out.print("Sum of arrays with equal lengths: ");
        printArray(sumArrayEqual);

        int[] c = {1, 2, 3};
        int[] d = {4, 5, 6, 7, 8};

        // Call the sumArraysUnequal method and store the result for arrays of unequal lengths
        int[] sumArrayUnequal = sumArraysUnequal(c, d);

        // Print the result of arrays with unequal lengths
        System.out.print("Sum of arrays with unequal lengths: ");
        printArray(sumArrayUnequal);
    }

    // Method to sum two arrays of equal lengths
    public static int[] sumArrays(int[] a, int[] b) {
        // Create a new array to store the sum with the same length as input arrays
        int[] result = new int[a.length];

        // Iterate through each element of the arrays
        for (int i = 0; i < a.length; i++) {
            // Sum corresponding elements and store in result array
            result[i] = a[i] + b[i];
        }

        // Return the result array
        return result;
    }

    // Method to sum two arrays of unequal lengths
    public static int[] sumArraysUnequal(int[] a, int[] b) {
        // Determine the length of the longest array
        int maxLength = Math.max(a.length, b.length);

        // Create a new array to store the sum with the length of the longest array
        int[] result = new int[maxLength];

        // Iterate through each element of the arrays
        for (int i = 0; i < maxLength; i++) {
            // If index is within bounds of array a, use its value, otherwise use 0
            int aValue = i < a.length ? a[i] : 0;
            // If index is within bounds of array b, use its value, otherwise use 0
            int bValue = i < b.length ? b[i] : 0;
            // Sum corresponding elements and store in result array
            result[i] = aValue + bValue;
        }

        // Return the result array
        return result;
    }

    // Method to print an array
    public static void printArray(int[] arr) {
        // Print opening bracket
        System.out.print("[");

        // Iterate through each element of the array
        for (int i = 0; i < arr.length; i++) {
            // Print the element
            System.out.print(arr[i]);

            // Print comma and space if it's not the last element
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }

        // Print closing bracket
        System.out.println("]");
    }
}