package ceq.bowling;

import ceq.bowling.score.ScoreBoard;
import ceq.bowling.score.ScoreBoardFactory;

/*
 * Role: passing file path to score board
 * 
 * Input: file path
 * Output: printed game score board 
 * 
 * */
public class App {
	
    public static void main (String[] args) {
    	// Validate input parameters amount
		if (args.length != 1) {
			System.out.println("Error: you should only enter 1 parameter (path to file)");
			System.exit(1);
		}
		
		// Create score board to print information of input file
		ScoreBoardFactory factory = new ScoreBoardFactory();
		ScoreBoard board = factory.getBoard();
		board.printScoreForFile(args[0]);
    }
    
}
