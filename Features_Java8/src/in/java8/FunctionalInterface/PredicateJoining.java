/*
 * Print emp name who are working in noida 
 * location in css team or devops.
 * */

package in.java8.FunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;


class Employee{
	String name;
	String location;
	String dept;
	
	Employee(String name, String location, String dept){
		this.name = name;
		this.location = location;
		this.dept = dept;
	}
}

public class PredicateJoining {
	public static void main(String[] args) {
		Employee emp1 = new Employee("Anil", "Noida", "Devops");
		Employee emp2 = new Employee("Raju", "Banglure","SE");
		Employee emp3 = new Employee("Ganesh","Noida","CSS");
		Employee emp4 = new Employee("Gaouri","Hyd","CSS");
		
		List<Employee> emps = Arrays.asList(emp1,emp2,emp3,emp4);
		
		Predicate<Employee> p1 = p -> p.location.equals("Noida");
		Predicate<Employee> p2 = p -> p.dept.equals("CSS");
		Predicate<Employee> p3 = p -> p.dept.equals("Devops");
		
		//Predicate Joining and() , or()
		
		Predicate<Employee> p = p1.and((p2).or(p3));
		for(Employee e : emps) {
			if(p.test(e)) {
				System.out.println(e.name);
			}
		}
		
	}

}
