import java.util.Scanner;
import java.lang.Math;
public class Cone
{
    private double height; // height of the cone
    private double radius; // radius of the circular base

    public Cone( double radius, double height )
    {
        this.height = height;
        this.radius = radius;
    }

    public double area()
    {
        double area = 0;
        area = Math.PI * radius * (radius + Math.sqrt(( radius * radius ) + ( height * height )));
        return area;
    }

    public double volume()
    {
        double volume = 0;
        volume = Math.PI * radius * radius * (height / 3);
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
    public double slantHeight()
    {
        double slant = Math.sqrt(radius*readius+height*height);
        return slant;
    }
}