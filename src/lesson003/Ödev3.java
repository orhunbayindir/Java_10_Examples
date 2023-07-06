package lesson003;

import java.util.Scanner;

/*
 * 
 * Klavyeden 0 girilinceye kadar sayı okumaya devam edeceğiz

* 0 girilidğinde sayıların toplamını ve ortalamasını ekrana yazdıralım 
 * 
 */
public class Ödev3 {
	
	public static void main(String[] args) {
		
			
		   		    
		 
		int toplam=0;
		 int sayi;
		 int sayac =0;
		 while(true)
		 {
			 sayac++;
			Scanner scan = new Scanner(System.in);
			System.out.print("Bir sayi girin: ");
			sayi = scan.nextInt();
			if(sayi==0) break;
			toplam=toplam + sayi;
		} 
		System.out.println("Sayıların Toplamı: "+toplam);
		System.out.println("Sayıların Ortalaması: "+toplam/sayac);
	
		
		
	}

}
