public class GreekNumerals{
	public int greekNumerals (String x){
		//prepei na spaso ton arithmo kai analoga me to gramam na prostheto
		char gramma;
		char voithima;
		int arithmos=0;
		System.out.println(x);
		for (int i=0;i<x.length();i++){
			gramma=x.charAt(i);
			System.out.println(gramma);
			if (gramma=='�'){
				voithima=x.charAt(i-1);
				if (voithima==','){
					arithmos=arithmos+1000;
				} else {
					arithmos=arithmos+1;
				}
			}
			if (gramma=='�'){
				voithima=x.charAt(i-1);
				if (voithima==','){
					arithmos=arithmos+2000;
				} else {
					arithmos=arithmos+2;
				}
			}
			if (gramma=='�'){
				voithima=x.charAt(i-1);
				if (voithima==','){
					arithmos=arithmos+3000;
				} else {
					arithmos=arithmos+3;
				}
			}
			if (gramma=='�'){
				voithima=x.charAt(i-1);
				if (voithima==','){
					arithmos=arithmos+4000;
				} else {
					arithmos=arithmos+4;
				}
			}
			if (gramma=='�'){
				voithima=x.charAt(i-1);
				if (voithima==','){
					arithmos=arithmos+5000;
				} else {
					arithmos=arithmos+5;
				}
			}
			if (gramma=='�'){
				voithima=x.charAt(i-1);
				if (voithima==','){
					arithmos=arithmos+6000;
				} else {
					arithmos=arithmos+6;
				}
			}
			if (gramma=='�'){
				voithima=x.charAt(i-1);
				if (voithima==','){
					arithmos=arithmos+7000;
				}else{
					arithmos=arithmos+7;
				}
			}
			if (gramma=='�'){
				voithima=x.charAt(i-1);
				if (voithima==','){
					arithmos=arithmos+8000;
				} else {
					arithmos=arithmos+8;
				}
			}
			if (gramma=='�'){
				voithima=x.charAt(i-1);
				if (voithima==','){
					arithmos=arithmos+9000;
				} else {
					arithmos=arithmos+9;
				}
			}
			if (gramma=='�')
				arithmos=arithmos+10;
			if (gramma=='�')
				arithmos=arithmos+20;
			if (gramma=='�')
				arithmos=arithmos+30;
			if (gramma=='�')
				arithmos=arithmos+40;
			if (gramma=='�')
				arithmos=arithmos+50;
			if (gramma=='�')
				arithmos=arithmos+60;
			if (gramma=='�')
				arithmos=arithmos+70;
			if (gramma=='�')
				arithmos=arithmos+80;
			if (gramma=='Q')
				arithmos=arithmos+90;
			if (gramma=='�')
				arithmos=arithmos+100;
			if (gramma=='�')
				arithmos=arithmos+200;
			if (gramma=='�')
				arithmos=arithmos+300;
			if (gramma=='�')
				arithmos=arithmos+400;
			if (gramma=='�')
				arithmos=arithmos+500;
			if (gramma=='�')
				arithmos=arithmos+600;
			if (gramma=='�')
				arithmos=arithmos+700;
			if (gramma=='�')
				arithmos=arithmos+800;
			if (gramma=='�')
				arithmos=arithmos+900;
			if (gramma==','){
				continue;
			}
		}
		return arithmos;
	}
}