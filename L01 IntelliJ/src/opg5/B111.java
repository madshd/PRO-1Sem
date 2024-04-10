package opg5;

public class B111 {
    public static void main(String[] args) {
        int curPop = 312_032_486;
        int daysYear = 365;
        
        double birthDay = 3600.0 / 7.0 * 24.0;
        double deathDay = 3600.0 / 13.0 * 24.0;
        double immigrantDay = 3600.0 / 45.0 * 24.0;

        double totalDay = birthDay + immigrantDay - deathDay;
        double totalPrYear = totalDay * daysYear;

        System.out.println("Year 1 = " + (curPop + totalPrYear));
        System.out.println("Year 2 = " + (curPop + totalPrYear + totalPrYear));
        System.out.println("Year 3 = " + (curPop + totalPrYear + totalPrYear + totalPrYear));
        System.out.println("Year 4 = " + (curPop + totalPrYear + totalPrYear + totalPrYear + totalPrYear));
        System.out.println("Year 5 = " + (curPop + totalPrYear + totalPrYear + totalPrYear + totalPrYear + totalPrYear));

    }
}
