public class Room
{
    public static void main(String[] args)
    {
        String[][] room = new String[4][10];
        int x = 2;
        int y = 5;
        int ctr = 0;
        int row;
        for(int d =1; d <= 6; d++)
        {
            System.out.println("Day " + d);
            for (int c = 0; c < 10; c++)
            {
                for(int r = 0; r < 4; r++)
                {
                    room[r][c] = "O";
                    if (((r >= x - ctr) && r <= x + ctr) && (c >= y - ctr && c <= y + ctr))
                    {
                        room[r][c] = "X";
                    }
                    if (((r > x - ctr) && r < x + ctr) && (c > y - ctr && c < y + ctr))
                    {
                        room[r][c] = "-";
                    }
                }
            }
            System.out.println(java.util.Arrays.deepToString(room) + '\n' );
            System.out.println();
            ctr++;
        }
    }
}
