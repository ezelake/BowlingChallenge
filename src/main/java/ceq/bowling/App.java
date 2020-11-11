package ceq.bowling;

import ceq.bowling.score.ScoreBoard;
import ceq.bowling.score.ScoreBoardFactory;
import ceq.bowling.util.BowlingException;

/*
 * Role: passing file path to score board
 * 
 * Input: file path
 * Output: printed game score board 
 * 
 * */
public class App {

    public static void main (String[] args) {
    	int returnCode = run(args);
    	System.exit(returnCode);
    }

    public static int run (String[] args) {
    	// Validate input parameters amount
		if (args.length != 1) {
			System.out.println("Error: you should only enter 1 parameter (path to file)");
			return 1;
		}
		
		// Create score board to print information of input file
		ScoreBoardFactory factory = new ScoreBoardFactory();
		ScoreBoard board = factory.getBoard();
		try {
			board.printScoreForFile(args[0]);
		} catch (BowlingException e) {
			System.out.println(e.getMessage());
			return 2;
		}
		
		return 0;
    }
    
}
