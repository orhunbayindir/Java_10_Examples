package lesson010;
/**
 * 
 * @author orhunbayindir
 *
 *
 *
 *bir baslangıc ve bitis degeri arasında ki sıralı sayılardan eger sayı 3 ün katı ise bilge 
 */
public class Question49 {

	
	
	public static void main(String[] args) {
		int start=2;
		int end=22;
		
	    arrayYazdir(arrayOlustur(start,end));
	}

	private static String[] arrayOlustur(int start, int end) {
		String[] array=new String[end-start+1];//kaç sayı olduğu
		for (int i = 0; i < array.length; i++) {
			int eleman=start+i;
			if (eleman%15==0) {
				array[i]="bilgeadam";
			} else if (eleman%5==0) {
				array[i]="adam";
				
			}else if (eleman%3==0) {
				array[i]="bilge";
				
			}else {
				array[i]=Integer.toString(eleman);
				//array[i]=elaman+"";
				//array[i]=String.valueOf(eleman);
		
			}
			
		}
		return array;
		
	}
	public static void arrayYazdir(String[]dizi) {
		
		System.out.println("[");
		for (String deger : dizi) {
			System.out.print(deger+",");
		}
		System.out.println("]");
		
//		int[]array = new int[5];
//		
//		for (int sayi : array) {
//			System.out.println(sayi);
//		}
		
	}

	
	
	
	
}

