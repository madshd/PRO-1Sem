package opg1;

public class E14 {
    public static void main(String[] args) {
        // variabler
        int startBalance = 1000;
        double factor = 1.05;
        // tildelingsætning
        System.out.println("År 0 = " + startBalance);
        System.out.println("1 = " + startBalance * factor);
        System.out.println("2 = " + startBalance * factor * factor);
        System.out.println("3 = " + startBalance * factor * factor * factor);

    }
}
