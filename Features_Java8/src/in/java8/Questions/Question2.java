package in.java8.Questions;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Question2 {
	public static void main(String[] args) {
		
		List<Emp> empList = new ArrayList<Emp>();
		
		empList.add(new Emp(1, "Jhansi", 32, "Female", "HR", 2011, 25000.0));
		empList.add(new Emp(2, "Smith", 25, "Male", "Sales", 2015, 13500.0));
		empList.add(new Emp(3, "David", 29, "Male", "Infrastructure", 2012, 18000.0));
		empList.add(new Emp(4, "Orlen", 28, "Male", "Development", 2014, 32500.0));
		empList.add(new Emp(5, "Charles",27 , "Male", "HR", 2013, 22700.0));
		empList.add(new Emp(6, "Cathy", 43, "Male", "Security", 2016, 10500.0));
		empList.add(new Emp(7, "Ramesh", 35, "Male", "Finance", 2010, 27000.0));
		empList.add(new Emp(8, "Suresh", 31, "Male", "Development", 2015, 345000.0));
		empList.add(new Emp(9, "Gita", 24, "Female", "Sales", 2016, 11500.0));
		empList.add(new Emp(10, "Mahesh", 38, "Male", "Security", 2015, 11000.5));
		empList.add(new Emp(11, "Gouri", 27, "Female", "Infrastucture", 2014, 15700.0));
		empList.add(new Emp(12, "Nitin", 25, "Male", "Development", 2016, 28200.0));
		empList.add(new Emp(13, "Swati", 27, "Female", "Finance", 2013, 21300.0));
		empList.add(new Emp(14, "Buttler", 24, "Male", "Sales", 2017, 10700.5));
		empList.add(new Emp(15, "", 32, "Female", "HR", 2011, 25000.0));
		
		//1. How many male and female employees are there in the organization?
	    Map<String, Long> Res= empList.stream().collect(Collectors.groupingBy(Emp::getGender, Collectors.counting()));
		System.out.println(Res);
		
		System.out.println("-----------------------------------------");
		//2. Print the name of all department in the organization?
		empList.stream().map(e -> e.dept).distinct().forEach(name -> System.out.println(name));
		
		System.out.println("-----------------------------------------");
		//3. What is the average age of male and female employees?
		Map<String, Double> Res1 =  empList.stream().collect(Collectors.groupingBy(Emp::getGender, Collectors.averagingInt(Emp::getAge)));
		System.out.println(Res1);
		
		System.out.println("-----------------------------------------");
		//4. Get the details of highest paid employee in the organization?
		Optional<Emp> optional =  empList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Emp::getSalary)));
		if(optional.isPresent()) {
			Emp emp1 = optional.get();
			System.out.println(emp1);
		}
		
		System.out.println("-----------------------------------------");
		//5. Get the names of all employees who have joined after 2015 ?
		empList.stream().filter(e -> e.yearOfJoining > 2015).map(e -> e.name).forEach(name -> System.out.println(name));
	}
}
class Emp{
	int id;
	String name;
	int age;
	String gender;
	String dept;
	int yearOfJoining;
	double salary;
	
	Emp(int id, String name, int age, String gender, String dept, int yearOfJoining, double salary){
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.dept = dept;
		this.yearOfJoining = yearOfJoining;
		this.salary = salary;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getYearOfJoining() {
		return yearOfJoining;
	}

	public void setYearOfJoining(int yearOfJoining) {
		this.yearOfJoining = yearOfJoining;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", dept=" + dept
				+ ", yearOfJoining=" + yearOfJoining + ", salary=" + salary + "]";
	}
	
}