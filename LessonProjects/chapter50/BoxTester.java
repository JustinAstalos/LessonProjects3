import java.util.Scanner;
public class BoxTester
{
    public static void main(String[] args)
    {
        Box yeet = new Box(4,6,5);
        System.out.println( "Area: "  + yeet.area() + " volume: " + yeet.volume() );
        System.out.println( "length: " + yeet.length() + " height: " + yeet.height() + " width:  " + yeet.width() )  ;
        System.out.println( "topArea: "  + yeet.topArea() );
        Box yeet2 = new BiggerBox(yeet);
        System.out.println( "Area: "  + yeet2.area() + " volume: " + yeet2.volume() );
        System.out.println( "length: " + yeet2.length() + " height: " + yeet2.height() + " width:  " + yeet2.width() )  ;
        System.out.println( "topArea: "  + yeet2.topArea() );
        Box yeet3 = new SmallerBox(yeet);
        System.out.println( "Area: "  + yeet3.area() + " volume: " + yeet3.volume() );
        System.out.println( "length: " + yeet3.length() + " height: " + yeet3.height() + " width:  " + yeet3.width() )  ;
        System.out.println( "topArea: "  + yeet3.topArea() );
        System.out.println( yeet2.nest(yeet3));
    }
}