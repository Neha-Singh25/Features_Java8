// I want data of that persons who's belong from India.
package in.java8.StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Question1Matching {
	public static void main(String[] args) {
		Persons p1 = new Persons("John","USA");
		Persons p2 = new Persons("Steve","Japan");
		Persons p3 = new Persons("Aashutosh","India");
		Persons p4 = new Persons("Ching","China");
		
		List<Persons> persons = Arrays.asList(p1,p2,p3,p4);
		
		Optional<Persons> findFirst = persons.stream()
											.filter(p -> p.country.equals("Inida"))
											.findFirst();
		
		if(findFirst.isPresent()) {
			System.out.println(findFirst.get());
		}
		
	}
}
class Persons{
	String name;
	String country;
	
	public Persons(String name, String country) {
		this.name = name;
		this.country = country;
	}

	@Override
	public String toString() {
		return "Persons [name=" + name + ", country=" + country + "]";
	}
}