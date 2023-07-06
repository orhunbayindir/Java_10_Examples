package lesson010;
/*
 * 
 * çarpım tablosu bir arrayin içine toplayacagız
 * 1ile 10 arasındaki sayılar için geçerli
 * 1*1=1;
 * 1*2=2;
 * .
 * 1*10=10;
 * 
 * 2*1=1
 * 2*2=4
 * 
 */
public class Question50 {
	public static void main(String[] args) {
		
		carpimTablosuYazdir(çarpımTablosu());
		
		
	}
	private static String[][] çarpımTablosu() {
		
		String[][]çarpımTablosu= new String[10][10]	;
		
//		String[][] array3= new String[2][3];
//		String[][] array2 = { {"1x1=1","1x2=2","1x3=3"},
//				{"2x1=2","2x2=4","2x3=6"},
//				 };//2e 3 bir array
//	
		
		for (int i = 0; i < çarpımTablosu.length; i++) {
			
			for (int j = 0; j < çarpımTablosu[i].length; j++) {
				çarpımTablosu[i][j]=(i+1) + "x" + (j+1) +"=" +((i+1)*(j+1)) ;
				
			}
			
			
		}
		return çarpımTablosu;
		
	}
	
	public static void carpimTablosuYazdir(String[][]dizi) {
		
		for (int i = 0; i < dizi.length; i++) {
			for (int j = 0; j < dizi[i].length; j++) {
				System.out.println(dizi[i][j]);
				
			}
			
		}
		
	}
}


