//pseudocode: Create an array to be 4 by 10. Create a loop to print each day result.
//Create loop to check row. Create loop to check column. Place the virus.
// Check the virus placement. Spread/absent/do nothing students
//Output the array day by day
import java.util.ArrayList;
public class lab2 {
    public static void main(String[] args){
        String[][] infected = new String[4][10];
        int assist = 0;
        for(int day = 1; day < 8; day++ ) // loop for each day
        {
            System.out.println("Day " + day + ":"); // print out of day
            for(int i = 0; i < infected.length; i++) // for loop for array row
            {
                for(int j= 0; j < infected[i].length; j++) // for loop for array column
                {
                    infected[i][j] = "O"; // sets the whole array to healthy
                    if((((i >= 2 - assist) && i <= 2 + assist ) && (j >= 5. -assist && j <= 5 + assist ))) // set the virus
                    {
                        infected[i][j] = "X";
                    }
                    if((((i > 2 - assist) && i < 2 + assist ) && (j > 5 - assist && j < 5 + assist))) // overrides virus to be absent
                    {
                        infected[i][j] = "-";
                    }
                }
            }
            System.out.println(java.util.Arrays.deepToString(infected));
            assist++;
        }
    }
}
