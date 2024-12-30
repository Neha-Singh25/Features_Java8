package in.java8.DateandTime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
	public static void main(String[] args) throws Exception {
		Date d = new Date();
		System.out.println(d);    // o/p=> Fri Dec 27 14:37:55 IST 2024
		
		//dd/mm/yyyy
		//mmm -> month name short
		//mmmm -> complete month name
		//yy -> last 2 digits of the year
		
		
		//1. CONVERTING DATE TO STRING
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String format = sdf.format(d);
		System.out.println("Indian format:-"+ format);
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("MM/dd/yyyy");
		String format1 = sdf1.format(d);
		System.out.println("US format:- "+ format1);
		
		//2. CONVERT STRING TO DATE
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
		Date parsedDate = sdf2.parse("2024-12-26");
		System.out.println(parsedDate);
		
	}

}
