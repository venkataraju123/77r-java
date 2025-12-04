package blc_elc;

public class LibraryBookM {

	public static void main(String[] args) {
		Librarybook l1=new Librarybook();
		l1.setbookId(6352);
		l1.settitle("Three roses");
		l1.setauthor("Ravindra");		
		l1.setprice(123.6);

		Librarybook l2=new Librarybook();
		l2.setbookId(9955);
		l2.settitle("The sword");
		l2.setauthor("shri shri");		
		l2.setprice(75.36);
		System.out.println("----LIBRARYBOOKS--------");
		System.out.println("BOOKID :"+l1.getbookId());
		System.out.println("\nBOOKTILLE :"+l1.gettitle());
		System.out.println("\nBOOKAUTHOR :"+l1.getauthor());
		System.out.println("\nBOOKPRICE:"+l1.getprice());
		System.out.println("\n--------library 2-------");
		System.out.println("BOOKID :"+l2.getbookId());
		System.out.println("\nBOOKTILLE :"+l2.gettitle());
		System.out.println("\nBOOKAUTHOR :"+l2.getauthor());
		System.out.println("\nBOOKPRICE:"+l2.getprice());
		
		
		
		

	}

}
