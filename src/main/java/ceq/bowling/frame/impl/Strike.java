package ceq.bowling.frame.impl;

import ceq.bowling.frame.Frame;

public class Strike extends Frame {
	
	public Strike(int points) {
		this.points = points;
	}

	@Override
	public String getPinfall() {
		return "  X";
	}

}
