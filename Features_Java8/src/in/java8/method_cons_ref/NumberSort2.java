//approach 2:-
package in.java8.method_cons_ref;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class NumberSort2 {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(5);
		al.add(6);
		al.add(4);
		al.add(3);
		al.add(1);
		al.add(2);
		System.out.println("Before sort:="+ al);
		
		//using lambda and o/p is ascending order.
		Collections.sort(al, (i,j) -> i.compareTo(j));
		System.out.println("After sort in asc order:="+ al);
		Collections.sort(al,(i,j) -> (i>j) ? -1 :1);
		System.out.println("After Sort in desc ::" + al);
	}
}

//class Numberr implements Comparator<Integer>{
//	@Override
//	public int compare(Integer i, Integer j) {
//		if(i > j) {
//			return -1;  //No swapping / shifted
//		}else if(i<j) {
//			return 1;   // do swapping / shifted
//		}
//		return 0;
//	}
//}
