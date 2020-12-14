package basic.thread.operations;

class Sleeping_Thread extends Thread{
	public void run() {
		try {
		for(int i=0;i<10;i++)
		{	
			System.out.println("i need to nap "+i);
			Thread.sleep(1000);
		}
//			try {
//				Thread.sleep(1000);
//			}
//			catch(InterruptedException e) {
//				System.out.println("INTERRUPTION");
//			}
		}
		catch(InterruptedException e) {
			System.out.println("INTERRUPTION");
		}
	}
}

public class Threadsleep {

	public static void main(String[] args) {
		Sleeping_Thread s=new Sleeping_Thread();
		s.start();
		s.interrupt();
		System.out.println(Thread.currentThread().getName()+" ends");
	}

}
