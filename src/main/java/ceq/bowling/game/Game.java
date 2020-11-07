package ceq.bowling.game;

import java.util.ArrayList;

/*
 * Role: convert chances to frames
 * 
 * Input: chances of the player's game
 * Output: frames of the player's game
 * 
 * */
public class Game {
	
	ArrayList<Integer> chances;
	ArrayList<Frame> frames;
	
	public Game() {
		chances = new ArrayList<Integer>();
		frames = new ArrayList<Frame>();
	}

	public void add(int pins) {
		// Add number of pins to chances
		chances.add(pins);
	}

	// Iterate over chances array to generate frames from the game
	public void generateFrames() {
		
		// Create Frame Factory
		FrameFactory factory = new FrameFactory();
		
		// Index to iterate over chances
		int index = 0;
		
		// Generate frames until we have the complete game
		while (frames.size() < 10) {
			
			// If it was STRIKE
			if(chances.get(index) == 10) {
				frames.add(factory.createFrame(chances.subList(index, index+2)));
				index += 1;
				
			// If it was SPARE
			} else if(chances.get(index)+chances.get(index+1) == 10) {
				frames.add(factory.createFrame(chances.subList(index, index+2)));
				index += 2;

			// If it was NORMAL
			} else {
				frames.add(factory.createFrame(chances.subList(index, index+1)));
				index += 2;
			}
			
		}
	}
	
}
