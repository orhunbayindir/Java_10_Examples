package lesson004;

import java.util.Scanner;

public class Question24____ {
public static void main(String[] args) {
	
	
	Scanner input = new Scanner(System.in);
	System.out.println("Lütfen bir sayi giriniz");
	int sayi = input.nextInt();
	boolean asalmi =true;
	
	if (sayi<2) {
		asalmi =false;
		
	}else {
		
		
		for (int i = 2; i < sayi/2; i++) {
			if (sayi%i==0 ) {
				asalmi = false;
				break;
				
			}
			
		}
		
	}
	if (asalmi ) {
		System.out.println(sayi+" Asal sayidir");
	}else {
		System.out.println(sayi+" Asal sayı değildir");
	}
	

	
	
	
	
	
	}
}

