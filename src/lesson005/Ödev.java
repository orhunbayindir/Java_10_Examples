 package lesson005;

import java.util.Scanner;

public class Ödev {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen bir sayi giriniz");
		int sayi = scanner.nextInt();
		int sayac= 0;
		
		while (true) {
			
			if (sayi % 5 == 0) {
				sayi = sayi/ 5 ; 
				sayac++;
			}else if (sayi == 1) {
				System.out.println("5in kuvvettidir");
				break;
				
			}else {
				System.out.println("5in kuvveti değildir");
				break;
			}
			
		}
		System.out.println(sayac);//kaç kere böldüğünü bulur
		
		
		
		
		
	}

}
