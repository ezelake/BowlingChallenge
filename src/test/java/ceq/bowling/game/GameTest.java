package ceq.bowling.game;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;

public class GameTest {

	@Test
	public void addTest() {
		Game game = new Game();
		
		for (int i = 0; i < 10; i++) {
			game.add("10");
		}
		
		int sum = 0;
		
		ArrayList<String> chances = game.chances;
		for (String string : chances) {
			sum += Integer.parseInt(string);
		}
		
		assertTrue(sum == 100);
	}

	@Test
	public void generateFramesTest() {
		Game game = new Game();
		
		for (int i = 0; i < 12; i++) {
			game.add("10");
		}
		
		game.generateFrames();
		
		assertTrue(game.frames.size() == 10);
	}
}
