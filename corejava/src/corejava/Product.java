package corejava;

public class Product {
	String productname;
	int Idname;
	int productprice;
	public void addProductDetails(String product,int Id, int price) {
		productname=product;
		Idname=Id;
		productprice=price;
		
	}
	public String displayDetails() {
		return " productname :"+productname+" ,Idname :"+Idname+", productprice : "+productprice;
	}

	public static void main(String[] args) {
		Product obj1=new Product();
		obj1.addProductDetails("TATA TEA",5623,200);
		String res=obj1.displayDetails();
		System.out.println(res);
		Car obj2=new Car();
		obj2. addCarDetails("tesla","XYZ",2002);

		obj2.displayDetails();
		
		System.out.println(		obj2.displayDetails());
		

	}

}
