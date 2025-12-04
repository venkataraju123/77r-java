package blc_elc;

public class Employee {
	int empId;
	String empName;
	double empSalary;
	public int getempID(){
		return empId;
			}
	public String getempName() {
		return empName;
	}
	public double getSalary() {
		return empSalary;
	}
	public void set(int eId) {
		empId=eId;

	}
	public void set(String ename) {
		 empName=ename;
		
	}
	public void set(double eSalary) {
		empSalary=eSalary;
		
	}
	public static Employee getEmployeeDetails(int empId, String empName, double empSalary) {
		Employee e=new Employee();
		e.set( empId);
		e.set(empName);
		e.set(empSalary);
		return e;
	}

}
