package maven;

/**
 * @author Christina Zacharoula Chaniotaki
 *
 */

/**
 * 
 * Test the romanToArabic method in Class ArabicNumerals.
 *
 */

import static org.junit.Assert.*;

import org.junit.Test;

public class RomanToArabicTest {

	@Test
	public void test() {
		ArabicNumerals test = new ArabicNumerals("CDXLIV");
		String romanStr = test.getStringNumber();
		assertEquals("CDXLIV", romanStr);
		int romanToArb = test.romanToArabic();
		assertEquals(444, romanToArb);
	}

}
