package ceq.bowling.score;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.junit.Test;

import ceq.bowling.AppTest;

public class ScoreBoardTest {
	
	@Test
	public void playerListTest() {
		try {
			ScoreBoard board = new ScoreBoard(new Scanner(new File(AppTest.TEST_FILE)));
			assertTrue(board.players.get("Jeff") != null);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
