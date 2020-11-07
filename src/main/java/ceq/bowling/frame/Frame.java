package ceq.bowling.frame;

public abstract class Frame {
	
	protected int points;
	
	public int getPoints() {
		return points;
	}
	
	public abstract String getPinfall();
}
