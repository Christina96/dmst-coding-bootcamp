/**
 * @author Christina Zacharoula Chaniotaki
 *
 */
import java.util.Scanner;
//δουλευουν και τα ελληνικα!
//το μονο που μενει ειναι να σπαω την εκφραση
//θα την σπαω οταν βρισκω το + - / *
public class Askhsh1 {

	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Παρακαλω pliktorligiste thn ar9thmitiki ekfrash: ");
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
			System.out.println(ekfrash1+" "+sumvolo+" "+ekfrash2);
			//spame teleia kai thn arithmitiki ekfrash!
			//ara tora tha prepei na vriskoume pio systhma einai
			//to elliniko einai me grammata
			//den exo thema einai ksexoristoi oi ksenoi apo tous ellinikous xarakthres
			number1=arabic.metatrophSeInt(ekfrash1);
			number2=arabic.metatrophSeInt(ekfrash2);
			System.out.println(number1);
			System.out.println(number2);
			if (sumvolo=='+'){
				apotelesma=number1+number2;
			}else if (sumvolo=='-'){
				apotelesma=Math.abs(number1-number2);
			}else if (sumvolo=='*'){
				apotelesma=number1*number2;
			}else{
				apotelesma=number1/number2;
			}
			//kano kai thn praksh
			//tora m menei na ta metatrepso sto antistoixo systhma. eexo to araviko thelo elliniko kai roman
			System.out.println("arabic="+apotelesma);
			System.out.println("roman="+roman.arabicToRoman(apotelesma));

			System.out.println("Παρακαλω pliktorligiste thn ar9thmitiki ekfrash: ");
			ekfrash=input.nextLine();
			mhkos=ekfrash.length();
		}
	}//μαλλον δοθλεθει και το ελλινικο. παμε τωρα να κανουμε μετατροπ απο το αραβικο στο ρομαικο


}