package ceq.bowling.game;

public class Normal extends Frame {
	
	int firstChance;
	int secondChance;
	
	public Normal(int points, int firstChance, int secondChance) {
		this.points = points;
		this.firstChance = firstChance;
		this.secondChance = secondChance;
	}

	@Override
	public String getPinfall() {
		return firstChance + " " + secondChance;
	}

}
