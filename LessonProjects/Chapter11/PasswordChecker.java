import java.util.Scanner;
public class PasswordChecker
{
  public static void main(String[] args)
  {
    String password;
    Scanner scan = new Scanner( System.in );
    System.out.println("Enter your password:");
    password = scan.nextLine();
    if (password.equals("Penisballs47"))
    {
      System.out.println("That is correct. *dab*");
    }
    else if (password.equals("DondeEstaLaC00chie"))
    {
      System.out.println("That is also acceptable.");
    }
    else if (password.equals("Password") || password.equals("password"))
    {
      System.out.println("Ooohh, you're fucking clever. Shut your dumb ass up.");
    }
    else 
    {
      System.out.println("False");
    }
  }
}