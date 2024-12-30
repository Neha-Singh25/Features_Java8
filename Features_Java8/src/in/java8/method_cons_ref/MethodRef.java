//STATIC METHOD REFERENCE EXAMPLE

package in.java8.method_cons_ref;

@FunctionalInterface
interface MyInterface{
	public void show();
}

public class MethodRef {
	public static void disp() {
		System.out.println("i am disp...");
	}
//	public  void show() {
//		System.out.println("i am the show method....");
//	}
	
	//static reference---
	public static void show() {
		System.out.println("i am the show method....");
	}
	public static void main(String[] args) {
		MethodRef.disp();
//		MethodRef m = new MethodRef();
//		MyInterface mi = m::show;
		MyInterface mi = MethodRef::show;
		mi.show();
	}

}
