
/**
 * @author Sandeep_Singh
 * @Functionality The Player then checks for a Option. They are No Play,Ladder or Snake.
 *
 */
public class CheckOption 
{
    private static final int player=1;
    private static int position;
    private static int dice_number;
    public static int roll_the_dice(){
    	double dice_value=(Math.floor(Math.random()*10)%6)+1;
    	  return (int)dice_value;
        }
    public static void check_option() {
    	double option=(Math.floor(Math.random()*10)%3)+1;
    	switch((int)option) {
    	case 1 :
    		    System.out.println("player gets ladder");
    		    position=position+dice_number;
    		    System.out.println("Now players reaches at"+" "+position);
    		    break;
    	case 2 :
    		    System.out.println("player gets Snake");
    		    if(position<=0)
    		    	System.out.println("Now player reaches at"+" "+0);
    		    else {
    		    	position=position-dice_number;
    		    	if(position<=0)
    		    		System.out.println("Now player reaches at"+" "+0);
    		    	else
    		    		System.out.println("Now player reaches at"+" "+position);
    		    }
    		    break;
    	case 3 : 
    		    System.out.println("This is the No playe option so player stay at same "+" "+position);
    	        default : System.out.println("No changes in the player position");
    	
    	}
    }
	public static void main( String[] args )
    {
        System.out.println( "Let's start the Game with player and position is"+" "+player+" "+"and"+" "+position);
        dice_number=roll_the_dice();
        check_option();
    }
}
