package DateAndTimeAPI;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

/*
 * Agenda:-
 * -------
 * LocalDate - it's a final class in java - to get only date without time. 
 */
public class LocalDateDemo {

	public static void main(String[] args) {
		
		System.out.println("---------------");
		// current local date
		LocalDate d = LocalDate.now();
		System.out.println("current local date without time -->"+d);
		
		System.out.println("---------------");
		// specify your own date without time
		System.out.println("customized local date without time -->"+LocalDate.of(2022, 01, 16));
		
		System.out.println("---------------");
		// to convert a text into LocalDate obj
		System.out.println("customized local date as text without time -->"+LocalDate.parse("2022-01-16")); 
		
		System.out.println("---------------");
		LocalDate tomorrow = LocalDate.now().plusDays(1);
		System.out.println("tomorrow -->"+tomorrow);
		
		System.out.println("---------------");
		LocalDate previousMonthSameDay = LocalDate.now().minus(1, ChronoUnit.MONTHS);
		System.out.println("previousMonthSameDay -->"+previousMonthSameDay);
		
		System.out.println("---------------");
		boolean leapYear = LocalDate.now().isLeapYear();
		System.out.println("leapYear --> "+leapYear);
		
		System.out.println("---------------");
		boolean notBefore = LocalDate.parse("2021-06-12")
				  .isBefore(LocalDate.parse("2021-06-11"));
		System.out.println("notBefore -->"+notBefore);
		
		System.out.println("---------------");
		boolean isAfter = LocalDate.parse("2021-06-12")
				  .isAfter(LocalDate.parse("2021-06-11"));
		System.out.println("isAfter -->"+isAfter);
	}

}
