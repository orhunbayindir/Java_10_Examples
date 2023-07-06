package lesson005;

import java.util.Scanner;

/*
 * 
 * Dışarıdan  bir kelime girelim
 * 
 * bu kelime içerisinden kucuk harf a kac defa geciyo bize söylesin
 * 
 * 
 * 
 * 
 */
public class Question32 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Bir kelime giriniz");
		String kelime = input.nextLine();
		int sayac = 0;

		for (int i = 0; i < kelime.length(); i++) {

			if (kelime.charAt(i) == 'a' || kelime.charAt(i) == 'A') {
				sayac++;

			}
		}
		System.out.println(sayac + "tane a vardır");
	}
}
