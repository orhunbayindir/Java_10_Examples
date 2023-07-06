package lesson19.stack;

import java.util.Scanner;
import java.util.Stack;

/*
 * 
 * dışarıdan bir kelime alıp bu kelimeyi bir stack e aktaralım
 * daha sonra bu stack uzerinde calışıp kelimenin palibdrın olup olmadığğını bulalım
 * tat kek kabak --> tersten okunusu ve düzden okunusu aynı olan kelimeler palindromdur
 * 
 * 
 */

   
public class PalindromStack {
	static Stack<Character>stack= new Stack<>(); 
	
	
	
	
	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen bir kelime giriniz");
		String kelime = scanner.nextLine();
	    stackOlustur(kelime);
	    
	    
	    
	if (isPalindrom()) {
		System.out.println("Palindromdur");
		
	}else {
		System.out.println("Palindrom değildir");
	}
		
	}
	
	private static boolean isPalindrom() {
		for (int i = 0; i < stack.size()/2; i++) {
			if (stack.pop()!=stack.get(i)) {
				return false;
				
			}
		}
	return true;
	}
	
	private static void stackOlustur(String kelime) {
	for (int i = 0; i < kelime.length(); i++) {
		stack.push(kelime.charAt(i));	
	}
	}

	

}
