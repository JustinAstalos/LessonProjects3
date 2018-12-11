class ArraySum5
{
  public static void main ( String[] args )
  {
    int[] val = {0, 1, 2, 3}; 
    int[] temp = {0,0,0,0};
 
    System.out.println( "Original Array: " 
        + val[0] + " " + val[1] + " " + val[2] + " " + val[3] );
 
    // reverse the order of the numbers in the array
    for(int i = 0; i < val.length; i++)
    {
        temp[i] = val[i];
    }
    for(int i = 0; i < val.length; i++)
    {
        val[i] = temp[temp.length-(i+1)];
    }
 
    
 
    System.out.println( "Reversed Array: " 
        + val[0] + " " + val[1] + " " + val[2] + " " + val[3] );
   }
}