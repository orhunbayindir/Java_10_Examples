package lesson002;

import java.util.Scanner;

/*
 * Dışarıdan vize ve final bilgisi girilsin
 * daha sonra öğrenci ismi girilsin 
 * 
 * çıktı olarak eğer ortalama 60  ın uzerinde ise Mustafa adlı öğrenci geçti
 * altında ise mustafa adlı ogrenci kaldı çıktısı
 * 
 * ort= vizenin40 final 60
 * 
 * 
 * 
 * 
 */






public class Question8 {

	
	public static void main(String[] args) {
		
		double vize,finalNotu,toplam,ortalama;
		
		Scanner input =new Scanner(System.in);
		
		System.out.println("Lütfen vize notunu giriniz");
		vize= input.nextDouble();
		
		System.out.println("Lütfen final notunu giriniz");
		finalNotu=input.nextDouble();
		
		ortalama= (vize*0.4)+(finalNotu*0.6);

		
		System.out.println("Lütfen ögrenci ismini giriniz");
		input.nextLine();
		String isim = input.nextLine();
		
		System.out.println( isim+ " adlı ogrenci");
		System.out.println(ortalama>60?" geçti":" kaldı");
		System.out.println();
		
	    String durum = ortalama>60?" gecti":" kaldı";
	    System.out.println(isim+" adlı ogrenci" +durum+ " ort:"+ortalama);
		
		
		
		
		
		
		
	}
}
