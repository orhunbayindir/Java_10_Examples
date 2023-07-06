package lesson13;

import java.awt.Adjustable;
import java.util.Scanner;

/*
 * 
 * 
 * öğrencinin bir numarası bir isimi olsun
 * daha sonra kayıt metodu yazalım
 * Mustafa adlı ogrenci basarı ile kayıt edildi ogrenci numarası 1
 *  Serkan adlı ogrenci basarı ile kayıt edildi ogrenci numarası 2
 * 
 */
public class Student {
	String name ;
static	int index;
int no;
	
	
	
	
	
//public static void main(String[] args) {
//	
////	kayıtMetodu(StudentTest.number1,StudentTest.adi1);
////	kayıtMetodu(StudentTest.number2,StudentTest.adi2);
////	
//}



public void kayıtMetodu() {
	
	index++;
	no=index;
	
	 
	System.out.println("----------------");
	System.out.println(name+"adlı ogrenci başarı ile kayıt olmuştur");
	System.out.println("öğrenci numarası"+no);
	
//	System.out.println(string+" adlı öğrenci kayıt olmuştur " +(++Student.ogrenciKayıt));
	
	

}
public void kayıtOl() {
	index++;
	no = index;
	System.out.println("==============");
	System.out.println(name + " adlı ogrenci başarı ile kayıt olmustur");
	System.out.println("ogrenci numarası=" + no);
	System.out.println("=============");

}

public static Student kayıtMetodu2() {
	
	index++;
	Student student = new Student();
	Scanner scanner = new Scanner(System.in);
	System.out.println("Lütfen öğrenci isimini giriniz");
	
	student.name =scanner.nextLine();
	student.no=index;
	
	 
	System.out.println("----------------");
	System.out.println(student.name+"adlı ogrenci başarı ile kayıt olmuştur");
	System.out.println("öğrenci numarası"+student.no);
	
	return student;
	
//	System.out.println(string+" adlı öğrenci kayıt olmuştur " +(++Student.ogrenciKayıt));
	
	

}







}
