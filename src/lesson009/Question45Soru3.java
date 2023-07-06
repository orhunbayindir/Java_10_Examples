package lesson009;

public class Question45Soru3 {
public static void main(String[] args) {
	
	karakterSayici("Bugün güzel bir gün",'g');
	
}

private static void karakterSayici(String string, char c) {
	
	
	int sayac = 0;
	String s=String.valueOf(c);  
	char karakter = s.charAt(0);
	if (!string.contains(s.substring(0, 1))) {
		System.out.println("0");
		return;
	}
	for (int i = 0; i < string.length(); i++) {
		if (string.charAt(i) == karakter) {
			sayac++;
		}
	}
	System.out.println(sayac);
}
	
}

