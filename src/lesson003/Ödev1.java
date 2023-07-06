package lesson003;

import java.util.Scanner;

/*
 *  Dışarıdan taban değeri birde üs değeri alacağız
 *  ( 2 üzeri 5 gibi ) bu işlemin sonucu bulan algoritma( dongu kullanarak)
 * 
 * 
 */
public class Ödev1 {
	public static void main(String[] args) {
		
       Scanner input =new Scanner(System.in);
	   System.out.println("Lütfen sayı giriniz");
	   int tabanDegeri= input.nextInt();
	   
	   System.out.println("Lütfen sayı giriniz");
	   int üsDegeri= input.nextInt();
	   int sabit = 1;
	   
	   while (üsDegeri!=0) {
		   
		   sabit*=tabanDegeri;
		   üsDegeri--;
		   
		
	}System.out.println("Cevap = "+ sabit);
	   
	
		
	} 

}
