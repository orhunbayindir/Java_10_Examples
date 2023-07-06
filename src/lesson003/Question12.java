package lesson003;

import java.util.Iterator;
import java.util.Scanner;

//1den girdiğimiz sayıya kadar çiftlerin toplamı


public class Question12 {

	public static void main(String[] args) {
		
		
		int toplam = 0;
		
		int sayi;
		System.out.println("1 sayı giriniz");
		Scanner input = new Scanner(System.in);
		sayi = input.nextInt();	
//		
//		for (int i=2 ;i<=sayi;i+=2) {
//			toplam+=i;
//			
//		}
	//	System.out.println(toplam);
		toplam =0;
		for (int i = 1; i <= sayi; i++) {
			int a=i%2==0?i:0;//?
			toplam+=a;
			
		}
		System.out.println(toplam);
		
		
	}
}
