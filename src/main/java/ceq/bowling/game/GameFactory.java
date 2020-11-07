package ceq.bowling.game;

import ceq.bowling.game.impl.ClassicGame;

public class GameFactory {
	public Game getGame() {
		return new ClassicGame();
	}
}
