package lesson006;

public class Question37 {
	public static void main(String[] args) {

		String dizi[] = new String[4];// sıfırdan başlar sonuncu 3
		dizi[0] = "java";
		dizi[3] = "React";
		System.out.println(dizi[3]);
		System.out.println(dizi[1]);

		System.out.println("-----------------");
		String[] dizi2 = { "Mustafa", "Mert" };
		System.out.println(dizi2[1]);
		System.out.println("-----------------");

		String[] dizi3;
		dizi3 = new String[2];
		dizi3[0] = "Mustafa";
		System.out.println("---------int--------");

		int[] dizi4 = new int[10];
		System.out.println(dizi4[0]);
		System.out.println("-----INTEGER------------");
		
		Integer[] dizi5 = new Integer[5];
		System.out.println(dizi5[0]);
		System.out.println("-----------------");

		boolean[] dizi6 = new boolean[5];
		System.out.println(dizi6[0]);
		dizi6[1] = true;
		System.out.println(dizi6[1]);
		System.out.println("-----------------");
		for (int i = 0; i < dizi6.length; i++) {
			System.out.println(dizi6[i]);

		}

	}

}
