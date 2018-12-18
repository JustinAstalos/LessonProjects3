import java.io.* ;

class ThreeSums
{

  public static void main ( String[] args ) 
  {
    int[] data = {3, 2, 5, 7, 9, 12, 97, 24, 54};
    
    // declare and initialize three sums
    int sum = 0;
    int odd = 0;
    int even = 0;
    
    // compute the sums
    for ( int i=0; i < data.length; i++)
    {
        sum+= data[i];
        if(data[i]%2 == 0)
        {
            even += data[i];
        }
        else
        {
            odd += data[i];
        }
    }
      
    // write out the three sums
    System.out.println("Sum: "+ sum);
    System.out.println("Even: "+ even);
    System.out.println("Odd: "+ odd);
  }
}      