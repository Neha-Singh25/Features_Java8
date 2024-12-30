//INSTANCE METHOD REFERENCE EXAMPLE

package in.java8.method_cons_ref;

public class InstanceMthodeRef {
	public void m1() {
		for(int i=1; i<=5; i++) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		InstanceMthodeRef im = new InstanceMthodeRef();
//		im.m1();
		
		// here run() method(static method) is replace by m1 method.
		Runnable r = im::m1;
		Thread t = new Thread(r);
		t.start();
	}

}
