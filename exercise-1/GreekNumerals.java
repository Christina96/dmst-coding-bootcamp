/**
 * @author Christina Zacharoula Chaniotaki
 *
 */

/**
 * 
 * The class has two methods. The method greekNumerals converts the string into
 * Arabic numeral system and method arabicToGreek converts the Arabic numeral in
 * Greek numeral system. I work using if..else. It works for numbers > 1000.
 *
 */

public class GreekNumerals {
	public int greekNumerals(String grNumber) {
		char character, helpVariable;
		int arbcNumber = 0;
		for (int i = 0; i < grNumber.length(); i++) {
			character = grNumber.charAt(i);
			if (character == 'Á') {
				helpVariable = grNumber.charAt(i - 1);
				if (helpVariable == ',') {
					arbcNumber += 1000;
				} else {
					arbcNumber += 1;
				}
			}
			if (character == 'Â') {
				helpVariable = grNumber.charAt(i - 1);
				if (helpVariable == ',') {
					arbcNumber += 2000;
				} else {
					arbcNumber += 2;
				}
			}
			if (character == 'Ã') {
				helpVariable = grNumber.charAt(i - 1);
				if (helpVariable == ',') {
					arbcNumber += 3000;
				} else {
					arbcNumber += 3;
				}
			}
			if (character == 'Ä') {
				helpVariable = grNumber.charAt(i - 1);
				if (helpVariable == ',') {
					arbcNumber += 4000;
				} else {
					arbcNumber += 4;
				}
			}
			if (character == 'Å') {
				helpVariable = grNumber.charAt(i - 1);
				if (helpVariable == ',') {
					arbcNumber += 5000;
				} else {
					arbcNumber += 5;
				}
			}
			if (character == 'ò') {
				helpVariable = grNumber.charAt(i - 1);
				if (helpVariable == ',') {
					arbcNumber += 6000;
				} else {
					arbcNumber += 6;
				}
			}
			if (character == 'Æ') {
				helpVariable = grNumber.charAt(i - 1);
				if (helpVariable == ',') {
					arbcNumber += 7000;
				} else {
					arbcNumber += 7;
				}
			}
			if (character == 'Ç') {
				helpVariable = grNumber.charAt(i - 1);
				if (helpVariable == ',') {
					arbcNumber += 8000;
				} else {
					arbcNumber += 8;
				}
			}
			if (character == 'È') {
				helpVariable = grNumber.charAt(i - 1);
				if (helpVariable == ',') {
					arbcNumber += 9000;
				} else {
					arbcNumber += 9;
				}
			}
			if (character == 'É') {
				if (i - 1 > 0) {
					helpVariable = grNumber.charAt(i - 1);
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
					helpVariable = grNumber.charAt(i - 1);
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
					helpVariable = grNumber.charAt(i - 1);
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
					helpVariable = grNumber.charAt(i - 1);
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

	public String arabicToGreek(int number) {
		String strGreek = "";
		if (number / 100000 != 0) {
			for (int i = 0; i < (number / 100000); i++) {
				strGreek += ",Ñ";
			}
			number = number % 100000;
		}
		if (number / 50000 == 1) {
			strGreek += ",Í";
			number = number % 50000;
		}
		if (number / 20000 == 1) {
			strGreek += ",K";
			number = number % 20000;
		}
		if (number / 10000 != 0) {
			for (int i = 0; i < (number / 10000); i++) {
				strGreek += ",É";
			}
			number = number % 10000;
		}
		if (number / 9000 == 1) {
			strGreek += ",È";
			number = number % 9000;
		}
		if (number / 8000 == 1) {
			strGreek += ",H";
			number = number % 8000;
		}
		if (number / 7000 == 1) {
			strGreek += ",Æ";
			number = number % 7000;
		}
		if (number / 6000 == 1) {
			strGreek += ",ò";
			number = number % 6000;
		}
		if (number / 5000 == 1) {
			strGreek += ",Å";
			number %= 5000;
		}
		if (number / 4000 == 1) {
			strGreek += ",Ä";
			number %= 4000;
		}
		if (number / 3000 == 1) {
			strGreek += ",Ã";
			number %= 3000;
		}
		if (number / 2000 == 1) {
			strGreek += ",Â";
			number %= 2000;
		}
		if (number / 1000 == 1) {
			strGreek += ",Á";
			number %= 1000;
		}
		if (number / 900 == 1) {
			strGreek += "W";
			number %= 900;
		}
		if (number / 800 == 1) {
			strGreek += "Ù";
			number %= 800;
		}
		if (number / 700 == 1) {
			strGreek += "Ø";
			number %= 700;
		}
		if (number / 600 == 1) {
			strGreek += "×";
			number %= 600;
		}
		if (number / 500 == 1) {
			strGreek += "Ö";
			number %= 500;
		}
		if (number / 400 == 1) {
			strGreek += "Õ";
			number %= 400;
		}
		if (number / 300 == 1) {
			strGreek += "Ô";
			number %= 300;
		}
		if (number / 200 == 1) {
			strGreek += "Ó";
			number %= 200;
		}
		if (number / 100 == 1) {
			strGreek += "Ñ";
			number %= 100;
		}
		if (number / 90 == 1) {
			strGreek += "Q";
			number %= 90;
		}
		if (number / 80 == 1) {
			strGreek += "Ð";
			number %= 80;
		}
		if (number / 70 == 1) {
			strGreek += "Ï";
			number %= 70;
		}
		if (number / 60 == 1) {
			strGreek += "Î";
			number %= 60;
		}
		if (number / 50 == 1) {
			strGreek += "Í";
			number %= 50;
		}
		if (number / 40 == 1) {
			strGreek += "Ì";
			number %= 40;
		}
		if (number / 30 == 1) {
			strGreek += "Ë";
			number %= 30;
		}
		if (number / 20 == 1) {
			strGreek += "Ê";
			number %= 20;
		}
		if (number / 10 == 1) {
			strGreek += "É";
			number %= 10;
		}
		if (number / 9 == 1) {
			strGreek += "È";
			number %= 9;
		}
		if (number / 8 == 1) {
			strGreek += "Ç";
			number %= 8;
		}
		if (number / 7 == 1) {
			strGreek += "Æ";
			number %= 7;
		}
		if (number / 6 == 1) {
			strGreek += "ò";
			number %= 6;
		}
		if (number / 5 == 1) {
			strGreek += "Å";
			number %= 5;
		}
		if (number / 4 == 1) {
			strGreek += "Ä";
			number %= 4;
		}
		if (number / 3 == 1) {
			strGreek += "Ã";
			number %= 3;
		}
		if (number / 2 == 1) {
			strGreek += "Â";
			number %= 2;
		}
		for (int i = 0; i < number; i++) {
			strGreek += "Á";
		}
		return strGreek;
	}
}