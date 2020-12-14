package basic.thread.operations;
class Joining_Thread extends Thread{
	
	static Thread thread;
	public void run() {
		try {
			thread.join();
			System.out.println("joined -->"+Thread.currentThread().getName());
		}
		catch(InterruptedException e) {
			System.out.println("INTERRUPTION");
		}
		for(int i=0;i<10;i++)
		{	
			System.out.println("child -->"+Thread.currentThread().getName());
		}
	}
}

public class Threadjoin {

	public static void main(String[] args) {
		Joining_Thread.thread=Thread.currentThread();
		Joining_Thread j=new Joining_Thread();
		j.start();
//		try {
//			Thread.currentThread().join();
//			System.out.println("joined -->"+Thread.currentThread().getName());
//		}
//		catch(InterruptedException e) {
//			System.out.println("INTERRUPTION");
//		}
		for(int i=0;i<10;i++) {
		System.out.println(Thread.currentThread().getName());
		}
	}

}
