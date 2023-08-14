package DateAndTimeAPI;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

/*
  * Agenda:-
 * -------
 * What is DateTimeFormatter class in java?
 * 		-- DateTimeFormatter class is used to deal with formatting date and time based on our requirements..
 */
public class Formatting {

	public static void main(String[] args) {
		LocalDateTime localDateTime = LocalDateTime.of(2015, Month.JANUARY, 25, 6, 30);
		System.out.println("localDateTime --> "+localDateTime);
		
		String localDateString = localDateTime.format(DateTimeFormatter.ISO_DATE);
		System.out.println("localDateString in ISO Format--> "+localDateString);
		
		String patternedDateTime = localDateTime.format(DateTimeFormatter.ofPattern("yyyy/MM/dd"));
		System.out.println("localDateTime in yyyy/MM/dd pattern--> "+patternedDateTime);
	}

}
