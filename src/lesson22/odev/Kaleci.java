package lesson22.odev;
//17-Kalecilerimiz kurtarışyap ve degaj yap davranışınasahiptir
public class Kaleci extends Futbolcu{


	int kurtaris;
	int gorusAlani;
	
	
	
	public Kaleci(Boolean aktif, String ad, String mevki, int numara, int hiz, int pas, int topsurme, int sut,
			int passayisi, int kurtaris, int gorusAlani) {
		super(aktif, ad, mevki, numara, hiz, pas, topsurme, sut, passayisi);
		this.kurtaris = kurtaris;
		this.gorusAlani = gorusAlani;
	}
	public void kurtarışyap(){
	        System.out.println("kurtarışyapma yeteneği");
	    }
	   public void degajyap(){
	        System.out.println("degaj yap yeteneği");
	    }

}
