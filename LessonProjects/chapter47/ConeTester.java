import java.util.Scanner;
public class ConeTester
{
    public static void main(String[] args)
    {
        Cone yeet = new Cone(4,6);
        System.out.println("You made a cone with height "+ yeet.getHeight() +" and radius "+ yeet.getRadius() +". You're a hero");
        yeet.setHeight(7);
        yeet.setRadius(9);
        System.out.println("Height : " + yeet.getHeight() + " Radius: " + yeet.getRadius());
        System.out.println("The SA is " + yeet.area() + ". The V is " + yeet.volume() + ".");
    }
}