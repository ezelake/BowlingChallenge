package ceq.bowling.score;

import ceq.bowling.util.BowlingException;

/*
 * Role: reading input file to print game score board
 * 
 * Input: file location
 * Output: printed game score board
 * 
 * */
public interface ScoreBoard {
	void printScoreForFile(String fileLocation) throws BowlingException;
}
