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

	public Frame createFrame(List<Integer> subList) {
		
		Frame frame = null;
		
		// Create the frame depending on its type
		if(subList.get(0) == 10) {
			frame = new Strike(subList.get(0) + subList.get(1) + subList.get(2) + points);
		} else if((subList.get(0)+subList.get(1)) == 10) {
			frame = new Spare(subList.get(0) + subList.get(1) + subList.get(2) + points, subList.get(0));
		} else {
			frame = new Normal(subList.get(0) + subList.get(1) + points, subList.get(0), subList.get(1));
		}
		
		// Update points and return created frame
		points = frame.getPoints();
		return frame;
	}

}
