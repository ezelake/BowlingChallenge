package ceq.bowling.score;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ValidatedChanceTest {
	
	@Test
	public void validatedChanceTest() {
		ValidatedChance chance = new ValidatedChance(new String[] {"Ceq", "5"});
		assertTrue(chance.getPlayerName().equals("Ceq"));
		assertTrue(chance.getChance().equals("5"));
	}

}
