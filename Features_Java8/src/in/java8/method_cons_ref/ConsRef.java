//it is supporting only 0 parameter constructor.
//it just returning the object => supplier
package in.java8.method_cons_ref;

import java.util.function.Supplier;

class Emp {
	public Emp() {
		System.out.println("Emp Constructor....");
	}
}
public class ConsRef {
	public static void main(String[] args) {
		
	/*	Emp e = new Emp();
		System.out.println(e.hashCode());
	*/
		Supplier<Emp> e = Emp::new;
		//System.out.println(e.get().hashCode());
		
		Emp emp = e.get();
		System.out.println(emp.hashCode());
	}
}
