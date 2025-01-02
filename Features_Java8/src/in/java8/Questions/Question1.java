// Write a java program to get MAX, MIN and AVG salary from given employees data using Stream API.
package in.java8.Questions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


public class Question1 {
	public static void main(String[] args) {
		Emp e1 = new Emp(1, "Rahul", 26500.00);
		Emp e2 = new Emp(2, "Anika", 36500.00);
		Emp e3 = new Emp(3, "Chitra", 46500.00);
		Emp e4 = new Emp(4, "Danish", 16500.00);
		Emp e5 = new Emp(5, "Chetna", 25500.00);
		
		List<Emp> list = Arrays.asList(e1,e2,e3,e4,e5);
		
		
		//Stream<Emp> stream = Stream.of(e1,e2,e3,e4,e5);
		Optional<Emp> maxSalary = list.stream().collect(Collectors.maxBy(Comparator.comparing(e -> e.salary)));
		System.out.println("Max Salary :->" + maxSalary.get().salary);
		
		System.out.println("----------------------");
		Optional<Emp> minSalary = list.stream().collect(Collectors.minBy(Comparator.comparing(e -> e.salary)));
		System.out.println("Min Salary :->" + minSalary.get().salary);
		
		System.out.println("----------------------");
		Double avgSalary = list.stream().collect(Collectors.averagingDouble(e -> e.salary));
		System.out.println("Avg. Salary :->" + avgSalary);
	}
}
class Emp{
	int id;
	String name;
	double salary;
	
	Emp(int id, String name, double salary){
		
		this.id  = id;
		this.name = name;
		this.salary = salary;
	}
}
