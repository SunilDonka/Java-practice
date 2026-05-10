package inheritancedemo;

public class user {
	public static void main(String[] args) {
		Guest g1 = new Guest();
		g1.read();
		Developer dev = new Developer();
		dev.read();
		dev.write();
		Admin ad= new Admin();
		ad.read();
		ad.write();
		ad.manage();
		
	}

}
