package corejava;

public class Car {
	
String Carname;
String CarModel;
int Manufacturingyear;
public void addCarDetails(String Car,String Model,int Year ) {
	Carname=Car;
	CarModel=Model;
	Manufacturingyear=Year;
}
public String displayDetails() {
	return  " Carname : "+Carname+" Carmodel  :"+ CarModel+" Manufacturing year :"+ Manufacturingyear;
}
public static void main (String[] args) {
	Car obj1=new Car();
	obj1. addCarDetails("tesla","XYZ",2002);
	String res=obj1.displayDetails();
	System.out.println(res);
	
}
	
}
	
	
	
	

	




