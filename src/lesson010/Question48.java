package lesson010;
/*
 * 1 metot yazacagız bu metot bize bu areyde 1 ve 4un kac kere gectiğini soyleyecek
 * ayrıca 1 sayısının adeti 4 den büyük ise true değil ise false donsun
 * 
 * 
 * 
 */

public class Question48 {
	public static void main(String[] args) {
		int[] sayilar = {1,4,5,6,1,1,4,8};
		System.out.println(dortVeBirFrekansi(sayilar));
		
		
	}


	private static boolean dortVeBirFrekansi(int[] dizi) {
		int birSayiAdedi=0;
		int dortSayiAdedi=0;
		boolean kontrol =true;
		
		for (int i = 0; i < dizi.length; i++) {
			if (dizi[i]==1) {
				birSayiAdedi++;
				
			}else if (dizi[i]==4) {
				dortSayiAdedi++;
				
			}
			
			
		}
		System.out.println("1lerin adedi :"+birSayiAdedi);
		System.out.println("4lerin adedi :"+dortSayiAdedi);
//		
//		if (birSayiAdedi>dortSayiAdedi) {
//			System.out.println(kontrol);
//			
//		}else {
//			kontrol=false;
//			System.out.println(kontrol);
//		}
//		
	    kontrol =birSayiAdedi>dortSayiAdedi;
		return birSayiAdedi>dortSayiAdedi;
	}



}
