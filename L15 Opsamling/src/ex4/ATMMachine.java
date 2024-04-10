package ex4;

import java.util.Scanner;

public class ATMMachine {
    static Account[] accountsArray = new Account[10];
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        for (int i = 0; i < accountsArray.length; i++) {
            accountsArray[i] = new Account(i, 100);
        }
        int id = idPrompt();
        while (true) {
            if (isValidId(id)) {
                displayMenu(id);
            }
            else {
                System.out.println("Wrong ID. Please try again: ");
            }
        }
    }

    private static boolean isValidId(int id) {
        return id >= 0 && id < accountsArray.length;
    }

    public static int idPrompt() {
        System.out.println("Enter account ID: ");
        return input.nextInt();
    }

    public static void displayMenu(int id) {
        for (int i = 0; i < 1;) {
            System.out.println("1 - View balance: ");
            System.out.println("2 - Withdraw: ");
            System.out.println("3 - Deposit: ");
            System.out.println("4 - Exit menu: ");
            int menuChoice = input.nextInt();
            if (menuChoice == 1) {
                System.out.println(accountsArray[id].toString());
                System.out.println("The balance is: " + accountsArray[id].getBalance());
            }
            if (menuChoice == 2) {
                System.out.println("Input amount to withdraw: ");
                accountsArray[id].withdraw(input.nextDouble());
            }
            if (menuChoice == 3) {
                System.out.println("Input amount to deposit: ");
                accountsArray[id].deposit(input.nextDouble());
            }
            if (menuChoice == 4) {
                System.out.println("Returning to ID prompt.");
                idPrompt();
            }
        }
    }
}
