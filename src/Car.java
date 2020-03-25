public class Car
{
    private int yearModel;
    private String make;
    private int speed;

    public Car(int yearModelGiven, String makeGiven)
    {
        yearModelGiven = yearModel;
        makeGiven = make;
        speed = 0;
    }

    int getYearModel()
    {
        return yearModel;
    }

    String getMake()
    {
        return make;
    }

    int getSpeed()
    {
        return speed;
    }

    public void setAccelerate()
    {
        speed += 5;
    }

    public void setBrake()
    {
        speed -= 5;
    }

    public static void main(String[] args)
    {
        Car check = new Car(2020, "Honda");
        for (int inc = 1; inc < 6; inc++)
        {
            check.setAccelerate();// calls the setAccerleate method
            System.out.println(check.getSpeed());
        }
        for (int dec = 1; dec < 6; dec++)
        {
            check.setBrake();
            System.out.println(check.getSpeed());
        }
    }
}

