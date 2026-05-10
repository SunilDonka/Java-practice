
public class LastCharacter {

	public static void main(String[] args) {
		String s= "Ramu";
		char ch;
		for(int i=0;i<s.length();i++) 
		{
			ch=s.charAt(i);
			
			if(i==s.length()-1) {
			
				System.out.println("Lastcharacter "+ch);
			}
			
		}
		
	}

}
