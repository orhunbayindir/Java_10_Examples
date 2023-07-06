package lesson012oop;

import java.util.Random;

public class UserProfile {
	
	String avatar;
	String username;
	String name;
	String surName;
	int followers;
	Integer following;
	double repositories;
	
	public void editProfile() {
		System.out.println(name+" Profilini düzenlendi");
	}
	public void createRepository() {
		System.out.println("Yeni bir repository oluşturuldu");
	}
	
	
	
	
	public void RandomFollewers() {
		Random random = new Random();
		followers=random.nextInt(1,10000000);
		
	}

	
	
	public void getInformation() {
		System.out.println("========Profil Bilgileri=============");
		System.out.println("isim soyisim"+name+" "+surName);
		System.out.println("Kullanıcı ismi= "+ username);
		System.out.println("followers= "+ followers);
		System.out.println("following= "+ following);
		System.out.println("repositories= "+ repositories);
	}
}
