package blc_elc;

public class CarRentals {

	public static void main(String[] args) {
		CarRental c1=new CarRental();
		c1.setcarId(456);
		c1.setbrand("tesla");
		c1.setmodel("xyz");
		c1.setrentalPricePerDay(456.3);
		CarRental c2=new CarRental();
		c2.setcarId(968);
		c2.setbrand("suzuki");
		c2.setmodel("swift");
		c2.setrentalPricePerDay(2000.0);
		System.out.println("---CAR RENTAL SYSTEM---");
		System.out.println("\nCARID :"+c1.getcarId());
		System.out.println("\nBRAND :"+c1.getbrand());
		System.out.println("\nMODEL :"+c1.getmodel());
		System.out.println("\nRENTAL:"+c1.getrentalPricePerDay());
		System.out.println("\n---car2 rentalsystem-------------");
		System.out.println("\nCARID :"+c2.getcarId());
		System.out.println("\nBRAND :"+c2.getbrand());
		System.out.println("\nMODEL :"+c2.getmodel());
		System.out.println("\nRENTAL:"+c1.getrentalPricePerDay());
		System.out.println();
		System.out.println();
		
		

	}

}
