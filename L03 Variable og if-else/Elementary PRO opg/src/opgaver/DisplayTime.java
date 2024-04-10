package opgaver;

import java.util.Scanner;

public class DisplayTime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter integer for seconds: ");
        int seconds = input.nextInt();

        int minutes = seconds / 60; // Find minutter i sekunder
        int remainingSeconds = seconds % 60; // Resterende sekunder
        System.out.println(seconds + " seconds is " + minutes + " minutes and " + remainingSeconds + " seconds");
    }
}
