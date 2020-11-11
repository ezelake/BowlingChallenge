package ceq.bowling.game.impl;

import java.util.ArrayList;

import ceq.bowling.frame.Frame;
import ceq.bowling.frame.FrameFactory;
import ceq.bowling.game.Game;
import ceq.bowling.util.BowlingException;
import ceq.bowling.util.Chance;

public class ClassicGame implements Game {
	
	ArrayList<Chance> chances;
	
	public ClassicGame() {
		chances = new ArrayList<Chance>();
	}
	
	@Override
	public void add(Chance chance) {
		chances.add(chance);
	}
	
	// Iterate over chances array to generate frames from the game
	public ArrayList<Frame> generateFrames() throws BowlingException {

		ArrayList<Frame> frames = new ArrayList<Frame>();
		
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

				// If it was an error
				} else if ((chances.get(index).getChancePins() + chances.get(index+1).getChancePins()) > 10){
					throw new BowlingException("Error: a max of 10 pins are allowed per frame. Frame: "
							+ (frames.size()+1) + " Amount: "
							+ (chances.get(index).getChancePins() + chances.get(index+1).getChancePins()));
				
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
