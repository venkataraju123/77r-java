package corejava;

public class Showroom {
	String carbrand;
	double carprice;
	public void carDetails(String brand,double price) {
	carbrand=brand;
	carprice=price;
	}
	public void displayCar() {
		
     System.out.println("\ncarbrand :"+ carbrand+"\ncarprice :"+ carprice);
	}

	public static void main(String[] args) {
		Showroom c1=new Showroom();
		c1.carDetails("Tesla",75000.5);

     c1.displayCar();
	}

}


	