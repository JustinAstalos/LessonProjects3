public class Odious
{
    public static boolean odiousCheck(int num)
    {
        boolean result = true;
        int count = 0;
        while (num>0)
        {
            if (num % 2 == 1)
            {
                count++;
            }
            num = num/2;
        }
        if (count % 2 == 1)
        {
            result = false;
        }
        return result;
    } 
}