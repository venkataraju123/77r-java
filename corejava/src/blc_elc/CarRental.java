package blc_elc;

public class CarRental {
	int carId;
	String brand;
	String model;
	double rentalPricePerDay;
	int getcarId() {
		return carId;		
	}
	String getbrand() {
		return brand;
	}
	String getmodel() {
		return model;
	}
	double getrentalPricePerDay() {
		return rentalPricePerDay;
	}
	void setcarId(int car) {
		carId=car;
	}
	void setbrand(String bran){
		brand=bran;	
	}
	void setmodel(String mod) {
		model=mod;
	}
	void setrentalPricePerDay(double rental) {
		rentalPricePerDay=rental;
	}
	

}
