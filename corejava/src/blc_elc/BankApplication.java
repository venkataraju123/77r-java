package blc_elc;

public class BankApplication {
	public static void main(String[] args) {
		BankAccount b1=new BankAccount();
		b1.setAccountNumber(586215614524l);
		b1.setAccountHolderName("raju");
		b1.setBalance(789.236);
		System.out.println("------SBI BANK-------");
		System.out.println("Accountnumber :"+ b1.getAccountNumber());
		System.out.println("\nAccountHolderName :"+ b1.getAccountHolderName());
		System.out.println("\nAccount balance :"+b1.getBalance());
		
	}

}
