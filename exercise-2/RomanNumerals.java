package maven;

/**
 * @author Christina Zacharoula Chaniotaki
 *
 */

/**
 * 
 * Class is a subclass of Arabic Numerals. Has a constructor method which gets
 * as argument the value of the Arabic number. It has methods getArbNumber and
 * setArbNumber to get the value of the variable instance or change it. Also has
 * the method arabicToRoman which converts Arabic numeral to Roman. I work using
 * if..else. It works for numbers > 1000.
 *
 */

public class RomanNumerals extends ArabicNumerals {
	private int arbNumber;

	public RomanNumerals(int arbNumber) {
		super();
		this.arbNumber = arbNumber;
	}

	public int getArbNumber() {
		return this.arbNumber;
	}

	public void setArbNumber(int arbNumber) {
		this.arbNumber = arbNumber;
	}

	public String arabicToRoman() {
		String strRoman = "";
		if (this.arbNumber / 1000 != 0) {
			for (int i = 0; i < (this.arbNumber / 1000); i++)
				strRoman += "M";
			this.arbNumber %= 1000;
		}
		if (this.arbNumber / 900 == 1) {
			strRoman += "CM";
			this.arbNumber %= 900;
		}
		if (this.arbNumber / 500 == 1) {
			strRoman += "D";
			this.arbNumber %= 500;
		}
		if (this.arbNumber / 400 == 1) {
			strRoman += "CD";
			this.arbNumber %= 400;
		}
		if (this.arbNumber / 100 != 0) {
			for (int i = 0; i < (this.arbNumber / 100); i++) {
				strRoman += "C";
			}
			this.arbNumber %= 100;
		}
		if (this.arbNumber / 90 == 1) {
			strRoman += "XC";
			this.arbNumber %= 90;
		}
		if (this.arbNumber / 50 == 1) {
			strRoman += "L";
			this.arbNumber %= 50;
		}
		if (this.arbNumber / 40 == 1) {
			strRoman += "XL";
			this.arbNumber %= 40;
		}
		if (this.arbNumber / 10 != 0) {
			for (int i = 0; i < (this.arbNumber / 10); i++) {
				strRoman += "X";
			}
			this.arbNumber %= 10;
		}
		if (this.arbNumber / 9 == 1) {
			strRoman += "IX";
			this.arbNumber %= 9;
		}
		if (this.arbNumber / 5 == 1) {
			strRoman += "V";
			this.arbNumber %= 5;
		}
		if (this.arbNumber / 4 == 1) {
			strRoman += "IV";
			this.arbNumber %= 4;
		}
		for (int i = 0; i < this.arbNumber; i++) {
			strRoman += "I";
		}
		return strRoman;
	}
}
