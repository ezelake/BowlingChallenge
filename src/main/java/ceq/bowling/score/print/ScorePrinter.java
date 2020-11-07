package ceq.bowling.score.print;

import java.util.HashMap;

import ceq.bowling.game.Game;

/*
 * Role: reading map to print game scores
 * 
 * Input: map of players and their games
 * Output: printed game scores
 * 
 * */
public interface ScorePrinter {
	void printScoreForPlayers(HashMap<String, Game> players);
}
