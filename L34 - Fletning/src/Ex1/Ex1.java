package Ex1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Ex1 {
    private static Customer c1 = new Customer("Isadora", "Osgordby");
    private static Customer c2 = new Customer("Thaddeus", "Agronski");
    private static Customer c3 = new Customer("Eduino","Dain");
    private static Customer c4 = new Customer("Mari","Dallicott");
    private static Customer c5 = new Customer("Marget","Trinder");
    private static Customer c6 = new Customer("Tessy", "Osgordby");
    private static Customer c7 = new Customer("Gayler", "Agronski");
    private static Customer c8 = new Customer("Darlene","Wilton");
    private static Customer c9 = new Customer("Ruthy","Monument");
    private static Customer c10 = new Customer("Julieta","Roadnight");
    private static ArrayList<Customer> list1 = new ArrayList<>(List.of(c1, c2, c3,c4, c5));
    private static ArrayList<Customer> list2 = new ArrayList<>(List.of(c6, c7, c8, c9, c10));
    public static void main(String[] args) {
        Collections.sort(list1);
        Collections.sort(list2);
        System.out.println(mergeAllCustomers(list1, list2));
    }
    public static ArrayList<Customer> mergeAllCustomers(ArrayList<Customer> list1, ArrayList<Customer> list2) {
        ArrayList<Customer> result = new ArrayList<>();
        // merge, as long as both lists contains elements
        int i1 = 0;
        int i2 = 0;
        while (i1 < list1.size() && i2 < list2.size()) {
            if (list1.get(i1).compareTo(list2.get(i2)) <= 0) {
                // s1's element at i1 is smallest
                result.add(list1.get(i1));
                i1++;
            } else if (list1.get(i1) == list2.get(i2)) {
                // s2's element at i2 is smallest
                result.add(list2.get(i2));
                i2++;
            } else {
                // the element at i1 is equal to the element at i2
                result.add(list2.get(i2));
                i2++;
            }
        }

        // copy from the list that isn't empty
        while (i1 < list1.size()) {
            result.add(list1.get(i1));
            i1++;
        }
        while (i2 < list2.size()) {
            result.add(list2.get(i2));
            i2++;
        }

        return result;
    }
}
