package lesson009;
import java.lang.invoke.StringConcatException;
import java.util.Scanner;

public class Question46Soru4 {

	public static void main(String[] args) {
		CustomStringTR();
		
		
		
		
	}
	
	
	public static void menu() {
		System.out.println("*************************");
		System.out.println("*String Hesaplayıcı*");
		System.out.println("*************************");
		System.out.println("Uzunluk");            //Length
		System.out.println("Bosluk al");          //Trim
		System.out.println("Esit mi");            //Equals
		System.out.println("Degistir");           //Replace
		System.out.println("Karakter");           //Charvalue 
		System.out.println("İçeriyo mu");         //Contains
		System.out.println("İndexi Chara donustur"); //CharAt
		System.out.println("Birlestir");             //Concat
		System.out.println("İndeks Aralık");        //Substring
		System.out.println("10.Daire çevre hesaplama");
		System.out.println("11.Çıkış");	
	}
	public static void CustomStringTR() {

		Scanner scanner = new Scanner(System.in);
		int islem;
		do {
			menu();
			islem = scanner.nextInt();
			switch (islem) {
			case 1:
			System.out.println(uzunluk("abc"));
				break;
			case 2:
				boslukAl(" Orhun ");
				break;
		    case 3:
		    System.out.println(esit(null, null));
         		break;
			case 4:
			System.out.println(degistir("Orhun",'u','a'));
     			break;	
			case 5:
				karakter('A');
				break;	
       		case 6:
			iceriyomu("Mer");
				break;	
			case 7:
				indexiCharaDonustur(0);
				break;		
 			case 8:
 				birlestir("Orhun");
				break;		
     		case 9:
				indexAralık("Merhaba Dünya");
				break;	
 		    case 10:
				kacinciİndex("M");
				break;	
			
			case 11:
				System.out.println("Çıkış yapılıyor.....!");
				break;
			default:
				break;
			}
		} while (islem != 7);

	}
	

	private static void kacinciİndex(String string) {
		String merhaba ="Merhaba Dünya";
		System.out.println(merhaba.indexOf(string));
		
	}


	private static void indexAralık(String string) {
		System.out.println(string.substring(4,5));
	}


	private static void birlestir(String value1) {
		String value2 = "Bayındır";
		System.out.println(value1.concat(value2));
		
	}


	private static void indexiCharaDonustur(int i) {
		String value1 ="Merhaba Dünya";
		System.out.println(value1.charAt(i));
	}


	private static String degistir(String ifade, char eski, char yeni) {
		return ifade.replace(eski, yeni);
		
	}


	public static boolean esit(String ifade,String ifade2) {
		
		if (ifade.equals(ifade2)) {
			return true;
		}else {
			return false;
		}
		
	}


	public static int uzunluk(String deger) {
		int uzunluk = 0;
		for (int i = 0; i < deger.length(); i++) {
			uzunluk++;
		}
		return uzunluk;
		
	}
	public static void boslukAl(String deger) {
		System.out.println(deger.trim());
		
		
	}
	public static void karakter(Character deger2) {
		System.out.println(deger2.charValue());
		
		
	}

public static void iceriyomu(String deger2) {
	
	String value1 ="Merhaba Dünya";
	System.out.println(value1.contains(deger2));
}

}
