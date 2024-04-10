package opgaver;

import java.util.Scanner;

public class VisITid {
    public static void main(String[] args) {
        //Algorithm

        Scanner input = new Scanner(System.in);
        System.out.println("Input a number of seconds: ");
        int seconds = input.nextInt();
        int minutes = seconds / 60;
        int remSeconds = seconds % 60;
        System.out.println(seconds + " seconds is " + minutes + " minutes and " + remSeconds + " seconds");
    }
}
