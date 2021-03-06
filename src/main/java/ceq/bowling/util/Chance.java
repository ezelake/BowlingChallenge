package ceq.bowling.util;

/*
 * Role: validating chances read from input file
 * 
 * Input: chance value
 * Output: object with chance value and number of pins 
 * 
 * */
public class Chance {
	
	String chanceValue;

	public Chance(String chanceValue) throws BowlingException {
		// Validate chance content
		if (chanceValue.equals("F")) {
			this.chanceValue = chanceValue;
		} else {
			int pins = Integer.parseInt(chanceValue);
			if (pins >= 0 && pins <= 10) {
				this.chanceValue = chanceValue;
			} else {
				throw new BowlingException("Error: pins number should be between 0 and 10 (" + pins + ")");
			}
		}
	}

	public String getChanceValue() {
		return chanceValue;
	}

	public int getChancePins() {
		if(chanceValue.equals("F")) {
			return 0;
		} else {
			return Integer.parseInt(chanceValue);
		}
	}

}
