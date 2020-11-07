package ceq.bowling.game;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class FrameTest {

	@Test
	public void strikeTest() {
		List<String> subList = Arrays.asList("10","5","3");
		
		FrameFactory factory = new FrameFactory();
		Frame frame = factory.createFrame(subList);
		
		assertTrue(frame.getPinfall().equals("  X"));
		assertTrue(frame.getPoints() == 18);
	}

	@Test
	public void spareTest() {
		List<String> subList = Arrays.asList("5","5","3");
		
		FrameFactory factory = new FrameFactory();
		Frame frame = factory.createFrame(subList);
		
		assertTrue(frame.getPinfall().equals("5 /"));
		assertTrue(frame.getPoints() == 13);
	}

	@Test
	public void normalTest() {
		List<String> subList = Arrays.asList("5","3");
		
		FrameFactory factory = new FrameFactory();
		Frame frame = factory.createFrame(subList);
		
		assertTrue(frame.getPinfall().equals("5 3"));
		assertTrue(frame.getPoints() == 8);
	}
}
