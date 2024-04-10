package opgaver;

import java.util.Scanner;

/*
(Game: scissor, rock, paper) Write a program that plays the popular scissor–
rock–paper game. (A scissor can cut a paper, a rock can knock a scissor, and
a paper can wrap a rock.) The program randomly generates a number 0, 1, or
2 representing scissor, rock, and paper. The program prompts the user to enter
a number 0, 1, or 2 and displays a message indicating whether the user or the
computer wins, loses, or draws. Here are sample runs:
 */
public class Opg10 {
    public static void main(String[] args) {
        System.out.print("Scissor-Rock-Paper");
        Scanner input = new Scanner(System.in);
        int compChoice = (int) (Math.random() * 3);
        System.out.print("Enter number, 0 for scissor, 1 for rock, 2 for paper: ");
        int userChoice = input.nextInt();

    }

}
