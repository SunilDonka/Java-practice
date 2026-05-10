package coreJavaTopics;
public class ObjectCreation {
	int i;
	int j;
	public ObjectCreation() 
	{
		i=10;
		j=20;	
	}
	public ObjectCreation(int i, int j) {
		this.i=i;
		this.j=j;		
	}
	public int add() {
		return i+j;
	}
	public static void main(String[] args) {
		ObjectCreation oc1 =new ObjectCreation();
		ObjectCreation oc2 =new ObjectCreation(15,25);
		ObjectCreation oc3 =new ObjectCreation(80,50);
		System.out.println(oc1.add());
		System.out.println(oc2.add());
		System.out.println(oc3.add());
	}

}
