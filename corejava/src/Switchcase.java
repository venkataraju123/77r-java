
public class Switchcase {
	public void collegeRollNumber(int rollnum) {
		switch(rollnum) {
		case 551:
			System.out.println("vivek's rollnumber");
			break;
		case 552:
			System.out.println("Ramu's rollnumber");
			break;
		case 553:
			System.out.println("venky's rollnumber");
			break;
			default :
				System.out.println("you are entered invaild number");			
		}		
	}
	public static void main(String[] args) {
		Switchcase s=new Switchcase();
s.collegeRollNumber(553)	;	

	}

}
