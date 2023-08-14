package DateAndTimeAPI;

import java.time.Duration;
import java.time.LocalTime;

/*
 * Agenda:-
 * -------
 * What is Duration class in java?
 * 		-- Duration class is used to deal with Time
 * 
 */
public class DurationDemo {

	public static void main(String[] args) {
		
		LocalTime initialTime = LocalTime.of(9, 30, 0);
		LocalTime finalTime = initialTime.plus(Duration.ofSeconds(45));
		System.out.println("-----------");
		System.out.println("initialTime -->"+initialTime);
		System.out.println("finalTime -->"+finalTime);
		
		System.out.println("-----------");
		long durationBetween = Duration.between(initialTime, finalTime).getSeconds();
		System.out.println("Duration between initial time and final time is -->"+durationBetween);
		System.out.println("-----------");
	}

}
