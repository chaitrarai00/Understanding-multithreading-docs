package basic.thread.operations;
/*
 * Thread called in parent and executes run of child on thread start
 * scheduling depends on OS scheduling 
 * yeild  passes execution to thread of same priority its generally not used
 * It is rarely appropriate to use this method. It may be useful
 * for debugging or testing purposes, where it may help to reproduce
 * bugs due to race conditions
 */
class Yielding_Thread extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(Thread.currentThread().getName());
			Thread.yield();
		}
	}
}

public class Threadyield {

	public static void main(String[] args) {
		Yielding_Thread thread=new Yielding_Thread();
		thread.start();
		for(int i=0;i<5;i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}

}
