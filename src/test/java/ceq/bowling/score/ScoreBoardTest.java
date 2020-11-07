package ceq.bowling.score;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

import ceq.bowling.AppTest;

public class ScoreBoardTest {
	
	@Test
	public void playerListTest() {
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(new ByteArrayOutputStream()));

		ScoreBoardFactory factory = new ScoreBoardFactory();
		ScoreBoard board = factory.getBoard();
		board.printScoreForFile(AppTest.TEST_FILE);
		
	    System.setOut(originalOut);
	}

}
