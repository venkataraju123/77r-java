package blc_elc;

public class BankAccount {
		long AccountNumber;
		String AccountHolderName;
		double Balance;
		long getAccountNumber() {
			return AccountNumber;
		}
		String getAccountHolderName() {
			return AccountHolderName;
	}
		double getBalance() {
			return Balance;
		}
	void setAccountNumber(long anumber) {
		AccountNumber=anumber;	
	}
	void setAccountHolderName(String ahname) {
		AccountHolderName=ahname;	
		}
	void setBalance(double bal) {
		Balance=bal;
	}
	}



