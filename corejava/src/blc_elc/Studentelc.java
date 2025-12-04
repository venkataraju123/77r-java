package blc_elc;

public class Studentelc {

	public static void main(String[] args) {
		Student s= Student.getStudentDetails(5623, 56, "ravi");
		
		
		System.out.println( "studentId     :" +s.getstudId());
		System.out.println("student Rollno :"+s.getrollNo());
		System.out.println("  student Name :"+s.getname());
		
		
		
	}

}
