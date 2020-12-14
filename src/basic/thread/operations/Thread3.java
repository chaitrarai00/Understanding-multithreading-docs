package basic.thread.operations;

class Thread_class4 extends Thread{
//	public void start() {
//		super.start();//calls the start of parent i.e. thread which internally calls run()
//		System.out.println("overriden start");
//	}
	public void run() {
		System.out.println("thread executing the run method is-->"+Thread.currentThread().getName());
		System.out.println("overriden run");
	}
}
public class Thread3 {

	public static void main(String[] args) {
		System.out.println("thread executing-->"+Thread.currentThread().getName());
		Thread_class4 thread= new Thread_class4();
		thread.setName("thread1");
		thread.start();
		System.out.println("thread executing-->"+Thread.currentThread().getName());
		System.out.println("main thread");
	}

}
