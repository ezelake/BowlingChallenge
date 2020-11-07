package ceq.bowling.game;

import java.util.ArrayList;

import ceq.bowling.score.Chance;

/*
 * Role: convert chances to frames
 * 
 * Input: chances of the player's game
 * Output: frames of the player's game
 * 
 * */
public class Game {
	
	ArrayList<Chance> chances;
	ArrayList<Frame> frames;
	
	public Game() {
		chances = new ArrayList<Chance>();
		frames = new ArrayList<Frame>();
	}

	public void add(Chance chance) {
		// Add chance to list
		chances.add(chance);
	}

	// Iterate over chances array to generate frames from the game
	public ArrayList<Frame> generateFrames() {
		
		// Create Frame Factory
		FrameFactory factory = new FrameFactory();
		
		// Index to iterate over chances
		int index = 0;
		
		// Generate frames until we have the complete game
		while (frames.size() < 10) {
			
			if (frames.size() < 9) {
				// If it was STRIKE
				if(chances.get(index).getChancePins() == 10) {
					frames.add(factory.createStrike(chances.subList(index, index+3)));
					index += 1;
					
				// If it was SPARE
				} else if( (chances.get(index).getChancePins() + chances.get(index+1).getChancePins()) == 10) {
					frames.add(factory.createSpare(chances.subList(index, index+3)));
					index += 2;

				// If it was NORMAL
				} else {
					frames.add(factory.createNormal(chances.subList(index, index+2)));
					index += 2;
				}
			} else {
				// If it is final frame
				frames.add(factory.createFinal(chances.subList(index, chances.size())));
			}
			
			
		}

		return frames;
	}
	
}
