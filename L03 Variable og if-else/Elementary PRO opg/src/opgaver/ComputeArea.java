package opgaver;

public class ComputeArea {
    public static void main(String[] args) {
        double radius; //declare radius
        double area; //declare area
        // Step 1: Read in radius
        radius = 20;
        // Step 2: Compute area
        area = radius * radius * 3.14159;
        // Step 3: Display the area
        System.out.println("Arealet for en cirkel med en radius på " + radius + " er " + area);
    }
}
