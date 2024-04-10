package MyPoint;

public class MyPoint {
    // Private data fields to store x and y coordinates
    private double x;
    private double y;

    // No-arg constructor to create a point at (0, 0)
    public MyPoint() {
        this(0, 0); // Calls the constructor with specified coordinates
    }

    // Constructor to create a point with specified coordinates
    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Getter method to retrieve the x coordinate
    public double getX() {
        return x;
    }

    // Getter method to retrieve the y coordinate
    public double getY() {
        return y;
    }

    // Method to calculate the distance between this point and another point
    public double distance(MyPoint point) {
        // Distance formula: sqrt((x2 - x1)^2 + (y2 - y1)^2)
        return distance(point.x, point.y);
    }

    // Method to calculate the distance between this point and a point with specified coordinates
    public double distance(double x, double y) {
        // Distance formula: sqrt((x2 - x1)^2 + (y2 - y1)^2)
        return Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2));
    }

    // Static method to calculate the distance between two MyPoint objects
    public static double distance(MyPoint p1, MyPoint p2) {
        // Utilizes the instance method distance to calculate distance between two points
        return p1.distance(p2);
    }

    @Override
    public String toString() {
        return "MyPoint |" +
                " x = " + x +
                " | y = " + y;
    }
}