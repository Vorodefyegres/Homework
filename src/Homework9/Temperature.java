package Homework9;

public class Temperature {
    private double temperature;
    private char scale;

    public static void main(String[] args) {
        Temperature temp1 = new Temperature();
        Temperature temp2 = new Temperature(32.0, 'F');
        Temperature temp3 = new Temperature(100.0);

        System.out.println("Temperature in Celsius: " + temp1.getTemperatureInC());
        System.out.println("Temperature in Fahrenheit: " + temp2.getTemperatureInF());
        System.out.println("Temperature in both: " + temp3.getTemperatureInC());
    }

    public Temperature() {
        this.temperature = 0.0;
        this.scale = 'C';
    }

    public Temperature(double temperature) {
        this.temperature = temperature;
        this.scale = 'C';
    }

    public Temperature(char scale) {
        this.temperature = 0.0;
        this.scale = scale;
    }

    public Temperature(double temperature, char scale) {
        this.temperature = temperature;
        this.scale = scale;
    }

    public double getTemperatureInC() {
        return (scale == 'C') ? temperature : (5 * (temperature - 32) / 9);
    }

    public double getTemperatureInF() {
        return (scale == 'F') ? temperature : ((9 * temperature / 5) + 32);
    }

    public char getScale() {
        return scale;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public void setScale(char scale) {
        this.scale = scale;
    }

    public void setTemperatureAndScale(double temperature, char scale) {
        this.temperature = temperature;
        this.scale = scale;
    }
}