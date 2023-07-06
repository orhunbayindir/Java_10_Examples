package lesson003;

import java.util.Scanner;

/*
 * Kullanıdan alınan bir sayının carpım tablosunu yazdıralım
 * 
 * 10a kadar
 * 
 * 
 */

public class Question13 {
	
	public static void main(String[] args) {
		
		System.out.println("Lütfen sayı giriniz");
		
		Scanner input = new Scanner(System.in);
	    	
	    int sayi = input.nextInt();
		     
		for (int i= 1 ; i <= 10; i++) {
			
			System.out.println(sayi+"x"+i+"="+sayi*i);
		
		}
		
		
		
		
		
		
	}

}
