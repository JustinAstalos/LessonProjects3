public class Unlucky
{
    public static boolean unluckyCheck(int num)
    {
        boolean result = false;
        int num1 = 0;
        int num2 = 0;
        while (num>0)
        {
            num2 = num1;
            num1 = num % 10;
            if (num1 == 1 && num2 ==3)
            {
                result = true;
            }
            num = num/10;
        }
        return result;
    } 
}