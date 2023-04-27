package lesson002;

import java.util.Scanner;

/*
 * 
 * Dışarıdan 2 tane sayı alıp toplayalım
 * ve daha sonra bu sayı çift ise ekrana true yazdıralım
 * 
 * 
 */
public class Question7 {

	public static void main(String[] args) {
		
		int sayi1,sayi2,toplam;
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Lütfen  sayı giriniz");
		sayi1 = input.nextInt();
		System.out.println("Lütfen  sayı giriniz");
		sayi2 = input.nextInt();
		
	    toplam =(sayi1 + sayi2);
		
		System.out.println(sayi1+sayi2);
		System.out.println("Çift mi?" + toplam);
		
		boolean kontrol = toplam%2==0;
		
		System.out.println(kontrol);
		
		System.out.println(kontrol?"Çift":"Tek");
		System.out.println(toplam%2==0?"Çift":"Tek");
	}
}
