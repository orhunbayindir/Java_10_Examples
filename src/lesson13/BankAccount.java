package lesson13;
/*
 * 
 * bir interest rate account number birde balance özelliklerim var
 * 
 * şimdi bu sınıfı bir soyutlamamızı istiyorum bizim bankamızın faiz oranı 0.05 olsun
 * 
 * daha sonra faiz getirisini hesaplayan bir metot yazalım getInterestRate==>
 * 
 * bir de getInformation metodu yazıp hesap bilgilerimiz gosterelim
 * 
 */
public class BankAccount {
	
	static double interestRate;
	private double balance ;
	private String accountNumber;
	
	public BankAccount(String accountNumber,double balance) {
		this(accountNumber);//tek parametreli constrakter cağırımı 
	//this.accountNumber= accountNumber;//this sınıfı gösteri
	this.balance=balance;
		
	}
	
	public BankAccount(double balance, String accountNumber) {

		this(accountNumber, balance);
		// this.balance = 5892;

	}
	public BankAccount(String accountNumber) {
		this();//parametresiz constrakter cağırımı
		this.accountNumber= accountNumber;//this sınıfı gösteri
		//this.balance=100;
			
		}
	
	public BankAccount() {
		this.balance=100;
			
		}
	
	
	
	public void getInformation() {
		//System.out.println(this);
		//BankAccount bankAccount=this;
		System.out.println("-----Hesap Bilgileri--------");
		System.out.println("hesap numarası"+accountNumber);
		System.out.println("hesap bakiyesi"+balance);
		System.out.println("faiz oranı"+interestRate);
		System.out.println("faiz getirisi"+getInterestRate());
		
	}

	private double getInterestRate() {
	
		return balance*interestRate;
	}

	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance=balance;
		
	}
	
	public String getAccountNumber() {
		return accountNumber;
		
	}
	
	public void setAccountNumber(String accountNumber) {
		this.accountNumber=accountNumber;
		
	}
	
	
	
}
