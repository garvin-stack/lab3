import java.util.Scanner;
public class Temperature
{
    private double ftemp;

    public Temperature(double fahrenheitGiven)
    {
        ftemp = fahrenheitGiven;
    }

    public void setFahrenheit(double fahrenheitGiven)
    {
        ftemp = fahrenheitGiven;
    }

    public double getFahrenheit()
    {
        return ftemp;
    }

    public double getCelsius()
    {
        return (5.0/9.0) * (ftemp - 32.0);
    }
    public double getKelvin()
    {
        return ((5.0/9.0) * (ftemp - 32.0)) + 273.0;
    }

    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a Fahrenheit temperature:");
        double fahrenheitInput = keyboard.nextDouble();
        Temperature t = new Temperature(fahrenheitInput);
        System.out.println("The temperature in Fahrenheit is " + fahrenheitInput);
        System.out.println("The temperature in Celsius is " + t.getCelsius());
        System.out.println("The temperature in Kelvin is " + t.getKelvin());

    }
}
