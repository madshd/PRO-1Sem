package Exam3;

public class ex4 {
    public static void main(String[] args) {
        int[] t1 = {4, 6, 7, 2, 3};
        int[] t2 = {4, 6, 8, 2, 6};

        // Test the hasUneven method with array t1
        System.out.println("Array t1 has uneven numbers: " + hasUneven(t1));

        // Test the hasUneven method with array t2
        System.out.println("Array t2 has uneven numbers: " + hasUneven(t2));
    }

    // Method to check if an array contains at least one uneven number
    public static boolean hasUneven(int[] t) {
        // Iterate through each element of the array
        for (int i = 0; i < t.length; i++) {
            // Check if the current element is uneven (not divisible by 2)
            if (t[i] % 2 != 0) {
                return true; // Return true if uneven number is found
            }
        }
        return false; // Return false if no uneven number is found
    }
}
