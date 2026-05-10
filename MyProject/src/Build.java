public class Build{
	public static void main(String[] args) {
		Drive d =(i,j)-> System.out.println(i+j);
	d.compile(4, 5);
	}
}

@FunctionalInterface
interface Drive{
	public void compile(int i,int j);
}


