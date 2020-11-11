package ceq.bowling.score;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

import ceq.bowling.AppTest;
import ceq.bowling.util.BowlingException;

public class ScoreBoardTest {
	
	@Test
	public void playerListTest() throws BowlingException {
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(new ByteArrayOutputStream()));

		ScoreBoardFactory factory = new ScoreBoardFactory();
		ScoreBoard board = factory.getBoard();
		board.printScoreForFile(AppTest.TEST_FILES.get(0));
		
	    System.setOut(originalOut);
	}

}
