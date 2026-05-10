package coreJavaTopics;

abstract class facts {
	
	public abstract void config();
	public void show(){
		System.out.println("first class method");
	}

	 class myth extends facts {
		public void show() {
			System.out.println("I am from extended class");
			
		}

		@Override
		public void config() {
			// TODO Auto-generated method stub
			
		}
	}
	
public static void main(String[] args) {
	facts f = new facts() 
	{
		public void show(){
			System.out.println("in a new show");
		}

		@Override
		public void config() {
			System.out.println("in a config show");
			
		}
	
		
	};
	f.show();
	f.config();
}
}
