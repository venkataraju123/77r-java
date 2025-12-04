package corejava;

public class Employee {
	String employeeName;
	int employeeId;
	double employeesalary;
	public void addEmployeDetails(String empname,int empId,double empsalary) {
		employeeName=empname;
		employeeId=empId;
		employeesalary=empsalary;
			
		
	}
	public String displayDetails() {
		return "employeename:"+ employeeName+"employeeId"+employeeId+"employeesalary"+employeesalary;
	}
	
	
	

	public static void main(String[] args) {
		Employee obj1=new Employee();
		obj1.addEmployeDetails("ravi",21,500.3);
		String res=obj1.displayDetails();
		System.out.println(res);
		
		

	}

}
