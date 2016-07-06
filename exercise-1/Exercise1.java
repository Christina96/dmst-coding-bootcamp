/**
 * @author Christina Zacharoula Chaniotaki
 *
 */
import java.util.Scanner;
//δουλευουν και τα ελληνικα!
//το μονο που μενει ειναι να σπαω την εκφραση
//θα την σπαω οταν βρισκω το + - / *
public class Exercise1 {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Παρακαλω pliktorligiste thn ar9thmitiki ekfrash: ");
		String ekfrash= input.nextLine();
		int mhkos=ekfrash.length();
		int i,number1,number2;
		String ekfrash1, ekfrash2;
		char sumvolo;
		int apotelesma;
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
			number1=metatrophSeInt(ekfrash1);
			number2=metatrophSeInt(ekfrash2);
			System.out.println(number1);
			System.out.println(number2);
			if (sumvolo=='+'){
				apotelesma=number1+number2;
			}else if (sumvolo=='-'){
				apotelesma=Math.abs(number1-number2);
			}else if (sumvolo=='*'){
				apotelesma=number1*number2;
			}else if (sumvolo=='/'){
				apotelesma=number1/number2;
			}
			//kano kai thn praksh
			//tora m menei na ta metatrepso sto antistoixo systhma. eexo to araviko thelo elliniko kai roman


			System.out.println("Παρακαλω pliktorligiste thn ar9thmitiki ekfrash: ");
			ekfrash=input.nextLine();
			mhkos=ekfrash.length();
		}
	}
	//public static String arabictoroman(int aa){

	//}
	public static int romanNumerals (String x){
			//prepei na spaso ton arithmo kai analoga me to gramam na prostheto
			char gramma;
			int arithmos=0, thesi=500;
			char [] grammata = {'I','V','X','L','C','D','M'};
			for (int i=0;i<x.length();i++){
				gramma=x.charAt(i);
				if (gramma== grammata[0]){
					if (thesi >= 0){
						arithmos=arithmos+1;
					} else {
						arithmos=Math.abs(arithmos-1);
					}
					thesi=0;
				}

				if (gramma==grammata[1]){
					if (thesi >= 1){
						arithmos=arithmos+5;
					} else {
						arithmos=Math.abs(arithmos-5);
					}
					thesi=1;
				}
				if (gramma==grammata[2]){
					if (thesi >= 2){
						arithmos=arithmos+10;
					} else {
						arithmos=Math.abs(arithmos-10);
					}
					thesi=2;
				}
				if (gramma==grammata[3]){
					if (thesi >= 3){
						arithmos=arithmos+50;
					} else {
						arithmos=Math.abs(arithmos-50);
					}
					thesi=3;
				}
				if (gramma==grammata[4]){
					if (thesi >= 4){
						arithmos=arithmos+100;
					} else {
						arithmos=Math.abs(arithmos-100);
					}
					thesi=4;
				}
				if (gramma==grammata[5] ){
					if (thesi >= 5){
						arithmos=arithmos+500;
					} else {
						arithmos=Math.abs(arithmos-500);
					}
					thesi=5;
				}
				if (gramma==grammata[6]){
					if (thesi >= 6){
						arithmos=arithmos+1000;
					} else {
						arithmos=Math.abs(arithmos-1000);
					}
					thesi=6;
				}
			}
			return arithmos;
	}
	public static int greekNumerals (String x){
		//prepei na spaso ton arithmo kai analoga me to gramam na prostheto
		char gramma;
		char voithima;
		int arithmos=0;
		System.out.println(x);
		for (int i=0;i<x.length();i++){
			gramma=x.charAt(i);
			System.out.println(gramma);
			if (gramma=='Α'){
				voithima=x.charAt(i-1);
				if (voithima==','){
					arithmos=arithmos+1000;
				} else {
					arithmos=arithmos+1;
				}
			}
			if (gramma=='Β'){
				voithima=x.charAt(i-1);
				if (voithima==','){
					arithmos=arithmos+2000;
				} else {
					arithmos=arithmos+2;
				}
			}
			if (gramma=='Γ'){
				voithima=x.charAt(i-1);
				if (voithima==','){
					arithmos=arithmos+3000;
				} else {
					arithmos=arithmos+3;
				}
			}
			if (gramma=='Δ'){
				voithima=x.charAt(i-1);
				if (voithima==','){
					arithmos=arithmos+4000;
				} else {
					arithmos=arithmos+4;
				}
			}
			if (gramma=='Ε'){
				voithima=x.charAt(i-1);
				if (voithima==','){
					arithmos=arithmos+5000;
				} else {
					arithmos=arithmos+5;
				}
			}
			if (gramma=='ς'){
				voithima=x.charAt(i-1);
				if (voithima==','){
					arithmos=arithmos+6000;
				} else {
					arithmos=arithmos+6;
				}
			}
			if (gramma=='Ζ'){
				voithima=x.charAt(i-1);
				if (voithima==','){
					arithmos=arithmos+7000;
				}else{
					arithmos=arithmos+7;
				}
			}
			if (gramma=='Η'){
				voithima=x.charAt(i-1);
				if (voithima==','){
					arithmos=arithmos+8000;
				} else {
					arithmos=arithmos+8;
				}
			}
			if (gramma=='Θ'){
				voithima=x.charAt(i-1);
				if (voithima==','){
					arithmos=arithmos+9000;
				} else {
					arithmos=arithmos+9;
				}
			}
			if (gramma=='Ι')
				arithmos=arithmos+10;
			if (gramma=='Κ')
				arithmos=arithmos+20;
			if (gramma=='Λ')
				arithmos=arithmos+30;
			if (gramma=='Μ')
				arithmos=arithmos+40;
			if (gramma=='Ν')
				arithmos=arithmos+50;
			if (gramma=='Ξ')
				arithmos=arithmos+60;
			if (gramma=='Ο')
				arithmos=arithmos+70;
			if (gramma=='Π')
				arithmos=arithmos+80;
			if (gramma=='Q')
				arithmos=arithmos+90;
			if (gramma=='Ρ')
				arithmos=arithmos+100;
			if (gramma=='Σ')
				arithmos=arithmos+200;
			if (gramma=='Τ')
				arithmos=arithmos+300;
			if (gramma=='Υ')
				arithmos=arithmos+400;
			if (gramma=='Φ')
				arithmos=arithmos+500;
			if (gramma=='Χ')
				arithmos=arithmos+600;
			if (gramma=='Ψ')
				arithmos=arithmos+700;
			if (gramma=='Ω')
				arithmos=arithmos+800;
			if (gramma=='Τ')
				arithmos=arithmos+900;
			if (gramma==','){
				continue;
			}
		}
		return arithmos;
	}
	public static int metatrophSeInt(String ekfrash1){
		int number;
		if (ekfrash1.charAt(0)!= 'I' && ekfrash1.charAt(0)!= 'V' && ekfrash1.charAt(0)!= 'X' && ekfrash1.charAt(0)!= 'L' && ekfrash1.charAt(0)!= 'C' && ekfrash1.charAt(0)!= 'D' && ekfrash1.charAt(0)!= 'M'){
			//den einai roman
			//ara prepei na do an einai elliniko i araviko.
			if (ekfrash1.charAt(0)!= '0' && ekfrash1.charAt(0)!= '1' && ekfrash1.charAt(0)!= '2' && ekfrash1.charAt(0)!= '3' && ekfrash1.charAt(0)!= '4' && ekfrash1.charAt(0)!= '5' && ekfrash1.charAt(0)!= '6' && ekfrash1.charAt(0)!= '7' && ekfrash1.charAt(0)!= '8' && ekfrash1.charAt(0)!= '9'){
				//den einai oute to araviko ara einai to elliniko
				number = greekNumerals(ekfrash1);
			}else{
				//einai to araviko
				number = Integer.parseInt(ekfrash1);
			}
		}else{
			//einai to romaiko
			number = romanNumerals(ekfrash1);
		}
		return number;
	}
}