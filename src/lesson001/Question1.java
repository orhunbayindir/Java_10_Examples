package lesson001;

import java.util.List;

public class Question1 {
	// primitive veri tipleri
	/*
	 * değişken isimlerini adlandırmada camel case kullanılır
	 * 
	 * ilk harf kucuk daha sonra gelen yeni gelen yeni kelime varsa onun ilk harfi
	 * büyük olarak başlar
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {

		int sayi = 50;
		byte myByte = 25;
		short myShort = 5222;
		long myLong = 1_000_000_000;
		double myDouble = 120000.52;
		char myChar = 'A'; // ctrl alt yön tuşu
		char myChar2 = 65; // ascıı
		boolean myBoolean = true;
		float myFloat = 128.65f;

		// kısayol calıstırma ctrl f11

		System.out.println("int deger===>" + sayi);
		System.out.println("long deger===>" + myLong);
		System.out.println("byte deger===>" + myByte);
		System.out.println("short deger===>" + myShort);
		System.out.println("double deger===>" + myDouble);
		System.out.println("char deger===>" + myChar);
		System.out.println("char deger2===>" + myChar2);
		System.out.println("boolean deger===>" + myBoolean);
		System.out.println("float deger===>" + myFloat);

		System.out.println("int deger char karşılığı===>" + (char) sayi);

		System.out.println("iki char degerinin toplanması===>" + (myChar + myChar2));

		// Wrapper class (sarmalıyıcı Sınıflar)
		Integer myInteger = 529;
		Integer myInteger2 = null;
		int myInt = 0;
		System.out.println("Integer2 ==>" + myInteger2);

		myInteger2 = myInt;

		System.out.println("Integer ==>" + myInteger);
		System.out.println("Integer2 ==>" + myInteger2);
		System.out.println("int==>" + myInt);

		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);

		System.out.println(Integer.toString(myInt)); // Integer değeri stringe cevirmek için

		System.out.println("Double Max==>" + Double.MIN_VALUE + "min ==>" + Double.MAX_VALUE);
		System.out.println("long Max==>" + Long.MIN_VALUE + "min ==>" + Long.MAX_VALUE);
		System.out.println("short Max==>" + Short.MIN_VALUE + "min ==>" + Short.MAX_VALUE);
		System.out.println("byte Max==>" + Byte.MIN_VALUE + "min ==>" + Byte.MAX_VALUE);
		System.out.println("float Max==>" + Float.MIN_VALUE + "min ==>" + Float.MAX_VALUE);
		System.out.println("Integer Max==>" + Integer.MIN_VALUE + "min ==>" + Integer.MAX_VALUE);

		System.out.println("---------------------------");

		long number1 = 256; // bytei 0 çıkar
		byte number2 = 100;
		byte number3 = (byte) number2;
		byte number4 = (byte) number1;
		System.out.println(number3);
		System.out.println(number4);

		long result = number1 + number3;
		System.out.println(result);

		short number5 = (short) (number1 + number3);
		short number6 = (short) (number2 + number3);
		short number7 = (short) number2;
		long number8 = number7;

		System.out.println(number5);
		System.out.println(number6);

		double number9 = 25.4;

		double result2 = (long) number9 + number2;

		double result3 = number9 + number2;
		System.out.println(result2);
		System.out.println(result3);

		int number10 = 125 / 10;
		System.out.println(number10);

		float number11 = (float) (number9 + 10);
		double number12 = number11 + 10;

		System.out.println(number11);
		System.out.println(number12);

		String isim = "Orhun";
		System.out.println(isim + number10);
		String a = isim + number10;
		System.out.println(a);
		String deger1 = Integer.toString(number10);
		System.out.println(deger1.length());

		String deger2 = number10 + "";
		String deger3 = "" + number10;
		System.out.println(deger2);
		System.out.println(deger3);

	}

}
