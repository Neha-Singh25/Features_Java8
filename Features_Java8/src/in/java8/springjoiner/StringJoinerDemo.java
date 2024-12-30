package in.java8.springjoiner;

import java.util.StringJoiner;

public class StringJoinerDemo {
	public static void main(String[] args) {
		StringJoiner sj = new StringJoiner("-");
		
		sj.add("Java");
		sj.add("Programming");
		sj.add("Language");
		
		System.out.println(sj);
		
		StringJoiner sj1 = new StringJoiner("-","(",")");
										//(delimeter, prefix, suffix);
		sj1.add("java");
		sj1.add("Language");
		System.out.println(sj1);
	}
}
