package lesson19.stack;
/*
 * 
 * tabak sınıfımızda tabaklarımızın idsini ve kirli olup olmadığını tutalım 
 * daha sonra bir manager sınıfı oluşturup
 * bu manager sınıfında 10 tane tabak uretelim ve kirli olup olmadıkları rastgele gelsin
 * 
 * temizleri bir stacke kirlileri başka bir stackde tutalım
 * 
 * 
 * kullan metodu oluşturalım ==> temizler stackinden bir tabak alıp kirleteceğiz
 * 
 * temizle ve kullan metodunda eğer stacklerimiz bossa ytemizle metodunda kullan calıssın 
 * kullan metodunda temizle
 * 
 * daha sonra secim yap metodu olusturacagız dısarıdan 1 veya 2 degerini alacak gelen deger 1 ise temizle 2 ise kullan metodu calıssın
 * 
 * Test sınıfında 50 kere calısan dongu olsun herdefasında random bir secim uretip
 * secim yap metodu kullanacagız
 * 
 */

public class  Tabak {
	
	private int id;
	private boolean kirliMi;
	public Tabak(int id, boolean kirliMi) {
		super();
		this.id = id;
		this.kirliMi = kirliMi;
	}
	
	public Tabak(int id) {
		super();
		this.id = id;
	}
	
	
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public boolean isKirliMi() {
		return kirliMi;
	}
	public void setKirliMi(boolean kirliMi) {
		this.kirliMi = kirliMi;
	}
	@Override
	public String toString() {
		return "Tabak [id=" + id + ", kirliMi=" + kirliMi + "]";
	}
	
	

}
