package lesson002;
/*
 * 
 * 
 * Dışarıdan veri alma ile ilgili ornekler 
 * scanner
 * 
 * 
 */

import java.util.Scanner;

public class Question5 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Lütfen bir isim giriniz");
		String isim = input.nextLine();

		System.out.println("isim=" + isim);

		int sayi1 = 10;

		System.out.println("Lütfen bir sayı giriniz");

		int sayi2 = input.nextInt();

		System.out.println("Lütfen bir sayı giriniz");

		double sayi3 = input.nextDouble();//consoledan ondalık değerleri , ile girelim

//		long sayi4 = input.nextLong();

//		float sayi5 = input.nextFloat();

		// dışarıdan char değeri alamayız

		System.out.println("sonuc " + (sayi1 + sayi2 + sayi3));

		input.nextLine();// int (sayısal) degerden sonra bir string deger almak istersek mutlaka
		//
		System.out.println("Lütfen bir isim giriniz");
		String isim2 = input.nextLine();

		System.out.println("isim" + isim2);

		System.out.println("Lütfen bir isim giriniz");
		isim2 = input.nextLine();

		System.out.println("isim" + isim2);

	}

}
