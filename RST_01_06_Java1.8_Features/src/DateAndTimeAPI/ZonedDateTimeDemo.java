package DateAndTimeAPI;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Set;

/*
 * Agenda:-
 * ------
 * ZonedDateTime - it's a final class in java - to get Date and Time with the TimeZones
 */

public class ZonedDateTimeDemo {

	public static void main(String[] args) {
		System.out.println("---------------");
		// get all the available time zones in the world.. there are 40 time zones i think..
		Set<String> allZoneIds = ZoneId.getAvailableZoneIds();
		System.out.println("allZoneIds -->"+allZoneIds);
		
		System.out.println("---------------");
		// get zone id for the given zone name.
		ZoneId zoneId = ZoneId.of("US/Central");
		System.out.println("zoneId of the given name--> "+zoneId);
		
		System.out.println("---------------");
		// get local date and time with the local zone
		LocalDateTime l = LocalDateTime.now();
		ZonedDateTime zonedDateTime = ZonedDateTime.of(l, zoneId);
		System.out.println("zonedDateTime --> "+zonedDateTime);
		
		
		System.out.println("---------------");
		// modify the offset
		ZoneOffset offset = ZoneOffset.of("+02:00");
		OffsetDateTime offSetByTwo = OffsetDateTime.of(l, offset);
		System.out.println("offSetByTwo --> "+offSetByTwo);
		
	}

}
