package ceq.bowling.game;

import java.util.ArrayList;

public class Game {
	
	ArrayList<Integer> chances;
	
	public Game() {
		chances = new ArrayList<Integer>();
	}

	public void add(int pins) {
		// Add number of pins to chances
		chances.add(pins);
	}

}
