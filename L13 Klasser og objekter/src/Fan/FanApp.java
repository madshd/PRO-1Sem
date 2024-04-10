package Fan;

public class FanApp {
    public static void main(String[] args) {
        Fan f1 = new Fan(3, true, 10, "cyan");
        Fan f2 = new Fan();
        System.out.println(f1);
        System.out.println(f2);
    }
}
