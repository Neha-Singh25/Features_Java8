/*
 * Stream are used to process the data.
 * 
 * 2 ways of stream creating:-
 * 
 * 1.) Stream.of(values)
 * 2.) stream()
 * 
 * */

package in.java8.StreamApi;

import java.util.ArrayList;
import java.util.stream.Stream;

public class FirstDemo {
public static void main(String[] args) {
		
		//1. way
		Stream<Integer> stream1 = Stream.of(1,2,3,4,5);
		
		//2. way
		ArrayList<String> names = new ArrayList<>();
		names.add("Albert");
		names.add("Sweety");
		names.add("Karishma");
		
		Stream<String> stream2 = names.stream();
		
	}

}
