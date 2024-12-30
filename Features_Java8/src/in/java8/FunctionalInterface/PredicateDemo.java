package in.java8.FunctionalInterface;
import java.util.function.Predicate;

public class PredicateDemo {
	public static void main(String[] args) {
		Predicate<Integer> p = i -> i>10;
		System.out.println(p.test(6));
	}

}
