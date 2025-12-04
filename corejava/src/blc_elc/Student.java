package blc_elc;

public class Student {
	int studId;
	int rollNo;
	String name;
	int getstudId() {
		return studId;
	}
	int getrollNo() {
	return rollNo;
}
	String getname() {
		return name;
	}
void setstudId(int Id) {
	studId=Id;
}
void setrollNo(int Rno) {
	rollNo=Rno;
}
void setname(String stName) {
	name=stName;
}
 static Student getStudentDetails(int studId,int rollNo,String name) {
	 Student s=new Student();
		s.setstudId(studId);
		s.setrollNo(rollNo);
		s.setname(name);
		return s;
	}
}




