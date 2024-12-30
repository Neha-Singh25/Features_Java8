/*
 * take 2 input and perform sum of two input and return output.
 * */

package in.java8.FunctionalInterface;

import java.util.function.BiFunction;


public class BiFunctionDemo {
	public static void main(String[] args) {
		BiFunction<Integer, Integer,Integer> bf = (a,b) -> a+b;
		System.out.println(bf.apply(10, 20));
		
		Integer sum = bf.apply(10,60);
		System.out.println(sum);
	}

}
