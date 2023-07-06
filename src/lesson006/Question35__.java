package lesson006;

public class Question35__ {
public static void main(String[] args) {
	
	
	String deger = "1243";
	
	int toplam = 0;
	int sayi1 = Integer.parseInt(deger);
	int basamak = 0;
	
	while (sayi1 >= 1) {
		basamak = sayi1 % 10;
		toplam += basamak;
		sayi1 /= 10;
		
		
	}
	
	System.out.println(toplam);
	
	
}
}
