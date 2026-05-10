class Student2 {
	int rollNum;
	String studName;
	double Mark1;
	double Mark2;
	double Mark3;
	double totalmarks;
	void setStudDetails()
	{
		rollNum =1438;
		studName="tanusha Kasiredla";
		Mark1 =56.8;
		Mark2 = 87.6;
		Mark3 = 67.9;
	}
	void calculateTotal()
	{
		totalmarks=Mark1+Mark2+Mark3;
	}
	void displayStudDetails()
	{
		
		System.out.println("-------Student Details---------");
		System.out.println("Hallticket number="+rollNum);
		System.out.println("Name ="+studName);
		System.out.println("Total marks  = "+totalmarks);
		System.out.println("SpecialNote: She is in love with someone");
		System.out.println("-------------------------------");
	}
}
public class Student1 {
	public static void main(String[] args) {
		Student2 s= new Student2();
		s.setStudDetails();
		s.calculateTotal();
		s.displayStudDetails();
	}
}
