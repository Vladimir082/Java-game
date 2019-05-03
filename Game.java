public class Game {

	public static void main(String[] args) {
		Player PlayerObject= new Player();
		Startgame.main(args,"","");
	}

	
     
       public void Grid(){
    	   System.out.println("WELCOME TO THE GAME *** NOUGHTS AND CROSSES ***");
    	   int row = 3;
    	   int column= 3;
    	    System.out.println("  | 1 2 3 ");
    	    System.out.println("--+-------");

    	    for (row = 1; row <= 3; row++) {
    	        System.out.print(row + " | ");
    	        for (column = 1; column <= 3; column++) {
    	
    	        } // end column
    	        System.out.println();
    	    } // end row
    	}

	
		
	} // end method displayBoard
	