/**
 * @author Christina Zacharoula Chaniotaki
 *
 */

/**
 * 
 * The class has one method. This method checks the string for what numeral
 * system belongs to and sends the corresponding class I work using if..else. It
 * It works for numbers > 1000.
 * 
 */

public class ArabicNumerals {
	public int conversion‘oArabic(String strNumber) {
		RomanNumerals roman = new RomanNumerals();
		GreekNumerals greek = new GreekNumerals();
		int arbcNumber;
		if (strNumber.charAt(0) != 'I' && strNumber.charAt(0) != 'V' && strNumber.charAt(0) != 'X'
				&& strNumber.charAt(0) != 'L' && strNumber.charAt(0) != 'C' && strNumber.charAt(0) != 'D'
				&& strNumber.charAt(0) != 'M') {
			// Not roman system
			// check now if is arabic system
			if (strNumber.charAt(0) != '0' && strNumber.charAt(0) != '1' && strNumber.charAt(0) != '2'
					&& strNumber.charAt(0) != '3' && strNumber.charAt(0) != '4' && strNumber.charAt(0) != '5'
					&& strNumber.charAt(0) != '6' && strNumber.charAt(0) != '7' && strNumber.charAt(0) != '8'
					&& strNumber.charAt(0) != '9') {
				// greek number
				arbcNumber = greek.greekNumerals(strNumber);
			} else {
				// arabic number
				arbcNumber = Integer.parseInt(strNumber);
			}
		} else {
			// roman number
			arbcNumber = roman.romanNumerals(strNumber);
		}
		return arbcNumber;
	}
}