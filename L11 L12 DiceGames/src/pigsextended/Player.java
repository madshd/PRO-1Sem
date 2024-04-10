package pigsextended;

import java.util.Scanner;

public class Player {
    private Die die;
    private Die dieTwo;
    private int sum;
    private int round;
    private int sumRound;
    private int rollCount;
    private double averageStat;

    public Player() {
        this.die = new Die();
        this.dieTwo = new Die();
    }

    public void throwDice() {
        // Throw dices
        die.roll();
        dieTwo.roll();
        rollCount++;
    }

    public int getSum() {
        return sum;
    }

//    public void setSum() {
//        sum += sumRound;
//    }

    public void printStats() {
        averageStat = rollCount / round;
        System.out.println("You've scored " + sum + " points!");
        System.out.println("The dice was rolled " + rollCount + " times!");
        System.out.println("Which was over " + round + " rounds! ");
        System.out.println("On average, you've rolled " + averageStat + " per. round!");
    }

    public int play() {
        Scanner scanner = new Scanner(System.in);
        sumRound = 0;
        System.out.println("Roll?");
        scanner.nextLine();
        boolean finished = false;
        while (!finished) {
            throwDice();
            System.out.println("Round: " + round);
            System.out.printf("Rolling... %d\n", die.getFaceValue(), dieTwo.getFaceValue());
            System.out.printf("Rolling... %d\n", dieTwo.getFaceValue());
            if (die.getFaceValue() + dieTwo.getFaceValue() == 1) {
                sum = 0;
                sumRound = 0;
                System.out.println("You rolled two 1s, bummer!");
                round++;
                finished = true;
            } if (die.getFaceValue() == 1 || dieTwo.getFaceValue() == 1) {
                sumRound = 0;
                System.out.println("You rolled a single 1, bummer!");
                round++;
                finished = true;
            } else {
                sumRound += die.getFaceValue() + dieTwo.getFaceValue();
                System.out.println("Round score: " + sumRound);
                System.out.println("Roll again? (Y/n)");
                String again = scanner.nextLine();
                if (again.toLowerCase().equals("n")) {
                    round++;
                    sum += sumRound;
                    finished = true;
                }
            }
        }
        return sumRound;
    }
}
