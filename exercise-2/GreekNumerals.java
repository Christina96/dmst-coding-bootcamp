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
 * the method arabicToGreek which converts Arabic numeral to Greek. I work using
 * if..else. It works for numbers > 1000.
 *
 */

public class GreekNumerals extends ArabicNumerals {
	private int arbNumber;

	public GreekNumerals(int arbNumber) {
		super();
		this.arbNumber = arbNumber;
	}

	public int getArbNumber() {
		return this.arbNumber;
	}

	public void setArbNumber(int arbNumber) {
		this.arbNumber = arbNumber;
	}

	public String arabicToGreek() {
		String strGreek = "";
		if (this.arbNumber / 100000 != 0) {
			for (int i = 0; i < (this.arbNumber / 100000); i++) {
				strGreek += ",�";
			}
			this.arbNumber = this.arbNumber % 100000;
		}
		if (this.arbNumber / 50000 == 1) {
			strGreek += ",�";
			this.arbNumber = this.arbNumber % 50000;
		}
		if (this.arbNumber / 20000 == 1) {
			strGreek += ",K";
			this.arbNumber = this.arbNumber % 20000;
		}
		if (this.arbNumber / 10000 != 0) {
			for (int i = 0; i < (this.arbNumber / 10000); i++) {
				strGreek += ",�";
			}
			this.arbNumber = this.arbNumber % 10000;
		}
		if (this.arbNumber / 9000 == 1) {
			strGreek += ",�";
			this.arbNumber = this.arbNumber % 9000;
		}
		if (this.arbNumber / 8000 == 1) {
			strGreek += ",H";
			this.arbNumber = this.arbNumber % 8000;
		}
		if (this.arbNumber / 7000 == 1) {
			strGreek += ",�";
			this.arbNumber = this.arbNumber % 7000;
		}
		if (this.arbNumber / 6000 == 1) {
			strGreek += ",�";
			this.arbNumber = this.arbNumber % 6000;
		}
		if (this.arbNumber / 5000 == 1) {
			strGreek += ",�";
			this.arbNumber %= 5000;
		}
		if (this.arbNumber / 4000 == 1) {
			strGreek += ",�";
			this.arbNumber %= 4000;
		}
		if (this.arbNumber / 3000 == 1) {
			strGreek += ",�";
			this.arbNumber %= 3000;
		}
		if (this.arbNumber / 2000 == 1) {
			strGreek += ",�";
			this.arbNumber %= 2000;
		}
		if (this.arbNumber / 1000 == 1) {
			strGreek += ",�";
			this.arbNumber %= 1000;
		}
		if (this.arbNumber / 900 == 1) {
			strGreek += "W";
			this.arbNumber %= 900;
		}
		if (this.arbNumber / 800 == 1) {
			strGreek += "�";
			this.arbNumber %= 800;
		}
		if (this.arbNumber / 700 == 1) {
			strGreek += "�";
			this.arbNumber %= 700;
		}
		if (this.arbNumber / 600 == 1) {
			strGreek += "�";
			this.arbNumber %= 600;
		}
		if (this.arbNumber / 500 == 1) {
			strGreek += "�";
			this.arbNumber %= 500;
		}
		if (this.arbNumber / 400 == 1) {
			strGreek += "�";
			this.arbNumber %= 400;
		}
		if (this.arbNumber / 300 == 1) {
			strGreek += "�";
			this.arbNumber %= 300;
		}
		if (this.arbNumber / 200 == 1) {
			strGreek += "�";
			this.arbNumber %= 200;
		}
		if (this.arbNumber / 100 == 1) {
			strGreek += "�";
			this.arbNumber %= 100;
		}
		if (this.arbNumber / 90 == 1) {
			strGreek += "Q";
			this.arbNumber %= 90;
		}
		if (this.arbNumber / 80 == 1) {
			strGreek += "�";
			this.arbNumber %= 80;
		}
		if (this.arbNumber / 70 == 1) {
			strGreek += "�";
			this.arbNumber %= 70;
		}
		if (this.arbNumber / 60 == 1) {
			strGreek += "�";
			this.arbNumber %= 60;
		}
		if (this.arbNumber / 50 == 1) {
			strGreek += "�";
			this.arbNumber %= 50;
		}
		if (this.arbNumber / 40 == 1) {
			strGreek += "�";
			this.arbNumber %= 40;
		}
		if (this.arbNumber / 30 == 1) {
			strGreek += "�";
			this.arbNumber %= 30;
		}
		if (this.arbNumber / 20 == 1) {
			strGreek += "�";
			this.arbNumber %= 20;
		}
		if (this.arbNumber / 10 == 1) {
			strGreek += "�";
			this.arbNumber %= 10;
		}
		if (this.arbNumber / 9 == 1) {
			strGreek += "�";
			this.arbNumber %= 9;
		}
		if (this.arbNumber / 8 == 1) {
			strGreek += "�";
			this.arbNumber %= 8;
		}
		if (this.arbNumber / 7 == 1) {
			strGreek += "�";
			this.arbNumber %= 7;
		}
		if (this.arbNumber / 6 == 1) {
			strGreek += "�";
			this.arbNumber %= 6;
		}
		if (this.arbNumber / 5 == 1) {
			strGreek += "�";
			this.arbNumber %= 5;
		}
		if (this.arbNumber / 4 == 1) {
			strGreek += "�";
			this.arbNumber %= 4;
		}
		if (this.arbNumber / 3 == 1) {
			strGreek += "�";
			this.arbNumber %= 3;
		}
		if (this.arbNumber / 2 == 1) {
			strGreek += "�";
			this.arbNumber %= 2;
		}
		for (int i = 0; i < this.arbNumber; i++) {
			strGreek += "�";
		}
		return strGreek;
	}
}