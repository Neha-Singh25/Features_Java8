//Group By is used categorize the data/ Grouping the data.
// When we use groupingBy() function with stream they it will group the data as Key-Value(s) pair and it will return Map object.

package in.java8.StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class GroupBydemo {
	public static void main(String[] args) {
		
		Emp e1 = new Emp(1, "Rahul", 26500.00, "USA");
		Emp e2 = new Emp(2, "Anika", 36500.00, "INDIA");
		Emp e3 = new Emp(3, "Chitra", 46500.00 , "CHINA");
		Emp e4 = new Emp(4, "Danish", 16500.00, "INDIA");
		Emp e5 = new Emp(5, "Chetna", 25500.00, " USA");
		
		List<Emp> list = Arrays.asList(e1,e2,e3,e4,e5);
		
		//Employees will grouped based on country name.
		Map<String, List<Emp>> data = list.stream().collect(Collectors.groupingBy(e -> e.location));
		System.out.println(data);
		
		
	}
}
class Emp{
	int id;
	String name;
	double salary;
	String location;
	
	Emp(int id, String name, double salary, String location){
		
		this.id  = id;
		this.name = name;
		this.salary = salary;
		this.location = location;
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", salary=" + salary + ", location=" + location + "]";
	}
}