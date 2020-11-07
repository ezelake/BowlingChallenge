package ceq.bowling.game;

public class Strike extends Frame {
	
	public Strike(int points) {
		this.points = points;
	}

	@Override
	public String getPinfall() {
		return "X";
	}

}
