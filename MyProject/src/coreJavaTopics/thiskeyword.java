package coreJavaTopics;

public class thiskeyword {
	int age =25;

	public static void main(String[] args) {
		thiskeyword t= new thiskeyword();
		t.getAge();
		t.setAge(10);
	}
	public int getAge() {
		int age =25;
		//this.age=age;// instance variable (class level)
		return age;
	}
		
		
	public void setAge(int age) {
		
		this .age=age;
		
	}
	}


