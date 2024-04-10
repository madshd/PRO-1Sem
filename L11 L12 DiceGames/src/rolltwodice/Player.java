package rolltwodice;

import rolltwodice.Die;

import java.util.Scanner;

public class Player {
    private rolltwodice.Die die;
    private rolltwodice.Die dieTwo;
    private int sumValue;
    private int sumValueTwo;
    private int rollCount;
    private int rollCountTwo;
    private int equalFaceCount;
    private int oneThrowMax;
    private int[] dieArray = new int[7];
    private int[] dieTwoArray = new int[7];

    public Player() {
        this.die = new Die();
        this.dieTwo = new Die();
    }

    public int getRollCount(int d) {
        if (d == 1) {
            return rollCount;
        }
        return rollCountTwo;
    }

    public int getSumValue(int d) {
        if (d == 1) {
            return sumValue;
        }
        return sumValueTwo;
    }

    public int[] getDieArray(int d) {
        if (d == 1) {
            return dieArray;
        }
        return dieTwoArray;
    }
    public int getOneThrowMax() {
        return oneThrowMax;
    }

    public int getEqualFaceCount() {
        return equalFaceCount;
    }

    public void throwDice() {
        die.roll();
        sumValue += die.getFaceValue();
        dieArray[die.getFaceValue()]++;
        rollCount++;

        dieTwo.roll();
        sumValueTwo += dieTwo.getFaceValue();
        dieTwoArray[dieTwo.getFaceValue()]++;
        rollCountTwo++;

        if (die.getFaceValue() == dieTwo.getFaceValue()) {
            equalFaceCount++;
        }

        if (die.getFaceValue() + dieTwo.getFaceValue() > oneThrowMax) {
            oneThrowMax = die.getFaceValue() + dieTwo.getFaceValue();
        }
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Roll?");
        scanner.nextLine();
        boolean finished = false;
        while (!finished) {
            throwDice();
            System.out.printf("Rolling... %d\n", die.getFaceValue());
            System.out.printf("Rolling... %d\n", dieTwo.getFaceValue());
            System.out.println("Roll again? (Y/n)");
            String again = scanner.nextLine();
            if (again.toLowerCase().equals("n")) {
                finished = true;
            }
        }
    }
}
