package ceq.bowling.score;

import ceq.bowling.score.impl.ClassicScoreBoard;

public class ScoreBoardFactory {

	public ScoreBoard getBoard() {
		return new ClassicScoreBoard();
	}

}
