class rectangle2{
	int length;
	int breadth;
	int area;
	rectangle2(int length,int breadth)
	{
		this.length=length;
		this.breadth =breadth;
	}
	
	void area()
	{
	System.out.println("The area of rectangle="+length*breadth);
	}
}
public class Rectangle1 {

	public static void main(String[] args) {
		rectangle2 r = new rectangle2(56,5);
		r.area();
		

	}

}
