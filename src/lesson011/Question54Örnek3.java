package lesson011;

import java.util.Scanner;

public class Question54Örnek3 {

	
	
	static Scanner scanner = new Scanner(System.in);
	
	public static void menu() {
		
		int kontrol = 0;
		
		do {
			System.out.println("==Hesap makinesi===\n");
			System.out.println("1- Topla");
			System.out.println("2- Çıkar"); 
			System.out.println("3- Çarp");
			System.out.println("4- Böl"); 
			System.out.println("0- Çıkış"); 
			System.out.println("Bir işlem Seçiniz");
			kontrol = Integer.parseInt(scanner.nextLine());
			

			switch (kontrol) {
			case 1:
				System.out.println(topla());
				break;
            case 2:
				System.out.println(cikar());
				break;
            case 3:
				System.out.println(carpma());
				break;
            case 4:
				System.out.println(bolme());
				break;
            case 0:
            	System.out.println("Program sonlanıyor");
				
				break;
			default:
				System.out.println("Yanlış bir seçim yaptınız");
				break;
			}
		} while (kontrol!=0);
		
	}

	private static int topla() {
		String sayi= "";
		int toplam= 0;
		do {
			System.out.println("Lütfen bir sayı giriniz");
			sayi = scanner.nextLine();
			if (!sayi.equals("=")) {
				toplam+=Integer.parseInt(sayi);
			}
			
			
			
		} while (!sayi.equals("="));
		return toplam;
	}
	private static int topla2() {
		String sayi= "";
		int toplam= 0;
		
		while (!(sayi=scanner.nextLine()).equals("=")) {
			System.out.println("Lütfen bir sayı giriniz");
			toplam+=Integer.parseInt(sayi);
			
		}
		
		return toplam;
	}
	public static int cikar() {
		String sayi="";
		int sonuc=0;
		int sayac=0;
		
		System.out.println("Lütfen bir sayi giriniz");
		while (!(sayi=scanner.nextLine()).equals("=") ) {
			sayac++;
			if (sayac==1) {
				sonuc = Integer.parseInt(sayi);
			}else {
				sonuc-=Integer.parseInt(sayi);
			}
			System.out.println("Lütfen bir sayı giriniz");
		}
		
		return sonuc;
	}
	
	public static int carpma() {
		String sayi="";
		int carpim =1;
		System.out.println("Lütfen bir sayı giriniz");
		while (!(sayi=scanner.nextLine()).equals("=")) {
			carpim*=Integer.parseInt(sayi);
			System.out.println("Lütfen bir sayı giriniz");
			
		}
		
		
		return carpim ;
		
		
	}
	public static double bolme() {
		
		String sayi="";
		double sonuc =1;
		int sayac = 0;
		System.out.println("Lütfen bir sayı giriniz");
		while (!(sayi=scanner.nextLine()).equals("=")) {
			sayac++;
			if (sayac ==1) {
				sonuc=Double.parseDouble(sayi);
				
			} else {
             sonuc/=Double.parseDouble(sayi);
			}
			System.out.println("Lütfen bir sayi giriniz");
		}
		return bolme();
	}
	
	
	public static void main(String[] args) {
		menu();
		//Question3 myObject= new Question3();
	}
}
