package maven;

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
		int lengthStr1, number1, number2, length, numericResult;
		String strNumber1, strNumber2;
		char symbol;
		System.out.print("Please type the numeric expression or type ENTER to exit: ");
		String numericalExpression = input.nextLine();
		length = numericalExpression.length();
		while (length != 0) {
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
			ArabicNumerals arb1 = new ArabicNumerals(strNumber1);
			ArabicNumerals arb2 = new ArabicNumerals(strNumber2);
			number1 = arb1.conversionÔoArabic();
			number2 = arb2.conversionÔoArabic();
			if (symbol == '+') {
				numericResult = number1 + number2;
			} else if (symbol == '-') {
				numericResult = Math.abs(number1 - number2);
			} else if (symbol == '*') {
				numericResult = number1 * number2;
			} else {
				numericResult = number1 / number2;
			}
			GreekNumerals greek1 = new GreekNumerals(number1);
			RomanNumerals roman1 = new RomanNumerals(number1);
			GreekNumerals greek2 = new GreekNumerals(number2);
			RomanNumerals roman2 = new RomanNumerals(number2);
			GreekNumerals greekResult = new GreekNumerals(numericResult);
			RomanNumerals romanResult = new RomanNumerals(numericResult);
			System.out.println(
					"Hindu-Arabic numeral system:" + number1 + " " + symbol + " " + number2 + " =  " + numericResult);
			System.out.println("Roman numeral system:" + roman1.arabicToRoman() + " " + symbol + " "
					+ roman2.arabicToRoman() + " =  " + romanResult.arabicToRoman());
			System.out.println("Greek numeral system:" + greek1.arabicToGreek() + " " + symbol + " "
					+ greek2.arabicToGreek() + " =  " + greekResult.arabicToGreek());
			System.out.print("Please type the numeric expression or type ENTER to exit: ");
			numericalExpression = input.nextLine();
			length = numericalExpression.length();
		}
		if (input != null)
			input.close();
	}
}