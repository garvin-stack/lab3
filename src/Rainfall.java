import java.util.Scanner;
public class Rainfall
{
    final private double[] rainfall;
    public Rainfall(double[] rainfallGiven)
    {
        this.rainfall = new double[rainfallGiven.length];
        for(int index = 0; index < rainfallGiven.length; index++) // rainfallGiven.length means number of elements
        {
            rainfall[index] = rainfallGiven[index];
        }
    }
    public double getTotalRainfall()
    {
        int total = 0;
        for(int index = 0; index < rainfall.length; index++)
        {
            total += rainfall[index];
        }
        return total; // total rainfall
    }

    public double getAverageRainfall()
    {
        return getTotalRainfall() / rainfall.length;
    }

    public int getMostRain()
    {
        double highest = rainfall[0];
        int highestMonth = 1;
        for(int index = 0; index < rainfall.length; index++)
        {
            if(rainfall[index] > highest)
            {
                highest = rainfall[index];
                highestMonth = index + 1;
            }

        }
        return highestMonth;
    }

    public int getLeastRain()
    {
        double least = rainfall[0];
        int leastMonth = 1;
        for(int index = 0; index < rainfall.length; index++)
        {
            if(rainfall[index] < least)
            {
                least = rainfall[index];
                leastMonth = index + 1;
            }
        }
        return leastMonth;
    }
    public static void rainfallArray(double[] rainfallInput) // putting  user values into rainfall array
    {
        double monthlyRain;
        Scanner keyboard = new Scanner(System.in);
        for(int index = 0; index < rainfallInput.length; index++)
        {
            System.out.print("Enter rainfall for month " +
                    (index + 1) + ": ");
            monthlyRain = keyboard.nextDouble();
            rainfallInput[index] = monthlyRain;
        }
    }
    public static void main(String[] args)
    {
        final int monthsInYear = 12;
        double[] rainfall = new double[monthsInYear];
        rainfallArray(rainfall);
        Rainfall r = new Rainfall(rainfall);
        System.out.println(r.getTotalRainfall());
        System.out.println(r.getAverageRainfall());
        switch(r.getMostRain())
        {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
        }
        switch(r.getLeastRain())
        {
            case 1:
            System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
        }
    }
}
