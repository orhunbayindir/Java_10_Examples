package lesson22.odev;

import java.util.Random;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;

//16-Ortasaha oyuncularımız pasver sutcekarapasıvergibi davranışlarasahiptir
public class Ortasaha extends Futbolcu{
        Random random=new Random();
	    private int ozelyetenek;
		private int uzunTop;
		private int uretkenlik;
	    
		
		
	
		
	



		public Ortasaha(Boolean aktif, String ad, String mevki, int numara, int hiz, int pas, int topsurme, int sut,
				int passayisi, int ozelyetenek, int uzunTop, int uretkenlik) {
			super(aktif, ad, mevki, numara, hiz, pas, topsurme, sut, passayisi);
			this.ozelyetenek = ozelyetenek;
			this.uzunTop = uzunTop;
			this.uretkenlik = uretkenlik;
		}


		public void pasver(){    
			     
			    setPassayisi(getPassayisi()+1);
		        if (getPassayisi()%3==0) {
		        	System.out.println("Şut çekildi");
					
				}
		        System.out.println("Pas verildi");
		       
		    }
		   

		      public void arapasıver(){
		        System.out.println("arapasıver yeteneği");
		    }
		
}
