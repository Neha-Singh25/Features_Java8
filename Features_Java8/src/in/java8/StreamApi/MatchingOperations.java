/*These are the terminal operations.because they will do operation and they will return result.
 * 
 * All these methods take Predicate as a input.
 * 1. boolean anyMatch(Predicate p) 
 *    // atleast one record should be match.
 *    
 * 2. boolean allMatch(Predicate p)
 *   
 * 3. boolean noneMatch(Predicate p)
 * 
 * = Above methods are used to check the given condition and returns true or false value based on conndition.
 * */

package in.java8.StreamApi;

import java.util.Arrays;
import java.util.List;

public class MatchingOperations {
	public static void main(String[] args) {
		Person p1 = new Person("Rohit", "Haryana");
		Person p2 = new Person("Raju", "Haryana");
		Person p3 = new Person("Khyati", "Mzn");
		Person p4 = new Person("Kanchan", "Noida");
		Person p5 = new Person("Sahil", "Rajisthan");
		Person p6 = new Person("Manpreet", "Punjab");
		
		List<Person> persons = Arrays.asList(p1,p2,p3,p4,p5,p6);
		
		// I want to check if anyone from 'Noida 'then it's return true otherwise false.
		boolean status = persons.stream().anyMatch(p -> p.country.equals("Noida"));
		System.out.println("Any Noidian available ? ::" + status);
		System.out.println("-------------------------------");
		
		// I want check all persons are from 'Haryana' or not?
		boolean status2 = persons.stream().allMatch(p -> p.country.equals("Haryana"));
		System.out.println("All persons from 'Haryana'? ::" + status2);
		System.out.println("--------------------------------");
		// I want check No person from Maharashtra ?
		boolean status3 = persons.stream().noneMatch(p -> p.country.equals("Maharashtra"));
		System.out.println("No persons from 'Maharashtra' ? ::"+ status3);
		
	}
}

class Person{
	String name;
	String country;
	
	public Person (String name, String country) {
		this.name = name;
		this.country = country;
	}
}