public class RomanNumerals{
	public int romanNumerals (String x){
		//prepei na spaso ton arithmo kai analoga me to gramam na prostheto
		char gramma;
		int arithmos=0, thesi=500;
		char [] grammata = {'I','V','X','L','C','D','M'};
		for (int i=0;i<x.length();i++){
			gramma=x.charAt(i);
			if (gramma== grammata[0]){
				if (i+1<x.length()){
					if (x.charAt(i+1)=='X'){
						arithmos=arithmos+9;
						break;
					}else if (x.charAt(i+1)=='V'){
						arithmos=arithmos+4;
						break;
					}
				}
				if (thesi >= 0){
					arithmos=arithmos+1;
				} else {
					arithmos=Math.abs(arithmos-1);
				}
				thesi=0;
				//System.out.println(arithmos);
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
				} else{
					arithmos=Math.abs(arithmos-10);
				}
				thesi=2;
				//System.out.println(arithmos);
			}
			if (gramma==grammata[3]){
				if (thesi >= 3 && thesi!=2){
					arithmos=arithmos+50;
				} else if (thesi < 3 && thesi!=2) {
					arithmos=Math.abs(arithmos-50);
				}else{
					arithmos=arithmos+30;
				}
				thesi=3;
				//System.out.println(arithmos);
			}
			if (gramma==grammata[4]){
				if (thesi >= 4 && thesi!=2){
					arithmos=arithmos+100;
				} else if (thesi <4 && thesi!=2){
					arithmos=Math.abs(arithmos-100);
				}else{
					arithmos=arithmos+80;
				}
				thesi=4;
				//System.out.println(arithmos);
			}
			if (gramma==grammata[5] ){
				if (thesi >= 5 && thesi!=4){
					arithmos=arithmos+500;
				} else if(thesi<5 && thesi!=4){
					arithmos=Math.abs(arithmos-500);
				}else{
					arithmos=arithmos+300;
				}
				thesi=5;
				//System.out.println(arithmos);
			}
			if (gramma==grammata[6]){
				if (thesi >= 6 && thesi != 4){
					arithmos=arithmos+1000;
				} else if (thesi < 6 && thesi!=4){
					arithmos=Math.abs(arithmos-1000);
				}else{
					arithmos=arithmos+800;
				}
				thesi=6;
				//System.out.println(arithmos);
			}
		}
		return arithmos;
	}
	public String arabicToRoman(int aa){
			String s="";
			if (aa/1000!=0){
				for (int i=0;i<(aa/1000);i++)
					s=s+"M";
				aa=aa%1000;
			}
			if (aa/900==1){
				s=s+"CM";
				aa=aa%900;
			}
			if (aa/500==1){
				s=s+"D";
				aa=aa%500;
			}
			if (aa/400==1){
				s=s+"CD";
				aa=aa%400;
			}
			if (aa/100!=0){
				for (int i=0;i<(aa/100);i++){
					s=s+"C";
				}
				aa=aa%100;
			}
			if (aa/90==1){
				s=s+"XC";
				aa=aa%90;
			}
			if (aa/50==1){
				s=s+"L";
				aa=aa%50;
			}
			if (aa/40==1){
				s=s+"XL";
				aa=aa%40;
			}
			if (aa/10!=0){
				for (int i=0;i<(aa/10);i++){
					s=s+"X";
				}
				aa=aa%10;
			}
			if (aa/9==1){
				s=s+"IX";
				aa=aa%9;
			}
			if (aa/5==1){
				s=s+"V";
				aa=aa%5;
			}
			if (aa/4==1){
				s=s+"IV";
				aa=aa%4;
			}
			for (int i=0;i<aa;i++){
				s=s+"I";
			}
			return s;
	}
}