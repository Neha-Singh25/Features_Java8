/*
 * A COLLECTION INTO ANOTHER COLLECTION.
 * Then we go for *flatMap(Function f)* (deals with collection with collection.)
 * WHEN YOU PERFORM STREAM OF STREAM THEN YOU GO WITH THAT.
 * 
 * */

package in.java8.StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Question3Map {
	public static void main(String[] args) {
		List<String> java = Arrays.asList("core java","adv. java","springboot");
		List<String> ui = Arrays.asList("html","css","bs","js");
		List<List<String>> courses = Arrays.asList(java, ui);
		
		//courses.stream().forEach(c -> System.out.println(c));
		Stream<String> fms = courses.stream().flatMap(s -> s.stream());
		fms.forEach(c -> System.out.println(c));
	}
}
