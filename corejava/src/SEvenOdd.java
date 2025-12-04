
public class SEvenOdd {
public boolean printData(int num) {
	if(num%2==0) {
		return true; 
	}
	else {
		return false;
	}
	
}
	public static void main(String[] args) {
		SEvenOdd s=new SEvenOdd();
System.out.println(s.printData(56));
	}

}
