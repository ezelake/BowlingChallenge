package ceq.bowling.game;

import java.util.List;

public class Final extends Frame {
	
	String pinfall;

	public Final(int points, List<String> subList) {
		this.points = points;
		for (String string : subList) {
			this.points += pinsInChance(string);
		}
		
		this.pinfall = pinfallInChance(subList.get(0)) + " ";
		
		if (pinsInChance(subList.get(0)) != 10 && (pinsInChance(subList.get(0))+pinsInChance(subList.get(1))) == 10 ) {
			this.pinfall += "/";
		} else {
			this.pinfall += pinfallInChance(subList.get(1));
		}
		
		if(subList.size() == 3) {
			this.pinfall += (" " + pinfallInChance(subList.get(2)));
		}
	}

	@Override
	public String getPinfall() {
		return pinfall;
	}

	private int pinsInChance(String chance) {
		if(chance.equals("F")) {
			return 0;
		} else {
			return Integer.parseInt(chance);
		}
	}
	
	private String pinfallInChance(String chance) {
		if(chance.equals("10")) {
			return "X";
		} else {
			return chance;
		}
	}

}
