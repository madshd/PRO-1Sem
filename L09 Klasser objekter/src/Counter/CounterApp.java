package Counter;

public class CounterApp {
    public static void main(String[] args) {
        Counter c1 = new Counter("Blue"); //Objekter
        c1.setName("Green");
        Counter c2 = new Counter("Red", 10);
        System.out.println("test c1" + c1);
        System.out.println("test c2" + c2);

        c1.click();
        c1.click();
        c1.click();

        System.out.println(c1.toString());
//        c1.count = 200;
//        System.out.println(c1.getCount() + " " + c1.getName());
//        System.out.println(c2.getCount() + " " + c2.getName());

    }
}
