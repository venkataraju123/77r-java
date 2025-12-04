
public class checkDivisiblity {
public boolean isDivisibleBy5(int num) {
	if (num % 5== 0) {
		return true;
	}
	return false;
	
}
	public static void main(String[] args) {
		checkDivisiblity b=new checkDivisiblity();
		System.out.println("Is 15 divisible by 85 :"+ b.isDivisibleBy5(90));

	}

}
