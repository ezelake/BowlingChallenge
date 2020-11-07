package ceq.bowling.score;

import java.util.Map;
import java.util.Scanner;

import ceq.bowling.game.Game;

/*
 * Role: creating game score board
 * 
 * Input: file scanner
 * Output: game score board 
 * 
 * */
public class ScoreBoard {

	// Object created to hold players list and their games information
	Map<String, Game> players;

	// using scanner to load information in the file, while validating its content
	public ScoreBoard(Scanner scanner) {
		while (scanner.hasNextLine()) {
			ValidatedChance chance = new ValidatedChance(scanner.nextLine().split("\\t"));
		}
	}

}
