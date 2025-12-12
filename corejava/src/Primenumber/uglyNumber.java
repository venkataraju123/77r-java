package Primenumber;
/*An ugly number is a number that can be completely divided 
 (factorized) using only 2, 3, and 5.
In other words, its prime factors must be only 2, 3, or 5.

If any other number (like 7, 11, 13…) divides it,
 then it is not an ugly number.
*/
public class uglyNumber {
	public static boolean isuglyNumber(int num) {
		if (num<=0) {
			return false;
		}
		while(num>0) {
			if(num%2==0) {
				num=num/2;				
			}
			else if(num%3==0) {
				num/=3;
			}
			else if(num%5==0) {
				num%=5;
			}
			else {
				break;
			}
		}
		return num ==1;
	}
public static void main(String[]args) {
	uglyNumber u=new uglyNumber();
	System.out.println((u.isuglyNumber(12))?"uglynumber":"not a ugly number");
}
}
