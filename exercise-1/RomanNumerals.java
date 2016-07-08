/**
 * @author Christina Zacharoula Chaniotaki
 *
 */

/**
 * 
 * The class has two methods. The method romanNumerals converts the string into
 * Arabic numeral system and method arabicToRoman converts the Arabic numeral in
 * Roman numeral system. I work using if..else. It works for numbers > 1000.
 * 
 */

public class RomanNumerals {
	public int romanNumerals(String strRoman) {
		char character;
		int arbcNumber = 0, position = 500;
		char[] letters = { 'I', 'V', 'X', 'L', 'C', 'D', 'M' };
		for (int i = 0; i < strRoman.length(); i++) {
			character = strRoman.charAt(i);
			if (character == letters[0]) {
				if (i + 1 < strRoman.length()) {
					if (strRoman.charAt(i + 1) == 'X') {
						arbcNumber += 9;
						break;
					} else if (strRoman.charAt(i + 1) == 'V') {
						arbcNumber += 4;
						break;
					}
				}
				if (position >= 0) {
					arbcNumber += 1;
				} else {
					arbcNumber = Math.abs(arbcNumber - 1);
				}
				position = 0;
			}
			if (character == letters[1]) {
				if (position >= 1) {
					arbcNumber += 5;
				} else {
					arbcNumber = Math.abs(arbcNumber - 5);
				}
				position = 1;
			}
			if (character == letters[2]) {
				if (position >= 2) {
					arbcNumber += 10;
				} else {
					arbcNumber = Math.abs(arbcNumber - 10);
				}
				position = 2;
			}
			if (character == letters[3]) {
				if (position >= 3 && position != 2) {
					arbcNumber += 50;
				} else if (position < 3 && position != 2) {
					arbcNumber = Math.abs(arbcNumber - 50);
				} else {
					arbcNumber += 30;
				}
				position = 3;
			}
			if (character == letters[4]) {
				if (position >= 4 && position != 2) {
					arbcNumber += 100;
				} else if (position < 4 && position != 2) {
					arbcNumber = Math.abs(arbcNumber - 100);
				} else {
					arbcNumber += 80;
				}
				position = 4;
			}
			if (character == letters[5]) {
				if (position >= 5 && position != 4) {
					arbcNumber += 500;
				} else if (position < 5 && position != 4) {
					arbcNumber = Math.abs(arbcNumber - 500);
				} else {
					arbcNumber += 300;
				}
				position = 5;
			}
			if (character == letters[6]) {
				if (position >= 6 && position != 4) {
					arbcNumber += 1000;
				} else if (position < 6 && position != 4) {
					arbcNumber = Math.abs(arbcNumber - 1000);
				} else {
					arbcNumber += 800;
				}
				position = 6;
			}
		}
		return arbcNumber;
	}

	public String arabicToRoman(int arbcNumber) {
		String strRoman = "";
		if (arbcNumber / 1000 != 0) {
			for (int i = 0; i < (arbcNumber / 1000); i++)
				strRoman += "M";
			arbcNumber %= 1000;
		}
		if (arbcNumber / 900 == 1) {
			strRoman += "CM";
			arbcNumber %= 900;
		}
		if (arbcNumber / 500 == 1) {
			strRoman += "D";
			arbcNumber %= 500;
		}
		if (arbcNumber / 400 == 1) {
			strRoman += "CD";
			arbcNumber %= 400;
		}
		if (arbcNumber / 100 != 0) {
			for (int i = 0; i < (arbcNumber / 100); i++) {
				strRoman += "C";
			}
			arbcNumber %= 100;
		}
		if (arbcNumber / 90 == 1) {
			strRoman += "XC";
			arbcNumber %= 90;
		}
		if (arbcNumber / 50 == 1) {
			strRoman += "L";
			arbcNumber %= 50;
		}
		if (arbcNumber / 40 == 1) {
			strRoman += "XL";
			arbcNumber %= 40;
		}
		if (arbcNumber / 10 != 0) {
			for (int i = 0; i < (arbcNumber / 10); i++) {
				strRoman += "X";
			}
			arbcNumber %= 10;
		}
		if (arbcNumber / 9 == 1) {
			strRoman += "IX";
			arbcNumber %= 9;
		}
		if (arbcNumber / 5 == 1) {
			strRoman += "V";
			arbcNumber %= 5;
		}
		if (arbcNumber / 4 == 1) {
			strRoman += "IV";
			arbcNumber %= 4;
		}
		for (int i = 0; i < arbcNumber; i++) {
			strRoman += "I";
		}
		return strRoman;
	}
}