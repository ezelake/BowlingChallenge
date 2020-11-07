package ceq.bowling.game;

import java.util.ArrayList;

import ceq.bowling.frame.Frame;
import ceq.bowling.util.Chance;

/*
 * Role: convert chances to frames
 * 
 * Input: chances of the player's game
 * Output: frames of the player's game
 * 
 * */
public interface Game {
	ArrayList<Frame> generateFrames();
	void add(Chance chance);
}
