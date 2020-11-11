package ceq.bowling.score.impl;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

import ceq.bowling.game.Game;
import ceq.bowling.game.GameFactory;
import ceq.bowling.score.ScoreBoard;
import ceq.bowling.score.print.ScorePrinter;
import ceq.bowling.score.print.ScorePrinterFactory;
import ceq.bowling.util.BowlingException;
import ceq.bowling.util.Chance;

public class ClassicScoreBoard implements ScoreBoard {

	@Override
	public void printScoreForFile(String fileLocation) throws BowlingException {
		
		// Object created to hold players list and their games information
		HashMap<String, Game> players = new HashMap<>();
		
		GameFactory gameFactory = new GameFactory();

		try {
			// Stream and lambda
			List<String[]> lines = Files.lines(Paths.get(fileLocation)).map(line -> line.split("\t")).collect(Collectors.toList());
			
			for (String[] parameters : lines) {
				if (parameters.length != 2) {
					throw new BowlingException("Error: a line is not properly formatted");
				}
				String playerName = parameters[0];
				String chanceValue = parameters[1];

				// Create player if it is the first chance
				if(!players.containsKey(playerName)) {
					players.put(playerName, gameFactory.getGame());
				}

				// Add chance to player's game record
				Chance chance = new Chance(chanceValue);
				players.get(playerName).add(chance);
			}
		} catch (IOException e) {
			throw new BowlingException("Error with IOException: " + e.getMessage());
		}
		
		ScorePrinterFactory factory = new ScorePrinterFactory();
		ScorePrinter printer = factory.getPrinter();
		printer.printScoreForPlayers(players);

	}

}
