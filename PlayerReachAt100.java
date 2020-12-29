
/**
 * @author Sandeep_Singh
 * @Functionality Player Reaches at 100.and then player have won the match
 *
 */
public class PlayerReachAt100 
{
    private static final int player=1;
    private static int position;
    private static int dice_number;
    public static int roll_the_dice(){
    	double dice_value=(Math.floor(Math.random()*10)%6)+1;
    	  return (int)dice_value;
        }
    public static void check_option() {
    	while(position<100) {
    	double option=(Math.floor(Math.random()*10)%3)+1;
    	dice_number=roll_the_dice();
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
    		    System.out.println("This is the No play option so player stay at same "+" "+position);
    	        default : System.out.println("No changes in the player position");
    	
    	}
    }
  }   	
	public static void main( String[] args )
    {
        System.out.println( "Let's start the Game with player and position is"+" "+player+" "+"and"+" "+position);
        check_option();
    }
}
