package ceq.bowling.score;

/*
 * Role: validating chances read from input file
 * 
 * Input: array of elements in a line
 * Output: object with player name and number of pins 
 * 
 * */
public class ValidatedChance {
	
	String playerName;
	int pins;

	public ValidatedChance(String[] split) {
		if (split.length != 2) {
			String line = "";
			for (int i = 0; i < split.length; i++) {
				line += (split[i] + "\t");
			}
			throw new RuntimeException("Error: this line is not properly formatted (" + line + ")");
		}
		
		if (split[1].equals("F")) {
			pins = 0;
		} else {
			pins = Integer.parseInt(split[1]);
			if (pins < 0 || pins > 10) {
				throw new RuntimeException("Error: pins number should be between 0 and 10 (" + pins + ")");
			}
		}
		
		playerName = split[0];
	}

	public String getPlayerName() {
		return playerName;
	}

	public int getPins() {
		return pins;
	}
	
}
