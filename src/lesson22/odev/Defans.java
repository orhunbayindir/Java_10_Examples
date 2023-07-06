package lesson22.odev;
//14-Defans oyuncularımız pasver şutçek markaj yap topamudahale gibi davranışlarasahiptir
public class Defans extends Futbolcu{

	int topCalma;
	int markaj;
	int sıcrama;

	
	

	
	
	public Defans(Boolean aktif, String ad, String mevki, int numara, int hiz, int pas, int topsurme, int sut,
			int passayisi, int topCalma, int markaj, int sıcrama) {
		super(aktif, ad, mevki, numara, hiz, pas, topsurme, sut, passayisi);
		this.topCalma = topCalma;
		this.markaj = markaj;
		this.sıcrama = sıcrama;
	}
	public void pasver(){    
		
	    setPassayisi(getPassayisi()+1);
        if (getPassayisi()%3==0) {
        	System.out.println("Şut çekildi");
			
		}
        System.out.println("Pas verildi");
       
    }
	
	
   public void topamudahale(){
        System.out.println("topamudahaleyeteneği");
    }
	
	
}
