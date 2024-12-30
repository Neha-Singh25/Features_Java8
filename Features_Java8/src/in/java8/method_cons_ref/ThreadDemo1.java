/*
 * Create a thread and print number 1-5.
 * */

package in.java8.method_cons_ref;

//APPROACH - 1
public class ThreadDemo1 implements Runnable {

	@Override
	public void run() {
		for(int i =1; i<=5; i++) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		ThreadDemo1 th = new ThreadDemo1();
		Thread t = new Thread(th);
		t.start();
	}
}
