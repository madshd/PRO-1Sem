package pig;

import java.util.Scanner;

public class Player {
    private pig.Die die;
    private int sum;
    private int sumRound;

    public Player() {
        this.die = new Die();
    }
    public void throwDie() {
        die.roll();
    }
    public int getSum() {
        return sum;
    }

    public int play() {
        Scanner scanner = new Scanner(System.in);
        sumRound = 0;
        System.out.println("Roll?");
        scanner.nextLine();
        boolean finished = false;
        while (!finished) {
            throwDie();
            System.out.printf("Rolling... %d\n", die.getFaceValue());
            if (die.getFaceValue() == 1) {
                sumRound = 0;
                System.out.println("You rolled a 1, bummer!");
                finished = true;
            } else {
                sumRound += die.getFaceValue();
                System.out.println("Round score: " + sumRound);
                System.out.println("Total score: " + sum);
                System.out.println("Roll again? (Y/n)");
                String again = scanner.nextLine();
                if (again.toLowerCase().equals("n")) {
                    sum += sumRound;
                    finished = true;
                }
            }
        }
        return sumRound;
    }
}
