import java.util.Scanner;
import java.lang.Math;
public class Cone
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

    public double area()
    {
        double area = 0;
        area = ( 2 * width * height ) + ( 2 * length * height ) +( 2 * length * width );
        return area;
    }

    public double volume()
    {
        double volume = 0;
        volume = length * width * height;
        return volume;
    }
}
