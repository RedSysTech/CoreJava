package DateAndTimeAPI;

import java.time.LocalDateTime;
import java.time.Month;

/*
 * Agenda:-
 * ------
 * LocalDateTime - it's a final class in java - to get both DATE & TIME values.
 */

public class LocalDateTimeDemo {

	public static void main(String[] args) {
		System.out.println("---------------");
		// get the local date and time
		LocalDateTime l = LocalDateTime.now();
		System.out.println("current date & time --> "+l);
		
		System.out.println("---------------");
		// convert a text into LocalDateTime obj.
		LocalDateTime parsedDateTime = LocalDateTime.parse("2022-02-20T06:30:00"); 
		System.out.println("parsedDateTime --> "+parsedDateTime);
		
		System.out.println("---------------");
		// specify your own time and date date
		LocalDateTime newDateTime = LocalDateTime.of(2022, Month.FEBRUARY, 20, 06, 30);
		System.out.println("newDateTime --> "+newDateTime);
		
		System.out.println("---------------");
		System.out.println("tomorrow --> "+LocalDateTime.now().plusDays(2));

	}

}
