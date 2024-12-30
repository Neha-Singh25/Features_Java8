//---filter the objects. 1.)who's age is greater than 18.
//-----------------------2.)who's age is greater than 18 and names start with "R".

package in.java8.StreamApi;

import java.util.stream.Stream;

public class Question3 {
	public static void main(String[] args) {
		User u1 = new User("John", 25);
		User u2 = new User("Robert", 40);
		User u3 = new User("Raju", 15);
		User u4 = new User("Rahul", 10);
		User u5 = new User("Amit", 45);
		
		Stream<User> stream = Stream.of(u1,u2,u3,u4,u5);
		//---------Question 1
//		stream.filter(i -> i.age >=18).forEach(i -> System.out.println(i));
		
		//---------Question 2 (2 approch)
		stream.filter(i -> i.age >=18).filter(i -> i.name.startsWith("R")).forEach(i -> System.out.println(i));
//		stream.filter(i -> i.age >=18 && i.name.startsWith("R")).forEach(i -> System.out.println(i));
	}
}

class User{
	String name;
	int age;
	
	User(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	// ---- to print the content of the object.
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}
	
	
}