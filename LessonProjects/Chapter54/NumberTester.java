import java.util.Scanner;
public class NumberTester
{
    public static void main()
    {
        Scanner scan = new Scanner( System.in );
        System.out.println("Enter a number");
        int num = scan.nextInt();
        if (unluckyCheck(num) || odiousCheck(num))
        {
            if(unluckyCheck(num))
            {
                System.out.println("This number is unlucky");
            }
            if(odiousCheck())
            {
                System.out.println("This number is odious");
            }
        }
        else
        {
            System.out.println("This number is neither odious or unlucky");
        }
    }
}