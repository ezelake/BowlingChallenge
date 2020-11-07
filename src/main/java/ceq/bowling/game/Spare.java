package ceq.bowling.game;

public class Spare extends Frame {
	
	String chance;
	
	public Spare(int points, String chance) {
		this.points = points;
		this.chance = chance;
	}

	@Override
	public String getPinfall() {
		return chance + " /";
	}

}
