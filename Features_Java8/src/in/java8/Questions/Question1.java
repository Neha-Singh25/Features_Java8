// Write a java program to get MAX, MIN and AVG salary from given employees data using Stream API.
package in.java8.Questions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


public class Question1 {
	public static void main(String[] args) {
		Employee e1 = new Employee(1, "Rahul", 26500.00);
		Employee e2 = new Employee(2, "Anika", 36500.00);
		Employee e3 = new Employee(3, "Chitra", 46500.00);
		Employee e4 = new Employee(4, "Danish", 16500.00);
		Employee e5 = new Employee(5, "Chetna", 25500.00);
		
		List<Employee> list = Arrays.asList(e1,e2,e3,e4,e5);
		
		
		//Stream<Emp> stream = Stream.of(e1,e2,e3,e4,e5);
		Optional<Employee> maxSalary = list.stream().collect(Collectors.maxBy(Comparator.comparing(e -> e.salary)));
		System.out.println("Max Salary :->" + maxSalary.get().salary);
		
		System.out.println("----------------------");
		Optional<Employee> minSalary = list.stream().collect(Collectors.minBy(Comparator.comparing(e -> e.salary)));
		System.out.println("Min Salary :->" + minSalary.get().salary);
		
		System.out.println("----------------------");
		Double avgSalary = list.stream().collect(Collectors.averagingDouble(e -> e.salary));
		System.out.println("Avg. Salary :->" + avgSalary);
	}
}
class Employee{
	int id;
	String name;
	double salary;
	
	Employee(int id, String name, double salary){
		
		this.id  = id;
		this.name = name;
		this.salary = salary;
	}
}
