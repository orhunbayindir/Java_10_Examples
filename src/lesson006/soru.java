package lesson006;

public class soru {


public static void main(String[] args) {


String [] sayilar = { "4","6" , "5" , "10" , "15" };
double ciftToplam = 0;
double tekToplam = 0;


for (int i = 0; i < sayilar.length; i++) {
	
	int sayi = Integer.parseInt(sayilar[i]);
	
	if (sayi % 2 == 0) {
		ciftToplam+=sayi;
		
	}else {
		tekToplam +=sayi;
		
		
	}
	
	
	
}
double oran = tekToplam/ciftToplam;
System.out.println(oran);


}}	
	











