/*Declare names in an array and print names which
are starting with 'A' using lambda expression.*/

package in.java8.FunctionalInterface;

import java.util.function.Predicate;

public class Question1 {
	public static void main(String[] args) {
		String [] names = {"Anushka", "Anupama","deepika","Kajol"};
	    Predicate<String> p = n -> n.charAt(0)=='A';
	    for(String name : names) {
	    	if(p.test(name)) {
	    		System.out.println(name);
	    	}
	    }
	}

}
