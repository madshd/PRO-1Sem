package opg5;

public class B112 {
    public static void main(String[] args) {
        double milesRun = 24.0;
        //Konverteringen af minutter og sekunder til timer
        double hours = 1.0 + 40.0/60 + 35.0/3600;
        //Konverteringsfaktor
        double kmPerMile = 1.60;
        //Udregningen af km/t
        double kilometers = milesRun * kmPerMile;
        double kmT = kilometers / hours;

        System.out.println("Avg. km/h speed is = " + kmT);
    }
}