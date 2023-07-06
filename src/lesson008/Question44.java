package lesson008;

/*
 * Bir dizide ard arda gelen 2 indexteki degerde 2 rakımı ise bize true dönen 
 * bir metod yazınız
 * 
 * 
 */
public class Question44 {

	public static void main(String[] args) {
		int[] sayilar = { 1, 2, 3, 4, 5, 8, 2, 2, 15 };
		System.out.println(ikiKontrolu(sayilar));

	}

	public static boolean ikiKontrolu(int[] dizi) { // boolean yazabiliriz ama aynı sırayla yazamayız int []
													// dizi,boolean kontrol yazamayız
		for (int i = 1; i < dizi.length; i++) {

			if (dizi[i] == 2 && dizi[i - 1] == 2) {
				return true;
			}
		}
		return false;
	}

	// method overload aşırı yükleme
	public static boolean ikiKontrolu(int[] dizi, boolean kontrol) {
		for (int i = 1; i < dizi.length; i++) {

			if (dizi[i] == 2 && dizi[i - 1] == 2) {
				return true;
			}

		}
		return false;
	}

}
