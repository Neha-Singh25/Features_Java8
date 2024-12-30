/*---IT'S ALSO USED FOR ITERMIDATE OPTIONS.
 * ----IT TAKE FUNCTION FUNCTIONAL INTERFACE AS A PARAMETER.
 * -----IT TAKE INPUT AND RETURN OUTPUT (MEANS TRANSFORM THE DATA)
 * (MAP IS USED TO TRANSFORM THE DATA.)
 * map(Function function)
 * 
 * 
 * mapToInt()
 * */

package in.java8.StreamApi;

import java.util.Arrays;
import java.util.List;

public class MapOperationDemo {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Delhi","Punjab","Nepal","Lucknow","Muzaffarnagar");
		// GIVEN DATA CONVERT TO UPPERCASE.
		names.stream().map(name -> name.toUpperCase()).forEach(n -> System.out.println(n));
		
		//Given data print the length of the each name.
		names.stream().mapToInt(name -> name.length()).forEach(i -> System.out.println(i));
	}
}
