import java.util.Scanner;

public class AppMadsD {

    public static void main(String[] args) {
        int weight;
        double height;

        Scanner input = new Scanner(System.in);

        System.out.println("Indtast personens navn: ");
        String name = input.next();

        System.out.println("Indtast personens vægt i kg: ");
        weight = input.nextInt();

        System.out.println("Indtast personens højde i m: ");
        height = input.nextDouble();
        double bmi = weight / (height * height);
        System.out.println("Beregnet BMI: " + bmi);
        System.out.println();

        if (bmi < 18.5)
            System.out.println(name + ", BMI siger: " + "undervægt");
        else if (bmi < 25)
            System.out.println(name + ", BMI siger: " + "normal vægt");
        else if (bmi < 30)
            System.out.println(name + ", BMI siger: " + "overvægt");
        else
            System.out.println(name + ", BMI siger: " + "fedme");

    }
}
