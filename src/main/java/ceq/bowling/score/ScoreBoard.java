package ceq.bowling.score;

import java.util.HashMap;
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
	HashMap<String, Game> players;

	// using scanner to load information in the file, while validating its content
	public ScoreBoard(Scanner scanner) {
		players = new HashMap<>();
		
		while (scanner.hasNextLine()) {
			ValidatedChance chance = new ValidatedChance(scanner.nextLine().split("\\t"));
			
			if(!players.containsKey(chance.getPlayerName())) {
				players.put(chance.getPlayerName(), new Game());
			}
		}
	}

}
