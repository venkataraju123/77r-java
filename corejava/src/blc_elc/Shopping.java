package blc_elc;

public class Shopping {

	public static void main(String[] args) {
		Product p1=new Product();
		p1.setproductId(102);
		p1.setproductName("rice");
		p1.setprice(100.3);
		p1.setquantity(8);
		Product p2=new Product();
		p2.setproductId(111);
		p2.setproductName("wheat");
		p2.setprice(8000);
		p2.setquantity(9);
		System.out.println("--------change the values--------");
		p1.setprice(50);
		p2.setquantity(50);
		
		System.out.println(p1.getproductId());
		System.out.println(p1.getproductName());
		System.out.println(p1.getprice() );
		System.out.println(p1.getquantity());

		System.out.println("-----------p2------------");
		System.out.println("\n p2 detalis");
		System.out.println("\nproductId :"+p2.getproductId());
		System.out.println("\nproductname :"+p2.getproductName());
		System.out.println("\nproductprice :"+p2.getprice() );
		System.out.println("\nproductquantity :"+p2.getquantity());

	}

}
