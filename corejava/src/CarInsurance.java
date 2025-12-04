
public class CarInsurance {
	public String calculatePremium(int age,int experience) {
		if ((age<=50)&&(experience <10)){
			return "lowestPremium";
		}
		else if ((age>30)&&(age>=50)&&(experience>=5)) {
			return "moderate premium";
		}
		else if ((age>18)&&(age>=30)&&(experience<5)) {
			return "Highest premium";
		}
		else {
			return "NotEligible for the insurance";
		}
	}

	public static void main(String[] args) {
		CarInsurance c=new CarInsurance();
		System.out.println(c.calculatePremium(75, 10));
		
		

	}

}
