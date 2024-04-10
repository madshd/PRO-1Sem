package craps;

import craps.Player;

public class CrapsGame {
    public static void main(String[] args) {
        printRules();
        System.out.println();

        Player player = new Player();
        System.out.println("Plying CrapsGame.");
        int gameState = player.play();

        if (gameState == 0){
            System.out.println("You have ended the game manuelly.");
        } else if (gameState == 1) {
            System.out.println("*** You have won ***");
        }else {
            System.out.println("You have lost!");
        }

        System.out.println();

        System.out.println("Thank you for playing CrapsGame.");
    }

    public static void printRules() {
        System.out.println("=================================================================================");
        System.out.println("Rules of CrapsGame:");
        System.out.println("If sum of first roll is 7 or 11 then you have won.");
        System.out.println("If sum of first roll is 2,3 or 12 then you have lost.");
        System.out.println("After first roll then if sum of roll is 7 then you have lost");
        System.out.println("After first roll then if sum and previus sum is the same then you have won.");
        System.out.println("================================================================================");
    }

}