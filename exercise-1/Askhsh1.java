/**
 * @author Christina Zacharoula Chaniotaki
 *
 */
import java.util.Scanner;
//δουλευουν και τα ελληνικα!
//θα την σπαω οταν βρισκω το + - / *
public class Askhsh1 {

	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please type the numeric expression or type ENTER to exit: ");
		String ekfrash= input.nextLine();
		int mhkos=ekfrash.length();
		int i,number1,number2;
		String ekfrash1, ekfrash2;
		char sumvolo;
		int apotelesma;
		ArabicNumerals arabic = new ArabicNumerals();
		GreekNumerals greek=new GreekNumerals();
		RomanNumerals roman=new RomanNumerals();
		while (mhkos!=0){//to ekana na termatizei me enter komple
			ekfrash1=Character.toString(ekfrash.charAt(0));
			i =1;
			while (i<mhkos && ekfrash.charAt(i)!= '+'  && ekfrash.charAt(i)!= '-'  && ekfrash.charAt(i)!= '/'  && ekfrash.charAt(i)!= '*' ){
				ekfrash1=ekfrash1+ekfrash.charAt(i);
				i=i+1;
			}
			//sunexizo apo to i
			sumvolo=ekfrash.charAt(i);
			ekfrash2=Character.toString(ekfrash.charAt(i+1));
			for (int j=i+2; j<mhkos;j++){
				ekfrash2=ekfrash2+ekfrash.charAt(j);
			}
			number1=arabic.metatrophSeInt(ekfrash1);
			number2=arabic.metatrophSeInt(ekfrash2);
			if (sumvolo=='+'){
				apotelesma=number1+number2;
			}else if (sumvolo=='-'){
				apotelesma=Math.abs(number1-number2);
			}else if (sumvolo=='*'){
				apotelesma=number1*number2;
			}else{
				apotelesma=number1/number2;
			}
			System.out.println("Hindu-Arabic numeral system:"+number1+" "+sumvolo+" "+number2+" =  "+apotelesma);
			System.out.println("Roman numeral system:"+roman.arabicToRoman(number1)+" "+sumvolo+" "+roman.arabicToRoman(number2)+" =  "+roman.arabicToRoman(apotelesma));
			System.out.println("Greek numeral system:"+greek.arabicToGreek(number1)+" "+sumvolo+" "+greek.arabicToGreek(number2)+" =  "+greek.arabicToGreek(apotelesma));
			System.out.print("Please type the numeric expression or type ENTER to exit: ");
			ekfrash=input.nextLine();
			mhkos=ekfrash.length();
		}
	}
}