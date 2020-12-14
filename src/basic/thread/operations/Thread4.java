package basic.thread.operations;

class Thread_runnable implements Runnable{
	public void run() {
		for(int i=0;i<3;i++) {
			System.out.println("child thread from interface implementation-->"+Thread.currentThread().getName());
		}
	}
}

class Thread_fromThreadclass extends Thread{
	public void run() {
		for(int i=0;i<3;i++) {
			System.out.println("child thread from class extension-->"+Thread.currentThread().getName());
		}
	}
}

public class Thread4 {

	public static void main(String[] args) {
		Thread_runnable r=new Thread_runnable();
		Thread thread_r=new Thread(r);
		Thread_fromThreadclass c=new Thread_fromThreadclass();
		Thread thread_c=new Thread(c);
		thread_r.start();
		thread_c.start();
		for(int i=0;i<3;i++) {
			System.out.println("main thread");
		}
	}

}
