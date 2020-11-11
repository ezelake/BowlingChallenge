package ceq.bowling.frame;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import ceq.bowling.util.Chance;

public class FrameTest {

	@Test
	public void strikeTest() {
		List<Chance> subList = Arrays.asList(new Chance("10"), new Chance("5"), new Chance("3"));
		
		FrameFactory factory = new FrameFactory();
		Frame frame = factory.createStrike(subList);
		
		assertTrue(frame.getPinfall().equals("\tX"));
		assertTrue(frame.getPoints() == 18);
	}

	@Test
	public void spareTest() {
		List<Chance> subList = Arrays.asList(new Chance("5"), new Chance("5"), new Chance("3"));
		
		FrameFactory factory = new FrameFactory();
		Frame frame = factory.createSpare(subList);
		
		assertTrue(frame.getPinfall().equals("5\t/"));
		assertTrue(frame.getPoints() == 13);
	}

	@Test
	public void normalTest() {
		List<Chance> subList = Arrays.asList(new Chance("5"), new Chance("3"));
		
		FrameFactory factory = new FrameFactory();
		Frame frame = factory.createNormal(subList);
		
		assertTrue(frame.getPinfall().equals("5\t3"));
		assertTrue(frame.getPoints() == 8);
	}
	
	@Test
	public void finalTest() {
		List<Chance> subList = Arrays.asList(new Chance("10"), new Chance("5"), new Chance("3"));
		
		FrameFactory factory = new FrameFactory();
		Frame frame = factory.createFinal(subList);
		
		assertTrue(frame.getPinfall().equals("X\t5\t3"));
		assertTrue(frame.getPoints() == 18);
	}

}
