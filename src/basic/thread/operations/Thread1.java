package basic.thread.operations;

//import java.util.Set;

class Thread_class extends Thread{
		public void run() {
			System.out.println(this.getState()+" is the state of "+this.getName());
		
			System.out.println("child class thread run"+this.getName());}
		
	}
	
	public class Thread1 {
	public static void main(String[] args) {
		
		Thread_class thread=new Thread_class();
		thread.setName("first");
		thread.setPriority(7);
		thread.start();
		
		Thread_class thread1=new Thread_class();
		thread1.setName("second");
		thread.setPriority(7);
		thread1.start();
		Thread_class thread2=new Thread_class();
		thread2.setName("third");
		thread2.start();
		Thread.yield();
		System.out.println("thread yeild done");
		System.out.println(thread.getState()+" is the state of "+thread.getName());
		System.out.println(thread1.getState()+" is the state of "+thread1.getName());
		System.out.println(thread2.getState()+" is the state of "+thread2.getName());
		//get all threads running
//		Set<Thread> threads = Thread.getAllStackTraces().keySet();
//		
//		for (Thread t : threads) {
//		    String name = t.getName();
//		    Thread.State state = t.getState();
//		    int priority = t.getPriority();
//		    String type = t.isDaemon() ? "Daemon" : "Normal";
//		    System.out.printf("%-20s \t %s \t %d \t %s\n", name, state, priority, type);
//		}
	}

}
