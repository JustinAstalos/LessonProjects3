import java.util.Scanner;
public class NameEcho{
    public static void main(String[] args)
    {
        String name = "";
        Scanner scan = new Scanner( System.in );
        System.out.println("Enter your name");
        name = scan.nextLine();
        String firstName = "";
        String lastName = "";
        char letter = 'y';

        for(int i = 0; i < name.length(); i++)
        {
            letter = name.charAt(i);
            if (letter == ' ')
            {
                firstName = name.substring(0,i);
                lastName = name.substring(i+1,name.length());
            }
        }
        System.out.println(name);
        lastName.toLowerCase();
        System.out.println(firstName + " " + lastName);

    }
}