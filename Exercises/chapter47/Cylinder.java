import java.util.Scanner;
import java.lang.Math;
public class Cylinder
{
    private double height; // height of the cone
    private double radius; // radius of the circular base

    public Cylinder( double radius, double height )
    {
        this.height = height;
        this.radius = radius;
    }
    public double area()
    {
        double area = 0;
        area = (2 * Math.PI * radius * radius) + (2 * Math.PI * radius * height);
        return area;
    }
    public double volume()
    {
        double volume = 0;
        volume = Math.PI * radius * radius * (height);
        return volume;
    }
    public void setHeight(double height)
    {
        this.height = height;
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    public double getHeight()
    {
        return height;
    }

    public double getRadius()
    {
        return radius;
    }
}