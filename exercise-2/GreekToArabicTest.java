package maven;

/**
 * @author Christina Zacharoula Chaniotaki
 *
 */

/**
 * 
 * Test the greekToArabic method in Class ArabicNumerals.
 *
 */

import static org.junit.Assert.*;

import org.junit.Test;

public class GreekToArabicTest {

	@Test
	public void test() {
		ArabicNumerals test = new ArabicNumerals(",ลูฬ๒");
		String greekStr = test.getStringNumber();
		assertEquals(",ลูฬ๒", greekStr);
		int greekToArb = test.greekToArabic();
		assertEquals(5846, greekToArb);
	}

}
