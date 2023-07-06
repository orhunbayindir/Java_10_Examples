package lesson003;
/*
 * * Soru4-)/*

* 1 den 100 ekadar olan çift sayıların toplamının

* tek sayıların toplamına oranı

*

* Wrapper class nedir

*   arasındaki fark

* referans tur nedir
 * 
 * 
 * 
 */
public class Ödev4 {
public static void main(String[] args) {
	
	int ciftToplam = 0;
	int tekToplam = 0;
	   for(int i = 2; i <= 100; i+=2){
	      ciftToplam += i;
	   }
	   for(int j = 1; j <= 100; j+=2){
		      tekToplam += j;
		   }

	   System.out.println("1'den 100'e kadar olan çift sayıların toplamnın tek sayılara oranı: " + ciftToplam/tekToplam);
	
	
}
}
