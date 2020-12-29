
/**
 * @author Sandeep_Singh
 * @Functionality Report the number of times the dice was played to win the game and also the position after every die role.
 *
 */
public class NoOfTimesDicePlayedForWinGame 
{
    private static final int player=1;
    private static int position;
    private static int dice_number;
    private static int count_dice;
    public static int roll_the_dice(){
    	double dice_value=(Math.floor(Math.random()*10)%6)+1;
    	  return (int)dice_value;
        }
    public static void check_option() {
    	while(position<100) {
    	double option=(Math.floor(Math.random()*10)%3)+1;
    	dice_number=roll_the_dice();
    	System.out.println("I rolled the Dice and get"+" "+dice_number);
    	switch((int)option) {
    	case 1 :
    		    count_dice++;
    		    System.out.println("player gets ladder");
    		    position=position+dice_number;
    		    if(position<=100)
    		    System.out.println("Now players reaches at"+" "+position);
    		    else {
    		    	if(position>100)
    		    		position=position-dice_number;}
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
        System.out.println("Total number of times Dice was played to win the Game"+" "+count_dice);
    }
}
