import java.util.Scanner;
public class LargerThanN
{
    public LargerThanN()
    {

    }
    public int getLargerThanN(int[] number, int n)
    {
        for(int index = 0; index < number.length;index++)
        {
            if(n < number[index])
            {
                System.out.println(number[index]);
            }
        }
        return 0;
    }
    public static void main(String[] args)
    {
        int[] numbers = {1,5};
        int ns = 0;
        LargerThanN action = new LargerThanN();
        int[] array1 = {1, 5, 10, 2, 4, -3, 6};
        int[] array2 = {10, 12, 15, 24};
        action.getLargerThanN(array1, 3);
        action.getLargerThanN(array2, 12);
    }
}

