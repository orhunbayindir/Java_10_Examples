package lesson003;

import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {
		
		int sonSayi;
		int toplam = 0;
		Scanner input =new Scanner(System.in);
		
		System.out.println("Lütfen sayı giriniz");
		sonSayi= input.nextInt();
		
		 for (int i = 1; i <= sonSayi; i++) {
			 toplam+=i;
			 
			System.out.println(i);
			
		}
		 System.out.println(toplam);
	}
	
	
	
	
	
}
