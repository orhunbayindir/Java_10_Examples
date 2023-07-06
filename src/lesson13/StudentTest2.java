package lesson13;

public class StudentTest2 {
	public static void main(String[] args) {
		
		Student student1= Student.kayıtMetodu2();
		Student student2 = new Student();
		student2=Student.kayıtMetodu2();
		Student student3=Student.kayıtMetodu2();
		
		
		
		
		System.out.println(Student.index);
		System.out.println(student1.no);
		System.out.println(student2.no);
		
	}

}
