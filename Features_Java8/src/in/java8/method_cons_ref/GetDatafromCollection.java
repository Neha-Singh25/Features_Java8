package in.java8.method_cons_ref;

import java.util.ArrayList;

public class GetDatafromCollection {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(1);
		al.add(2);
		//FOLLOW THE INSERTION ORDER:-
		
		// first approach:- using for loop
		for(int i =0; i< al.size();i++) {
			System.out.println(al.get(i));
		}
		System.out.println("================");
		//second approach:- using foreach loop
		for(int i : al) {
			System.out.println(i);
		}
		System.out.println("==================");
        //Third approach:- using foreach method (Iterable interface) and having consumer FI.
		// It's a default method and arraylist override this method but it's not
		// compulsory because it's default.
		al.forEach(i -> System.out.println(i));
	}
}
