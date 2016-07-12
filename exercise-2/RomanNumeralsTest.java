package maven;

/**
 * @author Christina Zacharoula Chaniotaki
 *
 */

/**
 * 
 * Test the RomanNumerals Class.
 *
 */

import static org.junit.Assert.*;

import org.junit.Test;

public class RomanNumeralsTest {

	@Test
	public void test() {
		RomanNumerals test = new RomanNumerals(88);
		int getArbNumber = test.getArbNumber();
		assertEquals(88, getArbNumber);
		String output = test.arabicToRoman();
		assertEquals("LXXXVIII", output);
	}

}
