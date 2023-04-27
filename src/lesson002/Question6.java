package lesson002;

import java.util.Scanner;

// Dairenin alanını ve çevresi hesaplayan bir program
// Dışarıdan yarıçapı al
//alan = pi*r*r
//çevre= 2*pi*r

public class Question6 {
	
	public static void main(String[] args) {
		
		double pi = 3.14,yarıCap,cevre,alan;
        System.out.println("Lütfen yarı çap giriniz");
		Scanner input = new Scanner(System.in);
		
		yarıCap = input.nextDouble();
		alan = pi * yarıCap * yarıCap ;
		cevre = 2 * pi * pi ;
		System.out.println("Alan = " +alan + "\nDairenin çevresi= " +cevre);
		
		
	}

}
