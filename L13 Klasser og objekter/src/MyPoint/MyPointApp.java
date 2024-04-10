package MyPoint;

public class MyPointApp {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint();
        System.out.println(p1.toString());
        MyPoint p2 = new MyPoint(10, 30.5);
        System.out.println(p2.toString());

        System.out.printf("The distance between P1 and P2 is: %4.4f", p1.distance(p2));
    }
}
