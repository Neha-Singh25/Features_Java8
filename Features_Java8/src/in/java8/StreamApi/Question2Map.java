/*Get Emp name and Emp age whose salary is >= 50,000*/

package in.java8.StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Question2Map {
	public static void main(String[] args) {
		Employee e1 = new Employee("Anil",23,45000.00);
		Employee e2 = new Employee("Amit",27,75000.00);
		Employee e3 = new Employee("Somya",25,55000.00);
		Employee e4 = new Employee("Rashi",22,25000.00);
		Employee e5 = new Employee("Anita",23,45000.00);
		Employee e6 = new Employee("Robin",40,100000.00);
		
		Stream<Employee> stream = Stream.of(e1,e2,e3,e4,e5,e6);
		
		// Approach -1
//		stream.filter(e -> e.salary >=50000.00)
//		.map(e -> e.name+ "-" + e.age)
//		.forEach(e -> System.out.println(e));
		
		//Approach -2
		stream.filter(e -> e.salary >= 50000.00)
		.forEach(e -> System.out.println(e.name +"-"+ e.age));
	}
}
class Employee{
	
		String name;
		int age;
		double salary;
	Employee(String name, int age, double salary){
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
}