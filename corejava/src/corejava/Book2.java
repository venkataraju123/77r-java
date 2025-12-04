package corejava;

public class Book2 {
	String Booktitle;
	String Authorname;
	int isbn;
	public void addBookDetails(String Book,String Author,int isb) {
		Booktitle=Book;
		Authorname=Author;
		isbn=isb;
		
	}
public String displayDetails() {
	return " Booktitle "+Booktitle+" authorname "+Authorname+" isbn "+isbn;
}
	public static void main(String[] args) {
		Book2 obj1=new Book2();
		obj1 .addBookDetails("mansoon","ravindra",1234);
		String res=obj1.displayDetails();
		System.out.println(res);
		

	}

}
