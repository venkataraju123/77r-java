
public class University {
	public String evaluteAdmission(int marks,boolean sportsAchievement){
		if (marks<=95) {
			return " With ScholarshipAdmitted";
		}
		else if((marks>85)&&(marks<=94)) {
			return "Without ScholarshipAdmitted";
		}
		else if ((marks>70)&&(marks>=84)) {
			return "sports quota";}
			else if((marks>60)&&(marks>=69)) {
				return "required required";
			}else {return "interview rejected";
					
			
		}
	}

	public static void main (String[]args) {
		University u=new University();
		System.out.println(u.evaluteAdmission(56,false ));

	}

}
