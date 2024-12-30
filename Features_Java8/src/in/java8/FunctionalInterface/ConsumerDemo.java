/*
 * it will not return anything , but it will take input only.
 * and having a abs. method that is accept().
 * */
package in.java8.FunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
	public static void main(String[] args) {
		Consumer<String> c = name -> System.out.println( name +" Hello everyone....");
		c.accept("Amit");
		c.accept("Ankusha");
		
		//forEach (Consumer consumer)
		
		List<Integer> l1 = Arrays.asList(10,20,30,40);
		l1.forEach(i -> System.out.println(i));
	}

}
