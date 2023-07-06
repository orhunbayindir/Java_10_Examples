package lesson24;

import java.util.Scanner;
import java.util.concurrent.ExecutionException;

/*
 * 1-1metot yazacagız dısarıdan bir index alacak sonra o intexteki degeri yazdıracagız
 * hata varsada hatayı yakalayıp hata mesajı yazdıralım
 * 2-array uzerinde gezelim gezerken toplayabildigimiz degerleri toplam degiskene ekleyerek bir toplam sonucu bulalım ve
 * bir sayac ile de hata sayısını tutalım dongu sonunda toplamı ve hata sayısını yazdıralım6qa <
 */
public class TryCatchOrnek2 {
	public static void main(String[] args) {
		
		String array []= {null,"30","a","20","ab",null,"50"};
		indexdekiDegeriYazdır(array);
		System.out.println("Program devam ediyor");
		toplamDegeriniVeHataSayisiniBul(array);
	}

	private static void indexdekiDegeriYazdır(String array[]) {
		Scanner scanner =new Scanner(System.in);
		try {
			
			int index=scanner.nextInt();
		    System.out.println(array[index]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Hata var"+e.toString());
			//e.printStackTrace();
		}
		
		
		
	}
public static void toplamDegeriniVeHataSayisiniBul(String array[]) {
	int sayac =0;
	int toplam=0;
	for (String string : array) {
		try {
			//string.charAt(0);stringin ilk değerini char olarak alır abnin asını
			nullKontrol(string);
			toplam+=Integer.parseInt(string);
		} catch (NumberFormatException e) {
			
			System.out.println(e.toString());
			sayac++;
		} catch (Exception e) {
			System.out.println(e.toString());
			//e.printStackTrace();
			sayac++;
		}
	}
	System.out.println("toplam"+toplam);
	System.out.println("Hata satısı"+sayac);
	
}
private static String nullKontrol2(String string) {//unchecked exception
	if (string==null) {
		throw new NullPointerException("Null hatası");
	}
   return string;
	
}
private static String nullKontrol(String string) throws Exception{//checked exception
	if (string==null) {
		throw new NullPointerException("Null hatası");
	}
   return string;
	
}
	
	

}
