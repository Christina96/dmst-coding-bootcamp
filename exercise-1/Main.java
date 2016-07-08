/**
 * @author Christina Zacharoula Chaniotaki
 *
 */

/**
 * The program asks the user a numerical expression from three numerals system:
 * Greek numeral system
 * Roman numeral system
 * Hindu-Arabic Numeral
 * Are supported the arithmetic operation (+, -, *, /)
 * The numerical expression can contain numbers from any of those three numeral systems
 * It works for numbers > 1000.
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArabicNumerals arabic = new ArabicNumerals();
		GreekNumerals greek = new GreekNumerals();
		RomanNumerals roman = new RomanNumerals();
		int lengthStr1, number1, number2, length, numericResult;
		String strNumber1, strNumber2;
		char symbol;
		System.out.print("Please type the numeric expression or type ENTER to exit: ");
		String numericalExpression = input.nextLine();
		length = numericalExpression.length();
		while (length != 0) {// to ekana na termatizei me enter komple
			strNumber1 = Character.toString(numericalExpression.charAt(0));
			lengthStr1 = 1;
			while (lengthStr1 < length && numericalExpression.charAt(lengthStr1) != '+'
					&& numericalExpression.charAt(lengthStr1) != '-' && numericalExpression.charAt(lengthStr1) != '/'
					&& numericalExpression.charAt(lengthStr1) != '*') {
				strNumber1 = strNumber1 + numericalExpression.charAt(lengthStr1);
				lengthStr1 += 1;
			}
			symbol = numericalExpression.charAt(lengthStr1);
			strNumber2 = Character.toString(numericalExpression.charAt(lengthStr1 + 1));
			for (int j = lengthStr1 + 2; j < length; j++) {
				strNumber2 = strNumber2 + numericalExpression.charAt(j);
			}
			number1 = arabic.conversionÔoArabic(strNumber1);
			number2 = arabic.conversionÔoArabic(strNumber2);
			if (symbol == '+') {
				numericResult = number1 + number2;
			} else if (symbol == '-') {
				numericResult = Math.abs(number1 - number2);
			} else if (symbol == '*') {
				numericResult = number1 * number2;
			} else {
				numericResult = number1 / number2;
			}
			System.out.println(
					"Hindu-Arabic numeral system:" + number1 + " " + symbol + " " + number2 + " =  " + numericResult);
			System.out.println("Roman numeral system:" + roman.arabicToRoman(number1) + " " + symbol + " "
					+ roman.arabicToRoman(number2) + " =  " + roman.arabicToRoman(numericResult));
			System.out.println("Greek numeral system:" + greek.arabicToGreek(number1) + " " + symbol + " "
					+ greek.arabicToGreek(number2) + " =  " + greek.arabicToGreek(numericResult));
			System.out.print("Please type the numeric expression or type ENTER to exit: ");
			numericalExpression = input.nextLine();
			length = numericalExpression.length();
		}
		if (input != null)
			input.close();
	}
}