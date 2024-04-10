package opg5;

public class B110 {
    public static void main(String[] args) {
        //Average speed in miles
        double distKm = 15.0;
        double minTime = 50.0;
        double secTime = 30.0;
        double miles = distKm / 1.6;
        double timeTotal = (minTime * 60 + secTime) / 3600.0;

        System.out.println(miles / timeTotal);

    }
}
