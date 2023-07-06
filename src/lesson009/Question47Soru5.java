package lesson009;
import java.util.Scanner;

public class Question47Soru5 {
	
	public static void main(String[] args) {
		islem();
		
		
		
		
	}
	
	
	public static void menu() {
		System.out.println("*************************");
		System.out.println("*Geometrik Hesaplayıcı*");
		System.out.println("*************************");
		System.out.println("1.Kare alan hesaplama");
		System.out.println("2.Kare çevre hesaplama");
		System.out.println("3.Dikdörtgen alan hesaplama");
		System.out.println("4.Dikdörtgen çevre hesaplama");
		System.out.println("5.Daire alan hesaplama");
		System.out.println("6.Daire çevre hesaplama");
		System.out.println("7.Çıkış");	
	}
	public static void islem() {

		Scanner scanner = new Scanner(System.in);
		int islem;
		do {
			menu();
			islem = scanner.nextInt();
			switch (islem) {
			case 1:
				kareAlanHesaplama();
				break;
			case 2:
				kareCevreHesaplama();
				break;
			case 3:
				dikdörtgenAlanHesaplama();
				break;
			case 4:
				dikdörtgenCevreHesaplama();
				break;	
			case 5:
				daireAlanHesaplama();
				break;	
			case 6:
				daireCevreHesaplama();
				break;	
			case 7:
				System.out.println("Çıkış yapılıyor.....!");
				break;
			default:
				break;
			}
		} while (islem != 7);

	}


	public static void daireCevreHesaplama() {
		System.out.println("Lütfen yarıcap giriniz");
		Scanner input = new Scanner(System.in);
		int yariCap = input.nextInt();
		double pi=3.14;
		double cevre = 2*pi*yariCap;
		System.out.println("Dairenin çevresi= "+cevre);
		
		
	}

	public static void daireAlanHesaplama() {
		System.out.println("Lütfen yarıcap giriniz");
		Scanner input = new Scanner(System.in);
		int yariCap = input.nextInt();
		double pi=3.14;
		double alan = pi*yariCap*yariCap;
		System.out.println("Dairenin alanı= "+alan);
		
		
	}


	public static void dikdörtgenCevreHesaplama() {
		System.out.println("Lütfen uzun giriniz");
		Scanner input = new Scanner(System.in);
		int kenar = input.nextInt();
		System.out.println("Lütfen kısa giriniz");
		int kenar2 = input.nextInt();
		int cevre = 2*kenar+2*kenar2;
		System.out.println("Cevre = "+cevre);
		
	}


	public static void dikdörtgenAlanHesaplama() {
		System.out.println("Lütfen uzun kenarı giriniz");
		Scanner input = new Scanner(System.in);
		int kenar = input.nextInt();
		System.out.println("Lütfen kısa kenarı giriniz");
		int kenar2 = input.nextInt();
		int alan = kenar*kenar2;
		System.out.println("Alan= "+alan);
		
	}


	public static void kareCevreHesaplama() {
		System.out.println("Lütfen karenin kenarını giriniz");
		Scanner input = new Scanner(System.in);
		int kenar = input.nextInt();
		int cevre = kenar*4;
		System.out.println("Cevre= "+cevre);
		
		
	}


	public static void kareAlanHesaplama() {
		System.out.println("Lütfen karenin kenarını giriniz");
		Scanner input = new Scanner(System.in);
		int kenar = input.nextInt();
		int alan = kenar*kenar;
		System.out.println("Alan= "+alan);
		
		
	}
	
	
	
	
	
	
	}