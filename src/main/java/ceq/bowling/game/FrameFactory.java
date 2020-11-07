package ceq.bowling.game;

import java.util.List;

/*
 * Role: create frame from a list of chances
 * 
 * Input: list of chances
 * Output: frame with points
 * 
 * */
public class FrameFactory {
	
	// Points from last frame
	int points;
	
	public FrameFactory() {
		points = 0;
	}

	public Frame createFrame(List<String> subList) {
		
		Frame frame = null;
		
		// Create the frame depending on its type
		if(pinsInChance(subList.get(0)) == 10) {
			frame = new Strike(pinsInChance(subList.get(0)) + pinsInChance(subList.get(1))
			+ pinsInChance(subList.get(2)) + points);
		} else if((pinsInChance(subList.get(0))+pinsInChance(subList.get(1))) == 10) {
			frame = new Spare(pinsInChance(subList.get(0)) + pinsInChance(subList.get(1)) 
			+ pinsInChance(subList.get(2)) + points, subList.get(0));
		} else {
			frame = new Normal(pinsInChance(subList.get(0)) + pinsInChance(subList.get(1)) + points, 
					subList.get(0), subList.get(1));
		}
		
		// Update points and return created frame
		points = frame.getPoints();
		return frame;
	}

	private int pinsInChance(String chance) {
		if(chance.equals("F")) {
			return 0;
		} else {
			return Integer.parseInt(chance);
		}
	}

	public Frame createFinalFrame(List<String> subList) {
		return new Final(points, subList);
	}

}
