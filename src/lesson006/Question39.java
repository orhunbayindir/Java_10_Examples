package lesson006;

import java.util.Scanner;

/*
 * 
 * 5 boyutlu bir integer dizisi tanımlayıp
 * dışarıdan aldığımız değerleri bu diziye atalıyalım
 * ve daha sonra bu dizinin elamanlarını yazdıralım
 *
 */

public class Question39 {
	
	public static void main(String[] args) {
		
		
		int myArray [] = new int[5];
		
		Scanner scanner = new Scanner(System.in);
		
		
		
		for (int i = 0; i < myArray.length; i++) {
			System.out.println("Lütfen" +(i+1)+ "giriniz");
			myArray[i]= scanner.nextInt();
			
		}
		for (int i = 0; i < myArray.length; i++) {
			
			System.out.print(myArray[i] +" ");
			
		}
		
		
		
		
		
		
		
		
		
	}

}
