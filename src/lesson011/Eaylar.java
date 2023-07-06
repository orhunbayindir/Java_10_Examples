package lesson011;

public enum Eaylar {
	HAZİRAN(30,"yaz"),TEMMUZ(31,"yaz"),AGUSTOS(31,"yaz"),EYLUL(30,"sonbahar"),EKİM(31,"sonbahar"),KASIM(30,"sonbahar"),ARALIK(31,"kış");//değer verince noktalı virgül koy
	
	int gun;
	String mevsim;
	

	Eaylar(int i,String deger) {
		gun =i;
		mevsim =deger;
	}
	
	
	public String mevsimGetir() {
		return mevsim.toUpperCase();		
	}
}
