package ceq.bowling.game;

import java.util.List;

import ceq.bowling.score.Chance;

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

	public Frame createStrike(List<Chance> subList) {
		
		// Create the frame
		Frame frame = new Strike(subList.get(0).getChancePins() + subList.get(1).getChancePins()
			+ subList.get(2).getChancePins() + points);
		
		// Update points and return created frame
		points = frame.getPoints();
		return frame;
	}
	

	public Frame createSpare(List<Chance> subList) {
		
		// Create the frame
		Frame frame = new Spare(subList.get(0).getChancePins() + subList.get(1).getChancePins()
			+ subList.get(2).getChancePins() + points, subList.get(0).getChanceValue());
		
		// Update points and return created frame
		points = frame.getPoints();
		return frame;
	}

	public Frame createNormal(List<Chance> subList) {
		
		// Create the frame
		Frame frame = new Normal(subList.get(0).getChancePins() + subList.get(1).getChancePins()
			+ points, subList.get(0).getChanceValue(), subList.get(1).getChanceValue());
		
		// Update points and return created frame
		points = frame.getPoints();
		return frame;
	}

	public Frame createFinal(List<Chance> subList) {
		return new Final(points, subList);
	}

}
