package opgaver;
import java.sql.SQLOutput;
import java.util.Scanner; //Scanner
public class ComputeAreaWithConsoleInput {
    public static void main(String[] args) {
        //Create Scanner Object
        Scanner input = new Scanner(System.in);
        //Prompt for radius user input
        System.out.print("Enter radius = ");
        double radius = input.nextDouble();
        //Compute area
        double area = radius * radius * 3.14159;
        //Display results
        System.out.println("Arealet for en cirkel med en radius på " + radius + " er " + area);
    }
}
