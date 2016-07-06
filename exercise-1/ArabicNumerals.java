public class ArabicNumerals {
	public int metatrophSeInt(String ekfrash1){
		RomanNumerals roman = new RomanNumerals();
		GreekNumerals greek = new GreekNumerals();
		int number;
		if (ekfrash1.charAt(0)!= 'I' && ekfrash1.charAt(0)!= 'V' && ekfrash1.charAt(0)!= 'X' && ekfrash1.charAt(0)!= 'L' && ekfrash1.charAt(0)!= 'C' && ekfrash1.charAt(0)!= 'D' && ekfrash1.charAt(0)!= 'M'){
			//den einai roman
			//ara prepei na do an einai elliniko i araviko.
			if (ekfrash1.charAt(0)!= '0' && ekfrash1.charAt(0)!= '1' && ekfrash1.charAt(0)!= '2' && ekfrash1.charAt(0)!= '3' && ekfrash1.charAt(0)!= '4' && ekfrash1.charAt(0)!= '5' && ekfrash1.charAt(0)!= '6' && ekfrash1.charAt(0)!= '7' && ekfrash1.charAt(0)!= '8' && ekfrash1.charAt(0)!= '9'){
				//den einai oute to araviko ara einai to elliniko
				number = greek.greekNumerals(ekfrash1);
			}else{
				//einai to araviko
				number = Integer.parseInt(ekfrash1);
			}
		}else{
			//einai to romaiko
			number = roman.romanNumerals(ekfrash1);
		}
		return number;
	}
}