/*
(Find future dates) Write a program that prompts the user to enter an integer for
today’s day of the week (Sunday is 0, Monday is 1, . . . , and Saturday is 6). Also
prompt the user to enter the number of days after today for a future day and display
the future day of the week. Here is a sample run:
 */
package opgaver;

import java.util.Scanner;

public class Opg9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // prompt for user input
        System.out.print("Enter today’s day (Sunday 0-6  Saturday): ");
        int todayDay = input.nextInt();

        System.out.print("Enter the number of days elapsed since today: ");
        int futureDay = input.nextInt();

        String today = day(todayDay); // Get day of the week, calls the day-method in the main method.
        String future = day((todayDay + futureDay) % 7); // Gets the future day of the week.

        System.out.print("Today's day is " + today + " and the future day is " + future); // Prints the defined strings and method.
    }

    //Method for computing the day of the week && future day
    public static String day(int todayDay) {
        String day;
        if (todayDay == 0) {
            day = "Sunday";
        } else if (todayDay == 1) {
            day = "Monday";
        } else if (todayDay == 2) {
            day = "Tuesday";
        } else if (todayDay == 3) {
            day = "Wednesday";
        } else if (todayDay == 4) {
            day = "Thursday";
        } else if (todayDay == 5) {
            day = "Friday";
        } else  {
            day = "Saturday";
        }
        return day;

    }
}
