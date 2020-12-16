package basic.thread.operations;

class MyThread1 extends Thread{
	
}

class MyThread2 extends Thread{
	public void run() {
		System.out.println("child deamon");
	}
}
public class Deamon {

	public static void main(String[] args) {
		System.out.println("Thread is a deamon? "+Thread.currentThread().isDaemon());
		//Thread.currentThread().setDaemon(true);//IllegalThreadState
		MyThread1 thread1 =new MyThread1();
		thread1.setDaemon(true);
		System.out.println(thread1.isDaemon());
		MyThread2 thread2 =new MyThread2();
		thread2.setDaemon(true);
		thread2.start();
		//thread2.setDaemon(true);//Illegalthreadstateexception
		System.out.println(thread2.isDaemon());
	}

}
