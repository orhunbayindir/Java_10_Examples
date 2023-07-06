package lesson13;

public class StaticOrnek {
	
	int number1;//nesne değişkeni-nesne özelliği
	static int number2;//sınıf değişkeni sınıf özelliğidir
	                  //com.bilgeadam.lesson13.StaticOrnek.number2
	
	public void numaraVer() {
		System.out.println("Numara ver metodu");
		number1 +=1;
		number2 +=1;
		System.out.println("number1==>"+number1);
		System.out.println("number2==>"+number2);
	}

	
	
	public static void numaraVer2() {
		
		System.out.println("Numara 2 metodu");
		number2++;
		System.out.println(number2);
		
		
		
		//System.out.println(number1); static bir metot içinde static olmayan bir özelliği direk
		//olarak kullanamayız kullanmak için nesne oluşturmamız gerekli
		StaticOrnek staticOrnek= new StaticOrnek();
		staticOrnek.number1=10;
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		number2=5;
		StaticOrnek.number2=10;
		
		StaticOrnek staticOrnek= new StaticOrnek();
		staticOrnek.number1=10;
		
		System.out.println(number2);
		System.out.println(staticOrnek.number1);
		staticOrnek.numaraVer();
		staticOrnek= new StaticOrnek();
		staticOrnek.numaraVer();
		staticOrnek.numaraVer();
		
		StaticOrnek staticOrnek2= new StaticOrnek();
		System.out.println(staticOrnek2.number1);//0
		System.out.println(staticOrnek.number1);//0
		System.out.println(staticOrnek2.number2);//13
		System.out.println(staticOrnek.number2);//13
		
		
	}
}
