import java.io.* ;
import java.lang.Math;

class ClosestTo0
{

  public static void main ( String[] args )
  {
    int[] data = {3, 1, 5, 7, 4, 12, -3, 8, -2};
    
    // declare and initialize variables
    int closest = 1000;
    
    // find the element nearest to zero
    for ( int i = 0; i < data.length; i++)
    {
        if (java.lang.Math.abs(data[i]) < closest)
        {
            closest = data[i];
        }
    }
      
    // write out the element nearest to zero
    System.out.println( "Closest to 0: "+ closest );

  }
}