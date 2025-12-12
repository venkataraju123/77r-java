package Primenumber;
//A Harshad number is a number that is divisible by the sum of its digits.
public class Harshadnumber {
	public static boolean isharsadnumber(int num) {
		int temp=num;
		int sum=0;
		while(num!=0) {
			int rem=num%10;
			sum=sum+rem;
			num/=10;
		}
		return(temp%sum==0);
		
	}
 public static void main (String[]args) {
	 System.out.println(isharsadnumber(81)? "harsadnumber":"not harsadnumber");
 }
}
