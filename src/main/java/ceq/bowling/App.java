package ceq.bowling;

import java.util.Scanner;

import ceq.bowling.score.ScoreBoard;
import ceq.bowling.util.FileOperator;

/*
 * Role: reading file parameter path and executing tasks needed to show the game score board
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
		
		// Use FileOperator to open File and generate Scanner object
		String location = args[0];
		FileOperator operator = new FileOperator(location);
		Scanner scanner = operator.getFileScanner();
		
		// Create score board using input file
		ScoreBoard board = new ScoreBoard(scanner);
		System.out.println(board);

		// Close scanner after reading file
		scanner.close();
    }
    
}
