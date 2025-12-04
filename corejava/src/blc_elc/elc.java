package blc_elc;

public class elc {

	public static void main(String[] args) {
		Employee emp=Employee.getEmployeeDetails(123, "ravi", 50000.23);
		System.out.println("employeeId :"+emp.getempID());
		System.out.println("employeeName :"+emp.getempName());
		System.out.println("employeeSalary :"+emp.getSalary());
		

	}

}
