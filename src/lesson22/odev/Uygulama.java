package lesson22.odev;

import javax.management.loading.PrivateClassLoader;


public class Uygulama {
public static void main(String[] args) {
	
	Kaleci kaleci = new Kaleci(true,"Mert Günok", "Kaleci", 34, 12, 0, 0, 0, 0, 0,0);
	
	Defans defans1 =new Defans(true,"Arthur Masuaku", "Defans", 25, 12, 0, 0, 0,0,0,0,0);
	Defans defans2 =new Defans(true,"Omar Colley", "Defans", 6, 12, 0, 0, 0,0,0,0,0);
	Defans defans3 =new Defans(true,"Tayyib Talha Sanuç", "Defans", 3, 12, 0, 0, 0,0,0,0,0);
	
	Ortasaha ortasaha1=new Ortasaha(true,"Onur Bulut", "Ortasaha", 24, 12, 0, 0, 0,0,0,0,0);
	Ortasaha ortasaha2=new Ortasaha(true,"Amir Hadziahmetovic", "Ortasaha",19, 12, 0, 0, 0,0,0,0,0);
	Ortasaha ortasaha3=new Ortasaha(true,"Rachid Ghezzal", "Ortasaha", 18, 12, 0, 0, 0,0,0,0,0);
	Ortasaha ortasaha4=new Ortasaha(true,"Salih Uçan", "Ortasaha", 8, 12, 0, 0, 0,0,0,0,0);
	Ortasaha ortasaha5=new Ortasaha(true,"Gedson Fernandes", "Ortasaha", 83, 12, 0, 0, 0,0,0,0,0);
	
	Forvet forvet1=new Forvet(true,"Cenk Tosun", "Forvet", 9, 12, 0, 0, 0,0,0,0);
	Forvet forvet2=new Forvet(true,"Vincent Aboubakar", "Forvet", 10, 12, 0, 0,0, 0,0,0);
	
	Forvet forvet3=new Forvet(false,"Orhun Bayındır", "Forvet", 95, 100, 100, 100, 100,100,100,0);
	
   ortasaha1.pasver();
   ortasaha1.pasver();
   forvet1.pasver();
   ortasaha1.pasver();
   
   

 
}}
