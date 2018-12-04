public class PantryTester
{
  public static void main ( String[] args )
  {
    Jelly goose = new Jelly( "Gooseberry", "7/4/86", 12 );
    Jelly apple = new Jelly( "Crab Apple", "9/30/99", 8 );
    Jelly rhub  = new Jelly( "Rhubarb", "10/31/99", 3 );

    Pantry hubbard = new Pantry( goose, apple, rhub );
    System.out.println( hubbard );

    hubbard.select(1);
    hubbard.scoop(2);
    System.out.println( hubbard );

    hubbard.select(3);
    hubbard.scoop(4);
    System.out.println( hubbard );
  }
}