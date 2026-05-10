public class Marriage 
{
	 public  String girlName(String username,int number)
	 
	{
		return username+number;
		
	}
	
	public static void main(String[] args) 
	{
	Marriage m = new Marriage();
	String str= m.girlName("sunil",5);
	System.out.println(str);

	}

}
