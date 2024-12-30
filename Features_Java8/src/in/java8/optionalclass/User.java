package in.java8.optionalclass;

import java.util.Optional;

public class User {
	//WITHOUT OPTIONAL OBJECT:-
//	public String getUsernameById(Integer id) {
//		if(id == 100) {
//			return "Rohit";
//		}
//		else if(id == 101) {
//			return "Rohan";
//		}
//		else if(id == 102) {
//			return "Ravina";
//		}
//		else {
//			return null;
//		}
//	}
	
	//WITH OPTIONAL OBJECT:-
//	public Optional<String> getUsernameById(Integer id) {
//		if(id == 100) {
//			return Optional.ofNullable("Raju");
//		}
//		else if(id == 101) {
//			return Optional.ofNullable("Rohan");
//		}
//		else if(id == 102) {
//			return Optional.ofNullable("Rohit");
//		}
//		else {
//			return null;
//		}
//	}
	public Optional<String> getUsernameById(Integer id) {
		
		String name = null;
		
		if(id == 100) {
			name = "Raman";
		}
		else if(id == 101) {
			name = "Rohan";
		}
		else if(id == 102) {
			name = "Rohit";
		}
		return Optional.ofNullable(name);
	}

}
