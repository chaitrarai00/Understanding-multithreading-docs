package basic.thread.operations;

class Thread_class1 extends Thread{
	public void run() {
		System.out.println("run method with no arg");
	}
	
	public void run(int i) {
		System.out.println("run method with arg called explicitly "+i);
	}
}

class Thread_class2 extends Thread{
	public void run() {
		System.out.println("run method overriden");
	}
	
	public void start() {
		System.out.println("overriden start method");
	}
	/*
	 * overriding start in thread does not create a new thread
	 * instead works like a normal thread program
	 * eliminating/ruining the multithreaded nature
	 * also here calling start do not call run internally like in thread start which internally calls run 
	 * but run also has to be called explicitly  
	 */
}

class Thread_class3 extends Thread{
/*
 *we override run() method because it helps us make out when run is executed.
 * If we don't override Thread class run() method in Thread class will be executed 
 * it consists of an empty implementation so we see no output 
 */
}

public class Thread2 {

	public static void main(String[] args) {
		Thread_class1 thread=new Thread_class1();
		thread.start();
		thread.run(2);
		Thread_class2 thread2=new Thread_class2();
		thread2.start();
		System.out.println("main method");
		Thread_class3 thread3=new Thread_class3();
		thread3.start();
		
	}

}
