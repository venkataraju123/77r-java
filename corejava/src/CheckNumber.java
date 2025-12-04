
public class CheckNumber {
	public String CheckgivenNumber(int num) {
		if (num>=0) {
			return "postive";
		
		}
			if (num<=0) {
				return "Negative";
			}
			return "0";
		
	}

	public static void main(String[] args) {
		System.out.println(new CheckNumber().CheckgivenNumber(-3));
		

	}

}
