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
	
	ArrayList<String> chances;
	ArrayList<Frame> frames;
	
	public Game() {
		chances = new ArrayList<String>();
		frames = new ArrayList<Frame>();
	}

	public void add(String chance) {
		// Add number of pins to chances
		chances.add(chance);
	}

	// Iterate over chances array to generate frames from the game
	public void generateFrames() {
		
		// Create Frame Factory
		FrameFactory factory = new FrameFactory();
		
		// Index to iterate over chances
		int index = 0;
		
		// Generate frames until we have the complete game
		while (frames.size() < 10) {
			
			if (frames.size() < 9) {
				// If it was STRIKE
				if(pinsInChance(chances.get(index)) == 10) {
					frames.add(factory.createFrame(chances.subList(index, index+3)));
					index += 1;
					
				// If it was SPARE
				} else if( pinsInChance(chances.get(index)) + pinsInChance(chances.get(index+1)) == 10) {
					frames.add(factory.createFrame(chances.subList(index, index+3)));
					index += 2;

				// If it was NORMAL
				} else {
					frames.add(factory.createFrame(chances.subList(index, index+2)));
					index += 2;
				}
			} else {
				// If it is final frame
				frames.add(factory.createFinalFrame(chances.subList(index, chances.size())));
			}
			
			
		}
	}
	
	public ArrayList<Frame> getFrames(){
		return frames;
	}
	
	private int pinsInChance(String chance) {
		if(chance.equals("F")) {
			return 0;
		} else {
			return Integer.parseInt(chance);
		}
	}
	
}
