package maven;

/**
 * @author Christina Zacharoula Chaniotaki
 *
 */

/**
 * 
 * Test the GreekNumerals Class.
 *
 */

import static org.junit.Assert.*;

import org.junit.Test;

public class GreekNumeralsTest {

	@Test
	public void test() {
		GreekNumerals test = new GreekNumerals(256);
		int getArbNumber = test.getArbNumber();
		assertEquals(256, getArbNumber);
		String output = test.arabicToGreek();
		assertEquals("”ÕÚ", output);
		test.setArbNumber(190);
		getArbNumber = test.getArbNumber();
		assertEquals(190, getArbNumber);
		output = test.arabicToGreek();
		assertEquals("—Q", output);
	}

}
