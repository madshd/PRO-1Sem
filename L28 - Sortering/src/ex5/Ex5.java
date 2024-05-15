package ex5;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import ex1.Customer;

public class Ex5 {
        public static void main(String[] args) {

            ArrayList<Customer> list = new ArrayList<>();
            Customer customer1 = new Customer(1, "Alice", "alice@example.com", 123456789);
            Customer customer2 = new Customer(2, "Bob", "bob@example.com", 987654321);
            Customer customer3 = new Customer(3, "Charlie", "charlie@example.com", 456789123);

            list.add(customer1);
            list.add(customer2);
            list.add(customer3);

            // Add 7 more customers to the list
            list.add(new Customer(4, "David", "david@example.com", 111222333));
            list.add(new Customer(5, "Eve", "eve@example.com", 444555666));
            list.add(new Customer(6, "Frank", "frank@example.com", 777888999));
            list.add(new Customer(7, "Grace", "grace@example.com", 222333444));
            list.add(new Customer(8, "Henry", "henry@example.com", 555666777));
            list.add(new Customer(9, "Ivy", "ivy@example.com", 888999000));
            list.add(new Customer(10, "Jack", "jack@example.com", 333444555));
            // Add some strings to list here
            String[] namesList = {
                    "Jimmy",
                    "Berny",
                    "Giana",
                    "Brianne",
                    "Reginald",
                    "Fifi",
                    "Tiphani",
                    "Gavrielle",
                    "Nichole",
                    "Rutter",
                    "Kassie",
                    "Marisa",
                    "Jorgan",
                    "Clarette",
            };
            System.out.println("Names list: " + namesList); // print the list before sorting
            System.out.println("Customer list: " + list); // print the list before sorting

            long startTime = System.currentTimeMillis();
            Collections.sort(list);
            long sortCustomer = System.currentTimeMillis() - startTime;
            System.out.println("Customer sort() Time: " + sortCustomer + " milliseconds");

            Arrays.sort(namesList);
            System.out.println(Arrays.toString(namesList)); //print list after sorting
            System.out.println(list); // print the list after sorting

        }
}
