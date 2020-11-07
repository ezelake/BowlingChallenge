package ceq.bowling.score.print.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

import ceq.bowling.frame.Frame;
import ceq.bowling.game.Game;
import ceq.bowling.score.print.ScorePrinter;

public class ClassicScorePrinter implements ScorePrinter {

	@Override
	public void printScoreForPlayers(HashMap<String, Game> players) {
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
