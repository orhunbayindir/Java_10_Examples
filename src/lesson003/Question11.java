package lesson003;

import java.util.Scanner;

public class Question11 {
	
	public static void main(String[] args) {
		int toplam = 0;
		int sayi;
		int i = 1;
		Scanner input = new Scanner(System.in);
		sayi = input.nextInt();		
		while (i<=sayi) {
			toplam+=i;
			i++;
		}
		
		System.out.println(toplam);
		
		
	}

}
