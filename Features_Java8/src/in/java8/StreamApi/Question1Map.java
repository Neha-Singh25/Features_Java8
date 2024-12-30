/*To print the length of the name which names starting character is 'A'.
 * 
 * Ex:- Anil - 4
 * */
package in.java8.StreamApi;

import java.util.Arrays;
import java.util.List;

public class Question1Map {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Anil","Amisha","Raman","John","Albert","Sachin","Vivek");
		names.stream()
		.filter(n -> n.startsWith("A"))
		.map(name -> name + "-" +name.length())
		.forEach(res -> System.out.println(res));
	}
}
