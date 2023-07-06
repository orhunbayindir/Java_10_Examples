package lesson19.stack;
/*
 * First in first out
 * ilk giren ilk çıkıyo
 * lifo son giren ilk cikar
 * 
 * 
 * İnteger bir stack oluşturup içine 6 7 tane değer ekleyelim
 * 
 * 100den kucuk olan degerlerin toplamını bulalım 
 * 100den buyuk olanları da baska bir stack yapısına aktaralım
 * daha sonra yeni stack yazdıralım
 * 
 */

import java.util.Stack;

public class StackOrnek {
	public static void main(String[] args) {
		Stack <Integer> stackList = new Stack<Integer>();
		Stack <Integer> lastStack = new Stack<Integer>();
		
		stackList.push(10);
		
	int sayi=	stackList.push(30);
	System.out.println(sayi);
		stackList.push(121);
		stackList.push(142);
		stackList.push(122);
		stackList.push(192);
		stackList.push(19);
        stackList.add(90);
		int toplam=0;
		while (!stackList.isEmpty()) {
			//int deger = stackList.peek(); bakıyo 
			int deger=stackList.peek();//en üstteki veriye  bakar
			System.out.println(deger);
			if (deger<100) {
				toplam+=stackList.pop();//en usteki veriyi cıkarır
				
			}else {
				lastStack.push(stackList.pop());
			}
			
		}
		while (!stackList.isEmpty()) {
			//int deger = stackList.peek(); bakıyo 
			int deger=stackList.pop();//en üstteki veriye  bakar
			
			if (deger<100) {
				toplam+=deger;//en usteki veriyi cıkarır
				
			}else {
				lastStack.push(deger);
			}
			
		}
		
		
		System.out.println(toplam);
		for (Integer integer : lastStack) {//pop kullanamayız çünkü azaltır
			System.out.println(integer);
			
		}
		System.out.println("while dongusu");
		while (!lastStack.isEmpty()) {
			System.out.println(lastStack.pop());
		}
		System.out.println(lastStack.size());
		
		
	}
	
	

	
	

}
