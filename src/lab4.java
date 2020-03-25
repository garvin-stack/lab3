import java.util.ArrayList;
import java.util.Random;
public class lab4 {
    private String[][] classroom = new String[4][10];
    int assist = 0;
    public lab4(int row, int column) {
        classroom[1][4] = "O";
    }
    public void day()
    {
        for(int day = 1; day < 8; day++ ) // loop for each day
        {
            System.out.println("Day " + day + ":"); // print out of day
            virus();
            absent();
            System.out.println(java.util.Arrays.deepToString(classroom));
        }
    }
    public void virus() // makes students infected
    {
        for(int i = 0; i < classroom.length; i++) // for loop for array row
        {
            for (int j = 0; j < classroom[i].length; j++) // for loop for array column
            {
                classroom[i][j] = "O";
                if ((((i >= 2 - assist) && i <= 2 + assist) && (j >= 5 - assist && j <= 5 + assist))) // set the virus
                {
                    classroom[i][j] = "X";
                }
            }
        }
        assist++;
    }
    public void absent() // makes the infected students absents
    {
        Random r = new Random();
        int roll;
        roll = r.nextInt(4);
        for (int i = 0; i < classroom.length; i++) // for loop for array row
        {
            for (int j = 0; j < classroom[i].length; j++) // for loop for array column
            {
                if (roll == 2 && classroom[i][j] == "X") {
                    classroom[i][j] = "-";
                }
            }
        }
    }
    public static void main(String[] args)
    {
        lab4 first = new lab4(1, 4);
        first.day();
    }
}
