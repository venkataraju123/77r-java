
public class Eligibility {
	public boolean canVote(int age) {
		if (age >18) {
			return true;
		}
		return false;
		
		
	}

	public static void main(String[] args) {
		Eligibility e= new Eligibility();
		System.out.println("Can vote (Age 20)? " + e.canVote(20)) ;
		if (e.canVote(89)) {
			
		}
	}

}
