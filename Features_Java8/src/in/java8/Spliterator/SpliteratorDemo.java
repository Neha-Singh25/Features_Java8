/*
 * Spliterator introduced in java 1.8v
 * Spliterator is an interface in collections api.
 * spliterator supports both serial &  parallel programming
 * spliterator we can use to traverse both Collections & Streams.
 * 
 * */
package in.java8.Spliterator;

import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;

public class SpliteratorDemo {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Sachin", "Dhoni", "Sehwag");
		Spliterator<String> spliterator = names.stream().spliterator();
		spliterator.forEachRemaining(n -> System.out.println(n));
	}
	
}
