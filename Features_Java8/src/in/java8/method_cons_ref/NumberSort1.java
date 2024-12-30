/*
 * WAJP to store numbers in ArrayList and sort numbers in desending order.
 * 
 * Approach-1 (without lambda) 
 * 
 * 
 * */

package in.java8.method_cons_ref;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class NumberSort1 {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(5);
		al.add(6);
		al.add(4);
		al.add(3);
		al.add(1);
		al.add(2);
		System.out.println("Before sort:="+ al);
		
		//output in descending order
		Collections.sort(al, new NumberComparator());
		System.out.println("After Sort ::" + al);
	}
}

class NumberComparator implements Comparator<Integer>{
	@Override
	public int compare(Integer i, Integer j) {
		if(i > j) {
			return -1;  //No swapping / shifted
		}else if(i<j) {
			return 1;   // do swapping / shifted
		}
		return 0;
	}
}