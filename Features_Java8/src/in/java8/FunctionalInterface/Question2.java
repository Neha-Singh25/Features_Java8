/*Take a list of persons and print persons whose age is >= 18 using Lambda Expression*/

package in.java8.FunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Person{
	String name;
	int age;
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
}

public class Question2 {
	public static void main(String[] args) {
		Person p1 = new Person("Neha",20);
		Person p2 = new Person("Natasha",17);
		Person p3 = new Person("Anuu",18);
		Person p4 = new Person("Anshu",29);
		
		List<Person> persons = Arrays.asList(p1,p2,p3,p4);
		Predicate<Person> predicate = p -> p.age >= 18;
		
		for(Person person :persons) {
			if(predicate.test(person)) {
				System.out.println(person.name);
			}
		}
	}

}
