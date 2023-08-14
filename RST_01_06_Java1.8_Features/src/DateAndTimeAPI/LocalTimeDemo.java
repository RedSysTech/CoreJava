package DateAndTimeAPI;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

/*
 * Agenda:-
 * ------
 * LocalTime - it's a final class in java - to get only time without Date. 
 */
public class LocalTimeDemo {

	public static void main(String[] args) {
		System.out.println("---------------");
		// get the local time
		LocalTime now = LocalTime.now();
		System.out.println("now --> "+now);
		
		System.out.println("---------------");
		// convert a text into LocalTime obj.
		LocalTime sixThirty = LocalTime.parse("06:30"); 
		System.out.println("sixThirty --> "+sixThirty);
		
		System.out.println("---------------");
		// specify your own time without date
		LocalTime sixThirtya = LocalTime.of(6, 30);
		System.out.println("sixThirtya --> "+sixThirtya);
		
		System.out.println("---------------");
		// specify your own time without date and add the hours to it..
		LocalTime nineThirty = LocalTime.parse("06:30").plus(3, ChronoUnit.HOURS);
		System.out.println("nineThirty --> "+nineThirty);
		
		
		System.out.println("---------------");
		// check if the given time A is before time B?..
		boolean isbefore = LocalTime.parse("06:30").isBefore(LocalTime.parse("07:30"));
		System.out.println("isbefore ? "+isbefore);
		
		System.out.println("---------------");
		// get the max time in a day?
		LocalTime maxTime = LocalTime.MAX;
		System.out.println("maxTime --> "+maxTime);
				
				
	}

}
