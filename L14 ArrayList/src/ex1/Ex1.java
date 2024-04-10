package ex1;

import java.util.ArrayList;

public class Ex1 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Hans");
        names.add("Viggo");
        names.add("Jens");
        names.add("Bente");
        names.add("Bent");

        System.out.println(names.size());

        names.add(2, "Jane");

        System.out.println(names.toString());

        names.remove(1);

        names.addFirst("Pia");

        names.addLast("Ib");

        System.out.println(names.size());

        names.set(2, "Hansi");

        System.out.println(names.size());

        System.out.println(names.toString());

        for (int i = 0; i < names.size(); i++) {
            String name = names.get(i);
            System.out.print(name.length() + " ");
        }

        for (String name : names) {
            System.out.print(name.length() + " ");
        }
    }
}
