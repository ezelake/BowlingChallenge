package ceq.bowling.game;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;

import ceq.bowling.frame.Frame;
import ceq.bowling.util.Chance;

public class GameTest {

	@Test
	public void generateFramesTest() {
		GameFactory gameFactory = new GameFactory();
		Game game = gameFactory.getGame();
		
		for (int i = 0; i < 12; i++) {
			game.add(new Chance("10"));
		}
		
		ArrayList<Frame> frames = game.generateFrames();
		
		assertTrue(frames.size() == 10);
	}
}
