package DateAndTimeAPI;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

/*
 * Agenda:-
 * -------
 * 
 * How to fix the existing Date and Calendar API code to use 1.8 API?
 * 
 * Way 1:- toInstant()
 * 
 * Way 2:- Instant.ofEpochMilli()
 * 
 *  both the above techniques helps to convert existing Date and Calendar instance to 
 *  new Date and Time API
 */

public class DateCalendarCompatibility {

	public static void main(String[] args) {
		
		Date d = new Date();
		LocalDate way1 = convertToLocalDateByInstant(d);
		System.out.println("converted localDateTime by toInstant -->"+way1);
		
		LocalDate way2 = convertToLocalDateByInstant(d);
		System.out.println("converted localDateTime by ofEpochMilli -->"+way2);
		
	}
	
	// Way 1
	public static LocalDate convertToLocalDateByInstant(Date dateToConvert) {
	    return dateToConvert.toInstant()
	      .atZone(ZoneId.systemDefault())
	      .toLocalDate();
	}
	
	// Way 2
	public static LocalDate convertToLocalDateByMilisecond(Date dateToConvert) {
	    return Instant.ofEpochMilli(dateToConvert.getTime())
	      .atZone(ZoneId.systemDefault())
	      .toLocalDate();
	}

}
