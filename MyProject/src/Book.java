class textbook{
	int bno;
	String bname;
	double price;
	textbook(int bno,String bname, double price)
	{
		this.bno=bno;
		this.bname=bname;
		this.price=price;
	}
	textbook(){}
	void display()
	{
		
		System.out.println("----------------------");
		System.out.println("textbooknumber= "+bno);
		System.out.println("textbookname= "+bname);
		System.out.println("textbook price= "+price);
		System.out.println("----------------------");
	}
}
public class Book {
	public static void main(String[] args) {
		textbook t1 = new textbook(2,"Harrypotter",22.3);
		t1.display();
		textbook t2 = new textbook(3,"sherlockhomes",34);
		t2.display();
	}
}
