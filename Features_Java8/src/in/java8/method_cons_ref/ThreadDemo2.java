//Anonymus implementation like a inner class have a body
// not object okay...
package in.java8.method_cons_ref;

//APPROACH-2
public class ThreadDemo2 {

	public static void main(String[] args) {
		Runnable r = new Runnable() {
		@Override
		public void run() {
			for(int i =0; i<=5; i++) {
				System.out.println(i);
			}
		}
		
	};
	Thread t = new Thread(r);
	t.start();
		
	}
}
