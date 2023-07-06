package lesson20;


import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.swing.text.html.parser.Entity;

public class MapOrnek {

	public static void main(String[] args) {
		
		Map<String, String>map = new HashMap<>();
		
		map.put("06", "Ankara");
		map.put("05", "Amasya");
		map.put("06", "ankara");
		map.put("08", "Artvin");
		
		
		
		System.out.println(map.get("06"));//sonuncuyu alır
		System.out.println(map.get("08"));
		
		map.replace("05", "AMASYA");
		System.out.println(map.get("05"));
		
		
		System.out.println(map.containsKey("10"));
		System.out.println(map.containsKey("05"));
		System.out.println(map.containsValue("Artvin"));
		System.out.println(map.containsValue("Bolu"));
		
		
		
		for (Entry<String , String > value : map.entrySet()) {
			System.out.println(value);
			System.out.println(value.getKey()+"-"+value.getValue());
			
		}
		System.out.println("Key set");
		for (String string : map.keySet()) {
			System.out.println(string+"-"+map.get(string));
			
		}
	Collection<String>    iller = map.values();
	
	for (String string : iller) {
		System.out.println(string);
		
	}
	System.out.println("for each yapısı");
	map.forEach((k,v)->System.out.println(k+"==>"+v));
	
	List<String>list = new ArrayList<>(List.of("Java","react","Spring"));
	list.forEach((x)->System.out.println("-"+x+"-"));
	
	
		
		
	}
	
	
	
}
