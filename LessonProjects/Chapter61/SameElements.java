import java.util.Arrays;

class SameElements
{
  public static void main ( String[] args )
  {
    int[] arrayA = { 1, 2, 3, 4 };
    int[] arrayB = { 4,3,2,1 };

    Arrays.sort(arrayA);
    Arrays.sort(arrayB);


    System.out.print("Arrays says: ")    ;
    if (Arrays.equals( arrayB, arrayA )){
      System.out.println( "Equal" );
    }
    else{
      System.out.println( "NOT Equal" );   
    }   

    }
} 