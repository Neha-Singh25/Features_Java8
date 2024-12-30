// Fetch the data ,whose name started with 'A'.

package in.java8.StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Question2 {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("John","Anu","Abhishek","Robert","Smith");
		
		names.stream().filter(i -> i.startsWith("A")).forEach(i -> System.out.println(i));
		
	}
}
