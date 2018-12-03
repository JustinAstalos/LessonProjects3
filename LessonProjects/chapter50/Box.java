import java.util.Scanner;
import java.lang.Math;
public class Box
{
    private double height; // height of the cone
    private double length; // radius of the circular base
    private double width;

    public Box( double width, double length, double height )
    {
        this.height = height;
        this.length = length;
        this.width = width;
    }

    public Box BiggerBox( Box box)
    {
        return new Box( 1.25 * box.width(), 1.25 * box.length(), 1.25*box.height());
    }
    public Box SmallerBox( Box box)
    {
        return new Box( 0.75 * box.width(), 0.75 * box.length(), 0.75*box.height());
    }

    public double area()
    {
        double area = 2 * topArea() + 2 * sideArea() + 2 * frontArea();
        return area;  
    }

    public double volume()
    {
        double volume = length * width * height;
        return volume;
    }
    public double topArea()
    {
        double topArea = length * width;
        return topArea;
    }
    public double frontArea()
    {
        double frontArea = length * width;
        return frontArea;
    }
    public double sideArea()
    {
        double sideArea = length * width;
        return sideArea;
    }
    public double length()
    {
        return length;
    }
    public double height()
    {
        return height;
    }
    public double width()
    {
        return width;
    }
    public boolean nest ( Box box)
    {
        boolean nest = false
        if (length > box.length() && width > box.width() && length >box.length())
        {
            nest = true;
        }
        return nest;
    }
}
