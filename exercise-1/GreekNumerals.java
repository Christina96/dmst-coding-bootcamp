public class GreekNumerals{
	public int greekNumerals (String x){
		//prepei na spaso ton arithmo kai analoga me to gramam na prostheto
		char gramma;
		char voithima;
		int arithmos=0;
		for (int i=0;i<x.length();i++){
			gramma=x.charAt(i);
			if (gramma=='Á'){
				voithima=x.charAt(i-1);
				if (voithima==','){
					arithmos=arithmos+1000;
				} else {
					arithmos=arithmos+1;
				}
			}
			if (gramma=='Â'){
				voithima=x.charAt(i-1);
				if (voithima==','){
					arithmos=arithmos+2000;
				} else {
					arithmos=arithmos+2;
				}
			}
			if (gramma=='Ã'){
				voithima=x.charAt(i-1);
				if (voithima==','){
					arithmos=arithmos+3000;
				} else {
					arithmos=arithmos+3;
				}
			}
			if (gramma=='Ä'){
				voithima=x.charAt(i-1);
				if (voithima==','){
					arithmos=arithmos+4000;
				} else {
					arithmos=arithmos+4;
				}
			}
			if (gramma=='Å'){
				voithima=x.charAt(i-1);
				if (voithima==','){
					arithmos=arithmos+5000;
				} else {
					arithmos=arithmos+5;
				}
			}
			if (gramma=='ò'){
				voithima=x.charAt(i-1);
				if (voithima==','){
					arithmos=arithmos+6000;
				} else {
					arithmos=arithmos+6;
				}
			}
			if (gramma=='Æ'){
				voithima=x.charAt(i-1);
				if (voithima==','){
					arithmos=arithmos+7000;
				}else{
					arithmos=arithmos+7;
				}
			}
			if (gramma=='Ç'){
				voithima=x.charAt(i-1);
				if (voithima==','){
					arithmos=arithmos+8000;
				} else {
					arithmos=arithmos+8;
				}
			}
			if (gramma=='È'){
				voithima=x.charAt(i-1);
				if (voithima==','){
					arithmos=arithmos+9000;
				} else {
					arithmos=arithmos+9;
				}
			}
			if (gramma=='É'){
				if (i-1>0){
					voithima=x.charAt(i-1);
					if (voithima==','){
						arithmos=arithmos+10000;
					} else {
						arithmos=arithmos+10;
					}
				}else{
					arithmos=arithmos+10;
				}
			}
			if (gramma=='Ê'){
				if (i-1>0){
					voithima=x.charAt(i-1);
					if (voithima==','){
						arithmos=arithmos+20000;
					} else {
						arithmos=arithmos+20;
					}
				}else{
					arithmos=arithmos+20;
				}
			}
			if (gramma=='Ë')
				arithmos=arithmos+30;
			if (gramma=='Ì')
				arithmos=arithmos+40;
			if (gramma=='Í'){
				if (i-1>0){
					voithima=x.charAt(i-1);
					if (voithima==','){
						arithmos=arithmos+50000;
					} else {
						arithmos=arithmos+50;
					}
				}else{
					arithmos=arithmos+50;
				}
			}
			if (gramma=='Î')
				arithmos=arithmos+60;
			if (gramma=='Ï')
				arithmos=arithmos+70;
			if (gramma=='Ð')
				arithmos=arithmos+80;
			if (gramma=='Q')
				arithmos=arithmos+90;
			if (gramma=='Ñ'){
				if (i-1>0){
					voithima=x.charAt(i-1);
					if (voithima==','){
						arithmos=arithmos+100000;
					} else {
						arithmos=arithmos+100;
					}
				}else{
					arithmos=arithmos+100;
				}
			}
			if (gramma=='Ó')
				arithmos=arithmos+200;
			if (gramma=='Ô')
				arithmos=arithmos+300;
			if (gramma=='Õ')
				arithmos=arithmos+400;
			if (gramma=='Ö')
				arithmos=arithmos+500;
			if (gramma=='×')
				arithmos=arithmos+600;
			if (gramma=='Ø')
				arithmos=arithmos+700;
			if (gramma=='Ù')
				arithmos=arithmos+800;
			if (gramma=='W')
				arithmos=arithmos+900;
			if (gramma==','){
				continue;
			}
		}
		return arithmos;
	}
	public String arabicToGreek(int a){
		String s="";
		if (a/100000!=0){
			for (int i=0;i<(a/100000);i++){
				s=s+",Ñ";
			}
			a=a%100000;
		}
		if (a/50000==1){
			s=s+",Í";
			a=a%50000;
		}
		if (a/20000==1){
			s=s+",K";
			a=a%20000;
		}
		if (a/10000!=0){
			for (int i=0;i<(a/10000);i++){
				s=s+",É";
			}
			a=a%10000;
		}
		if (a/9000==1){
			s=s+",È";
			a=a%9000;
		}
		if (a/8000==1){
			s=s+",H";
			a=a%8000;
		}
		if (a/7000==1){
			s=s+",Æ";
			a=a%7000;
		}
		if (a/6000==1){
			s=s+",ò";
			a=a%6000;
		}
		if (a/5000==1){
			s=s+",Å";
			a=a%5000;
		}
		if (a/4000==1){
			s=s+",Ä";
			a=a%4000;
		}
		if (a/3000==1){
			s=s+",Ã";
			a=a%3000;
		}
		if (a/2000==1){
			s=s+",Â";
			a=a%2000;
		}
		if (a/1000==1){
			s=s+",Á";
			a=a%1000;
		}
		if (a/900==1){
			s=s+"W";
			a=a%900;
		}
		if (a/800==1){
			s=s+"Ù";
			a=a%800;
		}
		if (a/700==1){
			s=s+"Ø";
			a=a%700;
		}
		if (a/600==1){
			s=s+"×";
			a=a%600;
		}
		if (a/500==1){
			s=s+"Ö";
			a=a%500;
		}
		if (a/400==1){
			s=s+"Õ";
			a=a%400;
		}
		if (a/300==1){
			s=s+"Ô";
			a=a%300;
		}
		if (a/200==1){
			s=s+"Ó";
			a=a%200;
		}
		if (a/100==1){
			s=s+"Ñ";
			a=a%100;
		}
		if (a/90==1){
			s=s+"Q";
			a=a%90;
		}
		if (a/80==1){
			s=s+"Ð";
			a=a%80;
		}
		if (a/70==1){
			s=s+"Ï";
			a=a%70;
		}
		if (a/60==1){
			s=s+"Î";
			a=a%60;
		}
		if (a/50==1){
			s=s+"Í";
			a=a%50;
		}
		if (a/40==1){
			s=s+"Ì";
			a=a%40;
		}
		if (a/30==1){
			s=s+"Ë";
			a=a%30;
		}
		if (a/20==1){
			s=s+"Ê";
			a=a%20;
		}
		if (a/10==1){
			s=s+"É";
			a=a%10;
		}
		if (a/9==1){
			s=s+"È";
			a=a%9;
		}
		if (a/8==1){
			s=s+"Ç";
			a=a%8;
		}
		if (a/7==1){
			s=s+"Æ";
			a=a%7;
		}
		if (a/6==1){
			s=s+"ò";
			a=a%6;
		}
		if (a/5==1){
			s=s+"Å";
			a=a%5;
		}
		if (a/4==1){
			s=s+"Ä";
			a=a%4;
		}
		if (a/3==1){
			s=s+"Ã";
			a=a%3;
		}
		if (a/2==1){
			s=s+"Â";
			a=a%2;
		}
		for (int i=0;i<a;i++){
			s=s+"Á";
		}
		return s;
	}
}