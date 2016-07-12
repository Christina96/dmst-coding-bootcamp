package maven;

/**
 * @author Christina Zacharoula Chaniotaki
 *
 */

/**
 * 
 * Test the ArabicNumerals Class
 *
 */

import static org.junit.Assert.*;

import org.junit.Test;

public class ArabicNumeralsTest {

	@Test
	public void test() {
		ArabicNumerals roman = new ArabicNumerals("MMMCCXXIV");
		int romanOutput = roman.conversion‘oArabic();
		assertEquals(3224, romanOutput);
		ArabicNumerals greek = new ArabicNumerals(",√” ƒ");
		int greekOutput = greek.conversion‘oArabic();
		assertEquals(3224, greekOutput);
		ArabicNumerals arabic = new ArabicNumerals("3224");
		int arabicOutput = arabic.conversion‘oArabic();
		assertEquals(3224, arabicOutput);
		String strNumber = roman.getStringNumber();
		assertEquals("MMMCCXXIV", strNumber);
		greek.setStringNumber("—Q");
		strNumber = greek.getStringNumber();
		assertEquals("—Q", strNumber);
	}

}
