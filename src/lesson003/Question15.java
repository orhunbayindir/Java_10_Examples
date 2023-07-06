package lesson003;




// 1 den başlayarak sayıları toplayalım toplamımız 50den büyük olana kadar programımız
//çalışsın sonundada toplamı ve kaç kere çalıştığını yazalım
public class Question15 {

	public static void main(String[] args) {
		
		
		
		int sayi =0;
		int sayac=0;
		int toplam = 0;
	   
		while (toplam<=50) {
		sayi++;	
		toplam+=sayi;
		sayac++;
		System.out.println("Toplam"+toplam +"Sayac"+ sayac);
		}
		System.out.println(toplam );
		System.out.println(sayac );
		System.out.println(sayi);
		
		
		
		
		
		
		
	}
}
