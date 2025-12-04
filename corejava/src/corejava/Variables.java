package corejava;

public class Variables {
String  empname,empdesgi,empId;
 double empsalary;
 String getemployeename() {
	return empname;	
}
void setemployeename(String ename) {
	empname=ename;
}
	String getemployeedesgination() {
		return empdesgi;
	}
	void setemployeedesigation(String edesgi) {
		empdesgi=edesgi;
		
	}
	String getemployeeId() {
	return empId;
	}
void setemployeeId(String eId) {
	empId=eId;
}
double  getemployeesalary() {
	return empsalary;
	}
void setemployeesalary(double esalary) {
	empsalary=esalary;
}
	public static void main(String[] args) {
		Variables v1=new Variables();
		v1.setemployeename("ravi");
		v1.setemployeedesigation("software");
		v1.setemployeeId("jklm");
		v1.setemployeesalary(40000);

		System.out.println(" employeename : "+v1.getemployeename()+", employeedesgination : "
		+v1.getemployeedesgination()+" ,employeeId :"+v1.getemployeeId()+", employeesalary: "+v1.getemployeesalary());

	}
	
	

}
