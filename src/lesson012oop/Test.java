package lesson012oop;

public class Test {
	
	public static void main(String[] args) {
		
		UserProfile profile1= new UserProfile();
		profile1.name="Mustafa";
		profile1.surName="Öztürk";
		profile1.username="musty";
		profile1.followers=100;
		profile1.following=90;
		profile1.repositories=85.0;
		
		
		System.out.println(profile1.username);
		System.out.println(profile1.name+" "+profile1.surName);//değer atamazsak null
		System.out.println(profile1.followers);//deger atamazsak 0
		System.out.println(profile1.following);// deger atamazsak 0 gelecek
		System.out.println(profile1.repositories);//deger atamazsak 0.0 gelecek
		profile1.editProfile();
		profile1.createRepository();
		
		
		UserProfile profile2=new UserProfile();
		profile2=profile1;
		System.out.println(profile2.name);
		
		UserProfile profile3=profile2;
		System.out.println(profile3.name);
		
		System.out.println("profil3==>"+profile3);//konumu
		System.out.println("profil1==>"+profile1);
		
		
		UserProfile profile4=new UserProfile();
		profile4.name="Mustafa";
		profile4.surName="Öztürk";
		profile4.username="musty";
		profile4.followers=100;
		profile4.following=90;
		profile4.repositories=85.0;
		
		System.out.println("profil4==>"+profile4);
		
		
		UserProfile profile5=new UserProfile();
		
		
		profile5.name="Burhan";
		profile5.editProfile();
		System.out.println(profile5.followers);
		profile5.RandomFollewers();
		System.out.println(profile5.followers);
		
		System.out.println(profile4.equals(profile1));
		System.out.println(profile3.equals(profile1));
		
		
		profile1.getInformation();
		profile5.getInformation();
		profile3.getInformation();
	
		
		
		
	}

}
