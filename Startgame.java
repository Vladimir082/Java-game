import java.util.*;
public class Startgame {
	static Scanner input = new Scanner(System.in);
	static char[][] table = new char[3][3];
	
	
	public static void main(String[] args, String player1, String player2) {
		System.out.println("- - - WELCOME TO THE GAME TIC TAC TOE!- - - ");
		
		if (player1.equals("")){
					getPlayerName();
		}else {
		
		System.out.println("Type B (Begin), R (rules) or E(exit) : ");
		String answer = input.nextLine();
		boolean flag =false;
		do {
			switch (answer.toUpperCase()) {
			case "B": //	Begin Game 
				System.out.println("- - TIC TAC TOE! - -");
				flag = true;
				Player.Token(player1, player2);
				break;
			case "R"://	Rules
				System.out.println("- - Rules - -\n	1.Each player takes it in turn to place token into one of the empty squares by typing the coordinate. \n	2.To win the game get three of your tokens in a line vertically, horizontally or diagonally. \n	3.For the first game player1 begins.\n\n\nType B (Begin), R (rules) or E(exit):");
				answer = input.nextLine();
				flag = false;
				break;
			case "E"://	Exit Application 
				System.out.println("Exit : Thank you for playing");
				System.exit(0);
				flag = true;
				break;
			default: //Validation - fallacious input is rejected
				System.err.println("Unrecognised option-Type B (Begin), R (rules) or E(exit)");
				flag = false;
				answer = input.nextLine();
				break;
			}
		} while (flag == false);}
	}
	     
	
	
    public static void getPlayerName() {
        //	Validation - Ensures user name is between 1-15 characters and two users don't have identical names
        boolean flag = false;
        System.out.println("\nPlease insert the name of player 1: ");
        String player1 = input.nextLine();
        
        do {
         if (player1.length() < 1||player1.length() >15) {
          System.err.println("Please Enter name containing 1-15 characters!");
          System.out.println("Please insert the name of player 1: ");
          player1 = input.nextLine();
          flag = false;
         } else {
          flag = true;
         }
        } while (flag == false);
        
        System.out.println("Please insert the name of player 2: ");
        String player2 = input.nextLine();
        
        do {
         if (player2.length() < 1||player2.length() >15) {
          System.err.println("Please Enter name containing 1-15 characters!");
          System.out.println("Please insert the name of player 2: ");
          player2 = input.nextLine();
          flag = true;
         } else if (player1.equals(player2)) {
          System.err.println("Two players can't have same name!");
          System.out.println("Please insert the name of player 2: ");
          player2 = input.nextLine();
          flag = true;
         } else {
          flag = false;
          main( null, player1,player2);
         }
        } while (flag == true);
        
       }
    }
		

