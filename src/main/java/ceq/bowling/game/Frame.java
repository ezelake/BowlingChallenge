package ceq.bowling.game;

abstract class Frame {
	int points;
	public int getPoints() {
		return points;
	}
	
	public abstract String getPinfall();
}
