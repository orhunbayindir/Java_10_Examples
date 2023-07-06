package lesson19.stack.set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
 * bir set olusturalım bu sete film kategorisi ekleyecegiz
 * kategorisi ekle diye bir metot yazıp dısarıdan veri alacagız ve
 * sete ekleyecegiz eger 
 * kategori daha once eklenmisse bu kategori daha once eklenmistir cıktısı versin
 * eklenmemis ise kategori basarı ile eklenmistir
 * 
 * 
 * 
 */

public class SetOrnek {
	Set<String> kategoriler= new HashSet<>();
	Scanner scanner= new Scanner(System.in);
	
	
	public static void main(String[] args) {
		SetOrnek setOrnek=new SetOrnek();
		setOrnek.kategoriEkle();
		setOrnek.kategoriEkle();
		setOrnek.kategoriEkle();
		setOrnek.kategoriEkle();
		
		
		setOrnek.kategoriler.add("Drama");
		setOrnek.kategoriler.add("Anime");
		
		
		setOrnek.kategoriEkle2();
		
		
		for (String string : setOrnek.kategoriler) {//static olmadığı için set
			System.out.println(string);
		}
		
		
		
		
		
	}
	
	public void kategoriEkle() {
		System.out.println("Lütfen bir kategori giriniz");
		String kategori=scanner.nextLine().toUpperCase();
		if (kategoriler.contains(kategori)) {
			System.out.println(kategori+"Daha önce eklenmiştir");
			kategoriler.add(kategori);
			
		}else {
			System.out.println(kategori+"başarılı bir şekilde eklenmiştir");
			kategoriler.add(kategori);
		}
		
		
	}
	
	public void kategoriEkle2() {
		System.out.println("Lütfen bir kategori giriniz");
		String kategori=scanner.nextLine().toUpperCase();
		if (!kategoriler.add(kategori)) {
			System.out.println(kategori+"Daha önce eklenmiştir");
			
			
		}else {
			System.out.println(kategori+"Daha önce eklenmiştir");
		
		}
		
		
	}

}
