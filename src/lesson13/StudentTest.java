package lesson13;
/*
 * 
 * 
 * öğrencinin bir numarası bir isim olsun
 * daha sonra kayıt metodu yazalım
 * Mustafa adlı ogrenci basarı ile kayıt edildi ogrenci numarası 1
 *  Serkan adlı ogrenci basarı ile kayıt edildi ogrenci numarası 2
 * 
 */
public class StudentTest {

//	static String adi1="Mustafa";
//	static String adi2="Serkan";
//	static int number1 = 1234;
//	static int number2 = 5678;

	public static void main(String[] args) {
		
		Student student1 = new Student();
		student1.name="Mustafa";
		student1.kayıtMetodu();
		
		Student student2 = new Student();
		student2.name = "Serkan";
		student2.kayıtMetodu();
		
		Student student3 = new Student();
		student3.name = "Hilal";
		student3.kayıtMetodu();
		
		Student student4 = new Student();
		student4.name = "Hilal";
		student4.kayıtMetodu();
		
		System.out.println(student1.no);
		System.out.println(student2.no);
		System.out.println(student3.no);
		System.out.println(student4.no);
		
		System.out.println("Toplam kayıylı öğrenci sayısı"+Student.index);
		
		
	}
}
