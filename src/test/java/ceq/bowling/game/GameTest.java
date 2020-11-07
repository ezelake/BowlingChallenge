package ceq.bowling.game;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;

import ceq.bowling.score.Chance;

public class GameTest {

	@Test
	public void addTest() {
		Game game = new Game();
		
		for (int i = 0; i < 10; i++) {
			game.add(new Chance("10"));
		}
		
		int sum = 0;
		
		ArrayList<Chance> chances = game.chances;
		for (Chance chance : chances) {
			sum += chance.getChancePins();
		}
		
		assertTrue(sum == 100);
	}

	@Test
	public void generateFramesTest() {
		Game game = new Game();
		
		for (int i = 0; i < 12; i++) {
			game.add(new Chance("10"));
		}
		
		game.generateFrames();
		
		assertTrue(game.frames.size() == 10);
	}
}
