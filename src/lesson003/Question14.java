package lesson003;

import java.util.Iterator;
import java.util.Scanner;

// girilen sayının faktoriyeli
public class Question14 {

	public static void main(String[] args) {
		
		
        System.out.println("Lütfen sayı giriniz");
		
		Scanner input = new Scanner(System.in);
	    	
	    int sayi = input.nextInt();
	    int faktoriyel= 1 ;
	    
	   for (int i = 1; i <= sayi; i++) {
		   faktoriyel*=i;
		
	}
	   System.out.println("faktoriyel= "+faktoriyel);
	    
	   
	   
//	   while (sayi>= i) {
//		   faktoriyel *= sayi;
//		   sayi--;
//		   
//		
//	}
	    
		
		
	}
}
