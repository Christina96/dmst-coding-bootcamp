package maven;

/**
 * @author Christina Zacharoula Chaniotaki
 *
 */

/**
 * 
 * The class has two constructors. The one without arguments and used in
 * subclasses of the program and the second is used by the Main program. It has
 * methods getStringNumber and setStringNumber to get the value of the variable
 * instance or change it. Also has methods conversionÔoArabic, greekToArabic and
 * romanToArabic. The method conversionÔoArabic converts the string to Arabian
 * number using the methods greekToArabic and romanToArabic depending on whether
 * they are Greek or Roman numerals. Works using if..else. It works for numbers
 * > 1000.
 * 
 */

public class ArabicNumerals {
	private String stringNumber;

	public ArabicNumerals() {

	}

	public ArabicNumerals(String strNumber) {
		this.stringNumber = strNumber;
	}

	public String getStringNumber() {
		return this.stringNumber;
	}

	public void setStringNumber(String strNumber) {
		this.stringNumber = strNumber;
	}

	public int conversionÔoArabic() {
		int arbcNumber;
		if (this.stringNumber.charAt(0) != 'I' && this.stringNumber.charAt(0) != 'V'
				&& this.stringNumber.charAt(0) != 'X' && this.stringNumber.charAt(0) != 'L'
				&& this.stringNumber.charAt(0) != 'C' && this.stringNumber.charAt(0) != 'D'
				&& this.stringNumber.charAt(0) != 'M') {
			// Not roman system
			// check now if is arabic system
			if (this.stringNumber.charAt(0) != '0' && this.stringNumber.charAt(0) != '1'
					&& this.stringNumber.charAt(0) != '2' && this.stringNumber.charAt(0) != '3'
					&& this.stringNumber.charAt(0) != '4' && this.stringNumber.charAt(0) != '5'
					&& this.stringNumber.charAt(0) != '6' && this.stringNumber.charAt(0) != '7'
					&& this.stringNumber.charAt(0) != '8' && this.stringNumber.charAt(0) != '9') {
				// greek number
				arbcNumber = greekToArabic();
			} else {
				// arabic number
				arbcNumber = Integer.parseInt(this.stringNumber);
			}
		} else {
			// roman number
			arbcNumber = romanToArabic();
		}
		return arbcNumber;
	}

	public int greekToArabic() {
		char character, helpVariable;
		int arbcNumber = 0;
		for (int i = 0; i < this.stringNumber.length(); i++) {
			character = this.stringNumber.charAt(i);
			if (character == 'Á') {
				helpVariable = this.stringNumber.charAt(i - 1);
				if (helpVariable == ',') {
					arbcNumber += 1000;
				} else {
					arbcNumber += 1;
				}
			}
			if (character == 'Â') {
				helpVariable = this.stringNumber.charAt(i - 1);
				if (helpVariable == ',') {
					arbcNumber += 2000;
				} else {
					arbcNumber += 2;
				}
			}
			if (character == 'Ã') {
				helpVariable = this.stringNumber.charAt(i - 1);
				if (helpVariable == ',') {
					arbcNumber += 3000;
				} else {
					arbcNumber += 3;
				}
			}
			if (character == 'Ä') {
				helpVariable = this.stringNumber.charAt(i - 1);
				if (helpVariable == ',') {
					arbcNumber += 4000;
				} else {
					arbcNumber += 4;
				}
			}
			if (character == 'Å') {
				helpVariable = this.stringNumber.charAt(i - 1);
				if (helpVariable == ',') {
					arbcNumber += 5000;
				} else {
					arbcNumber += 5;
				}
			}
			if (character == 'ò') {
				helpVariable = this.stringNumber.charAt(i - 1);
				if (helpVariable == ',') {
					arbcNumber += 6000;
				} else {
					arbcNumber += 6;
				}
			}
			if (character == 'Æ') {
				helpVariable = this.stringNumber.charAt(i - 1);
				if (helpVariable == ',') {
					arbcNumber += 7000;
				} else {
					arbcNumber += 7;
				}
			}
			if (character == 'Ç') {
				helpVariable = this.stringNumber.charAt(i - 1);
				if (helpVariable == ',') {
					arbcNumber += 8000;
				} else {
					arbcNumber += 8;
				}
			}
			if (character == 'È') {
				helpVariable = this.stringNumber.charAt(i - 1);
				if (helpVariable == ',') {
					arbcNumber += 9000;
				} else {
					arbcNumber += 9;
				}
			}
			if (character == 'É') {
				if (i - 1 > 0) {
					helpVariable = this.stringNumber.charAt(i - 1);
					if (helpVariable == ',') {
						arbcNumber += 10000;
					} else {
						arbcNumber += 10;
					}
				} else {
					arbcNumber += 10;
				}
			}
			if (character == 'Ê') {
				if (i - 1 > 0) {
					helpVariable = this.stringNumber.charAt(i - 1);
					if (helpVariable == ',') {
						arbcNumber += 20000;
					} else {
						arbcNumber += 20;
					}
				} else {
					arbcNumber += 20;
				}
			}
			if (character == 'Ë')
				arbcNumber += 30;
			if (character == 'Ì')
				arbcNumber += 40;
			if (character == 'Í') {
				if (i - 1 > 0) {
					helpVariable = this.stringNumber.charAt(i - 1);
					if (helpVariable == ',') {
						arbcNumber += 50000;
					} else {
						arbcNumber += 50;
					}
				} else {
					arbcNumber += 50;
				}
			}
			if (character == 'Î')
				arbcNumber += 60;
			if (character == 'Ï')
				arbcNumber += 70;
			if (character == 'Ð')
				arbcNumber += 80;
			if (character == 'Q')
				arbcNumber += 90;
			if (character == 'Ñ') {
				if (i - 1 > 0) {
					helpVariable = this.stringNumber.charAt(i - 1);
					if (helpVariable == ',') {
						arbcNumber += 100000;
					} else {
						arbcNumber += 100;
					}
				} else {
					arbcNumber += 100;
				}
			}
			if (character == 'Ó')
				arbcNumber += 200;
			if (character == 'Ô')
				arbcNumber += 300;
			if (character == 'Õ')
				arbcNumber += 400;
			if (character == 'Ö')
				arbcNumber += 500;
			if (character == '×')
				arbcNumber += 600;
			if (character == 'Ø')
				arbcNumber += 700;
			if (character == 'Ù')
				arbcNumber += 800;
			if (character == 'W')
				arbcNumber += 900;
			if (character == ',') {
				continue;
			}
		}
		return arbcNumber;
	}

	public int romanToArabic() {
		char character;
		int arbcNumber = 0, position = 500;
		char[] letters = { 'I', 'V', 'X', 'L', 'C', 'D', 'M' };
		for (int i = 0; i < this.stringNumber.length(); i++) {
			character = this.stringNumber.charAt(i);
			if (character == letters[0]) {
				if (i + 1 < this.stringNumber.length()) {
					if (this.stringNumber.charAt(i + 1) == 'X') {
						arbcNumber += 9;
						break;
					} else if (this.stringNumber.charAt(i + 1) == 'V') {
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
}