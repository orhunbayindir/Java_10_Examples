package lesson008;

/*
 * 1 metot yazalım bu metotta split kullanmadan
 * bu ifadeyi virgülden bulup şu çıktıyı elde edelim
 * Java
 * React
 * Spring
 * Google
 * 
 * 
 * 
 */


public class Question42__ {
	public static void main(String[] args) {
		
		String ifade = "Java,React,Spring,Google";
		
	  ifadeAyır(ifade);
	  ifadeAyır2(ifade);
	  ifadeAyır3(ifade);
	  System.out.println(ifadeAyır3(ifade));
	  //void metotları print metodunun içinde kullanamazsınız
	}
	
	
	public static String ifadeAyır3(String ifade) {
		
		
		ifade = ifade.replace(",", "\n");
		
		return ifade;
		
		
	}


	public static void ifadeAyır2(String ifade) {//?
		int index = 0;
		for (int i = 0; i < ifade.length(); i++) {
			
			if (ifade.charAt(i)==',') {
				System.out.println(ifade.substring(index,i));
				index=i+1;
				
			}

		}System.out.println(ifade.substring(index));
			
		}
		
		
		
	


	public static void ifadeAyır(String ifade) {
		
		for (int i = 0; i < ifade.length(); i++) {
			
			if (ifade.charAt(i)==',') {
				
				System.out.println();
			}else {
				System.out.print(ifade.charAt(i));
			}
			
		}
		
		

	}
	
	
	
	
	

}
