package Ex4;

public class NameApp {
    public static void main(String[] args) {

        Name n1 = new Name("Piotr", "Suski");
        Name n2 = new Name("Mads", "Hans", "Dueholm");

        System.out.println(n2.getFullName());
        System.out.println(n2.username());
        System.out.println(n2.getInits());
        System.out.println(n2.getCryptoInits(2));
    }
}
