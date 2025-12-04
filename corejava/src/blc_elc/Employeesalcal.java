package blc_elc;

public class Employeesalcal {
	public static void main(String[] args) {
		EmployeeSalary e1=new EmployeeSalary();
		e1.setemployeeId(50000);
		e1.setemployeeName("raju");
		e1.setsalary(45632.23);
		e1.setemployeeName("venky");
		System.out.println("---EMPSALARY-----");
		System.out.println("EmployeeId :"+e1.getemployeeId());
		System.out.println("\nEmployeeeName :"+e1.getemployeeName());
		System.out.println("\nEmployee salary:"+e1.getsalary());
		
	}

}
