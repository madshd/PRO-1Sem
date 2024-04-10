package WeatherStation;
public class WeatherStation {
    private double temperature;
    private double pressure;

    // Constructor
    public WeatherStation() {
        this.temperature = 0.0;
        this.pressure = 1.0;
    }

    public WeatherStation(double temperature, double pressure) {
        this.temperature = temperature;
        this.pressure = pressure;
    }

    public static String fromImperial(double temperature, double pressure) {
        double fahrenheitToCelcius = (temperature - 32) * 0.5555;
        double psiToBar = pressure * 0.06894757;

        return "WeatherStation" +
                " | Temperature (°F): " + temperature + " | °C " + fahrenheitToCelcius +
                " | Pressure (PSI): " + pressure + " | Bar " + psiToBar;
    }

// Getter
    public double getTemperature() {
        return temperature;
    }

    public double getPressurePSI() {
        this.pressure = pressure * 14.5;
        return pressure;
    }

    public double getTemperatureFahrenheit() {
        this.temperature = temperature * 1.8 + 32.0;
        return temperature;
    }

    public double getPressure() {
        return pressure;
    }
// Setter
    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }
// (°F =°C * 1.8 + 32,
// 1 bar = 14.503773773 PSI)
    public void setTemperatureFahrenheit(double temperature) {
        this.temperature = temperature * 1.8 + 32.0;
    }

    public void setPressurePSI(double pressure) {
        this.pressure = pressure * 14.5;
    }

    @Override
    public String toString() {
        return "WeatherStation" +
                " | Temperature (°C): " + temperature + " | °F " + getTemperatureFahrenheit() +
                " | Pressure (bar): " + pressure + " | PSI " + getPressurePSI();
    }
}


