/*
 * it will take input and generate output and having one
 * abs. method that is apply()
 * */

package in.java8.FunctionalInterface;

import java.util.function.Function;

public class FunctionDemo {
	public static void main(String[] args) {
		Function<String, Integer> f = name -> name.length();
		System.out.println(f.apply("Neha Singh..."));
		System.out.println(f.apply("38912831892"));
		System.out.println(f.apply("Sachin"));
	}

}
