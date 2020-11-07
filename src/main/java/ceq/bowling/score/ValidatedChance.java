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
	String chance;

	public ValidatedChance(String[] split) {
		// Validate Line format
		if (split.length != 2) {
			String line = "";
			for (int i = 0; i < split.length; i++) {
				line += (split[i] + "\t");
			}
			throw new RuntimeException("Error: this line is not properly formatted (" + line + ")");
		}
		
		// Validate chance content
		if (split[1].equals("F")) {
			chance = split[1];
		} else {
			int pins = Integer.parseInt(split[1]);
			if (pins >= 0 && pins <= 10) {
				chance = split[1];
			} else {
				throw new RuntimeException("Error: pins number should be between 0 and 10 (" + pins + ")");
			}
		}
		
		// Assign player's name
		playerName = split[0];
	}

	public String getPlayerName() {
		return playerName;
	}

	public String getChance() {
		return chance;
	}

}
