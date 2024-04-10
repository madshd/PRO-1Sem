package Ex4;

/*
(The Rectangle class) Following the example of the Circle class in Section 9.2,
design a class named Rectangle to represent a rectangle. The class contains:
■■ Two double data fields named width and height that specify the width and
height of the rectangle. The default values are 1 for both width and height.
■■ A no-arg constructor that creates a default rectangle.
■■ A constructor that creates a rectangle with the specified width and height.
■■ A method named getArea() that returns the area of this rectangle.
■■ A method named getPerimeter() that returns the perimeter.
Draw the UML diagram for the class then implement the class. Write a test program
that creates two Rectangle objects—one with width 4 and height 40, and the other with width 3.5 and height 35.9. Display the width, height, area, and
perimeter of each rectangle in this order.
 */
public class Rectangle {
    private double width = 1;
    private double height = 1;
    private double areal;
    private double perimeter;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public void getArea() {
        areal = height * width;
    }
    public void getPerimeter() {
        perimeter = 2 * (width + height);
    }
    public String toString() {
        return String.format("Rectangle: (%s, %s, %s, %s)", width, height, areal, perimeter);
    }
    public void printRectangle() {
        System.out.println("L: " + height + " W: " + width);
        System.out.printf("Areal: %.2f\n ", areal);
        System.out.println("Perimeter: " + perimeter);
    }
}
