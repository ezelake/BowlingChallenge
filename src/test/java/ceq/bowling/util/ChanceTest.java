package ceq.bowling.util;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ChanceTest {
	
	@Test
	public void validatedChanceTest() {
		Chance chance = new Chance("F");
		assertTrue(chance.getChanceValue().equals("F"));
		assertTrue(chance.getChancePins() == 0);
	}

}
