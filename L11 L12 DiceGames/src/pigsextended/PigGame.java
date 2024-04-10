package pigsextended;

import java.util.Scanner;

public class PigGame {
    public static void main(String[] args) {
        Player player1 = new Player();
        Player player2 = new Player();

        printRules();

        Scanner input = new Scanner(System.in);

        System.out.println("How much do you want to play to?: ");
        int gameLimit = input.nextInt();

        boolean gameOver = false;
        while (!gameOver) {
            // Player 1's turn
            if (!gameOver) {
                System.out.println("    *** Player 1's turn " + " ***");
                player1.play();
                System.out.println("    *** Total score: " + player1.getSum() + " ***");
                System.out.println(" ");

                System.out.println("*** Player 1's total score: " + player1.getSum() + " ***");
                System.out.println("*** Player 2's total score: " + player2.getSum() + " ***");
                System.out.println(" ");

                if (player1.getSum() >= gameLimit) {
                    System.out.println(" *** Player 1 wins! *** ");
                    player1.printStats();
                    gameOver = true;
                }
            }

            // Player 2's turn
            if (!gameOver) {
                System.out.println("    *** Player 2's turn " + " ***");
                player2.play();
                System.out.println("    *** Total score: " + player2.getSum() + " ***");
                System.out.println(" ");
                System.out.println("*** Player 1's total score: " + player1.getSum() + " ***");
                System.out.println("*** Player 2's total score: " + player2.getSum() + " ***");
                System.out.println(" ");

                if (player2.getSum() >= gameLimit) {
                    System.out.println(" *** Player 2 wins! *** ");
                    player2.printStats();
                    gameOver = true;

                }
            }
        }
    }
    public static void printRules() {
        System.out.println("=====================================================");
        System.out.println("Rules of Pigs:");
        System.out.println("The first player throws a die, till the player throws a 1 or decides to stop.");
        System.out.println("If the player rolls a 1, the player gets no points that round. However, if the player");
        System.out.println("rolls doesn't roll a 1, the rolls of the round will be added to the total score.");
        System.out.println("However, if the player rolls two 1's, the player loses all points.");
        System.out.println("The first player that reaches the set limit, wins.");
        System.out.println("=====================================================");

    }
}