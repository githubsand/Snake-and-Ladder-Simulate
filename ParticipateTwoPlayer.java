
/**
 * @author Sandeep_Singh
 * Functionality Take two player and find which player Won the Game
 *
 */
public class ParticipateTwoPlayer 
{
	   private static final int player=2;
	    private static  int position;
	    private static int dice_number;
	    private static int position1;
	    private static int position2;
	    static boolean value=true;
	    public static int roll_the_dice(){
	    	double dice_value=(Math.floor(Math.random()*10)%6)+1;
	    	  return (int)dice_value;
	        }
	    public static int check_option() {
	    	double option=(Math.floor(Math.random()*10)%3)+1;
	    	dice_number=roll_the_dice();
	    	System.out.println("I rolled the Dice and get"+" "+dice_number);
	    	switch((int)option) {
	    	case 1 :
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
	    	return position;
	  } 
	    ParticipateTwoPlayer(int player_position)
	    {
	    	this.position=player_position;
	    }
		public static void main( String[] args )
	    {
	        System.out.println( "Let's start the Game with player and position is"+" "+player+" "+"and"+" "+position);
	       while(position1<100 && position2<100) {
	        if(value) {
	        ParticipateTwoPlayer player1= new ParticipateTwoPlayer(position1);
	        position1= check_option();
	        value=false;
	        if(position1==100)
	        	System.out.println("player1 reaches at 100 and Won the Game");}
	        else {
	         ParticipateTwoPlayer player2= new ParticipateTwoPlayer(position2);
	        position2=check_option();
	        value=true;
	        if(position2==100)
	        	System.out.println("player2 reaches at 100 and Won the Game");}
	        
	    }
	}
}
