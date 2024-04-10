package WeatherStation;

public class WeatherStationApp {
    public static void main(String[] args) {
        WeatherStation w1 = new WeatherStation();
        System.out.println(w1.toString());
        WeatherStation w2 = new WeatherStation(35, 0.5);
        System.out.println(w2.toString());
        String w3 = WeatherStation.fromImperial(68, 21);
        System.out.println(w3.toString());

    }
}
