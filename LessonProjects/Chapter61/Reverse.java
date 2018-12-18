import java.io.* ;

class Reverse
{

  public static void main ( String[] args ) 
  {
    int[] data = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
    int[] temp = {0,0,0,0,0,0,0,0,0,0,0,0,0,0};
    
    // reverse the data
    for ( int j=0; j < data.length ; j++)
    {
        temp[j] = data[j];
    }
      
    // write out the new data
    for ( int j=0; j < data.length; j++)
    {
        data[j] = temp[data.length-(j+1)];
        System.out.print(data[j]+", ");
    }
    
  }
}      