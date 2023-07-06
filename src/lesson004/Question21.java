 package lesson004;

import java.util.Scanner;

/*
 * telefonkod mailkod baslangıc degerleri
 * 
 * daha sonra dışarıdan birtane telefon kodu alacağız bir tanede mail için koda alacağız 
 * 
 * eğer telefon kodu hatalı ise tel kodu hatalı çıktısı verelim
 * 
 * eğer mail kodu hatalı ise mail kodu hatalı çıktısı verelim
 * 
 * ikiside doğru ise sisteme kayıt oldunuz
 * telefon doğru email yanlış ise emaik yanlış
 * email doğru telefon yanlış ise  telefon yanlış
 * ikiside yanlış ise telefon email hatalıdır
 * 
 * 
 * 
 * 
 */
public class Question21 {
	
	
	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		int telefonKod = 10;
//		int mailKod = 20;
//		
//		System.out.println("Lütfen bir mail kodu giriniz");
//		int mKod=scanner.nextInt();
//		System.out.println("Lütfen bir telefon kodu giriniz");
//		int tKod=scanner.nextInt();
//		
//		if (telefonKod==tKod ) {
//			System.out.println("Telefon kodu doğrudur ");
//		}else {
//			System.out.println("Telefon kodu hatalıdır");
//		}
//		
//		if (mailKod==mailKod) {
//			System.out.println("Mail kodu doğrudur ");
//		} else {
//			System.out.println("Mail kodu hatalıdır ");
//		}
//		
//		////////////77
//		if (telefonKod!= tKod) {
//			System.out.println("Telefon kodu hatalıdır");
//		}
//		if (mailKod != mKod) {
//			System.out.println("Mail kodu hatalıdır");
//			
//		}
//		
		Scanner scanner = new Scanner(System.in);
		int telefonKod = 10;
		int mailKod = 20;
		
		System.out.println("Lütfen bir mail kodu giriniz");
		int mKod=scanner.nextInt();
		System.out.println("Lütfen bir telefon kodu giriniz");
		int tKod=scanner.nextInt();
		
		if (telefonKod==tKod && mailKod==mKod) {
			System.out.println("Sisteme kayıt oldunuz ");
		}else if (telefonKod==tKod  && mailKod!=mKod) {
			System.out.println("Telefon kodu doğru mail kodu yanlış");
		}
		else if (mailKod==mailKod && telefonKod!=tKod) {
			System.out.println("Mail kodu doğru telefon kodu yanlış");
			
		}else {
			System.out.println("Mail ve telefon kodu yanlış");
		}
		
		
	}

}
