package maven;

/**
 * @author Christina Zacharoula Chaniotaki
 *
 */

/**
 * 
 * Run all test.
 *
 */

import org.junit.Test;

public class AllTestsRun {

	@Test
	public void test() {
		ArabicNumeralsTest test1 = new ArabicNumeralsTest();
		test1.test();
		RomanNumeralsTest test2 = new RomanNumeralsTest();
		test2.test();
		GreekToArabicTest test3 = new GreekToArabicTest();
		test3.test();
		RomanToArabicTest test4 = new RomanToArabicTest();
		test4.test();
		GreekNumeralsTest test5 = new GreekNumeralsTest();
		test5.test();
	}

}
