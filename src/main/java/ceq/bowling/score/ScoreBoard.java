package ceq.bowling.score;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

import ceq.bowling.game.Frame;
import ceq.bowling.game.Game;

/*
 * Role: reading input file and creating game score board
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
			String line = scanner.nextLine();
			String[] parameters = line.split("\t");
			if (parameters.length != 2) {
				throw new RuntimeException("Error: this line is not properly formatted (" + line + ")");
			}
			String playerName = parameters[0];
			String chanceValue = parameters[1];

			// Create player if it is the first chance
			if(!players.containsKey(playerName)) {
				players.put(playerName, new Game());
			}

			// Add chance to player's game record
			Chance chance = new Chance(chanceValue);
			players.get(playerName).add(chance);
		}
	}

	// print score board information to system output
	public void printInformation() {
		System.out.println("Frame \t\t1 \t2 \t3 \t4 \t5 \t6 \t7 \t8 \t9 \t10");
		
		for (Entry<String, Game> entry : players.entrySet()) {
			System.out.println(entry.getKey());
			
			Game game = entry.getValue();
			ArrayList<Frame> frames = game.generateFrames();
			
			System.out.println("Pinfalls \t" + frames.get(0).getPinfall()
					+ "\t" + frames.get(1).getPinfall()
					+ "\t" + frames.get(2).getPinfall()
					+ "\t" + frames.get(3).getPinfall()
					+ "\t" + frames.get(4).getPinfall()
					+ "\t" + frames.get(5).getPinfall()
					+ "\t" + frames.get(6).getPinfall()
					+ "\t" + frames.get(7).getPinfall()
					+ "\t" + frames.get(8).getPinfall()
					+ "\t" + frames.get(9).getPinfall());
			
			System.out.println("Score \t\t" + frames.get(0).getPoints()
					+ "\t" + frames.get(1).getPoints()
					+ "\t" + frames.get(2).getPoints()
					+ "\t" + frames.get(3).getPoints()
					+ "\t" + frames.get(4).getPoints()
					+ "\t" + frames.get(5).getPoints()
					+ "\t" + frames.get(6).getPoints()
					+ "\t" + frames.get(7).getPoints()
					+ "\t" + frames.get(8).getPoints()
					+ "\t" + frames.get(9).getPoints());

		}
	}

}
