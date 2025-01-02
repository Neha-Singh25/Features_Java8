/*
 * Generally Streams will execute in sequence order.
 * To improve execution process of the stream we can use parallel streams
 * Parallel Streams introduces to improve performance of the program. 
 * */


package in.java8.StreamApi;

import java.util.stream.Stream;

public class ParallelDemo {
	public static void main(String[] args) {
		
		System.out.println("========== SERIAL STREAM=========");
		Stream<Integer> ss = Stream.of(1,2,3,4,5);
		ss.forEach(n -> System.out.println(n + ":" + Thread.currentThread()));
		
		System.out.println("========== PARALLEL STREAM=========");
		Stream<Integer> ps = Stream.of(1,2,3,4,5);
		ps.parallel().forEach(n -> System.out.println(n + ":" + Thread.currentThread()));
	}
}
