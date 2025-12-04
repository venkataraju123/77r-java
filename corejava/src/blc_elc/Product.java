package blc_elc;

public class Product {
	int productId;
	String productName;
	double price;
	int quantity;
public	int getproductId() {
		return productId;
	}
public String getproductName(){
	return productName;
}
public double getprice() {
	return price;
}
public int getquantity() {
	return quantity;
}
public void setproductId(int pro) {
	productId=pro;
}
public void setproductName(String pname ) {
	productName=pname;
}
public void setprice(double pri) {
	price=pri;
}
public void setquantity(int quant) {
	quantity=quant;
}

}
