package lesson011;



/*
 * bir dizide 13 var ise ve ise 13 bir sonra ki elaman toplama eklenmeden toplama sonucu bulan kod
 * 
 * 
 * 
 * 
 */
public class Question55 {
	public static void main(String[] args) {
		int[] sayilar= {1,13,13,13,5,13};
	System.out.println(bul(sayilar));
		
		
		
	}

	public static int bul(int []sayilar) {
		int toplam=0;
		for (int i = 0; i < sayilar.length; i++) {
			
			if(sayilar[i]==13) {
				if (i+1<sayilar.length && sayilar[i+1]!=13) {//sırası önemli
					i++;
				}
				
			}else {
				toplam+=sayilar[i];
			}
			
		}
		return toplam ;
		
	}
	
	public static int bul2(int []sayilar) {
		int toplam=0;
		for (int i = 0; i < sayilar.length; i++) {
			
			if(sayilar[i]==13|| (i>1&& sayilar[i-1]==13)) {
				continue;
				
			}else {
				toplam+=sayilar[i];
			}
			
		}
		return toplam ;
		
	}

}
