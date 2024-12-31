/* These are intermediate operations. they return a new stream.
 * SLICING OPERATIONS WITH STREAM----
 * 1. distinct()
 * 2. limit(long maxsize)
 * 3.skip(long n)   , here n is the number of ele.
 * 
 * */

package in.java8.StreamApi;


import java.util.Arrays;
import java.util.List;

public class SlicingOperation {
	public static void main(String[] args) {
		List<String> javacourses = Arrays.asList("core java", "advjava", "springboot","restapi","microservices");
		
		//I want print starting 3 records.
		javacourses.stream().limit(3).forEach(c -> System.out.println(c));
		System.out.println("------------------------");
		
		//I want skip 3 record .
		javacourses.stream().skip(3).forEach(c -> System.out.println(c));
		
		List<String> names = Arrays.asList("Rohit","supriya","Aanchal","Khyati","supriya","Aanchal","Rahul");
		System.out.println("------------------------");
		names.stream().distinct().forEach(name -> System.out.println(name));
		
		
		
	}
}
