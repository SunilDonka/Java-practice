
public class ReverseString {

	public static void main(String[] args) {
		String str="Sunil";
		String S="";
		char ch;
		for(int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			S=ch+S;
			
		}
		System.out.println(S);
		
		// TODO Auto-generated method stub

	}

}
