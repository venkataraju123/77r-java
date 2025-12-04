
public class EvenOdd{
	
	public boolean  isEven(int num){
		if(num%2==0) {
			return true;
		} 
		return false;
		
	}

	public static void main(String[] args) {
		EvenOdd b=new EvenOdd();
		System.out.println(b.isEven(56));

	}

}
