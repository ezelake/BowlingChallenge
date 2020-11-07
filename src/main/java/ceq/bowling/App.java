package ceq.bowling;

import ceq.bowling.score.ScoreBoard;

/*
 * Role: reading file path parameter and executing tasks needed to show the game score board
 * 
 * Input: file path
 * Output: game score board 
 * 
 * */
public class App {
	
    public static void main (String[] args) {
    	// Validate input parameters amount
		if (args.length != 1) {
			throw new RuntimeException("Error: you should only enter 1 parameter (path to file)");
		}
		
		// Create score board using input file
		ScoreBoard board = new ScoreBoard(args[0]);
		
		// Print score board information
		board.printInformation();

    }
    
}
