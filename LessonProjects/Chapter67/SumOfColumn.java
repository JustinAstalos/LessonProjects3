import java.io.* ;
import javax.xml.crypto.Data;

public class SumOfColumn
{

  public static void main ( String[] args )  
  {
    int[][] data = { {3, 2, 5},
                     {1, 4, 4, 8, 13},
                     {9, 1, 0, 2},
                     {0, 2, 6, 3, -1, -8} };
    
    // declare the sum
    int sum[] = {0, 0, 0, 0, 0, 0, 0};

    // compute the sum
    for ( int row=0; row < data.length; row++){

        //int individualSum = 0;

        for ( int col=0; col < data[row].length; col++) {
            if ( data[row] == null ){
                break;
            }
        
            sum[col] = sum[col] + data[row][col];
            System.out.println( "column " + (col + 1) + ":" + sum[col] );
            
        }
        
        
        
        
        
    }
      
    // write out the sum

  }
}      