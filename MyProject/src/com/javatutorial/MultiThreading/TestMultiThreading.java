package com.javatutorial.MultiThreading;

public class TestMultiThreading {
	public static void main(String[] args) throws InterruptedException {
		Runnable r1 =()->{
			for(int i=0;i<10;i++) {
//			System.out.println("hello "+Thread.currentThread().getName()+">>>"+Thread.currentThread().getId());
			}
		};
		
		Runnable r2 = ()->{
			for(int i=0;i<10;i++) {
		
//		System.out.println("Hi "+Thread.currentThread().getName()+">>>"+Thread.currentThread().getId());
			}
		};
		
		
		Thread t1= new Thread(r1,"T1");

		Thread t2= new Thread(r2,"T2");
		System.out.println(t1.getState());
		
		t1.start();
		System.out.println(t1.getState());
		t1.sleep(3000);
		
		t2.start();
		
		System.out.println(t1.getState());
	
		
		//Thread Lifecycle >>
		//0-New 
		//1-Runnable
		//2-Blocked State
		//3-Waiting(join)
		//4-Timed waiting(Specific time/sleep)
		//5-Terminated
		//
//		t1.join();
		// if we want to execute the thread after completion of one thread , we can use join keyword for doing this
		// even though it works as multiple threading 
//		t1.sleep(3000);// we can use sleep method to stop the thread execution for some time (3 seconds)
//		t2.start();
//		
//		System.out.println(Thread.activeCount());
	}
}





//class Employee extends Thread {
//	// we can only extend one class(X)
//	public void run() {
//		System.out.println("hello "+Thread.currentThread().getName()+">>>"+Thread.currentThread().getId());
//	}
//}
//class Manager implements  Runnable {
//	@Override// we can implement any no of classes (good way for dealing thread)
//		public void run() {
//			System.out.println("hello "+Thread.currentThread().getName()+">>>"+Thread.currentThread().getId());
//		}
//		
//	}
//	
//	




//Employee e1= new Employee();
//Thread t1 = new Thread(e1,"T1");
//t1.start();
//
//Manager m1 = new Manager();
//Thread t2 = new Thread(m1,"T2");
//
//t2.start();
//System.out.println(Thread.activeCount());



//public Manager(String name) {
//	super(name);
//}
//@Override
//public void run() {
//	System.out.println("hello "+Thread.currentThread().getName()+">>>"+Thread.currentThread().getId());
//}


//public Employee(String name) {
//	super(name);
//}// we can set the name of the thread by passing the constructor
//@Override
//public void run() {
//	System.out.println("hello "+Thread.currentThread().getName()+">>>"+Thread.currentThread().getId());
//}


//Thread t1= new Thread();
//t1.start();
//System.out.println(Thread.activeCount());// current active thread
//System.out.println("hello guys, welcome to world");
//System.out.println(Thread.activeCount());// ThreadCount
//System.out.println(Thread.currentThread().getId());ThreadId
//System.out.println(Thread.currentThread().getName());ThreadName
//System.out.println(Thread.currentThread().getPriority());ThreadPriority