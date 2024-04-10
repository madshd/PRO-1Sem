package opgaver;

import java.util.Scanner;
//Opg 6 og 7
public class Opg6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How old is your child?: ");
        int age = input.nextInt();
        // Y/N input til boolean
        System.out.print("Is child a boy? (Y/N)?: ");
        // Definere hvilket input der bliver ledt efter
        String gender = input.next();
        boolean isBoy = gender.equalsIgnoreCase("Y");

        String childAge = institution(age);
        String teamResult = team(isBoy, age);

        // Udskriv resultatet
        System.out.println(childAge + teamResult);
     //   System.out.println(teamResult);
    }

    public static String institution(int age) {
        if (age == 0) {
            return "Your child is at home";
        } else if (age == 1 && age == 2) {
            return "Your child is in nursery";
        } else if (age >= 3 && age <= 5) {
            return "Your child is in kindergarten";
        } else if (age >= 6 && age <= 16) {
            return "Your child is in school";
        } else {
            return "Your child has hopefully graduated school";
        }
    }
    public static String team(boolean isBoy, int age) {
        if (age < 8) {
            return " and your girl is in - Tumbling Girls";
        } else if (age >= 8) {
            return " and your girl is in - Springy Girls";
        } else if (age < 8 && isBoy) {
            return " and your boy is in - Young Cubs";
        } else if (age >= 8 && isBoy) {
            return " and your child is in - Cool Boys";
        } else {
            return "Can't figure out how to remove it without breaking it";
        }
    }

}