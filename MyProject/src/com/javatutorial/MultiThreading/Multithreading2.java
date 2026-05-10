package com.javatutorial.MultiThreading;

public class Multithreading2 {

	public static void main(String[] args) throws Exception {
		BrickDairy bd = new BrickDairy();
	
		Runnable r1 =()->{
			for(int i=0;i<10000;i+=50) {
				//unloading the 50 bricks
				bd.incrementbrickcount();
			}
		};
		
		Runnable r2 =()->{
			for(int i=0;i<15000;i+=50) {
				//unloading the 50 bricks
				bd.incrementbrickcount();
			}
		};
		
		Runnable r3 =()->{
			for(int i=0;i<5000;i+=50) {
				//unloading the 50 bricks
				bd.incrementbrickcount();
			}
		};
		
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r1);
		Thread t3 = new Thread(r1);
		
		t1.start();
		t2.start();
		t3.start();
		
		t1.join();
		t2.join();
		t3.join();
		
		System.out.println(bd.brickCount);
		System.out.println(bd.brickCount2);
		
	}

}
class BrickDairy{
	volatile int brickCount =0;
	volatile int brickCount2 =0;
	
	public synchronized void incrementbrickcount() {
		brickCount +=50;
		brickCount2 +=50;
		
	}
}




















