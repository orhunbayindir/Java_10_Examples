package lesson011;

public class EnumTest {

	public static void main(String[] args) {
		
		Eaylar haziran = Eaylar.HAZİRAN;
		
		//Stringe çevirme metotları
		String haziranString = Eaylar.HAZİRAN.toString();
		String haziranString2=Eaylar.HAZİRAN.name();
		
		System.out.println(haziran);
		System.out.println(haziranString);
		System.out.println(haziranString2);
		//enumun sırasını bir int defer alma yani indexini alma
		System.out.println(Eaylar.HAZİRAN.ordinal());
		System.out.println(Eaylar.TEMMUZ.ordinal());
		System.out.println(Eaylar.AGUSTOS.ordinal());
		
		//bir stringi enuma cevirme
		String ay="temmuz";
		
		Eaylar enumAy=Eaylar.valueOf(ay.toUpperCase());
		System.out.println(enumAy);
		
		
		//Bir enum yapısın araya çevirme
		Eaylar[] dizi = Eaylar.values();
		System.out.println("------------------");
		
		for (Eaylar ay1:dizi) {
			if (ay1.gun==30&& ay1.mevsim.equalsIgnoreCase("yaz")) {
				
			
			System.out.println((ay1.ordinal()+1) +"-"+ay1.toString());
			System.out.println(ay1.mevsimGetir());
			}
		}
		
		System.out.println(Eaylar.HAZİRAN.gun);
		
		
		
	}
}
