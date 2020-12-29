
/**
 * @author Sandeep_Singh
 * @Functionality Snake and Ladder game played with single player at start position 0 add one method is roll_the_dice
 *
 */
public class RollTheDice 
{
    private static final int player=1;
    private static int position;
    public static void roll_the_dice(){
    	double dice_value=(Math.floor(Math.random()*10)%6)+1;
    	System.out.println("When player roll the Dice and get a Number "+" "+(int)dice_value);
        }
	public static void main( String[] args )
    {
        System.out.println( "Let's start the Game with player and position is"+" "+player+" "+"and"+" "+position);
        roll_the_dice();
    }
}
