package opgaver;

import java.util.Scanner;

public class Opg8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input month (1-12): ");
        int month = input.nextInt();

        System.out.print("Input day (1-31): ");
        int day = input.nextInt();
        //Main
        String season = getSeason(month, day);
        System.out.println(season);
    }
    public static String getSeason(int month, int day) {
       // String season;
        if (month == 12 || month == 1 || month == 2 ||(month == 11 && day >= 21)) {
            return "Vinter";
        }
        else if (month == 3 || month == 4 || month == 5 || (month == 2 && day >= 21)) {
            return "Forår";
        }
        else if (month == 6 || month == 7 || month == 8 || (month == 5 && day >= 21)) {
            return "Sommer";
        }
        else if (month == 8 && day >= 21) {
            return "Efterår";
        }
        else {
            return "Efterår";
        }
    }
}
