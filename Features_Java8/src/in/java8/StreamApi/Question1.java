/*------THEY ARE INTERMIADTE OPERATIONS.
 * Print the number is greater than 20 or not.
 * 
 * filter(Predicate ) {check the condition true, false}, return a new stream.
 * --- Multiple filter you can apply.
 * */

package in.java8.StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Question1 {
	public static void main(String[] args) {
		
		//----Before stream api approach.....
		List<Integer> list = Arrays.asList(66,20,32,12,10);
		/*for(Integer i : list ) {
			if(i > 20) {
				System.out.println(i);
			}
		}*/
		
		//-----After stream api approach.....
		/*
		Stream<Integer> stream = list.stream();
		Stream<Integer> filter = stream.filter(i -> i >20);
		filter.forEach(i -> System.out.println(i));
		*/
		//------combine above solution in single line...
		list.stream().filter(i -> i > 20).forEach(i -> System.out.println(i));
	}
	
}
