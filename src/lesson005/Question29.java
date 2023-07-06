package lesson005;

import java.util.Scanner;

/*
 * Mükemmel sayı olup olmadığını bulalım
 * öyleyse yazdor
 * değilse değil yazdır
 * 
 * kendisi hariç bölenleri toplamına eşitse 6 = 1+2+3
 * 
 * 
 * 
 * 
 */
public class Question29 {
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen bir sayi giriniz");
		int sayi = scanner.nextInt();
		int toplam = 0;
		
		for (int i = 1; i <= sayi/2; i++) {
			
			if (sayi % i == 0) {
			toplam +=i;
				
			} 
			
		}if (toplam == sayi) {
			System.out.println("Mükemmel sayıdır");
			
		}else {
			System.out.println("Mükemmel sayı değildir");
		}
		
		
		
		
		
	}

}
