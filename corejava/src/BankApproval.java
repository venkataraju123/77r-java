
public class BankApproval {
	public String checkLoanApproval(double salary,int creditScore){
		if (salary>80000 && creditScore>750) {
			return"loanApproval";
		}
		else if (salary >=50000&& salary<=80000&& creditScore>=650&&creditScore<=750) {
			return "loan approved with highest intrest rate";			
		}
		else if (salary >=30000&& salary<=50000&& creditScore>=500&&creditScore<=650) {
			return "co signature Required";
		}
		else {
			return "loan rejected";
		}
		
		
	}

	public static void main(String[] args) {
		BankApproval l=new BankApproval();
		System.out.println("your'sloan approval is:"+l.checkLoanApproval(50000,500));
	

	}

}
