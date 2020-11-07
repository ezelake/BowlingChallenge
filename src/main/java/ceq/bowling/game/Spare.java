package ceq.bowling.game;

public class Spare extends Frame {
	
	int chance;
	
	public Spare(int points, int chance) {
		this.points = points;
		this.chance = chance;
	}

	@Override
	public String getPinfall() {
		return chance + " /";
	}

}
