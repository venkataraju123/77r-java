
public class EmployeeBonus {
	public double calculateBonus(int experience,int rating ,double salary) {
		if((experience>=5)&&(rating>=9)) {
			return salary*0.50;}
			else if ((experience>=3)&&(experience<=5)&&(rating>=7)&&(rating<=9)){
				return salary*0.30;				
		}
			else if((experience>=1)&&(experience<=3)&&(rating>=5)&&(rating<=7)) {
				return salary*0.10;
			}else {
				return 0;
			}
	}

	public static void main(String[] args) {
		EmployeeBonus e=new EmployeeBonus();
		System.out.println(e.calculateBonus(0,0,0));

	}

}
