package lesson004;

import java.util.Scanner;

/*
 * 
 * 
 * iki tane değişkenimiz olsun 
 * dışarıdan bir işlem seçeceğiz
 *toplam çıkarma bölme çarp
 *ve en sonunda sonucu yazdıralım
 * 
 * 
 * 
 */
public class Question26 {
	public static void main(String[] args) {
		
		int sayi1 = 58;
		int sayi2 =94;
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Lütfen bir işlem seciniz");
		String islem = scanner.nextLine();
	
		
		switch (islem) {
		case "+":

			System.out.println("Sonuc="+ (sayi1+sayi2));
		
		break;
		
		case "-":
			System.out.println("Cıkarma işleminin sonuc "+(sayi1-sayi2));
		break;
		
		case "/":
			System.out.println(sayi1/sayi2);
		break;
		 
		case "*":
			System.out.println(sayi1 * sayi2);
		break;
			
			
		default:
			break;
		}
		
		
		
		
		
		
		
	}
	

}
