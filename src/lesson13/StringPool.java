package lesson13;

public class StringPool {
	
  public static void main(String[] args) {
	
	String isim = "Mustafa";
	String isim2="Mustafa";
	System.out.println(isim==isim2);//aynı yeri gösterecek
	
	String isim3="Mustafa Ozturk";
	String isim4="Mustafa Ozturk";
	isim4="Mustafa ÖZTÜRK";
	
	isim4="Serkan";//yeni bir yere kayıtlı tutuluyo
	
	
	String isim5="Mustafa ÖZTÜRK";
	isim4=isim5;
	System.out.println(isim4=isim5);
	
	String isim6 = new String("Hilal");
	String isim7 = new String("Hilal");//heap bellek
	String isim8 = new String("Hilal");
	isim6=isim8;
	isim7=isim8;
	isim8="xxx";
	
	System.out.println(isim8==isim7);
	System.out.println(isim7);
	String isim9="Hilal";
	String isim10 = new String("Hilal").intern();
	//isim7.intern();
	System.out.println(isim10==isim9);
	
	
}
	
}
