package inheritancedemo;

public class Icecream {
	    public void eat(){
	        System.out.println("I will eat Icecream");
	       
	    }
	    
	}
	class Choclate extends Icecream{
	    public void eat(){
	        System.out.println("I will eat Choclate");
	    }
	
public static void main (String[] args) {
	Icecream i = new Choclate();
	i.eat();
	}

}
