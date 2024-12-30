//LocalDate is a FINAL CLASS

package in.java8.DateandTime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.util.Date;


public class NewDateDemo {
	public static void main(String[] args) {
		Date d1 = new Date();
		System.out.println(d1);
		
		LocalDate of = LocalDate.of(2024,12,3);		
		System.out.println(of);
		//for current date
		LocalDate d2 = LocalDate.now();
		System.out.println(d2);
		
		d2 = d2.plusDays(3);
		System.out.println(d2);
		
		d2 = d2.plusMonths(2);
		System.out.println(d2);
		
		d2 = d2.plusYears(2);
		System.out.println(d2);
		
		boolean leapYear = LocalDate.parse("2024-12-27").isLeapYear();
		System.out.println("leap Year ::" + leapYear);
		
		boolean before = LocalDate.parse("2021-12-22").isBefore(LocalDate.parse("2022-12-22"));
		System.out.println("Before Date : " + before);
		
		System.out.println("***************************");
		
		LocalTime time = LocalTime.now();
		System.out.println(time);
		time = time.plusHours(2);
		System.out.println(time);
		
		System.out.println("***************************");
		
		LocalDateTime datetime = LocalDateTime.now();
		System.out.println(datetime);
		
		System.out.println("***************************");
		
		Period p = Period.ofDays(5);
		System.out.println(p.getDays());
		
		Period between =Period.between(LocalDate.parse("1991-05-20"), LocalDate.now());
		System.out.println(between);
		
		System.out.println("***************************");
		Duration duration = Duration.between(LocalTime.parse("18:00"),LocalTime.now());
		System.out.println(duration);
	}

}
