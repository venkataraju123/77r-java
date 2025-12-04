
public class PostiveNegative {
	public String checkNumber(int num) {
		if(num>0){
		return "positive";
	} 
		if (num<0) {
		return "negative";
		}
return null;
	}
	public static void main(String[] args) {
		PostiveNegative p=new PostiveNegative();
		System.out.println("check  :"+p.checkNumber(62));

		
	}

}
