package lesson003;

import java.util.Scanner;

/*
 * 
 * Girilen sayının basamakları toplamını ekrana yazdıralım ve
 *  kaç basamaklı olduğunu yazdıralım
 * 
 */
public class Question16__ {

	public static void main(String[] args) {
		
		
        System.out.println("Lütfen sayı giriniz");
        
		Scanner input = new Scanner(System.in);	   
		
	    int sayi = input.nextInt();
	    int basamakDegeri ;
	    int y=1;
	    int toplam =0;
	    int sayac = 0;
	    
	    do {
	    	basamakDegeri = sayi%10;
	    	toplam+=basamakDegeri;
	    	sayi/=10;
	    	sayac++;
	    	
	    	
			
		} while (sayi!=0); //sayi>0 veya sayi>=1
		
		System.out.println("toplam "+toplam);
		System.out.println("basamak sayısı "+sayac);
		
		
		//while cozumu
	
		
		while (sayi > 0) {
			basamakDegeri = sayi%10;
	    	toplam+=basamakDegeri;
	    	sayi/=10;
	    	sayac++;
	    	
			
		}
		System.out.println("toplam "+toplam);
		System.out.println("basamak sayısı "+sayac);
		
		
	}
}
