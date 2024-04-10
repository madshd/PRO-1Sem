package opg5;

public class B113 {
    public static void main(String[] args) {
        // Coefficients of the equations
        double a = 3.4;
        double b = 50.2;
        double c = 2.1;
        double d = 0.55;
        double e = 44.5;
        double f = 5.9;

        // Calculate the determinant
        double det = a * d - b * c;

        // Check if the system is solvable (det != 0)
        if (det != 0) {
            // Calculate x and y using Cramer's rule
            double x = (e * d - b * f) / det;
            double y = (a * f - e * c) / det;

            // Display the results
            System.out.println("The solution for x is: " + x);
            System.out.println("The solution for y is: " + y);
        } else {
            System.out.println("The system of equations is unsolvable (ad - bc is zero).");
        }
    }
}