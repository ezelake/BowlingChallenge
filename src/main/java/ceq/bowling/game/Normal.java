package ceq.bowling.game;

public class Normal extends Frame {
	
	String firstChance;
	String secondChance;
	
	public Normal(int points, String firstChance, String secondChance) {
		this.points = points;
		this.firstChance = firstChance;
		this.secondChance = secondChance;
	}

	@Override
	public String getPinfall() {
		return firstChance + " " + secondChance;
	}

}
