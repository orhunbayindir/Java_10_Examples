package lesson006;

import java.time.chrono.MinguoChronology;

/*
 * 
 * 
 * 
 * dizideki en buyuk ve en kucuk elamanı bulan algoritmayı yazınız
 * 
 */
public class Question38 {

	public static void main(String[] args) {
		
		
		
		int[] sayilar = {0,12,5 ,85 , -89 , 1258, 87 ,14};
		int enBuyuk = sayilar[0] ;         //Integer.MIN_VALUE;
		int enKucuk = sayilar[0] ;            //Integer.MAX_VALUE;
		
		for (int i = 0; i < sayilar.length; i++) {
			
			if (sayilar[i]>enBuyuk ) {
				enBuyuk=sayilar[i];
				
			}
            if (sayilar[i]<enKucuk ) {
            	enKucuk=sayilar[i];
				
			}
			
			
			
		} System.out.println(enBuyuk);
		System.out.println(enKucuk);
		
		
		
		
		
	}
}
