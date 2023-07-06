package lesson007;

import java.util.Scanner;

import javax.swing.plaf.InputMapUIResource;

/*
 * 1 metot yazalım dışarıdan bir ülke ismi alalım 
 * bu ülke ismi dizimizde geçiyo mu onu kontrol edelim
 * ve geçiyosa consolea Girdiğiniz ülke bulundu
 * eğer yoksa girdiğiniz ülke bulunamadı çıktısı verelim
 * 
 * 
 */
public class Question41 {
	public static void main(String[] args) {
		String [] array = {"Türkiye","Moğalistan","Japonya","Fransa","Danimarka"};
		ulkeBul(array);
		ulkeBul2(array);
		
	}
	
        public static void ulkeBul(String[] dizi) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen bir ülke giriniz");
		String ulke = scanner.nextLine();
		boolean kontrol = false;
		
		
		for (int i = 0; i < dizi.length; i++) {
			
			if (dizi[i].equals(ulke)) {
				kontrol= true;
				break;
				//buraya 44. satırı yazsaydık bulana kadar bulunamadı yazar
			}
			
		}
		if (kontrol) {
			System.out.println(ulke +" ulke bulundu");
			
		}else {
			System.out.println(ulke +" ülke bulunamadı");
		}
	}
        
        
        
       public static void ulkeBul2(String[] dizi) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen bir ülke giriniz");
		String ulke = scanner.nextLine();
		String result = ulke + "Ülke bulunamadı";
		for (int i = 0; i < dizi.length; i++) {
			
			if (dizi[i].equals(ulke)) {
			result = ulke +"=====> Ülke Bulundur";
				break;
				
			}
			
		}System.out.println(result);
		
	}
	
	
	
	
	

}
