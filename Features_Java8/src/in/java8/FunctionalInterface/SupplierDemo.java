/*
 * it will not take any input only having one abs. method that is
 * get() and giving some output.
 * */

package in.java8.FunctionalInterface;

import java.util.function.Supplier;


public class SupplierDemo {
	public static void main(String[] args) {
		Supplier<String> s = ()->{
			String otp ="";
			for(int i =0; i<=8; i++) {
				otp += (int)(Math.random()*10);
			}
			return otp;
		};
		System.out.println(s.get());
		System.out.println(s.get());
	}

}
