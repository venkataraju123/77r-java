package loops;

public class Neonnumber {	
 public boolean getNeon(int n) {
			int square=n *n;
			int temp=n;
			int sum=0;
			while(square !=0) {
				int rem=square%10;
				sum=sum+rem;
				square /=10;
			}
			return sum == temp;
		}

		public static void main(String[] args) {
			
			for(int i=1; i<=100; i++ ) {
				Neonnumber n =new Neonnumber();
				boolean result=n.getNeon(i);
				if (result)
					System.out.println(i);
				}
			}
			
		}

	
	


