//reduce() = combine multiple values in single values.
package in.java8.Reduce;

import java.util.Arrays;

public class ReduceDemo {
	public static void main(String[] args) {
		// sum of array.
		int nums [] = {1,2,3,4,5};
		
		int res = Arrays.stream(nums).reduce(0, (a,b) -> a+b );
		System.out.println("Sum of ele. is:-> "+ res);
	}
}
