package lesson22.odev;
//15-Forvetlerimiz pasver şutçek markajdanKaçma gibi davranışlarasahiptir
public class Forvet extends Futbolcu{
	private int bitiricilik;
	private int kafavurusu;

	
	

	   public Forvet(Boolean aktif, String ad, String mevki, int numara, int hiz, int pas, int topsurme, int sut,
			int passayisi, int bitiricilik, int kafavurusu) {
		super(aktif, ad, mevki, numara, hiz, pas, topsurme, sut, passayisi);
		this.bitiricilik = bitiricilik;
		this.kafavurusu = kafavurusu;
	}
	   
	public void pasver(){    	
	    setPassayisi(getPassayisi()+1);
        if (getPassayisi()%3==0) {
        	System.out.println("Şut çekildi");
			
		}
        System.out.println("Pas verildi");
       
    }
	   public void markajdanKaçma(){
	        System.out.println("markajdan Kaçma yeteneği");
	    }

}
