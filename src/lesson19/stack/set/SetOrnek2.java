package lesson19.stack.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/*
 * 
 * Dışarıdan bir kelime girelim her harfini bir sete atmak istiyoruz
 * tekrar edenleri bir sete tekrar etmeyenleri başka bir sete atalım
 * sonra tekrar eden ve etmeyen setlerini yazdıralım
 * 
 */
public class SetOrnek2 {
	
	public static void main(String[] args) {
		
	
	Set<Character> tekrarEden= new HashSet<>();
	Set<Character> tekrarEtmeyen= new HashSet<>();
	
	
	Scanner scanner=new Scanner(System.in);
	
	String kelime=scanner.nextLine();
	
	
	
	for (int i = 0; i < kelime.length(); i++) {
		if (!tekrarEden.contains(kelime.charAt(i))&&!tekrarEtmeyen.add(kelime.charAt(i))) {
			tekrarEden.add(kelime.charAt(i));
			tekrarEtmeyen.add(kelime.charAt(i));
		}
	}
	
	System.out.println(tekrarEden);
	System.out.println(tekrarEtmeyen);
	
	}}
	
	
	
		
	