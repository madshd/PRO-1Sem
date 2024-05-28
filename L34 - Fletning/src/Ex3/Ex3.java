package Ex3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
Exercise 3
In this exercise you are going to merge an ArrayList (containing customers) with an array
(also containing customers).
The ArrayList contains customers from a shop. The array contains customers that are known
slow payers. The method goodCustomers() must return an ArrayList containing the shop's
customers that are not slow payers.
a) Program the following method in the class:
/**
* Return a sorted ArrayList containing all customers
* from l1 that are not in l2.
* Pre: l1 and l2 are sorted and l2 has no empty
* entries.
public static ArrayList<Customer> goodCustomers(
        ArrayList<Customer> l1, Customer[] l2)
b) Create an ArrayList containing Customer objects and sort the list.
c) Create a Customer array containing customers and sort the array. Make sure some
customers are both in the list and in the array (the list and the array must have customers
        with the same name).
d) Use the method goodCustomers() and print the result.
 */
public class Ex3 {
    private static Customer c1 = new Customer("Isadora", "Osgordby", true);
    private static Customer c2 = new Customer("Thaddeus", "Agronski", false);
    private static Customer c3 = new Customer("Eduino","Dain", false);
    private static Customer c4 = new Customer("Mari","Dallicott", true);
    private static Customer c5 = new Customer("Marget","Trinder", true);
    private static Customer c6 = new Customer("Tessy", "Osgordby", false);
    private static Customer c7 = new Customer("Eduino", "Dain", false);
    private static Customer c8 = new Customer("Darlene","Wilton", true);
    private static Customer c9 = new Customer("Ruthy","Monument",false);
    private static Customer c10 = new Customer("Julieta","Roadnight", true);
    private static ArrayList<Customer> l1 = new ArrayList<>(List.of(c1, c2, c3,c4, c5));
    private static Customer[] l2 = {c6, c7, c8, c9, c10};
        public static void main(String[] args) {
        Collections.sort(l1);
        Arrays.sort(l2);
        System.out.println(l1.toString());
        System.out.println(Arrays.toString(l2));
    }
    public static ArrayList<Customer> goodCustomers(ArrayList<Customer> l1, Customer[] l2) {
        ArrayList<Customer> goodCustomers = new ArrayList<>();
        int i1 = 0;
        int i2 = 0;
        
        return goodCustomers;
    }
}
