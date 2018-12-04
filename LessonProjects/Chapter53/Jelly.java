import java.util.Scanner;
import java.lang.Math;
public class Jelly
{
    private String flavor;
    private String expiration;
    private double ounces;
    public boolean empty;

    public Jelly(String flavor, String expiration, String ounces)
    {
        this.flavor = flavor;
        this.expiration = expiration;
        this.ounces = ounces;
        this.empty = false;
    }

    public scoop(double scoop)
    {
        if (!empty)
        {
            ounces -= scoop;
        }
        
        if (ounces < 0)
        {
            ounces += scoop;
            System.out.println("You tried to scoop too much");
        }
        else if (ounces == 0)
        {
            boolean empty = true;
        }
    }

    public String toSting()
    {
        return ( flavor + "   " + expiration + "   " + ounces + " fl. oz." ) ;
    }

    public String flavor ()
    {
        return flavor;
    }

    public String expiration ()
    {
        return expiration;
    }

    public double ounces ()
    {
        return ounces;
    }
}