package ex2;

import java.util.Scanner;

public class StopwatchApp {
    public static void main(String[] args) {
        Stopwatch s1 = new Stopwatch();
        for (int i = 0; i < 1;) {
            Scanner input = new Scanner(System.in);
            System.out.println("------------------");
            System.out.println("| 1 - Start tid");
            System.out.println("| 2 - Stop tid");
            System.out.println("| 3 - Vis tid");
            System.out.println("------------------");
            int menu = input.nextInt();
            if (menu == 1) {
                s1.start();
            }
            if (menu == 2) {
                s1.stop();
            }
            if (menu == 3) {
                s1.elapsedTime();
                System.out.println("Elapsed time: " + s1.elapsedTime());
            }
        }
    }
}
