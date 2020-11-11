package ceq.bowling.frame.impl;

import ceq.bowling.frame.Frame;

public class Spare extends Frame {
	
	String chance;
	
	public Spare(int points, String chance) {
		this.points = points;
		this.chance = chance;
	}

	@Override
	public String getPinfall() {
		return chance + "\t/";
	}

}
