// collect() is used to filtering data store or collect in another collection.
// foreach() is used to print the filtering data. 
package in.java8.StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsQuestion {
	public static void main(String[] args) {
		Person1 p1 = new Person1("John","USA");
		Person1 p2 = new Person1("Shiv","India");
		Person1 p3 = new Person1("Aashutosh","India");
		Person1 p4 = new Person1("Ching","China");
		
		List<Person1> persons = Arrays.asList(p1,p2,p3,p4);
		List<Person1> indians = persons.stream()
									   .filter(p -> p.country.equals("India"))
									   .collect(Collectors.toList());
									   
		
		//how many people's are belongs to 'India'.
		System.out.println(indians.size());
		System.out.println("--------------------");
		
		//Print objects....
		indians.forEach(i -> System.out.println(i));
		System.out.println("----------------------");
		
		// collect names of persons who are belongs to india and store into names collection.
		List<String> names = persons.stream()
									.filter(p -> p.country.equals("India"))
									.map(p -> p.name)
									.collect(Collectors.toList());
		System.out.println(names);
	}
}

class Person1{
	String name;
	String country;
	
	public Person1(String name, String country) {
		this.name = name;
		this.country = country;
	}

	@Override
	public String toString() {
		return "Persons [name=" + name + ", country=" + country + "]";
	}
}