package ex1;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class App {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Brigitta");
        names.add("Biron");
        names.add("Keene");
        names.add("Merle");
        names.add("Dall");
        names.add("Jacintha");
        names.add("Elsie");
        names.add("Dev");
        names.add("Giovanni");

        String[] namesArr = {
                "Brigitta",
                "Biron",
                "Keene",
                "Merle",
                "Dall",
                "Jacintha",
                "Elsie",
                "Dev",
                "Giovanni"};

        String[] namesArr2 = {
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
                "Ronda",
                "Johna",
                "Christyna",
                "Eolande",
                "Piotr",
                "Timotheus",
                "Adolphus",
                "Benedicto",
        };

        App.bubbleSort(names);
        System.out.println("Bubblesort: " + names.toString());

        ArrayList<Customer> customers = new ArrayList<>();
        Customer customer1 = new Customer(1, "Alice", "alice@example.com", 123456789);
        Customer customer2 = new Customer(2, "Bob", "bob@example.com", 987654321);
        Customer customer3 = new Customer(3, "Charlie", "charlie@example.com", 456789123);

        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);

        // Add 7 more customers to the list
        customers.add(new Customer(4, "David", "david@example.com", 111222333));
        customers.add(new Customer(5, "Eve", "eve@example.com", 444555666));
        customers.add(new Customer(6, "Frank", "frank@example.com", 777888999));
        customers.add(new Customer(7, "Grace", "grace@example.com", 222333444));
        customers.add(new Customer(8, "Henry", "henry@example.com", 555666777));
        customers.add(new Customer(9, "Ivy", "ivy@example.com", 888999000));
        customers.add(new Customer(10, "Jack", "jack@example.com", 333444555));

        App.selectionSortString(namesArr);
        System.out.println("Selection Sort: " + Arrays.toString(namesArr));

        App.selectionSortCustomer(customers);
        System.out.println("Selection Sort: " + customers + "\n");

        System.out.println("Unsorted: " + Arrays.toString(namesArr2));
        App.insertionSort(namesArr2);
        System.out.println("Insertion Sort: " + Arrays.toString(namesArr2));

        App.insertionsSortCustomer(customers);
        System.out.println("Insertion Sort, Customers, tlf: " + customers);

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        Random r = new Random();
        int[] ints = r.ints(1000, 1, 10000).toArray();
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int e : ints) {
            list1.add(e);
            list2.add(e);
            list3.add(e);
        }

    }

    /*
    Exercise 1
Write a bubble sort method that can sort an ArrayList<String> containing strings.
Test your method in a test class with a main method.
     */

    private static void bubbleSort(ArrayList<String> list) {
        for (int i = list.size() - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (list.get(j).compareTo(list.get(j+1)) > 0) {
                    String temp = list.get(j);
                    list.set(j, list.get(j+1));
                    list.set(j+1, temp);
                }
            }
        }
    }
    /*
    Exercise 2
Write two selection sort methods. The first must take an array String[] as parameter, the
second must take an ArrayList<Customer> as parameter. Make your own Customer class that
has a compareTo(Customer): int method (you decide how customers are compared).
Test your methods.
     */

    //2A
    public static void selectionSortString(String[] arr) {
        // arr has a sorted part followed by an unsorted part
        // i is the index of the first number in the unsorted part
        for (int i = 0; i < arr.length - 1; i++) {
            // find the index of the smallest number in unsorted part
            int indexOfMin = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].compareTo(arr[indexOfMin]) < 0) {
                    indexOfMin = j;
                }
            }
            // swap arr[indexOfMin] and arr[i]
            if (indexOfMin != i) {
                String temp = arr[i];
                arr[i] = arr[indexOfMin];
                arr[indexOfMin] = temp;
            }
        }
    }

    //2B
    public static void selectionSortCustomer(ArrayList<Customer> customers) {
        // arr has a sorted part followed by an unsorted part
        // i is the index of the first number in the unsorted part
        for (int i = 0; i < customers.size() - 1; i++) {
            // find the index of the smallest number in unsorted part
            int indexOfMin = i;
            for (int j = i + 1; j < customers.size(); j++) {
                if (customers.get(j).compareTo(customers.get(indexOfMin)) < 0) {
                    indexOfMin = j;
                }
            }
            // swap arr[indexOfMin] and arr[i]
            if (indexOfMin != i) {
                Customer temp = customers.get(i);
                customers.set(i, customers.get(indexOfMin));
                customers.set(indexOfMin, temp);
            }
        }
    }

    /*
    Exercise 3
Write two insertion sort methods. The first must take an array String[] as parameter, the
second must take an ArrayList<Customer> as parameter. Make your own Customer class that
has a compareTo(Customer): int method (you decide how customers are compared).
Test your methods.
     */

    public static void insertionSort(String[] arr) {
        for (int i = 1; i < arr.length; i++) {
            String temp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].compareTo(temp) > 0) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
    }

    public static void insertionsSortCustomer(ArrayList<Customer> customers) {
        for (int i = 1; i < customers.size(); i++) {
            Customer temp = customers.get(i);
            int j = i - 1;
            while (j >= 0 && customers.get(i).CompareTo2(temp) > 0) {
                customers.set(j + 1, customers.get(j));
                j--;
            }
            customers.set(j + 1, temp);
        }
    }
}
