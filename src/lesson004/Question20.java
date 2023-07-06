package lesson004;

public class Question20 {
public static void main(String[] args) {
	
	double toplamTek = 0;
	double toplamCift = 0;
	
	for (int i = 0; i <=100; i++) {
		
		if (i%2==0) {
			
			
			toplamCift+=i;
			
		} else {
			toplamTek+=i;

		}
		
		
		
		
		
	}System.out.println("çiftlerin toplamı"+toplamCift);
	System.out.println(toplamTek);
	System.out.println(toplamCift/toplamTek);
}
}
