package Ex4;

public class RectangleApp {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4, 40);
        Rectangle r2 = new Rectangle(3.5, 35.9);
//        System.out.println(r1);
        r1.getArea();
        r1.getPerimeter();
        r1.printRectangle();
        System.out.println(" ");
        r2.getArea();
        r2.getPerimeter();
        r2.printRectangle();
    }
}
