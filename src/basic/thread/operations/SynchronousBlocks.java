package basic.thread.operations;
class Greet{
	public synchronized void greet(String name) {
		System.out.println("Namaste!!!");
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException e) {
			
		}
		System.out.print(name);
	}
}

class thread_block extends Thread{
	Greet greet;
	String name;
	thread_block( Greet g, String name) {
		this.greet=g;
		this.name=name;
	}
	public void run() {
		greet.greet(name);
	}
}

public class SynchronousBlocks {
		public static void main(String[] args)  throws Exception{
			Greet greet=new Greet();
			thread_block thread1=new thread_block(greet, "Papaji");
			thread_block thread2=new thread_block(greet, "mummyji");
			thread1.start();
			thread2.start();
			synchronized (thread1) {
				System.out.print("excuting sync block to do selective sync instead of syncing wholee method");			
				thread1.wait();
			}
	}

}
