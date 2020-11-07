package ceq.bowling.frame.impl;

import java.util.List;

import ceq.bowling.frame.Frame;
import ceq.bowling.util.Chance;

public class Final extends Frame {
	
	String pinfall;

	public Final(int points, List<Chance> subList) {
		// Update points
		this.points = points;
		for (Chance chance : subList) {
			this.points += chance.getChancePins();
		}
		
		// Update string to be shown in output
		this.pinfall = pinfallInChance(subList.get(0).getChanceValue()) + " ";
		
		if (subList.get(0).getChancePins() != 10 && 
				subList.get(0).getChancePins()+subList.get(1).getChancePins() == 10 ) {
			this.pinfall += "/";
		} else {
			this.pinfall += pinfallInChance(subList.get(1).getChanceValue());
		}
		
		if(subList.size() == 3) {
			this.pinfall += (" " + pinfallInChance(subList.get(2).getChanceValue()));
		}
	}

	@Override
	public String getPinfall() {
		return pinfall;
	}

	private String pinfallInChance(String chance) {
		if(chance.equals("10")) {
			return "X";
		} else {
			return chance;
		}
	}

}
