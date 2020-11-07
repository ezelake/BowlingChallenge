package ceq.bowling.score;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import ceq.bowling.AppTest;

public class ScoreBoardTest {
	
	@Test
	public void playerListTest() {
		ScoreBoard board = new ScoreBoard(AppTest.TEST_FILE);
		assertTrue(board.players.get("Jeff") != null);
	}

}
