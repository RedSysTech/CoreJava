package DateAndTimeAPI;

import java.time.LocalDate;
import java.time.Period;

/*
 * Agenda:-
 * -------
 * What is Period class in java?
 * 		- represents a quantity of time in terms of years, months and days
 */
public class PeriodDemo {

	public static void main(String[] args) {
		
		LocalDate initialDate = LocalDate.parse("2022-01-10");
		LocalDate finalDate = initialDate.plus(Period.ofDays(5));
		System.out.println("-----------");
		System.out.println("initialDate -->"+initialDate);
		System.out.println("finalDate -->"+finalDate);
		
		
		System.out.println("-----------");
		int periodBetween = Period.between(initialDate, finalDate).getDays();
		System.out.println("Period between initial date and final date is -->"+periodBetween);
		System.out.println("-----------");
	}

}
