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

	// using scanner to load information from the file, while validating its content
	public ScoreBoard(Scanner scanner) {
		
		// Create empty players list
		players = new HashMap<>();
		
		while (scanner.hasNextLine()) {
			
			// Validate line values
			ValidatedChance chance = new ValidatedChance(scanner.nextLine().split("\\t"));
			
			// Create player if it is the first chance
			if(!players.containsKey(chance.getPlayerName())) {
				players.put(chance.getPlayerName(), new Game());
			}
			
			// Add chance to player's game record
			players.get(chance.getPlayerName()).add(chance.getPins());

		}
	}

}
