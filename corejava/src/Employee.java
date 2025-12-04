
public class Employee {
    String name;
    double salary;

    
    public void increaseSalary(Employee e) {
        e.salary = e.salary + (e.salary * 0.10);
        System.out.println("Updated Salary of " + e.name + " is: " + e.salary);
    }

    public static void main(String[] args) {
        
        Employee emp = new Employee();
        emp.name = "Teja";
        emp.salary = 50000;


        emp.increaseSalary(emp);
    }
}


	
