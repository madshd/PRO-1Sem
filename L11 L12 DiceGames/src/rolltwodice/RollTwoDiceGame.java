package rolltwodice;

import rolltwodice.Player;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RollTwoDiceGame {
    public static void main(String[] args) {
        printRules();
        System.out.println();

        rolltwodice.Player player = new rolltwodice.Player();
        System.out.println("Playing RollTwoDice.");
        player.play();

        printResults(player);
        System.out.println();

        System.out.println("Thank you for playing RollTwoDice.");
    }

    public static void printRules() {
        System.out.println("=====================================================");
        System.out.println("Rules of RollTwoDice:");
        System.out.println("The player throws one die as long as he/she wants.");
        System.out.println("=====================================================");
    }

    public static void printResults(Player player) {
        int[] d = player.getDieArray(1);
        int [] d1 = player.getDieArray(2);
        System.out.println("Results");
        System.out.println("-------");
        System.out.println("Roll count: "+ player.getRollCount(1));
        System.out.println("Total sum: " + (player.getSumValue(1) + player.getSumValue(2)));
        System.out.println("Count having the same dice face: " + player.getEqualFaceCount());
        System.out.println("Max throw: " + player.getOneThrowMax());
        System.out.println("Average sum of rolls: " + (player.getSumValue(1) + player.getSumValue(2)) / player.getRollCount(1));
        System.out.println("*** See how many times each dice face has appeared in a roll ***");
        for (int i = 1; i < d.length; i++) {
            System.out.printf("Count(s) of %d: %d \n", i, (d[i] + d1[i]));
        }
    }
}


