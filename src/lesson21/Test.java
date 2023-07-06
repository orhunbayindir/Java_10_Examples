package lesson21;

import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		
		SansliNumaralar sansliNumaralar=new SansliNumaralar();
		sansliNumaralar.mapOlustur();
		sansliNumaralar.listeOlustur();
		sansliNumaralar.sansliNumaraliBul();
		
		sansliNumaralar.map.forEach((k,v)->System.out.println(k+"-"+v));
		
		for (Entry<Integer, Integer> deger : sansliNumaralar.map.entrySet()) {
			System.out.println(deger.getKey()+"===>"+deger.getValue());
			
		}
		//Set<Integer>keySet=sansliNumaralar.map.keySet(); bunu yapıyo aslında asağıdaki
		int toplam=0;
		for (Integer key : sansliNumaralar.map.keySet()) {
			System.out.println(key+"==>"+sansliNumaralar.map.get(key));
			toplam+=sansliNumaralar.map.get(key);
		}
		System.out.println("Toplam uretilen sayı miktarı"+toplam);
		
		System.out.println("Liste uzunlugu"+sansliNumaralar.list.size());
		for (Integer sayi : sansliNumaralar.list) {
			System.out.println(sayi);
		}
		System.out.println("Set uzunlugu"+sansliNumaralar.set.size());
		for (Integer sayi : sansliNumaralar.set) {
			System.out.println(sayi);
		}
		System.out.println("-----------------");
		
		
		
	}
}
