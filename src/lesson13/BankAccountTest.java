package lesson13;

public class BankAccountTest {

	public static void main(String[] args) {
		
		BankAccount.interestRate=0.08;
		BankAccount bankAccount1= new BankAccount("123",12434);
		//bankAccount1.accountNumber="123";
		//bankAccount1.balance=1258.50;
		
		bankAccount1.getInformation();
	
		
		BankAccount bankAccount2=new BankAccount("1456",149868);
		//bankAccount2.accountNumber="456"; set ve getle yaptık
		bankAccount2.setAccountNumber("456");
		
		
		//bankAccount2.balance=561258.50;
		bankAccount2.setBalance(561258.50);
		
		bankAccount2.getInformation();
		
		BankAccount bankAccount3=new BankAccount("987", 1589);
		bankAccount3.getInformation();
		
		BankAccount bankAccount4=new BankAccount("2121");
		bankAccount3.getInformation();
		
		BankAccount bankAccount5 = new BankAccount(500, "11125");
		
		
		double sayi = bankAccount5.getBalance();
		sayi = 5689;
		System.out.println(bankAccount5.getBalance());
		System.out.println(bankAccount5.getAccountNumber());
		
		
	}
}
