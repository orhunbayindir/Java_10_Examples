package lesson006;

/*
 * 
 * 
 * deger stringinin karakterleri toplamı kaçtır;
 */

public class Question34__ {
	
	public static void main(String[] args) {
		
		
		
		String deger = "1243";
		
		int toplam = 0;
		int toplam2 = 0;
		int toplam3 =0;
		
		for (int i = 0; i < deger.length(); i++) {
			
			char a = deger.charAt(i);
			//ascii tablosunda karşılık gelen int deger ornek 1 karşılığı 49 dur
			toplam3+=a;
			//char dan stringe çevirme
			String karakter = String.valueOf(a);
			String karakter2 = Character.toString(a);
			//stringden int e çevirme
			int sayi = Integer.parseInt(karakter);
			//karakterden direk inte çevirme (bire bir int karşılığı )
			int sayi2 = Character.getNumericValue(a);
			toplam +=sayi;
			toplam2 += sayi2;
			
		
			
		}
		System.out.println(toplam);
		System.out.println(toplam2);
		System.out.println(toplam3);
		
		
		
		
	}

}
