import java.awt.Color;
import java.util.Scanner;

public class Player {
	static Scanner input = new Scanner(System.in);
	static char[][] table = new char[3][3];

	public static  void Token(String player1, String player2) {
		System.out.println("\n"+player1.toUpperCase()+"(X)  VS   "+player2.toUpperCase()+"(O)");
		displayBoard();
		Turn(0,player1, player2);
	}
	
	public static void Turn (int moves, String player1, String player2){ //Alternates Players Moves allowing players to take one turn at a time
				boolean value=false;
int row = 0;
		int col = 0;
		String test="";
	do {
	 if (moves==8){
		System.out.println("DRAW");
		System.exit(0);
	}
		if (moves==0||moves==2||moves==4||moves==6||moves==8){ //Player 1's turn 
		System.out.println("\nMake your move : "+player1.toUpperCase()+"\nRemainng moves : "+(9-moves)+"\n\nEnter Row : ");
		test=input.next();
		do {if (test.equals("1")||(test.equals("2"))||(test.equals("0"))){
			row=Integer.parseInt(test);
			value=true;
			break;
			}else{
				System.err.println("Please enter a Row between 0-2!");
				System.out.println("\nEnter Row : ");
				test=input.next();
				value=false;
			}}while(value==false);
		
		System.out.println("\nEnter Column : ");
		test=input.next();
		value=false;
		do {if (test.equals("1")||(test.equals("2"))||(test.equals("0"))){
		col=Integer.parseInt(test);
		makeMove(row,col,'X',player1,player2,moves+1);
		value=true;
		break;
		}else{
			System.err.println("Please enter a column between 0-2!");
			System.out.println("\nEnter Column : ");
			test=input.next();
			value=false;
		}}while(value==false);
		moves+=1;
	}else{//Player 2's turn 
		System.out.println("\nMake your move : "+player2.toUpperCase()+"\nRemainng moves : "+(9-moves)+"\n\nEnter Row : ");
		test=input.next();
		do {if (test.equals("1")||(test.equals("2"))||(test.equals("0"))){
			row=Integer.parseInt(test);
			value=true;
			break;
			}else{
				System.err.println("Please enter a Row between 0-2!");
				System.out.println("\nEnter Row : ");
				test=input.next();
				value=false;
			}}while(value==false);
		System.out.println("\nEnter Column : ");
		test=input.next();
		value=false;
		do {if (test.equals("1")||(test.equals("2"))||(test.equals("0"))){
		col=Integer.parseInt(test);	
		makeMove(row,col,'O',player1,player2,moves+1);
		value=true;
		break;
		}else{
			System.err.println("Please enter a column between 0-2!");
			System.out.println("\nEnter Column : ");
			test=input.next();
			value=false;
		}}while(value==false);
		moves+=1;
	}}while(moves<10);
	}
	
	
	public static void initialiseGame() { //Resets Game Board 
        for (int i = 0; i < 3; i++) {
            for (int p = 0; p < 3; p++) {
                table[i][p] = ' ';
            }
        }
    }
	
	public static void makeMove(int row, int column, char token, String player1, String player2, int moves ){ //Places token on board 
		if (table[row][column]==('X')||table[row][column]=='O'){	//Only allows user to place a token in EMPTY square 
			System.err.println("token alreaddy placed");
			Turn(moves-1,player1,player2);
		}else{
		table[row][column]=token;
		checkWin(player1, player2);
		displayBoard();}
	}
	
    public static  void displayBoard() { //Displays tic tac toe grid 
        System.out.println("  0  " + table[0][0] + "|" + table[0][1] + "|" + table[0][2]);
        System.out.println("    --+-+--");
        System.out.println("  1  " + table[1][0] + "|" + table[1][1] + "|" + table[1][2]);
        System.out.println("    --+-+--");
        System.out.println("  2  " + table[2][0] + "|" + table[2][1] + "|" + table[2][2]);
        System.out.println("     0 1 2 ");
    }

    public static void checkWin(String player1, String player2){
    	//Horizontal winning options 
    	if (table[0][0]=='X'&&table[0][1] =='X'&&table[0][2] =='X'){
    		System.out.println("WINNER : "+player1.toUpperCase()+"\nThank You For Playing!!" );
			System.exit(0);
    	}
    	if (table[0][0]=='O'&&table[0][1] =='O'&&table[0][2] =='O'){
    		System.out.println("WINNER : "+player1.toUpperCase()+"\nThank You For Playing!!" );
			System.exit(0);

    	}
    	if (table[1][0]=='X'&&table[1][1] =='X'&&table[1][2] =='X'){
    		System.out.println("WINNER : "+player1.toUpperCase()+"\nThank You For Playing!!" );
    		System.exit(0);
    	}
    	if (table[1][0]=='O'&&table[1][1] =='O'&&table[1][2] =='O'){
    		System.out.println("WINNER : "+player1.toUpperCase()+"\nThank You For Playing!!" );
    		System.exit(0);
    	}
    	if (table[2][0]=='X'&&table[2][1] =='X'&&table[2][2] =='X'){
    		System.out.println("WINNER : "+player1.toUpperCase()+"\nThank You For Playing!!" );
    		System.exit(0);
    	}
    	if (table[2][0]=='O'&&table[2][1] =='O'&&table[2][2] =='O'){
    		System.out.println("WINNER : "+player1.toUpperCase()+"\nThank You For Playing!!" );
    		System.exit(0);
    	}
    	
    	//Vertical winning options 
    	if (table[0][0]=='X'&&table[1][0] =='X'&&table[2][0] =='X'){
    		System.out.println("WINNER : "+player1.toUpperCase()+"\nThank You For Playing!!" );
    		System.exit(0);
    	}
    	if (table[0][0]=='O'&&table[1][0] =='O'&&table[2][0] =='O'){
    		System.out.println("WINNER : "+player1.toUpperCase()+"\nThank You For Playing!!" );
    		System.exit(0);
    	}
    	if (table[0][1]=='X'&&table[1][1] =='X'&&table[2][1] =='X'){
    		System.out.println("WINNER : "+player1.toUpperCase()+"\nThank You For Playing!!" );
    		System.exit(0);
    	}
    	if (table[0][1]=='O'&&table[1][1] =='O'&&table[2][1] =='O'){
    		System.out.println("WINNER : "+player1.toUpperCase()+"\nThank You For Playing!!" );
    		System.exit(0);
    	}
    	if (table[0][2]=='X'&&table[1][2] =='X'&&table[2][2] =='X'){
    		System.out.println("WINNER : "+player1.toUpperCase()+"\nThank You For Playing!!" );
    		System.exit(0);
    	}
    	if (table[0][2]=='O'&&table[1][2] =='O'&&table[2][2] =='O'){
    		System.out.println("WINNER : "+player1.toUpperCase()+"\nThank You For Playing!!" );
    		System.exit(0);
    	}
    	
    	//Diagonal winning options 
    	if (table[0][0]=='X'&&table[1][1] =='X'&&table[2][2] =='X'){
    		System.out.println("WINNER : "+player1.toUpperCase()+"\nThank You For Playing!!" );
    		System.exit(0);
    	}
    	if (table[0][0]=='O'&&table[1][1] =='O'&&table[2][2] =='O'){
    		System.out.println("WINNER : "+player1.toUpperCase()+"\nThank You For Playing!!" );
    		System.exit(0);
    	}
    	if (table[0][2]=='X'&&table[1][1] =='X'&&table[2][0] =='X'){
    		System.out.println("WINNER : "+player1.toUpperCase()+"\nThank You For Playing!!" );
    		System.exit(0);
    	}
    	if (table[0][2]=='O'&&table[1][1] =='O'&&table[2][0] =='O'){
    		System.out.println("WINNER : "+player1.toUpperCase()+"\nThank You For Playing!!" );
    		System.exit(0);
    	}
    }
}