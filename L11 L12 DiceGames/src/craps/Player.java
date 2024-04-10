package craps;

import craps.Die;

import java.util.Scanner;

public class Player {
    private Die die;
    private Die dieTwo;
    private int sum;
    private int winNo;
    private int rollCount;
    public Player() {
        this.die = new Die();
        this.dieTwo = new Die();
    }
    public void throwDice() {
        // Throw dices
        die.roll();
        dieTwo.roll();

        // Store sum
        sum = (die.getFaceValue() + dieTwo.getFaceValue());

        // Store winNo
        if (rollCount == 0){
            winNo = sum;
        }
        rollCount++;
    }
    // Statuses: 0 == Ongoing 1 == Won 2 == Lost
    private int gameState() {
        if (rollCount == 1) {
            if (sum == 7 || sum == 11) {
                return 1;
            } else if (sum == 2 || sum == 3 || sum == 12) {
                return 2;
            }
        }else {
            if (sum == winNo) {
                return 1;
            }
            if (sum == 7) {
                return 2;
            }
        }
        return 0;
    }
    public int getRollCount(){
        return rollCount;
    }
    public int play() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Roll?");
        scanner.nextLine();
        boolean finished = false;
        while (!finished) {
            throwDice();
            System.out.printf("Rolling... %d\n", die.getFaceValue());
            System.out.printf("Rolling... %d\n", dieTwo.getFaceValue());
            System.out.println("Sum = " + sum);
            System.out.println("Winning number: " + winNo);
            if (gameState() == 2){
                return gameState();
            }
            if (gameState() == 1){
                return gameState();
            }
            System.out.println("Roll again? (Y/n)");
            String again = scanner.nextLine();
            if (again.toLowerCase().equals("n")) {
                finished = true;
            }
        }
        return gameState();
    }
}

