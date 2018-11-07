import java.util.Scanner;
public class CylinderTester
{
    public static void main(String[] args)
    {
        Cylinder yeet = new Cylinder(4,6);
        System.out.println("You made a cylinder with height "+ yeet.getHeight() +" and radius "+ yeet.getRadius() +". You're a hero");
        yeet.setHeight(7);
        yeet.setRadius(9);
        System.out.println("Height : " + yeet.getHeight() + " Radius: " + yeet.getRadius());
        System.out.println("The SA is " + yeet.area() + ". The V is " + yeet.volume() + ".");
    }
}