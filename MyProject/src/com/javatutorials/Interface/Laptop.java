package com.javatutorials.Interface;

public interface Laptop {
	
	public void copy();
	
	public void paste();
	
	public void cut();
	
	public void keyboard();
	
	default void security(){
		commonCode();
		
		System.out.println("laptop security");
		
	}
	
	static void audio() {
		
		
		System.out.println("Laptop audio code");
	}
	
	private void commonCode() {
		
		System.out.println("common code");
		
	}

	public void camera();

	public void makesound();
	
	
	// we have to implement these methods in class (implementor for interface)
	
		

	

}
