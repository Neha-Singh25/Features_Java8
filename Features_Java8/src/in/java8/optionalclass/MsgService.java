//TO AVOID NULLPOINTER EXCEPTION
//USING OPTIONAL CLASS .

package in.java8.optionalclass;

import java.util.Optional;
import java.util.Scanner;

public class MsgService {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the user id");
		int id = sc.nextInt();
		
		User u = new User();
//		String userName = u.getUsernameById(id);
//		
//		if(userName != null) {
//			String msg = userName.toUpperCase()+ ", Hello !";
//			System.out.println(msg);
//		}
//		else {
//			System.out.println("Invalid Id");
//		}
		
		Optional<String> username = u.getUsernameById(id);
		if(username.isPresent()) {
			String name = username.get();
			System.out.println(name.toUpperCase()+", Hello");
		}
		else {
			System.out.println("No data found");
		}
	}

}
